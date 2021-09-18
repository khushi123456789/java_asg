import java.lang.Math;
import java.util.Scanner;

public class eem514_1901862_o2b {
    public static void main(String[] args) {

        int result;

        Scanner input = new Scanner(System.in);
    String exp;
        exp = input.nextLine();
        String s1=exp.substring(0,3);
        String s2=exp.substring(3,exp.length()-1);
        int a=Integer.parseInt(s2.substring(s2.indexOf('(')+1,s2.indexOf(',')));
        int b=Integer.parseInt(s2.substring(s2.indexOf(',')+1,s2.length()));

        if(s1.equals("ADD"))
        {
            result=a+b;
            System.out.println(result);
        }
        else if(s1.equals("SUB")){
            result=a-b;
            System.out.println(result);
        }
        else if(s1.equals("MUL")){
            result=a*b;
            System.out.println(result);
        }
        else  if(s1.equals("ADD")){
            result=a/b;
            System.out.println(result);
        }
        else if(s1.equals("POW"))
        {
            System.out.println((int)Math.pow(a,b));
        }

       }
}
