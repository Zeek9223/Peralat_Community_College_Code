import java.util.Scanner;
public class GravityB {
    public static void main(String[]args){


        //my initial weight is short since im under 255
        double Weight;
        short Planet;
        //want float so i dont have to many decimals number and time moon gravity with my weight

        Scanner input = new Scanner(System.in);
        //this lets me install the scanner input so i can input an number
        System.out.println("menu");
        System.out.println("Enter which planet you want to check your weight on. Enter \n 1 for Mercury \n 2 for Venus \n 3 for mars \n 4 for Earth Moon");
        Planet =input.nextShort();


        System.out.println("Enter your weight please");
        //lets me print out the Question before input

        Weight =input.nextDouble() ;
        //this lets me do the input and also calculate the gravity of the moon
        switch(Planet) {
            //create statement just in case some inter invalid put
            case 1:
            Weight =Weight * 0.37 ;
            System.out.println("My weight on the Mercury is " + Weight * 0.37 + " pounds");
            break;
            case 2:
            //create statement just in case some inter invalid put
            Weight = Weight * 0.91;
            System.out.println("My weight on the Venus is " + Weight * 0.91 + " pounds");
            break;
            case 3:
            //create statement just in case some inter invalid put
            Weight = Weight * 0.38;
            System.out.println("My weight on the Mars is " + Weight * 0.38 + " pounds");
            break;
            case 4:
            //create statement just in case some inter invalid put
            Weight = Weight * 0.17;
            System.out.println("My weight on the Moon is " + Weight * 0.17 +  " pounds");
            break;
            default:
            System.out.println("Invalid Input");
            //created for someone not using correct input
        }


    }
}