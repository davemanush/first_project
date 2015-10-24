package first_project;

/**
 * Created by gufee on 2015.10.18..
 */
public class HelpClass {
    public HelpClass(){


    }
    public void showCommands()
    {
    	PrintToScreen p = new PrintToScreen();
        String[] commands = {"exit", "help", "amoba"};
        String[] description = {
                "Closes the application",
                "Shows all the commands",
                "Opens the 'Amőba' mini game"
        };
        System.out.println();
        System.out.println("Commands-------------");
        for(int i = 0; i < commands.length; i++)
        {
            System.out.println(commands[i] + "   -   "+ description[i]);
        }
        
    }
}
