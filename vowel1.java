import java.io.*;
import java.util.*;
class vowel
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       char n=sc.nextLine().charAt(0);
       if(n=='a'||n=='e'||n=='i'||n=='o'||n=='u'||n=='A'||n=='E'||n=='I'||n=='O'||n=='U')
       {
           System.out.print("Vowel");
       }
       else if((n>='a'&&n<='z')||(n>='A'&&n<='Z'))
       {
           System.out.print("constant");
       }
    }
}
