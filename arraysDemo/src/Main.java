import javax.sound.midi.SysexMessage;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String ogrenci1 = "Berk";
        String ogrenci2 = "Kemal";
        String ogrenci3 = "Ayşe";
        String ogrenci4 = "Nur";

        System.out.println(ogrenci1 + "\n");
        System.out.println(ogrenci2 + "\n");
        System.out.println(ogrenci3 + "\n");
        System.out.println(ogrenci4 + "\n");

        System.out.println("------------------------------");

        String[] ogrenciler = new String[4];
        ogrenciler[0] = "Berk";
        ogrenciler[1] = "Kemal";
        ogrenciler[2] = "Ayşe";
        ogrenciler[3] = "Nur";

        for(int i=0;i<ogrenciler.length;i++)
            System.out.println(ogrenciler[i] + "\n");

        System.out.println("------------------------------");

        for(String students: ogrenciler) {
            System.out.println(students);
            System.out.println("\n");
        }

    }
}
