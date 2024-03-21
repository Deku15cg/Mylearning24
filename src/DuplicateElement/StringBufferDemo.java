package DuplicateElement;

public class StringBufferDemo {

	public static void main(String[] args) {

		String s1="Java@12@###$%444";
//		StringBuffer s2=new StringBuffer(s1);
//		System.out.println(s2.reverse());
		String s2=s1.replaceAll("[^A-Za-z0-9]", "");
		System.out.println(s2);
		
	}

}
