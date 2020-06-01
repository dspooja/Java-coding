package subarray;
import java.io.*; 
import java.util.*; 
public class Subarra1 {
	    private static int atMostK(int arr[], int n, int k) 
	    { 
	  
	        // To store the result 
	        int count = 0; 
	  
	        // Left boundary of window 
	        int left = 0; 
	  
	        // Right boundary of window 
	        int right = 0; 
	  
	        
	        HashMap<Integer, Integer> map = new HashMap<>(); 
	  
	         
	        while (right < n) { 
	  
	            
	            map.put(arr[right], map.getOrDefault(arr[right], 0) + 1); 
	  
	             
	            while (map.size() > k) { 
	                map.put(arr[left], map.get(arr[left]) - 1); 
	                if (map.get(arr[left]) == 0) 
	                    map.remove(arr[left]); 
	                left++; 
	            } 
	  
	            
	            count += right - left + 1; 
	            right++; 
	        } 
	        return count; 
	    } 
	  
	    
	    private static int exactlyK(int arr[], int n, int k) 
	    { 
	  
	        
	        return (atMostK(arr, n, k) - atMostK(arr, n, k - 1)); 
	    } 
	  
	    // Driver code 
	    public static void main(String[] args) 
	    { 
	        int arr[] = { 2, 1, 2, 1, 6 }; 
	        int n = arr.length; 
	        int k = 2; 
	  
	        System.out.print(exactlyK(arr, n, k)); 
	    } 
	
}