//Write a java program to count all the triplets such that sum of two elements equals the third element
class Count_all_triplets{ 

    static int countWays(int[] arr, int n) 

    { 

        int max_val = 0; 

        for (int i = 0; i < n; i++) 

            max_val = Math.max(max_val, arr[i]); 

        int[] freq = new int[max_val + 1]; 

        for (int i = 0; i < n; i++) 

            freq[arr[i]]++; 

  

        int ans = 0; 

        ans += freq[0] * (freq[0] - 1) * (freq[0] - 2) / 6; 

        for (int i = 1; i <= max_val; i++) 

            ans += freq[0] * freq[i] * (freq[i] - 1) / 2;

        for (int i = 1; 2 * i <= max_val; i++) 

            ans += freq[i] * (freq[i] - 1) / 2 * freq[2 * i]; 

        for (int i = 1; i <= max_val; i++) { 

            for (int j = i + 1; i + j <= max_val; j++) 

                ans += freq[i] * freq[j] * freq[i + j]; 

        } 

  

        return ans; 

    }

    public static void main(String[] args) 

    { 

        int[] arr = new int[] { 1, 2, 3, 4, 5 }; 

        int n = arr.length; 

        System.out.println(countWays(arr, n)); 

    } 
}