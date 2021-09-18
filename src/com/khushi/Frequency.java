package com.khushi;
import java.util.Arrays;
import java.util.Scanner;

public class Frequency
    {
        public static void main(String[] args) {
            String str ;
            Scanner in=new Scanner(System.in);
            str=in.next();

            int[] freq = new int[str.length()];
            int i, j;

            char string[] = str.toCharArray();

            for(i = 0; i <str.length(); i++) {
                freq[i] = 1;
                for(j = i+1; j <str.length(); j++) {
                    if(string[i] == string[j]) {
                        freq[i]++;

                        string[j] = '0';
                    }
                }
            }

            Arrays.sort(freq);
            reverse(freq);

            for(i = 0; i <freq.length; i++) {
                if(string[i] != ' ' && string[i] != '0')
                    System.out.print( freq[i]+" ");
            }
        }

        public static void reverse(int[] array)
        {

            int n = array.length;

            for (int i = 0; i < n / 2; i++) {
                int temp = array[i];
                array[i] = array[n - i - 1];

                array[n - i - 1] = temp;
            }
        }
    }

