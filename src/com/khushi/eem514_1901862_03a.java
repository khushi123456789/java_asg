import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.*;
import java.util.Scanner;
import java.util.Stack;
public class eem514_1901862_03a {


        public static void main (String [] args) throws Exception
        {
            Scanner inp = new Scanner(System.in);
            String file =inp.nextLine();
            File f = new File(file);
            String [] s = null;
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String str;
            String result="";
            int counter=0, c=0, temp=0 ;
            Stack<String> stack = new Stack<String>();
            while ((str=br.readLine())!= null) {
                s=str.split(" ");
                for (String input: s) {
                    if(input.equals("class"))
                    {
                        if(stack.isEmpty()) {
                            temp = c;
                            c++;
                            counter=0;
                        }
                        else  {
                            result="ERROR";
                            break;
                        }
                    }
                    if((temp+1) == c) {
                        String[] a=input.split("");
                        for(String symbol : a) {
                            if(( symbol.equals("{"))){
                                if(counter == 0){
                                    stack.push("{");}
                                else if (counter == 1) {
                                    result="ERROR";
                                    break;
                                }
                            }
                            if ((symbol.equals("}")))
                            {
                                if ( stack.isEmpty())
                                {
                                    result="ERROR";
                                    break;
                                }
                                else
                                {
                                    stack.pop();
                                    if(stack.isEmpty())
                                    {
                                        counter+=1;
                                        break;
                                    }
                                }}
                        }
                    }
                }
            }
            if (result.equals("ERROR"))
            {
                System.out.println("ERROR");
            }
            else
            {
                System.out.println(c);
            }
            fr.close();
        }
    }

