import java.util.Arrays;
import java.util.Scanner;
import java.util.Hashtable;
import java.util.Dictionary;

public class runApplication {
    private static Scanner usrInput;
    static void checkCommand(String command){
        switch (command) {
            case "add" -> {
                System.out.println("Here is where you enter players into the program (Max of 10 players)");
                askInput(temp, playerStats, playerRating);
            }
            case "access" -> Accessor.accessPlayer(temp, playerStats);
            case "compare" -> Comparison.comparePlayer(temp, playerStats, playerRating);
            case "quit" -> System.out.println("Successfully Exited STAT TRACKER");
            default -> {
                System.out.println("Invalid command, please try again");
            }
        }
    }

    static int count = 0;
    static String[][] temp = new String[10][6];
    static Dictionary<String, Integer> playerStats = new Hashtable<>();
    static Dictionary<String, Integer> playerRating = new Hashtable<>();
    public static void askInput(String[][]temp, Dictionary<String, Integer> stats, Dictionary<String, Integer> rate){
        System.out.print("Enter name of player to add:\n   >>> ");
        String name = usrInput.nextLine();

        System.out.print("What team does " + name + " play for?\n   >>> ");
        String team = usrInput.nextLine();

        System.out.print("How many points does " + name + " have this season?\n   >>> ");
        int points = usrInput.nextInt();
        usrInput.nextLine();

        System.out.print("How many assists does " + name + " have this season?\n   >>> ");
        int assists = usrInput.nextInt();
        usrInput.nextLine();

        System.out.print("How many steals does " + name + " have this season?\n   >>> ");
        int steals = usrInput.nextInt();
        usrInput.nextLine();

        System.out.print("How many blocks does " + name + " have this season?\n   >>> ");
        int blocks = usrInput.nextInt();
        usrInput.nextLine();

        count++;

        int rating = assists + points + steals + blocks;

        temp[count-1][0] = name;
        temp[count-1][1] = team;
        temp[count-1][2] = String.valueOf(points);
        temp[count-1][3] = String.valueOf(assists);
        temp[count-1][4] = String.valueOf(steals);
        temp[count-1][5] = String.valueOf(blocks);

        System.out.println("Player Added Successfully: ✔");
        System.out.println("  Name: " + name);
        System.out.println("  Team: " + team);
        System.out.println("  Points: " + points);
        System.out.println("  Assists: " + assists);
        System.out.println("  Steals: " + steals);
        System.out.println("  Blocks: " + blocks);
        System.out.println("  Overall Rating: " + rating);

        rate.put(name, rating);
        stats.put(name, count-1);

    }
    static void enterCommand(){
        String input;
        do {
            System.out.print(">>> ");
            input = usrInput.nextLine();
            checkCommand(input);
        } while (!input.equals("quit"));
    }
    static void displayBanner(){
        System.out.println("\uD83C\uDFC0⚽⚾\uD83C\uDFD0\uD83C\uDFC8🎾\uD83C\uDFB3\uD83C\uDFD2\uD83E\uDD4D⛳\uD83C\uDFC0⚽⚾\uD83C\uDFD0\uD83C\uDFC8🎾\uD83C\uDFB3\uD83C\uDFD2\uD83E\uDD4D⛳\uD83C\uDFC0⚽⚾\uD83C\uDFD0\uD83C\uDFC8🎾\uD83C\uDFB3\uD83C\uDFD2\uD83E\uDD4D⛳\uD83C\uDFC0⚽⚾\uD83C\uDFD0\uD83C\uDFC8🎾\uD83C\uDFB3\uD83C\uDFD2\uD83E\uDD4D⛳\uD83C\uDFC0⚽⚾\uD83C\uDFD0\uD83C\uDFC8🎾\uD83C\uDFB3\uD83C\uDFD2\uD83E\uDD4D⛳\uD83C\uDFC0⚽⚾\uD83C\uDFD0\uD83C\uDFC8🎾\uD83C\uDFB3\uD83C\uDFD2\uD83E\uDD4D⛳\uD83C\uDFC0⚽⚾\uD83C\uDFD0\uD83C\uDFC8🎾\uD83C\uDFB3\uD83C\uDFD2");
        System.out.println("⚽   ____    ____________     ___     ____________           ____________   _______          ___         _______     __    ___  ________   _______   ⚽");
        System.out.println("⚾  /    \\  |____    ____|   /   \\   |____    ____|         |____    ____| |   __  \\        /   \\       /  ___  \\   |  |  /  / |   _____| |   __  \\  ⚾");
        System.out.println("\uD83C\uDFD0 /  /\\__\\      |  |       /  _  \\       |  |                   |  |      |  |  |  |      /  _  \\     |  /   \\__\\  |  | /  /  |  |       |  |  |  | \uD83C\uDFD0");
        System.out.println("\uD83C\uDFC8 \\  \\___       |  |      /  / \\  \\      |  |                   |  |      |  |__| /      /  / \\  \\    |  |         |  |/  /   |  |___    |  |__| /  \uD83C\uDFC8");
        System.out.println("🎾  \\___  \\      |  |     /  /___\\  \\     |  |                   |  |      |      /      /  /___\\  \\   |  |         |     \\    |   ___|   |      /   🎾");
        System.out.println("\uD83C\uDFD0  ___ \\  \\     |  |    /   _____   \\    |  |                   |  |      |  |\\  \\     /   _____   \\  |  |    ___  |  |\\  \\   |  |       |  |\\  \\   \uD83C\uDFD0");
        System.out.println("⚾  \\  \\/  /     |  |   /  /       \\  \\   |  |                   |  |      |  | \\  \\   /  /       \\  \\ |  \\___/  /  |  | \\  \\  |  |_____  |  | \\  \\  ⚾");
        System.out.println("⚽   \\____/      |__|  /__/         \\__\\  |__|                   |__|      |__|  \\__\\ /__/         \\__\\ \\_______/   |__|  \\__\\ |________| |__|  \\__\\ ⚽");
        System.out.println("\uD83C\uDFC0⚽⚾\uD83C\uDFD0\uD83C\uDFC8🎾\uD83C\uDFB3\uD83C\uDFD2\uD83E\uDD4D⛳\uD83C\uDFC0⚽⚾\uD83C\uDFD0\uD83C\uDFC8🎾\uD83C\uDFB3\uD83C\uDFD2\uD83E\uDD4D⛳\uD83C\uDFC0⚽⚾\uD83C\uDFD0\uD83C\uDFC8🎾\uD83C\uDFB3\uD83C\uDFD2\uD83E\uDD4D⛳\uD83C\uDFC0⚽⚾\uD83C\uDFD0\uD83C\uDFC8🎾\uD83C\uDFB3\uD83C\uDFD2\uD83E\uDD4D⛳\uD83C\uDFC0⚽⚾\uD83C\uDFD0\uD83C\uDFC8🎾\uD83C\uDFB3\uD83C\uDFD2\uD83E\uDD4D⛳\uD83C\uDFC0⚽⚾\uD83C\uDFD0\uD83C\uDFC8🎾\uD83C\uDFB3\uD83C\uDFD2\uD83E\uDD4D⛳\uD83C\uDFC0⚽⚾\uD83C\uDFD0\uD83C\uDFC8🎾\uD83C\uDFB3\uD83C\uDFD2");
        System.out.println("Enter a command: \n \"add\" to add a player to the database \n \"access\" to access a players stats \n \"compare\" to compare two players' data");
        enterCommand();
    }

    public static void runApp(){
        usrInput = new Scanner(System.in);
        displayBanner();
    }
}
