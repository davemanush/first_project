package first_project;

/**
 * Created by gufee on 2015.10.18..
 */
public class Amoba {
    char[][] field;

    public Amoba() {
        PrintToScreen screenPrinter = new PrintToScreen();

        field = new char[3][3];
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                field[i][j] = '*';

            }
        }
        field[0][0] = 'X';
        field[1][1] = 'X';
        screenPrinter.PrintTicTacToeToScreen(field);
    }
}
