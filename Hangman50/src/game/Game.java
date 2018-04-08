package game;

import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.lang.*;
import java.text.Normalizer;

public class Game {

	public void run(){

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner (System.in);

		//String secretWord = "ABCDEE";
		String secretWord = randomWord();
		int nbLettersSecretWord = secretWord.length();

		int nbMaxChance = 10;
		int nbPlays = nbMaxChance;

		//List with the letters typed
		ArrayList<String> listOfLetters = new ArrayList<>();

		try {

			System.out.println("\n SECRETE WORD => " + secretWord);
			System.out.println("\nThe secret word contains " + nbLettersSecretWord + " letters!");
			System.out.println("\n");

			char lettersOfSecretWord[] = new char[nbLettersSecretWord];

			//Build the secret word with "_"
			for (int i = 0; i < nbLettersSecretWord; i++) {
				lettersOfSecretWord[i] = secretWord.charAt(i);
				System.out.print("_ ");
			}

			int nbErrors = 0;
			char correctLetters[] = new char[nbLettersSecretWord];

			//During the game, the "gameON" is true
			boolean gameON = true;
			while (gameON) {
				if (nbErrors < nbMaxChance) {

					System.out.println("\n");
					System.out.println("\n-----------------------------------------");
					System.out.println("\nEnter a letter. You have " + nbPlays + " chances !");
					int notCorrectLetters = 0;

					String answer = "";
					char letter;
					String newDisplayWord = "";

					answer = formatWord(scanner.nextLine());
					letter = answer.charAt(0);


					//
					if (listOfLetters.contains(String.valueOf(letter))){
						System.out.println("Letter already typed");
					} else {
						listOfLetters.add(String.valueOf(letter));
					}

					//--------------------------------------------------------
					//If a word is typed
					if(answer.length() > 1) {

						//The player wins
						if (answer.equals(secretWord)){
							System.out.println("The secret word is: " + secretWord);
							Drawing.playerWins();
						} else {

							//Implementar verificacao por char da palavra

						}
					} 

					//--------------------------------------------------------
					//If a letter is typed
					else {
						//Loop to validate the typed letter
						for (int i = 0; i < nbLettersSecretWord; i++) {

							if (letter == lettersOfSecretWord[i]) {
								correctLetters[i] = letter;	
							} else {
								notCorrectLetters++;	
							}	

							//Build the word with letters and "_"
							if (correctLetters[i] == lettersOfSecretWord[i]) {
								newDisplayWord += correctLetters[i];
								System.out.print(correctLetters[i] + " ");
							} else {
								System.out.print("_ ");
							}	
						}
					}


					//++++++++++++++++++++++++++++++++++++++++++++++++++++++

					//System.out.println("\nnewDisplayWord = " + newDisplayWord);

					//Organize the letters typed in alphabetical order
					Collections.sort(listOfLetters); 

					System.out.println("\n");
					System.out.print("\nLetters typed: " + listOfLetters);
					

					if (notCorrectLetters >= nbLettersSecretWord) {
						nbErrors++;
						nbPlays--;
					}

					Drawing.drawHangman(nbErrors);

					//The player wins
					if (secretWord.equals(newDisplayWord)) {
						Drawing.playerWins();
						gameON = false; //Change the value of the variable and ends the game
					} 
				
				//The player loses and the secret word is shown
				} else { 
					System.out.println("The secret word is: " + secretWord);
					System.out.println();
					gameON = false; //Change the value of the variable and ends the game
				}
			}

		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}


	//Method to send a random word to the game
	static private String randomWord(){

		List<String> wordList = new ArrayList<>();

		wordList.add("Apple");
		wordList.add("Apricot");
		wordList.add("Avocato");
		wordList.add("Banana");
		wordList.add("Blackberry");
		wordList.add("Blueberry");
		wordList.add("Chery");
		wordList.add("Coconut");
		wordList.add("Grape");
		wordList.add("Kiwi");
		wordList.add("Lemon");
		wordList.add("Lime");
		wordList.add("Lychee");
		wordList.add("Mango");
		wordList.add("Nectarine");
		wordList.add("Orange");
		wordList.add("Papaya");
		wordList.add("Peach");
		wordList.add("Pear");
		wordList.add("Pineapple");
		wordList.add("Plum");
		wordList.add("Raspberry");
		wordList.add("Strawberry");
		wordList.add("Watermelon");
		
		int i = wordList.size();
		int nbRandom = 0;
		//Get a aleatory word 
		nbRandom = (int) (1 + Math.random() * i);
		String secretWord = wordList.get(nbRandom-1);
	
		return formatWord(secretWord);
	}

	//Method to format the word and accents
	static private String formatWord(String word) {
		word = Normalizer.normalize(word, Normalizer.Form.NFD);
		word = word.replaceAll("[^\\p{ASCII}]", "");
		
		return word.toUpperCase();
	}

}













































