import java.util.Arrays;

public class MergeArray
{
	public static void merge_sorted_arrays(int[] A, int p, int[] B, int q)
	{
		
		for (int i = 0; i < p; i++)
		{
			if (A[i] > B[0])
			{
				int temp = A[i];
				A[i] = B[0];
				B[0] = temp;

				int first_arr = B[0];
				int k;
				for (k = 1; k < q && B[k] < first_arr; k++) {
					B[k - 1] = B[k];
				}

				B[k - 1] = first_arr;
			}
		}
	}

	public static void main (String[] args)
	{
		int[] A = { 1, 5, 6, 7, 8, 10 };
		int[] B = { 2, 4, 9 };
		int p = A.length;
		int q = B.length;

		System.out.println("Original Arrays:");
		System.out.println("A: " + Arrays.toString(A));
		System.out.println("B: " + Arrays.toString(B));
		
		merge_sorted_arrays(A, p, B, q);
        
		System.out.println("\nSorted Arrays:");
		System.out.println("A: " + Arrays.toString(A));
		System.out.println("B: " + Arrays.toString(B));
	}
}
