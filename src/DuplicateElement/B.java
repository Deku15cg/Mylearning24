package DuplicateElement;


public class B extends A{
	 
		int Rollno;
		public B(String Name,int age,int Usn ) {
			super(Name, age);
			Rollno=Usn;
	}
//	public int SetRollno(int x) {
//		return Rollno=x;
// 	}
   @Override public String toString() {
	return (super.toString() + " "+" Roll No :"+Rollno);
}
	//int Roll_no; 
	public static void main(String []args) {
		B objb=new B("sujeet" ,13,46);
				
		System.out.println(objb.toString());
		 
		
	}

}
