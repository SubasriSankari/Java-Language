import java.lang.Math;
import java.util.Arrays;

public class LargestSubArray
{
	static boolean is_consecutive(int arr[], int i, int j, int min, int max)
	{
		if (max - min != j - i) {
			return false;
		}

		boolean check[] = new boolean[j - i + 1];

		for (int k = i; k <= j; k++)
		{
			if (check[arr[k] - min]) {
				return false;
			}

			check[arr[k] - min] = true;
		}
	
		return true;
	}
	
	public static void find_Max_SubArray(int[] arr, int size)
	 {
		int len = 1;
		int start = 0, end = 0;

		for (int i = 0; i < size - 1; i++)
		{
			int min_val = arr[i], max_val = arr[i];
	
			for (int j = i + 1; j < size; j++)
			{
				min_val = Math.min(min_val, arr[j]);
				max_val = Math.max(max_val, arr[j]);
	
				if (is_consecutive(arr, i, j, min_val, max_val))
				{
					if (len < max_val - min_val + 1)
					{
						len = max_val - min_val + 1;
						start = i;
						end = j;
					}
				}
			}
		}
	
		System.out.println("The largest sub-array is [" + start + ", "
							+ end + "]");
		System.out.print("Elements of the sub-array: ");
	    for (int x = start; x <= end; x++)
	     {
			
		  System.out.print(arr[x]+" ");			
		 }	
	}

	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = sc.nextInt();
        System.out.println("Enter the array elements:");
        int[] array = new int[size];
        int result[];
        for(int ind = 0 ; ind < size ; ind ++)
        {
            array[ind] = sc.nextInt();
        }
        Arrays.sort(array);
        System.out.println("Original array is : " + Arrays.toString(array)); 
		find_Max_SubArray(array, size);
	}
}