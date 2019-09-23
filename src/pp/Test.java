package pp;
import java.util.*;

public class Test {

	public static void main(String[] args) {
			
		ArrayList<String> first=new ArrayList<String>();
		first.add("Vijay");
		first.add("Kiran");
		System.out.println("First"+first);
		ArrayList<String> last=new ArrayList<String>();
		last.add("Kadam");
		last.add("Somase");
		System.out.println("Last"+last);
			
		LinkedList<String> l=new LinkedList<String>();
			
	Iterator<String> i=first.iterator();
	Iterator<String> j=last.iterator();
	
	while (i.hasNext()&&j.hasNext()) {
	     l.add(i.next()+" "+j.next());
	}
	System.out.println("First & Last="+l);
		
		
	}

}
