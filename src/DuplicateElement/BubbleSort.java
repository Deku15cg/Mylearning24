package DuplicateElement;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {23,12,4,17,45};
		int flag=0;
		int n=arr.length;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=1;

				}
			}
			if(flag==0)
				break;
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+",");
		}

	}

}
