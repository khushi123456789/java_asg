package com.khushi;

import java.util.Scanner;

public class simpleinterst {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int p= in.nextInt();
        int i= in.nextInt();
        int r= in.nextInt();
        double si=(double) ((p*i*r)/100);
        System.out.println(si);
    }
}
