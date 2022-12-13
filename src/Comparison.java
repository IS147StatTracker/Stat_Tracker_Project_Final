import java.util.Dictionary;
import java.util.Scanner;

public class Comparison {
    static void comparePlayer(String[][] playerList, Dictionary stats, Dictionary playerRating) {
        Scanner usrInput = new Scanner(System.in);
        System.out.print("Enter first player to compare: \n   >>> ");
        String compare1 = usrInput.nextLine();
        if (!Accessor.checkPlayerExists(playerList, compare1)) {
            System.out.println(compare1 + " has not been entered into STAT TRACKER");
        }

        System.out.print("Enter second player to compare: \n   >>> ");
        String compare2 = usrInput.nextLine();
        if (!Accessor.checkPlayerExists(playerList, compare1)) {
            System.out.println(compare2 + " has not been entered into STAT TRACKER");
        }

        int index = (int) stats.get(compare1);

        int index2 = (int) stats.get(compare2);

        int rating1 = (int) playerRating.get(compare1);
        int rating2 = (int) playerRating.get(compare2);


        System.out.println("Player     Team       Points Assists Steals Blocks");
        System.out.println("__________ __________ ______ _______ ______ ______");
        System.out.println(compare1+"      "+playerList[index][1]+"   "+playerList[index][2]+"      "+playerList[index][3]+"       "+playerList[index][4]+"      "+playerList[index][5]);
        System.out.println(compare2+"     "+playerList[index2][1]+"     "+playerList[index2][2]+"      "+playerList[index2][3]+"       "+playerList[index2][4]+"      "+playerList[index2][5]);

        System.out.println(compare1 +"'s Overall Rating: " + rating1);
        System.out.println(compare2 +"'s Overall Rating: " + rating2);
        if (rating1 > rating2){
            System.out.println(compare1 + " is the better player");
        }else
            System.out.println(compare2 + " is the better player");
    }
}
