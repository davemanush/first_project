package first_project;

import java.util.Scanner;

/**
 * Created by gufee on 2015.10.18..
 */
public class Amoba {
	Scanner sc = new Scanner (System.in);
	//globális változók helye
    public char[][] field;
    PrintToScreen screenPrinter = new PrintToScreen();
    
    boolean player = false;
    char C;
    
    public Amoba() {
    	//kód helye
       
        tFeltolt();
        
        boolean isDraw = false;
        int draw = 1;
        int cordX;
        int cordY;
        do {
        	if(draw == 10) {
        		System.out.println("It's Draw.");
        		isDraw = true;
        		break;
        	}
        		draw++;
        		
        	screenPrinter.PrintTicTacToeToScreen(field);    	
        	 
        	if (player == true) {
        		player = false;
        		System.out.println("Palyer 2's turn.(O) ");
        		C = 'O';
        	} 
        	else {
        		player = true;
        		System.out.println("Player 1's turn. (X)");
        		C = 'X';
        	}
        	
//        	do {
        	System.out.println("Írjon be két számot.:");
        	cordX = sc.nextInt();
        	cordY = sc.nextInt();
        	
//        	} while (field[cordX][cordY] != ' ');
        	
        	field [cordX][cordY] = C;
        	
        } while(!win());
       if(isDraw = false){
        if (player == true) {
    		System.out.println("Palyer 2 WIN'S.");
    		C = 'O';
    	} 
    	else {
    		System.out.println("Player 1 WIN'S.");
    		C = 'X';
    	}
       }
    }
    
    private boolean win()
    {
    	for(int i = 0; i < field.length; i++){
    		for(int j = 0; j < field.length; j++) {
    			if(field[i][j] == C) {
    				for(int k = -1; k < 2; k++) {
    					for(int l = -1; l < 2; l++) {
    						if((i+k > -1 && j+l > -1) && (i+k < 3 && j+l < 3)) {
    							if(field[i+k][j+l] == C && i+k != i && j+l != j) {
    								if((i+k+k > -1 && j+l+l > -1) && (i+k+k < 3 && j+l+l < 3) && (field[i+k+k][j+l+l] == C)) {
    									return true;
    								}
    							}
    						}
    					}
    				}
    			}
    		}
    	};
    	return false;
    }
    
    private void tFeltolt()
    {
    	field = new char[3][3];
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                field[i][j] = ' ';

            }
        }
    }
}
