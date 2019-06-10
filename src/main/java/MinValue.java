import java.util.Scanner;

public class MinValue {
    public static void main(String[] args) {
        int size, exit;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            do {
                System.out.println("Enter size: ");
                size = scanner.nextInt();
                if (size > 20)
                    System.out.println("Size should not exceed 20");
            }
            while (size > 20);

            array = new int[size];
            int i = 0;
            while (i < array.length) {
                System.out.println("Enter element" + (i + 1) + " : ");
                array[i] = scanner.nextInt();
                i++;
            }
            System.out.println("Property list: ");
            System.out.print("{ ");
            for (int j : array) {
                System.out.print(j + " ");
            }
            System.out.print("}");


            System.out.printf("\n%-20s", "The lowest value of element in the Array is: ");
            int min = array[0];
            int index=0;
            for (int j : array) {
                if (min> j) {
                    min = j;
                    index = j;
                }
            }
            System.out.println(min);
            System.out.println("the position of index is: "+index);
            System.out.println("");
            System.out.println("\n" + "Enter 0 to exit, other to continue");
            exit = scanner.nextInt();
            if (exit == 0)
                System.exit(0);
        }
        while (exit != 0);
    }
}
