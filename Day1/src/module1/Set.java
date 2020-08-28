package module1;
import java.util.*; 

class Set{ 
	public static void main(String[] args) 

	{
		TreeSet<String> ts = new TreeSet<String>(); 
		ts.add("L"); 
		ts.add("M"); 
      	ts.add("N"); 
      	ts.add("O");
        ts.add("P");		
System.out.println("Tree Set is :" + ts);
NavigableSet<String> trev = ts.descendingSet();
Iterator<String> itr = trev.iterator(); 
    while (itr.hasNext()) {
    System.out.println("Value: " + itr.next() + " "); 
	}
   String val = "N";
   System.out.println("Higher: " + ts.higher(val)); 
   System.out.println("Lower: " + ts.lower(val)); 
    ts.remove("L");
   System.out.println("After removing element :" + ts);

} 
    
	} 


