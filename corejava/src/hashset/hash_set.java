package hashset;
import java.util.*;

public class hash_set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet <String> set =new HashSet <String> ();
		//LinkedHashSet <String> set =new LinkedHashSet <String> ();
		set.add("java");
		set.add("jsp");
		set.add(null);
	
		System.out.println(set);
		Iterator <String> it= set.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
			
			
		}

	}

}
