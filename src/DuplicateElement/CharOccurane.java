package DuplicateElement;

import java.util.HashMap;
import java.util.Map;

public class CharOccurane {

	public static void main(String[] args) {
		String s="GeeksforGeeks";
		char a[]=s.toCharArray();
Map<Character,Integer> hm=new HashMap<>();
for(char c:a) {
	if (hm.containsKey(c)) {
		hm.put(c ,hm.get(c)+1);
}
	else
		hm.put(c, 1);
	
}
for (Map.Entry entry :hm.entrySet()) {
    System.out.println(entry.getKey() + " " + entry.getValue());
}

	}

}
