public class Main {
    public static void main(String[] args) {

        int refill = 1507; //пополнение
        int bonus = refill / 100;
        int wallet = 100;

        int totalWallet;
        if (refill >= 1000) {
            totalWallet = wallet + refill + bonus;
        } else {
            totalWallet = wallet + refill;
        }
        System.out.println("Начислено бонусных рублей: " + bonus);
        System.out.println("Баланс: " + totalWallet);
    }
}