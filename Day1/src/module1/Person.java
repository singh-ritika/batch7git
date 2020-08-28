package module1;

public class Person 
{
	   int Id;  
	   String Name;  
		 
	   Person(int id, String name){  
	       this.Id = id;  
	       this.Name = name;  
	   }  
	   void display(){
	        System.out.println("Id: "+Id+" Name: "+Name);
	   }  
		   
	   public static void main(String args[])
	   {  
		Person obj1 = new Person(01,"Ritika");  
		Person obj2 = new Person(02,"Megha");  
		obj1.display();  
		obj2.display();  
	   }  
	}
