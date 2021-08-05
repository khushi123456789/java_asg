package com.khushi;
import java.util.Scanner;
public class eem514_1901862_00
{
    public static void main(String[] args)
    {
        int a, b, c, x, temp;
         Boolean choice;
        Scanner sc = new Scanner(System.in);


        a = sc.nextInt();

        b = sc.nextInt();

        c = sc.nextInt();
        choice=sc.nextBoolean();
if(choice==true) {
    temp = a > b ? a : b;

    x = c > temp ? c : temp;

    System.out.println(x);
}
else if(choice==false){
    temp = a < b ? a : b;

    x = c < temp ? c : temp;

    System.out.println(x);
}
    }
}
