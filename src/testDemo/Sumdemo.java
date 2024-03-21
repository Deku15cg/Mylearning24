package testDemo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Sumdemo {

	public int[] SumfromArrayinput(int a[],int Target){
		Map<Integer ,Integer> hm =new HashMap<>();
		for(int i=0;i<=a.length;i++) {
		if(hm.containsKey(Target-a[i])) {
			return new int[] {i,hm.get(Target-a[i])};
		}
		hm.put(a[i],i);
			
			}
		return new int[0];
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,7,6,3,11};
		int Target=9;
		Sumdemo s=new Sumdemo();
		int[] result = s.SumfromArrayinput(a, Target);
        if (result.length == 2) {
            System.out.println("Indices of the two numbers: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No two numbers found that sum up to the target.");
        }
    }

	}


