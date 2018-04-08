package game;

public class Drawing {

	
	public static void playerWins(){
		System.out.println("\n\n   CONGRATULATIONS!!!\n");

		
		System.out.println("    0   0  00   0  0       ");
		System.out.println("     0 0  0  0  0  0       ");
		System.out.println("      0   0  0  0  0       ");
		System.out.println("      0    00    00        ");
		System.out.println("                           ");
		System.out.println("  0  0  0   00   0   0     ");
		System.out.println("  0  0  0  0  0  00  0     ");
		System.out.println("  0  0  0  0  0  0 0 0     ");
		System.out.println("   00 00    00   0  00     ");
		System.out.println("                           ");
		
	}
	
	public static void drawHangman(int nbErrors){
		
		if (nbErrors == 1){
			System.out.println("\n");
			System.out.println("  _____________        ");
			System.out.println(" |          __|__      ");
			System.out.println(" |         |     |     ");
			System.out.println(" |         |     |     ");
			System.out.println(" |         |     |     ");
			System.out.println(" |         |     |     ");
			System.out.println(" |         |_____|     ");
			System.out.println(" |                     ");
			System.out.println(" |                     ");
			System.out.println(" |                     ");
			System.out.println(" |                     ");
			System.out.println(" |                     ");
			System.out.println(" |                     ");
			System.out.println(" |                     ");
			System.out.println(" |                     ");
			System.out.println(" |____________________ ");
		
		}
		else if (nbErrors == 2){		
			System.out.println("\n");
			System.out.println("  _____________        ");
			System.out.println(" |            |        ");
			System.out.println(" |          __|__      ");
			System.out.println(" |         |     |     ");
			System.out.println(" |         | 0   |     ");
			System.out.println(" |         |     |     ");
			System.out.println(" |         |     |     ");
			System.out.println(" |         |_____|     ");
			System.out.println(" |                     ");
			System.out.println(" |                     ");
			System.out.println(" |                     ");
			System.out.println(" |                     ");
			System.out.println(" |                     ");
			System.out.println(" |                     ");
			System.out.println(" |                     ");
			System.out.println(" |                     ");
			System.out.println(" |____________________ ");
		
		}
		else if (nbErrors == 3){			
			System.out.println("\n");
			System.out.println("  _____________        ");
			System.out.println(" |            |        ");
			System.out.println(" |          __|__      ");
			System.out.println(" |         |     |     ");
			System.out.println(" |         | 0 0 |     ");
			System.out.println(" |         |     |     ");
			System.out.println(" |         |     |     ");
			System.out.println(" |         |_____|     ");
			System.out.println(" |                     ");
			System.out.println(" |                     ");
			System.out.println(" |                     ");
			System.out.println(" |                     ");
			System.out.println(" |                     ");
			System.out.println(" |                     ");
			System.out.println(" |                     ");
			System.out.println(" |                     ");
			System.out.println(" |____________________ ");
		
		}else if (nbErrors == 4){	
			System.out.println("\n");
			System.out.println("  _____________        ");
			System.out.println(" |            |        ");
			System.out.println(" |          __|__      ");
			System.out.println(" |         |     |     ");
			System.out.println(" |         | 0 0 |     ");
			System.out.println(" |         |  7  |     ");
			System.out.println(" |         |     |     ");
			System.out.println(" |         |_____|     ");
			System.out.println(" |                     ");
			System.out.println(" |                     ");
			System.out.println(" |                     ");
			System.out.println(" |                     ");
			System.out.println(" |                     ");
			System.out.println(" |                     ");
			System.out.println(" |                     ");
			System.out.println(" |                     ");
			System.out.println(" |____________________ ");
		
		}else if (nbErrors == 5){	
			System.out.println("\n");
			System.out.println("  _____________        ");
			System.out.println(" |            |        ");
			System.out.println(" |          __|__      ");
			System.out.println(" |         |     |     ");
			System.out.println(" |         | 0 0 |     ");
			System.out.println(" |         |  7  |     ");
			System.out.println(" |         | === |     ");
			System.out.println(" |         |_____|     ");
			System.out.println(" |                     ");
			System.out.println(" |                     ");
			System.out.println(" |                     ");
			System.out.println(" |                     ");
			System.out.println(" |                     ");
			System.out.println(" |                     ");
			System.out.println(" |                     ");
			System.out.println(" |                     ");
			System.out.println(" |____________________ ");
		
		}else if (nbErrors == 6){	
			System.out.println("\n");
			System.out.println("  _____________        ");
			System.out.println(" |          __|__      ");
			System.out.println(" |         |     |     ");
			System.out.println(" |         | 0 0 |     ");
			System.out.println(" |         |  7  |     ");
			System.out.println(" |         | === |     ");
			System.out.println(" |         |_____|     ");
			System.out.println(" |           [ ]       ");
			System.out.println(" |           [ ]       ");
			System.out.println(" |           [ ]       ");
			System.out.println(" |           [ ]       ");
			System.out.println(" |           [ ]       ");
			System.out.println(" |                     ");
			System.out.println(" |                     ");
			System.out.println(" |                     ");
			System.out.println(" |____________________ ");
		
		}else if (nbErrors == 7){	
			System.out.println("\n");
			System.out.println("  _____________        ");
			System.out.println(" |          __|__      ");
			System.out.println(" |         |     |     ");
			System.out.println(" |         | 0 0 |     ");
			System.out.println(" |         |  7  |     ");
			System.out.println(" |         | === |     ");
			System.out.println(" |         |_____|     ");
			System.out.println(" |           [ ]       ");
			System.out.println(" |          /[ ]       ");
			System.out.println(" |         / [ ]       ");
			System.out.println(" |           [ ]       ");
			System.out.println(" |           [ ]       ");
			System.out.println(" |                     ");
			System.out.println(" |                     ");
			System.out.println(" |                     ");
			System.out.println(" |____________________ ");
		
		}else if (nbErrors == 8){	
			System.out.println("\n");
			System.out.println("  _____________        ");
			System.out.println(" |          __|__      ");
			System.out.println(" |         |     |     ");
			System.out.println(" |         | 0 0 |     ");
			System.out.println(" |         |  7  |     ");
			System.out.println(" |         | === |     ");
			System.out.println(" |         |_____|     ");
			System.out.println(" |           [ ]       ");
			System.out.println(" |          /[ ]\\     ");
			System.out.println(" |         / [ ] \\    ");
			System.out.println(" |           [ ]       ");
			System.out.println(" |           [ ]       ");	
			System.out.println(" |                     ");
			System.out.println(" |                     ");
			System.out.println(" |                     ");
			System.out.println(" |____________________ ");
		
		}else if (nbErrors == 9){	
			System.out.println("\n");
			System.out.println("  _____________        ");
			System.out.println(" |          __|__      ");
			System.out.println(" |         |     |     ");
			System.out.println(" |         | 0 0 |     ");
			System.out.println(" |         |  7  |     ");
			System.out.println(" |         | === |     ");
			System.out.println(" |         |_____|     ");
			System.out.println(" |           [ ]       ");
			System.out.println(" |          /[ ]\\     ");
			System.out.println(" |         / [ ] \\    ");
			System.out.println(" |           [ ]       ");
			System.out.println(" |          /[ ]       ");
			System.out.println(" |         /           ");
			System.out.println(" |                     ");
			System.out.println(" |                     ");
			System.out.println(" |____________________ ");
			
		}else if (nbErrors == 10){	
			System.out.println("\n");
			System.out.println("  _____________        ");
			System.out.println(" |          __|__      ");
			System.out.println(" |         |     |     ");
			System.out.println(" |         | 0 0 |     ");
			System.out.println(" |         |  7  |     ");
			System.out.println(" |         | === |     ");
			System.out.println(" |         |_____|     ");
			System.out.println(" |           [ ]       ");
			System.out.println(" |          /[ ]\\     ");
			System.out.println(" |         / [ ] \\    ");
			System.out.println(" |           [ ]       ");
			System.out.println(" |          /[ ]\\     ");
			System.out.println(" |         /     \\    ");
			System.out.println(" |                     ");
			System.out.println(" |        GAME OVER    ");
			System.out.println(" |____________________ ");
		
		}
	}

}
