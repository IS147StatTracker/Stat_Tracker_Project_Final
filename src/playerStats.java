public class playerStats {
    private static String name;
    private static String team;
    private static double points;
    private static double assists;
    private static double steals;
    private static double blocks;

    public playerStats(String n, String t, double p, double a, double s, double b) {
        name = n;
        team = t;
        points = p;
        assists = a;
        steals = s;
        blocks = b;
    }

    public static void setName(String n) {
        name = n;
    }

    public static void setTeam(String t) {
        team = t;
    }

    public static void setPoints(double p) {
        points = p;
    }

    public static void setAssists(double a) {
        assists = a;
    }

    public static void setSteals(double s) {
        steals = s;
    }

    public static void setBlocks(double b) {
        blocks = b;
    }

    public static String getName(String name) {
        return playerStats.name;
    }

    public static String getTeam(String team) {
        return playerStats.team;
    }

    public static double getPoints(double points) {
        return playerStats.points;
    }

    public static double getAssists(double assists) {
        return playerStats.assists;
    }

    public static double getSteals(double steals) {
        return playerStats.steals;
    }

    public static double getBlocks(double blocks) {
        return playerStats.blocks;
    }

}
