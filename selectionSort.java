package sortingAlgs;

import java.util.Arrays;

public class selectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = new int []{ 9 , 15 , 3 , 5 , 26 ,13, 7 } ;
		System.out.println(Arrays.toString(arr));
		selSort(arr);
		System.out.println(Arrays.toString(arr));

	}
	
	public static void selSort (int[] a) {
		
		int temp = 0 ;
		for (int j= 0 ; j< a.length-1; j++) {
			int least = j ;
			
			for (int i=j+1 ; i<a.length ; i++) 
				if(a [i] < a[least])
					least = i;
			
			temp = a [j];
			a [j]= a[least]	;	
			a[least] = temp;
			
		}
	}
}
