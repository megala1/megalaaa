import java.io.*;
import java.util.*;
class vowel
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       char n=sc.nextLine().charAt(0);
       if(n=='a'||n=='e'||n=='i'||n=='o'||n=='u')
       {
           System.out.print("Vowel");
       }
       else
       {
           System.out.print("not Vowel");
       }
    }
}

