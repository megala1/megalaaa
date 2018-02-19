import java.io.*;
import java.util.*;
class leap
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        if(year%4==0)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}
