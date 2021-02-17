package forloopExercises;

public class forloopExrecises {

    public static void main(String... args) {
        //Print number from 1 to 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        //Print number from 10 to 1
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        //Print the square of first 10 numbers
        for (int i = 1; i <= 10; i++) {
            System.out.println(i * i);
        }

        //Print first 10 even numbers
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        //Print first 10 odd numbers
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

    }


}
