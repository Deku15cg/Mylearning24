package DuplicateElement;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DemoHash {

	public static void main(String[] args) {

		int a[]= {1,2,5,6,2,4,4,6,5};
		Map<Integer,Integer> hm=new HashMap<>();
		for(int x:a) {
			if(!hm.containsKey(x)) {
				hm.put(x, 1);
			}
			else
				hm.put(x, hm.get(x)+1);
		}
		for(Integer x:hm.keySet()) {
			if(hm.get(x)>1)
				System.out.print(" "+x+":"+hm.get(x));
		}
		
	}

}
