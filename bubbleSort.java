package sortingAlgs;

import java.util.Arrays;

public class bubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = new int []{ 9 , 15 , 3 , 5 , 26 ,13, 7 } ;
		System.out.println(Arrays.toString(arr));
		bublSort(arr);
		System.out.println(Arrays.toString(arr));		

	}
	
	public static void bublSort(int [] a ) {
		boolean flagSwap = true ;
		for(int i=0 ; i< a.length-1 && flagSwap ; i++ ) {
			flagSwap = false ;
			for(int j = 0 ; j < a.length-i-1 ; j++) {
				if(a[j]> a[j+1]) {
					int temp = a[j+1];
					a[j+1]= a[j];
					a[j] = temp;
					flagSwap= true ;
				}	
			}
		}
	}
}
