import java.util.Scanner;
public class Maximum_Pairwise_product
 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
		//System.out.println("Enter number of digits");
		int n=sc.nextInt();
		int Max=0;
		Scanner sc1=new Scanner(System.in);
		//System.out.println("Enter digits");
		String n1= sc1.nextLine();
		int a[]=new int [n];
		String whole="";
		int j=0,i=0;
		while(j<n1.length())
		{
			String str =String.valueOf(n1.charAt(j));
			if(str.isBlank())
			{
				j++;
				continue;
			}
			while(j<n1.length())
			{
				String str1 =String.valueOf(n1.charAt(j));
				if(str1.isBlank())
				{
					j++;
					break;
				}
				 whole=whole+str1;
				 j++;
			}
			int con=Integer.parseInt(whole); 
			//System.out.println(con);
			a[i]=con;
			i++; 
			whole="";
				
		}
		for(int b=0;b<n;b++)
		{
			for(int c=0;c<n;c++)
			{
				if(b==c)
				{
					continue;
				}
				else
				{
					if(a[b]*a[c]>=Max)
					{
						Max=a[b]*a[c];
					}
				}
			}
		}
		System.out.println(Max);
    }    
}
