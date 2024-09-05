//Fibonacci series

import java.util.Scanner;
class Fibonacci{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your integer: ");
        int n = input.nextInt();
        int num1 = 0,num2 = 1;
        System.out.print("Fibonacci series: " + num1 + "," + num2);
        for(int i = 2 ; i < n ; i ++){
            int num3 = num1+num2;
            System.out.print(","+num3);
            num1 = num2;
            num2 = num3;
        }

    }
}