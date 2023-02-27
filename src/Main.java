import model.Bug;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

//
//        int a=1,b=2,c=4,d=4;
//
//        if ((a+b) % 2 == 0){
//            System.out.println("a+b parzyste");
//        }
//        if ((c+d) % 2 == 0){
//            System.out.println("c+d parzyste");
//        }
//        if ((a+b) % 2 == 0 && (c+d) % 2 == 0){
//            System.out.println("Obie sumy parzyste");
//        }
//
//       Bug robak = new Bug("opisik", "arek@test.pl",4,true);
//        robak.showBug();
//        System.out.println(robak.getPriority());

        int[] numbers = {1,4,2,5,72,4,7,0,9};

        for (int i = 0; i < numbers.length; i++){
            int max = numbers[i];
            for (int j = i; j< numbers.length; j++){
                if(numbers[j]>max){
                    max = numbers[j];
                    numbers[j]=numbers[i];
                    numbers[i]=max;
                }
            }
        }
        for (int liczba :numbers
        ) {
            System.out.println(liczba);
        }


    }
}