import model.Bug;
import model.BugReporter;

import java.util.*;

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
//       Bug robak = new Bug("opisik", new BugReporter("Ar", "Ku", "arek@test.pl"),4,true);
//        robak.showBug();
////        System.out.println(robak);
//
//        int[] numbers = {1,4,2,5,72,4,7,0,9};
//
//        for (int i = 0; i < numbers.length; i++){
//            int max = numbers[i];
//            for (int j = i; j< numbers.length; j++){
//                if(numbers[j]>max){
//                    max = numbers[j];
//                    numbers[j]=numbers[i];
//                    numbers[i]=max;
//                }
//            }
//        }
//        for (int liczba :numbers
//        ) {
//            System.out.println(liczba);
//        }
//
        List<Bug> bugs = new ArrayList<Bug>();
        bugs.add(new Bug("opisik5", new BugReporter("Ar5", "Ku", "arek5@test.pl"),4,true));
        bugs.add(new Bug("opisik4", new BugReporter("Ar4", "Ku", "arek4@test.pl"),4,true));
        bugs.add(new Bug("opisik2", new BugReporter("Ar2", "Ku", "arek2@test.pl"),4,true));
        bugs.add(new Bug("opisik2", new BugReporter("Ar2", "Ku", "arek2@test.pl"),4,true));
        bugs.add(new Bug("opisik1", new BugReporter("Ar1", "Ku1", "arek1@test.pl"),4,true));
        bugs.add(new Bug("opisik3", new BugReporter("Ar", "Ku3", "arek3@test.pl"),4,true));


        Collections.sort(bugs);

        for (Bug bug : bugs){
            System.out.println(bug);
        }

        Set<Bug> uniBugs  = new HashSet<Bug>(bugs);

        for (Bug bug : uniBugs){
            System.out.println(bug);
        }

    }


}