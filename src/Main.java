/*
IS 147 Stat Tracker
Gavin Hayes, Kimmie Herrit, Dillon, Jude Kim
*/

import java.util.Scanner;

public class Main {
    private static Scanner usrInput;
    static void checkCommand(String command) {
        switch (command) {
            case "add" -> addPlayer();
            case "access" -> accessPlayer();
            case "compare" -> comparePlayer();
            case "quit" -> System.out.println("");
            default -> {
                System.out.println("Invalid command, please try again");
            }
        }
    }
    static void addPlayer() {
        System.out.print("Enter Player to Add:\n   >>> ");
        String name = usrInput.nextLine();
        System.out.print("What team does " + name + " play for?\n   >>> ");
        String team = usrInput.nextLine();
        System.out.print("How many points does " + name + " have this season?\n   >>> ");
        double points = usrInput.nextDouble();
        System.out.print("How many assists does " + name + " have this season?\n   >>> ");
        double assists = usrInput.nextDouble();
        System.out.print("How many steals does " + name + " have this season?\n   >>> ");
        double steals = usrInput.nextDouble();
        System.out.print("How many blocks does " + name + " have this season?\n   >>> ");
        double blocks = usrInput.nextDouble();
    }
    static void accessPlayer(){
        System.out.println("accessed player stats");
    }
    static void comparePlayer(){
        System.out.println("compared player stats");
    }
    static void enterCommand(){
        String input;
        do {
            System.out.print(">>> ");
            input = usrInput.nextLine();
            checkCommand(input);
        } while (!input.equals("quit"));
    }
    static void runApplication() {
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
    public static void main(String[] args) {
        usrInput = new Scanner(System.in);
        runApplication();
    }


}