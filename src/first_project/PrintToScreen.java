package first_project;

public class PrintToScreen {
    public PrintToScreen()
    {

    }

    public void PrintTicTacToeToScreen(char[][] field)
    {
        System.out.println("|---1.--2.--3.--");
        System.out.println("|-|-----------||");
        System.out.println("1.|-"+  field[0][0]+"---"+  field[0][1]+"---"+  field[0][2]+"-|| ");
        System.out.println("|-|-----------||");
        System.out.println("2.|-"+  field[1][0]+"---"+  field[1][1]+"---"+  field[1][2]+"-|| ");
        System.out.println("|-|-----------||");
        System.out.println("3.|-"+  field[2][0]+"---"+  field[2][1]+"---"+  field[2][2]+"-|| ");
        System.out.println("|-|-----------||");

    }
    
}
