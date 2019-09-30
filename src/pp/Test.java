package pp;
import java.util.*;

public class Test {

	public static void main(String[] args) {
			
		ArrayList<String> first=new ArrayList<String>();
		first.add("Vijay");
		
		
		ArrayList<String> middle=new ArrayList<String>();
		middle.add("Murlidhar");
		
		ArrayList<String> last=new ArrayList<String>();
		last.add("Kadam");
		
		LinkedList<String> l=new LinkedList<String>();
			
	Iterator<String> i=first.iterator();
	Iterator<String> j=middle.iterator();
	Iterator<String> k=last.iterator();
	
	while (i.hasNext()&&j.hasNext()&&k.hasNext()) {
	     String str=i.next()+" "+j.next()+" "+k.next();
	     l.add(str);
	}
	System.out.println("Full name"+l);
	System.out.println("kkkk");
	System.out.println("hr");
	
		
	
	}

}
