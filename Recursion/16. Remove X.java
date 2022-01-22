/*

Given a string, compute recursively a new string where all 'x' chars have been removed.

Input format :
String S

Output format :
Modified String

Constraints :
1 <= |S| <= 10^3
where |S| represents the length of string S. 

Sample Input 1 :
xaxb

Sample Output 1:
ab

Sample Input 2 :
abc

Sample Output 2:
abc

*/




// Solution Class that contains function for solving problem
public class solution {

	public static String removeX(String input){
		
        if(input.length()==0)
            return "";
        
        String smallAns=input.substring(1);
        
        if(input.charAt(0)=='x')
            return removeX(smallAns);
        
        else
            return input.charAt(0)+removeX(smallAns);
        
        
	}
}


// Main Code
import java.util.Scanner;

public class runner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(solution.removeX(input));
	}
}

