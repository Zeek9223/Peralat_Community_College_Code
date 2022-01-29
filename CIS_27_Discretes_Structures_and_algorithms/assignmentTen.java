import java.util.Random;
import java.util.Scanner;

public class assignmentTen {

    public static void main(String[]args){

        int i;
        int max = 500;
        int v[]=new int[max];
        Random values =new Random();
        int sum = 0;

        for(i = 0;i <max;i++) {
            v[i] = values.nextInt(1000) + 1;
        }

            Scanner menu = new Scanner(System.in);

            while(true){
                System.out.println ("1. Output all values");
                System.out.println ("2. Output the sum of all values");
                System.out.println ("3. Output all odd numbers");
                System.out.println ("4. Output all even numbers");
                System.out.println ("5. Output middle value");
                System.out.println ("6. Output first value in the array");
                System.out.println ("7. Output last value in the array");

                System.out.println("Please choose option");
                        int o = menu.nextInt();

                            switch(o){

                                case 1:
                                    for(i =0;i<max;i++){
                                        System.out.print(v[i]+" ");
                                    }
                                    break;
                                case 2:
                                    for(i = 0;i<max;i++){
                                        sum += v[i];
                                }
                                System.out.println("The sum of all values: " + sum);
                                break;

                                case 3:
                                    System.out.println("the Output of all odd values");
                                    for(i = 0; i < max;i++){
                                        if(v[i]%2 ==1 ){
                                            System.out.print(v[i]+ " ");
                                        };
                                    }
                                    break;
                                case 4:
                                    System.out.println("the Output of all even values");
                                    for(i = 0; i < max;i++){
                                        if(v[i]%2 ==0 ){
                                            System.out.print(v[i]+ " ");
                                        };
                                    }
                                    break;

                                case 5:
                                    System.out.println("Output middle value:" + v[max/2]);
                                    break;
                                case 6:
                                    System.out.println("Output first value in the array: " + v[0]);
                                    break;
                                case 7:
                                    System.out.println("Output last value in the array " + v[max -1]);
                                    break;
                                default:
                                    System.out.println("Not the correct input");

                            }
                            System.out.println();

                        }

            }
        }


