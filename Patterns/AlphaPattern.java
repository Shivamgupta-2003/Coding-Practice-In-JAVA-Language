import java.util.Scanner;



public class Solution
{
    public static void main(String[] args)
    {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int i=1;
    
    while(i<=n)
    {
   
    
    int j=1;
    while(j<=i)
    {
    System.out.print((char)(i+64));
    j=j+1;
    }
    
   
    
    
    System.out.println();
    i=i+1;
    }
    }
}
