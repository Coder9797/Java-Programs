import java.util.Scanner;
public class GCD_Euclidian_Method
{
    static int Gcd(int a,int b)
    {
        int a_;
        if(b==0)
        {
            return a;
        }
        else
        {
            a_=a%b;
            return Gcd(b,a_);
        }
    }    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int no1,no2;
        System.out.println("Enter Number 1:");
        no1=sc.nextInt();
        System.out.println("Enter Number 2:");
        no2=sc.nextInt();
        int gcd=Gcd(no1,no2);
        System.out.println("GCD:"+gcd);
    }
}
