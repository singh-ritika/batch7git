package module1;
import java.util.*;
public class Swap

{
    public static void main(String[] args) 
    {
       try {
    	   ArrayList<String> list = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e", "f"));
       
        System.out.println(list);
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter indexes to swap \n i:  \n j:");
        int i = sc.nextInt(); 
        int j = sc.nextInt(); 
        Collections.swap(list, i, j);
        System.out.println(list);
    
    }catch (ArrayIndexOutOfBoundsException e) {

        System.out.println("Please enter the index numbers between 0 and 5."+e);
        }
    }
}

