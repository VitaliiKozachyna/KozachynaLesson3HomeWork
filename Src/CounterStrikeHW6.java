import java.util.Random;

public class CounterStrikeHW6 {
    public static void main(String[] args) {
        String teamA = "Команда-A";
        String teamB = "Команда-B";
        Random random = new Random();
        int playerA1 = random.nextInt(10);
        int playerA2 = random.nextInt(10);
        int playerA3 = random.nextInt(10);
        int playerA4 = random.nextInt(10);
        int playerA5 = random.nextInt(10);
        int playerB1 = random.nextInt(10);
        int playerB2 = random.nextInt(10);
        int playerB3 = random.nextInt(10);
        int playerB4 = random.nextInt(10);
        int playerB5 = random.nextInt(10);

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
