package CWHLectureCodes;
import java.util.Scanner;
public class Lecture5 {
    public static void main(String[] args){
        System.out.println("It works!");
        //input from keyboard(user)
        System.out.println("Taking input from keyboard");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1:");
        int a =sc.nextInt();
        System.out.println("Enter number 2:");
        int b =sc.nextInt();
        int sum = a+b;
        System.out.println("The sum of both the integers is:"+sum);
        sc.close();


    }
    
}
