 package DuplicateElement;

public class StringDemo {

	public static void main(String[] args) {

String s1="lol";
int n=s1.length();
String rev="";
for(int i=n-1;i>=0;i--) {
	rev=rev+s1.charAt(i);
	
}
System.out.println(rev);
if(rev.equals(s1)){
	System.out.println("String is palindrome");}

	else 
		System.out.println("String is not palindrome");

	
		
			
		}
	}





