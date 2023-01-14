public class Main {
    public static void main(String[] args) {
        int amount = 1100;
        int percent;
        if (amount >= 1000) {
            percent = amount * 1 / 100;
        } else {
            percent = 0;
        }
        System.out.println("Начисленно " + (amount + percent) + " рублей");
    }
}