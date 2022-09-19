public class Main {

    public static void main(String[] args) {
        int number = 220;
        int number2 = 284;
        int total1 = 0, total2 = 0;

        if(number > 0 && number2 > 0) {
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    total1 += i;
                }
            }
            for (int i = 1; i < number2; i++) {
                if (number2 % i == 0) {
                    total2 += i;
                }
            }
        }
        if(number2 == total1 && number == total2)
            System.out.println("Arkadas Sayilar");
        else
            System.out.println("Arkadas Sayi Degiller");
    }
}
