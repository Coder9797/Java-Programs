import java.util.Scanner;
public class Fibonacci_Number 
{
    public static void main(String[] args)
    {
        System.out.println("Number of terms of the series:");
        Scanner sc1 = new Scanner(System.in);
        int no=sc1.nextInt();
        int arr[]=new int[no];
        for(int i=0;i<=(no-2);i++)
        {
            if(i>=2)
            {
                arr[i]=arr[i-1]+arr[i-2];
            }
            if(i==0){
                arr[0]=0;
            }
            if(i==1)
            {
                arr[1]=1;
            }
            
        }
        for(int i=0;i<=(no-2);i++)
        {
            System.out.println(arr[i]);
        }

    }
}
