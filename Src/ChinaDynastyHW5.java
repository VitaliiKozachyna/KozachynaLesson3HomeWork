public class ChinaDynastyHW5 {
    public static void main(String[] args) {
        int numberLi = 860;
        int numberMing = (int) (numberLi * 1.5);
        int attackLi = attack(13, 24, 46, numberLi);
        int attackMing = attack(9, 35, 12, numberMing);
        System.out.println("Загальна атака армії династії Лі = " + attackLi);
        System.out.println("Загальна атака армії династії Мін = " + attackMing);
    }


    public static int attack (int attackWarrior, int attackArcher, int attackRider, int number){
        int attack = (attackWarrior + attackArcher + attackRider) * number;
        return attack;
    }
}
