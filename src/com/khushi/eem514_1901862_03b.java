import java.util.Scanner;
import java.lang.System;
public class eem514_1901862_03b {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        cString(n);
        cBuffer(n);
        cBuilder(n);
    }
    static void cString(int n){
        String s=new String();
        long start=System.nanoTime();
        for(int i=0;i<n;i++)
            s=s+'*';
        long end=System.nanoTime()-start;
        System.out.print(" "+end);
    }
    static void cBuffer(int n){
        StringBuffer s=new StringBuffer();
        long start=System.nanoTime();
        for(int i=0;i<n;i++)
            s=s.append('*');
        long end=System.nanoTime()-start;
        System.out.print(" "+end);
    }
    static void cBuilder(int n){
        StringBuilder s=new StringBuilder();
        long start=System.nanoTime();
        for(int i=0;i<n;i++)
            s=s.append('*');
        long end=System.nanoTime()-start;
        System.out.print(" "+end);
    }
}
