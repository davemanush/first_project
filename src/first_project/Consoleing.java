package first_project;  //Created by gufee on 2015.10.18..


public class Consoleing {
    public Consoleing(){}

    public void processInput(String input)
    {
        int index = 0;
        String[] inputs = {"exit","help","amoba"};
        for(int i = 0; i < inputs.length; i++) {
            if (inputs[i].equals(input))
            {
                index = i;
            }
            else {
                index = -1;
            }
        }

        switch(index){
            case -1:
                System.out.println("Commands is not exist!");
                break;
            case 0: //exit index
                System.out.println("Exiting application");
                System.exit(1);
                break;
            case 1:
                HelpClass h = new HelpClass();
                break;
            case 2:
                Amoba a = new Amoba();
                break;

        }

    }
}
