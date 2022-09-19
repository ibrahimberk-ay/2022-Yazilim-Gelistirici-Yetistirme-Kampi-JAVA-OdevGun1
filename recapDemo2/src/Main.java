public class Main {

    public static void main(String[] args) {

        double[] liste = {1.6,2.1,3.5,4.8,5.6};
        double total = 0;
        double max = liste[0];

        for(double sayi: liste){
            if(max < sayi)
                max = sayi;
            total = total + sayi;
            System.out.println(sayi);
        }
        System.out.println("Toplam = " + total);
        System.out.println("En Büyük Sayı = " + max);
    }
}
