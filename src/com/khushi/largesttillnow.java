package com.khushi;

import java.util.Scanner;

public class largesttillnow {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int largest=Integer.MIN_VALUE;
        int x=0;
        while((x=in.nextInt())!=0){

            if(x>largest)
                largest=x;

        }
        System.out.println(largest);



    }
}
