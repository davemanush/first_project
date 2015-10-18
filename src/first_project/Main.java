package first_project;

public class Main {

	static char[][] field = new char[3][3];

	public static void main(String[] args) {
		PrintToScreen screenPrinter = new PrintToScreen();

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
