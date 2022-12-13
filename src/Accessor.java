import java.util.Dictionary;
import java.util.Scanner;

public class Accessor {
    static void accessPlayer(String[][] playerList, Dictionary stats) {
        Scanner usrInput = new Scanner(System.in);
        System.out.print("What Player would you like to access? \n   >>> ");
        String playerWanted = usrInput.nextLine();
        if (checkPlayerExists(playerList, playerWanted)) {
            int index = (int) stats.get(playerWanted);
            System.out.println("Accessed " + playerWanted + " Successfully ✔");
            System.out.println("  Name: " + playerList[index][0]);
            System.out.println("  Team: " + playerList[index][1]);
            System.out.println("  Points: " + playerList[index][2]);
            System.out.println("  Assists: " + playerList[index][3]);
            System.out.println("  Steals: " + playerList[index][4]);
            System.out.println("  Blocks: " + playerList[index][5]);
        } else
            System.out.println(playerWanted + " has not been entered into STAT TRACKER");
    }

    static boolean checkPlayerExists (String[][]playerList, String playerWanted){
        boolean playerExists = false;
        for (String[] players : playerList) {
            for (String player : players) {
                if (playerWanted.equals(player)) {
                    playerExists = true;
                    break;
                }
            }
        }
        return playerExists;
    }
}
