package com.khushi;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int fact=1;
        int n=in.nextInt();
        for(int i=n;i>=1;i--){
            fact=fact*i;
        }
        System.out.println(fact);

    }

}
