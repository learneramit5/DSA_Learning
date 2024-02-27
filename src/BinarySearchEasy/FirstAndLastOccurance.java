package BinarySearchEasy;

import java.util.ArrayList;
import java.util.List;

public class FirstAndLastOccurance {
public static int firstOccurance(int[] arr,int n,int k) {
		
		int low = 0;
		int high = n-1;
		int first = -1;
		while(low<=high) {
			int mid = (low+high)/2;
			
			
			if(arr[mid] == k) {
				first = mid;
				high = mid-1;
			}
			else if (arr[mid] < k) 
				low  = mid+1;
			else
				high = mid-1;
		}
		return first;
	}
	
	public static int lastOccurance(int[] arr, int n, int k) {
		
		int low = 0;
		int high = n-1;
		int last = -1;
		
		while(low <= high) {
			
			int mid = (low+high)/2;
			
			if(arr[mid] == k) {
				last = mid;
				low = mid+1;
			}
			else if(arr[mid]<k)
				low = mid+1;
			else 
				high = mid-1;
		}
		
		
		
		return last;
	}
	public static int countOccurances(int[] ar, int n, int k) {
		int first = firstOccurance(ar, n, k);
		if(first == -1)
			return -1;
		else 
			return (lastOccurance(ar, n, k) - firstOccurance(ar, n, k) + 1);
		
	}

	public static void main(String[] args) {

		int[] arr = new int[] {1,2,8,8,8,8,9};
		int n = arr.length;
		int k = 8;
		List<Integer> ans = new ArrayList<Integer>();
		ans.add(firstOccurance(arr, n, k));
		ans.add(lastOccurance(arr, n, k));
		System.out.println(ans);
		
		System.out.println(countOccurances(arr, n, k));
		
	}

}


