package DuplicateElement;

import java.util.Arrays;

public class Seperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,1,0,1,0,0,1};
		int i=0;
		int j=arr.length-1;
		while(i<j) {
			int leftElement=arr[i];
			int rightElement=arr[j];
			if(leftElement==0) {
				i++;
			}
			if(rightElement==1) {
				j--;
			}
			if(leftElement ==1 && rightElement ==0) {
				arr[i]=rightElement;
				arr[j]=leftElement;
				i++;
				j--;
				
			}
		}
        System.out.println(Arrays.toString(arr));

	}

}
