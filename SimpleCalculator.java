import java.util.*;
public class SimpleCalculator{
    public static void main(String[] args){
        int operator,n1,n2;
        System.out.println("1 - Add \n 2 - Substact \n 3 - Multiply \n 4 - Divide");
        System.out.println("Choose operator: ");
        Scanner sc = new Scanner(System.in);
        operator = sc.nextInt();
        System.out.println("Enter first number: ");
        n1 = sc.nextInt();
        System.out.println("Enter second number: ");
        n2 = sc.nextInt();  
        
        double result = 0;
        switch(operator){
            case 1:
                result = n1 + n2;
                break;

            case 2:
                result = n1 - n2;
                break;

            case 3:
                result = n1 * n2;
                break;

            case 4:
                result = n1 / n2;
                break;

                default:
                System.out.println("Entered operator is not valid");
        }

        System.out.println("Result is : " + result);
    }
}
