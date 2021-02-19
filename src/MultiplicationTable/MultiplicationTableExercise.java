package MultiplicationTable;

public class MultiplicationTableExercise {
    public static void main(String[] args) {
        System.out.println("The Multiplication table of 5");
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 * " + i + " = " + 5 * i);
        }
    }

    void printMultiplicationTable(int table) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(table + " * " + i + " = " + table * i);
        }
    }
}
