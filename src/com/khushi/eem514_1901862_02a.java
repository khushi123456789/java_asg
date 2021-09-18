import java.util.Scanner;
import java.util.Arrays;
public class eem514_1901862_02a {
        public static void main(String[] args) {

            int[]ch=new int[26];
            int n, count = 0,i,j,t;
            Arrays.fill(ch,0);
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine().toLowerCase();
            while (count<str.length())
            {

                if (str.charAt(count) >= 'a' && str.charAt(count) <= 'z')
                {
                    n= str.charAt(count) - 'a';
                    ch[n]++;
                }
                count++;
            }
            Arrays.sort(ch);

            for(i=25;i>0;i--)
            {
                if(ch[i]!=0)
                    System.out.print(ch[i]+" ");
                else
                    break;
            }
        }
    }

