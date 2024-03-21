package DuplicateElement;

import java.util.ArrayList;
import java.util.List;

public class RemoveString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s1= {"Ram","Ram","Shyam","Sita"};
		List<String> li=new ArrayList<>();
		for(String s:s1) {
			//li.add(s);
		
		//int count=0;
		if(!li.contains(s)) {
			li.add(s);
		}
		
		}
		System.out.println(li);
		}	
		

	}


