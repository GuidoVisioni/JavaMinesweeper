public class Game 
{
    public static void main(String[] args)
    {
        showInstructions();
    }

    String currentRoom = "Hall";

    static void showInstructions()
    {
       System.out.println("Commands: go [direction], get [item]");
    }

    static void showStatus()
    {
    
    }
}