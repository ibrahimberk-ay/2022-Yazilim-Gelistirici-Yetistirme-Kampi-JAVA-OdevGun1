public class Main {

    public static void main(String[] args) {
	    int[] _numbers = {1 ,2, 5, 7, 9, 0};
	    int _number = 2;
	    boolean isTrue = false;

	    for(int number : _numbers){
	        if(number == _number){
	            isTrue = true;
            }
        }
        if(isTrue){
            System.out.println("Sayi Mevcut!");
        }else{
            System.out.println("Sayi Mevcut Degil!");
        }



    }
}
