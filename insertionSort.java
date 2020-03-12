package sortingAlgs;

import java.util.Arrays;

public class insertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = new int []{ 9 , 15 , 3 , 5 , 26 ,13, 7 } ;
		System.out.println(Arrays.toString(arr));
		insrtSort(arr);
		System.out.println(Arrays.toString(arr));

	}
	
	public static void insrtSort (int[] a) {
		
		for(int i =1; i < a.length  ; i++) {
			int temp= a[i] ;
			int j ;
			for(j=i ; j>0 && temp < a[j-1] ; j--) {
					a[j] = a[j-1];
			}
			a[j] = temp;
		}	

	}
}

