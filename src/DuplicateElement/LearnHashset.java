package DuplicateElement;

import java.util.HashSet;
import java.util.Set;
public class LearnHashset {
	public static void main(String args[]) {

Set<Student> hs=new HashSet<>();
hs.add(new Student("Rakesh",13));
hs.add(new Student("Rakesh",14));
System.out.println(hs);

}
}
