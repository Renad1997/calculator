import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
           boolean isChoose=true;
           System.out.println();
        ArrayList<Double> resultsList = new ArrayList<>();
        while(isChoose){
            double number1 = 0;
            double number2 = 0;
            int choice = menu(input);
            if(choice == 0){break;}
            if(choice < 9){
                 number1 = EnterNumber(input);
                 number2 = EnterNumber(input);
            }

            double result=0;

            switch (choice){
                case 1:
                    result = addition(number1,number2);
                    break;
                case 2:
                    result = subtraction(number1,number2);
                    break;
                    case 3:
                        result = multiplication(number1,number2);
                        break;
                    case 4:
                        result = division(number1,number2);
                        break;
                    case 5:
                        result = modulus(number1,number2);
                        break;
                    case 6:
                        result = findMin(number1,number2);
                        break;
                    case 7:
                        result = findMax(number1,number2);
                        break;
                    case 8:
                        result = findAverage(number1,number2);
                        break;
                    case 9:
                        System.out.println(resultsList.get(resultsList.size()-1));
                        break;
                    case 10:
                       resultsList.forEach(x -> System.out.println(x));
                        break;

            }
            if(choice < 9){ System.out.println(result);}

            resultsList.add(result);
        }

    }
    public static int menu(Scanner scan){
        int choice=0;
        try{
            System.out.println("Enter 1 to addition the numbers");
            System.out.println("Enter 2 to subtraction the numbers");
            System.out.println("Enter 3 to Multiplication the numbers");
            System.out.println("Enter 4 to Division the numbers");
            System.out.println("Enter 5 to modulus the numbers");
            System.out.println("Enter 6 to find minimum number");
            System.out.println("Enter 7 to find maximum number");
            System.out.println("Enter 8 to find the average of numbers");
            System.out.println("Enter 9 to print the last result in calculator");
            System.out.println("Enter 10 to print the list of all results in calculator");
            System.out.println("Choose number from 1 to 10 :");
            choice =  scan.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Please enter a valid number.");
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return choice;
    }
    public static double EnterNumber(Scanner input){
        System.out.println("Enter Number:");
      double  number =input.nextDouble();
      return number;
    }
    public static double addition(double number1,double number2){
        return number1+number2;
    }
    public static double subtraction(double number1,double number2){
        return number1-number2;
    }
    public static double multiplication(double number1,double number2){
        return number1*number2;
    }
    public static double division(double number1,double number2){
        return number1/number2;
    }
    public static double modulus(double number1,double number2){
        return number1%number2;
    }
    public static double findMin(double number1,double number2){
        return Math.min(number1,number2);
    }
    public static double findMax(double number1,double number2){
        return Math.max(number1,number2);
    }
    public static double findAverage(double number1,double number2){
        double sum=0;
         sum = number1 + number2;
        double Average = sum/2;
        return Average;
    }
}