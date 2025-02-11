import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        boolean exit = false;
        
        while(exit==false){
            System.out.println("Type the number of the operation you want to do:");
            System.out.println("1. Addition");
            System.out.println("2. Substraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Remainder");
            System.out.println("6. Exit");
            choice = sc.nextInt();
            sc.nextLine();
            if(choice == 6){
                exit = true;
            }
            else{
                System.out.println("Give me your first number");
                int x  = sc.nextInt();
                sc.nextLine();
                System.out.println("Give your second number");
                int y = sc.nextInt();
                sc.nextLine();
    
                switch(choice){
                    case 1:
                        System.out.println("The result of the addition of your numbers is " + (x+y));
                        break;
                    case 2:
                        System.out.println("The result of the substraction of your numbers is " + (x-y));
                        break;
                    case 3:
                        System.out.println("The result of the multiplication of your numbers is " + (x*y));
                        break;
                    case 4:
                        float x_float = (float) x;
                        float y_float = (float) y;
                        System.out.println("The result of the division of your numbers is " + (x_float/y_float));
                        break;
                    case 5:
                        System.out.println("The remainder of the division of your numbers is " + (x%y));
                        break;
                    default:
                        System.out.println("Choose a valid option");
                        break;
                }
            }
            System.out.println("\n");
        }
        sc.close();
    }  
}
