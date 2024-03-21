package DuplicateElement;

public class Demo1 {

	public static void main(String[] args) {
		String str="Swiss";
		for(int i=0;i<str.length();i++){
		if (str.indexOf(str.charAt(i),str.indexOf(str.charAt(i))+1)==-1)
		System.out.println("Non-Reapeating Character:"+str.charAt(i));
		}
	}

}
