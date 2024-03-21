package DuplicateElement;

import java.util.Arrays;

public class OddNos {

	public static void main(String[] args) {
int arr[]= {1,3,7,8,20};
int odd[]=null;
int count=0;
for(int o:arr) {
	if(o%2!=0) {
		count++;
	}
}
odd=new int[count];
int od=0;

for (int i:arr) {
	if(i%2!=0) {
		odd[od++]=i;
	}
}
	System.out.print(Arrays.toString(odd)+" ");
}
	}


