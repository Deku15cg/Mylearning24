package DuplicateElement;

public class TestDemo {

	public static void main(String[] args) {
		int arr[]= {1,2,4,3,2,5,4};
		int n=arr.length;
		for(int i=0;i<n;i++) {
			int index=arr[i]%n;
			arr[index]+=n;
			
			
		}
		System.out.println("Repeating elements:");

		for (int i = 0; i < n; i++)
        {
            if ((arr[i] / n) >= 2)
                System.out.print(i + " ");

        }
		
    }
	}


