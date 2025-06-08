import java.util.Scanner;
public class calculator {
public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter First Number:");
    int num1=scanner.nextInt();
    System.out.println("Enter second number");
    int num2=scanner.nextInt();
    System.out.println("Enter third Number:");
    int num3=scanner.nextInt();
    int sum=num1+num2+num3;
    int mul=num1*num2*num3;
    int sub=num1-num2-num3;
    int div=num1/num2/num3;
    System.out.println("The sum is " + sum);
    System.out.println("The mul is " + mul);
    System.out.println("The sub is " + sub);
    System.out.println("The div is " + div);
    scanner.close();
}   
}
