package comparing_number;
import java.util.Scanner;

public class compare {
    public static void main(String args[])
    {//program number 10
        int a, b;
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the first element:");
        a= sc1.nextInt();
        System.out.println("Enter the Second element:");
        b= sc1.nextInt();
        if(a==b)
        {
            System.out.println(a+"="+b);
        }
        if(a<b)
        {
            System.out.println(a+"<"+b);
        }
        if(a>b)
        {
            System.out.println(a+">"+b);
        }
        if(a!=b)
        {
            System.out.println(a+"!="+b);
        }
        if(a<=b)
        {
            System.out.println(a+"<="+b);
        }
        if(a>=b)
        {
            System.out.println(a+">="+b);
        }


    }
}
