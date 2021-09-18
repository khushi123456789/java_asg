import java.util.Scanner;

public class eem514_1901862_02c {


    public static void main(String[] args) {
        // char[] a={H,E,K,L,O};
        String str;
        String ex;
        Scanner in = new Scanner(System.in);
        int i;
        str = in.nextLine();
        char ch[] = str.toCharArray();
        int n = ch.length;
        //while (n != 0) {
            for (i = 0; i < n/2 +1; i++) {
             if(i!=n/2)
                    System.out.print(ch[i]);

                System.out.print(ch[n-i-1]);
                }

            }
        }

