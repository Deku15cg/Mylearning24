
package DuplicateElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DemoI {

	public static void main(String[] args) {
int a[]= {28,37,94,1,26,3};
List<Integer> al=new ArrayList<>();
for(int i:a) {
	al.add(i);
}
Collections.sort(al, Collections.reverseOrder());
	System.out.print(al+" ");
	

}
}
