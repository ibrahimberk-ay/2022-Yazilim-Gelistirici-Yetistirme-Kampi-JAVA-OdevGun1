public class Main {

    public static void main(String[] args) {

        char grade = 'F';

        switch (grade){
            case 'A': System.out.println("Geçti | Notunuz: Yüksek");
                break;
            case 'B': System.out.println("Geçti | Notunuz: İyi");
                break;
            case 'C': System.out.println("Geçti | Notunuz: Normal");
                break;
            case 'D': System.out.println("Koşullu Geçti | Notunuz: Düşük");
                break;
            case 'E': System.out.println("Kaldı | Notunuz: Çok Düşük");
                break;
            case 'F': System.out.println("Kaldı | Notunuz: Aşırı Düşük");
                break;
            default: System.out.println("Geçerisiz Not Verisi Girildi!");

        }

    }
}
