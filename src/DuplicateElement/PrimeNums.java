package DuplicateElement;

public class PrimeNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N=100;
        for(int i=2;i<=N;i++){
            boolean isprime=true;
            for(int j=2;j<=i/2;j++){
                if(i%j==0)
                isprime =false;
                break;
            }
            if(isprime)
            System.out.print(" "+i+" ");
                
            }

	}

}
