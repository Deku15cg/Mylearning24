package DuplicateElement;

import java.util.HashSet;
import java.util.Set;

public class Duplicate {

	public static void main(String[] args) {
int arr[]={1,3,4,3,6,8,9,5,7,4};
Set<Integer> hs=new HashSet<>();
for(int i:arr) {
	if (i%2==0) {
		hs.add(i);
	}
}
System.out.println(hs);
}
	}


