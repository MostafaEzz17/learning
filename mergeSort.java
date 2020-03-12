package sortingAlgs;

import java.util.Arrays;

public class mergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = new int []{ 9 , 15 , 3 , 5 , 26 ,13, 7 } ;
		System.out.println(Arrays.toString(arr));
		mrgSort(arr);
		System.out.println(Arrays.toString(arr));


	}
	
	public static void mrgSort (int[]a) {
		
		if(a.length==1) {
			return ;
		}
		
		int [] sub1 = new int [a.length/2];
		int [] sub2 = new int [a.length-(a.length/2)];

		splitArray(sub1, sub2, a);
		mrgSort(sub1);
		mrgSort(sub2);
		mrgArrays(sub1,sub2,a);
		
	}
  	public static void splitArray (int[]sub1,int[]sub2,int[]a) {
	
		for(int i=0;i<sub1.length;i++)
			sub1[i]=a[i];
		for(int i=sub1.length;i<a.length;i++)
			sub2[i-sub1.length]=a[i];
	} 
	
	public static void mrgArrays (int[]a,int[]b,int[]mrged) {
			int i=0,j=0,n=0;
		while (i<a.length && j<b.length ) {
			if(a[i]<=b[j]) {
				mrged[n]=a[i];
				i++;
			}else {
				mrged[n]=b[j];
				j++;
			} 
			n++;
		}
		if( i == a.length) {
			while(j<b.length) {
				mrged[n]=b[j];
				n++;
				j++;
			}
		}
		if( j == b.length) {
			while(i<a.length) {
				mrged[n]=a[i];
				n++;
				i++;
			}
		}
		
	}

}
