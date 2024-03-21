package DuplicateElement;

public class PimeNum {

	public static void main(String[] args) {
int N=100;
for(int i=2;i<=N;i++) {
	int count=0;

	for(int j=1;j<=i;j++) {
		if(i%j==0 && i%1==0)
		count++;
	} 
	if (count==2) {
		System.out.print(i+" ");
	}
}
	}

}
