import java.util.Scanner;
class basic_program{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int x = sc.nextInt();

        System.out.print("Enter the second number: ");
        int y = sc.nextInt();

        int result = x + y;
        System.out.println("The result of the sum: "+result);
    }
}