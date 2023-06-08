public class CounterStrikeHW6 {
    public static void main(String[] args) {
        String teamA = "Команда-A";
        String teamB = "Команда-B";
        int playerA1 = 5;
        int playerA2 = 7;
        int playerA3 = 10;
        int playerA4 = 6;
        int playerA5 = 5;
        int playerB1 = 10;
        int playerB2 = 2;
        int playerB3 = 4;
        int playerB4 = 7;
        int playerB5 = 8;

        double resultA = averageKills(playerA1, playerA2, playerA3, playerA4, playerA5);
        double resultB = averageKills(playerB1, playerB2, playerB3, playerB4, playerB5);

        if (resultA > resultB) {
            System.out.println("Перемогла команда " + teamA + ", її результат " + resultA);
        } else if (resultB > resultA) {
            System.out.println("Перемогла команда " + teamB + ", її результат " + resultB);
        } else {
            System.out.println("Нічия");
        }
    }

    public static double averageKills(int player1, int player2, int player3, int player4, int player5){
        double average = (player1 + player2 + player3 + player4 + player5)/5.0;
        return average;
    }
}
