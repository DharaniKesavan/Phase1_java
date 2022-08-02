package phase1_practice_project;

public class LongestSubsequence{
   	
	static int subseq(int input[], int L){
		int arr[] = new int[L];
		int i, j;
		int max = 0;
		for (i = 0; i < L; i++){
			arr[i] = 1;
		}
		
		for (i = 1; i < L; i++){
			for (j = 0; j < i; j++){
				if (input[i] > input[j] && arr[i] < arr[j] + 1)
					arr[i] = arr[j] + 1;
			}
		}
		
		for (i = 0; i < L; i++){
			if (max < arr[i])
				max = arr[i];
		}
		return max;	
	}
	
	public static void main(String args[]){
		int input[] = {8,1,5,7,19,3,21,6,12,33,2,11,40};
		int L = input.length;
		System.out.println("length of longest increasing subsequence = " +subseq(input, L));
	}
}
