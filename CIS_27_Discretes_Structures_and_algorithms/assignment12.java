import java.util.Random;
import java.util.Scanner;


public class assignment12 {

    Numbers NumbersObject = new Numbers();


    public static void main(String[] args) {

        int i;

        int max;
        int v[];
        int sum = 0;
        Random values = new Random();
        max = 500;
        sum = 0;
        int b = 0;
        v = new int[max];
        for (i = 0; i < max; i++) {
            v[i] = values.nextInt(1000) + 1;
        }

        Scanner menu = new Scanner(System.in);

        do {
            System.out.println("1. Output all values");
            System.out.println("2. Output the sum of all values");
            System.out.println("3. Output all odd numbers");
            System.out.println("4. Output all even numbers");
            System.out.println("5. Output middle value");
            System.out.println("6. Output first value in the array");
            System.out.println("7. Output last value in the array");
            System.out.println("8. Enter a search value  / Implement Linear Search ");
            System.out.println("9. Output Last Value in the Array");
            System.out.println("10. Output the Lowest Value and its location in the array");
            System.out.println("11. To end course");


            System.out.println("Please choose option");


            int o = menu.nextInt();

            switch (o) {

                case 1:
                    Numbers.method1(v);
                    break;
                case 2:
                    Numbers.method2(v);

                    break;

                case 3:
                    Numbers.method3(v);

                case 4:
                    Numbers.method4(v);

                    break;

                case 5:
                    Numbers.method5(v);

                    break;
                case 6:
                    Numbers.method6(v);

                    break;
                case 7:
                    Numbers.method7(v);

                    break;
                case 8:
                    Numbers.method8(v);

                    break;
                case 9:
                    Numbers.method9(v);

                    break;
                case 10:
                    Numbers.method10(v);

                    break;

                default:
                    System.out.println("Not the correct input");

            }
            System.out.println();

    }while (true) ;

    }
}











