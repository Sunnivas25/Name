package collectionConcept;

import java.util.ArrayList;
import java.util.Collection;

public class arylistDemo {

	public static void main(String[] args) {
		ArrayList<Integer> ll = new ArrayList<Integer>();
		System.out.println("the numbers");
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		System.out.println(ll);
		System.out.println(ll.size());
		System.out.println();
		for(Integer i:ll) {
			System.out.println(i);
		}
	}
}


/*package CollectionsConcepts;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> Lname=new ArrayList<String>();    //Collection concept     //String wrapper class
		Lname.add("Saranraj");         //adding the elements
		Lname.add("manoj kumar");
		Lname.add("Logeshwaran");
		Lname.add("Nisha");
		Lname.add("Sandhiya");
		Lname.add("Rajesh");
		System.out.println("The Names:");

		for(String s:Lname)//objects are repeating here
		{
			System.out.println(s);
	}
	}
}*/

/*package CollectionsConcepts;
import java.util.ArrayList;
public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> Lname=new ArrayList<String>();   //Collections concept //String Wrapper class
		Lname.add("Saranraj");//adding the elements
		Lname.add("manoj kumar");
		Lname.add("Logeshwaran");
		Lname.add("Nisha");
		Lname.add("Sandhiya");
		Lname.add("Rajesh");
		System.out.println("The Names:");
		
		for(String s:Lname)     ///objects are repeating here
		{
			System.out.println(s);
	}
		System.out.println("The Size of the Lname: "+Lname.size());
		ArrayList<Long> number=new ArrayList<Long>();   //Integer Wrapper class
		number.add(12l);
		number.add(23l);
		
		for(long i:number)
		{
			System.out.println(i);
		}
		System.out.println("The Size of the number: "+number.size());

	}
}*/