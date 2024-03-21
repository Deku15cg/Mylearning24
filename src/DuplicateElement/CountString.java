package DuplicateElement;

import java.util.HashMap;

public class CountString {

public static void main(String args[]) {
	String str="This is the devanshu kumar welcome to the world";
	
	String []a= str.split(" ");
	
	HashMap<String,Integer> hm=new HashMap<>();
	for(String s:a) {
		Integer i=hm.get(s);
		if(i==null) {
			hm.put(s, 1);
			
		}
		else
			hm.put(s,i+1);
	}
	System.out.println(hm);
}

		

}
