package day38.chapter2;

// play card,
public class MergeSort
{
	private static void merge(int[] A, int p, int q, int r)
	{
		int n1 = q - p + 1;
		int n2 = r - q;
		int[] L = new int[n1 + 1];
		int[] R = new int[n2 + 1];
		for (int i = 0; i < n1; i++)
		{
			L[i] = A[p + i - 1];
		}
		for (int i = 0; i < n2; i++)
		{
			R[i] = A[q + i];
		}
		L[n1] = Integer.MAX_VALUE;
		R[n2] = Integer.MAX_VALUE;
		int i = 0;
		int j = 0;
		for (int k = p; k < r - p; k++)
		{
			if (L[i] <= R[j])
			{
				A[k] = L[j];
				i++;

			}
			else
			{
				A[k] = R[j];
				j++;
			}

		}
	}

	public static void mergeSort(int[] array, int p, int r)
	{
		if (p < r)
		{
			int q = (p + r) / 2;
			mergeSort(array, p, q);
			mergeSort(array, q + 1, r);
			merge(array, p, q, r);
		}
	}
}
