package first_project;

/**
 * Created by gufee on 2015.10.18..
 */
public class Amoba {
	//glob�lia v�ltoz�k helye
    char[][] field;

    public Amoba() {
    	//k�d helye
        PrintToScreen screenPrinter = new PrintToScreen();

        field = new char[3][3];
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                field[i][j] = ' ';

            }
        }
      
        screenPrinter.PrintTicTacToeToScreen(field);
    }
}
