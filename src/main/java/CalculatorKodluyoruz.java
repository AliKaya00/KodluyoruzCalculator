import java.util.Scanner;

public class CalculatorKodluyoruz {

    public class Calculator {
        public static void main(String[] args) {
            int number1, number2, selectedNumber;

            Scanner input = new Scanner(System.in);
            System.out.println("Please enter a valid number: ");
            number1 = input.nextInt();
            System.out.println("PLease enter another valid numb er: ");
            number2 = input.nextInt();

            System.out.println("1.Plus\n2.Minus\n3.Multiplication\n4.Division");
            System.out.println("Your select : ");
            selectedNumber = input.nextInt();

            switch (selectedNumber) {
                case 1:
                    System.out.println(number1 + number2);
                    break;
                case 2:
                    System.out.println(number1 - number2);
                    break;
                case 3:
                    System.out.println(number1 * number2);
                    break;
                case 4:
                    if (number2 == 0) {
                        System.out.println("Invalid number");
                    }
                    System.out.println(number1 / number2);
                    break;
                default:
                    System.out.println("You selected invalid number");

            }


        }


    }



}
