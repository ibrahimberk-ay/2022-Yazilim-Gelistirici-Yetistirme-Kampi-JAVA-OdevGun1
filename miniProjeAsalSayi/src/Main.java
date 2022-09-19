public class Main {

    public static void main(String[] args) {
        int number = -6, counter = 0;

        if(number >= 2){

            for(int i=2;i<number;i++){

                if(number % i == 0){
                    System.out.println("Sayi Asal Degil!");
                    counter++;
                    break;
                }

            }
            if(counter < 1)
                System.out.println("Sayi Asal!");
        }
        if(number < 2)
            System.out.println("Sayi Asal Degil!");
    }
}
