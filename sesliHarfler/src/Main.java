public class Main {

    public static void main(String[] args) {
        char _harf = 'A';
        boolean isTrue = false;

        char[] kalinSesli = {'a', 'ı', 'o', 'u','A', 'I', 'O', 'U'};
        char[] inceSesli = {'e', 'i', 'ö', 'ü','E', 'İ', 'Ö', 'Ü'};

        for(char harf : kalinSesli){
            if(_harf == harf){
                System.out.println("Kalin Sesli!");
                isTrue = true;
            }
        }
        if(isTrue != true){
            for(char harf : inceSesli){
                if(_harf == harf){
                    System.out.println("ince Sesli!");
                }
            }
        }
    }
}
