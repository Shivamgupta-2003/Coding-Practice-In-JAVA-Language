import java.util.Scanner;
public class Main {
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);
    int n1 = s.nextInt();
    int n2 = s.nextInt();
    for (int i = 1; i <= n1; i++)
    {
      for (int j = 1; j <= n2; j++)
      {
        
        
    if ( i == 1 || i == n1) 
    System.out.print("*");
        
       
    else if(j==1 || j==n2)
    System.out.print("*");
      
      
    else
    System.out.print(" ");
      
      
    }
    System.out.println();
  }
  
}
}
