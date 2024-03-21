package DuplicateElement;

import java.util.HashMap;
import java.util.Map;

public class DemoCount {
public static void main(String [] args) {
	DemoCount d=new DemoCount();
	d.getInput("a3b4a1");
	
}
	
	void getInput(String str) {
		char a[]=str.toCharArray();
		Map<Character,Integer> hm=new HashMap<>();
		for(char c:a) {
			if (hm.containsKey(c)) {
				hm.put(c ,hm.get(c)+1);
		}
			else
				hm.put(c, 1);
			
		}
		for (Map.Entry entry :hm.entrySet()) {
		    System.out.print(entry.getKey() + " " + entry.getValue());
		}

	}
}
 
