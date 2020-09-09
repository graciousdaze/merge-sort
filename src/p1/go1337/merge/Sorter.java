package p1.go1337.merge;

/**
 * This purpose of this class is to use merge sort to put an array of items in order. 
 * 
 * @author Grace O'Brien
 * Sunday, May 17th, 2020
 * 
 */
public class Sorter {
	
	/**
	 * This static method takes an array of any type as input, and passes it into the private helper method mergeSort(). 
	 * This method manipulates the array by using merge sort to put the array items in order.
	 * 
	 * @param <T> A generic type parameter of T with the Comparable interface is referenced in this method
	 * @param items T[], An array of any type of object
	 */
	public static <T extends Comparable<T>> void sort(T[] items)
	{
		mergeSort(items, 1, items.length);
	}
	
	private static <T extends Comparable<T>> void mergeSort(T[] items, int start, int end)
	{
		
		if(start < end)
		{	
			int middle = (end + start) / 2;
			mergeSort(items, start, middle);
			mergeSort(items, middle + 1, end);
			merge(items, start, middle, end);
		}
	}
	
	private static <T extends Comparable<T>> void merge(T[] items, int start, int middle, int end)
	{
		int leftLength = middle - start + 1;
		int rightLength = end - middle;	

		@SuppressWarnings("unchecked")
		T[] leftItems = (T[]) new Comparable[leftLength];
		
		@SuppressWarnings("unchecked")
		T[] rightItems = (T[]) new Comparable[rightLength];

		for(int i = 0; i < leftLength; i++)
			leftItems[i] = items[start + i - 1];
		
		for(int j = 0; j < rightLength; j++)
			rightItems[j] = items[middle + j];
		
		int	i = 0;	
		int	j = 0;	
		int k = start - 1;	
		
		boolean leftIsMerged = false;
		boolean rightIsMerged = false;	

		while(!(leftIsMerged || rightIsMerged))
		{
			if(leftItems[i].compareTo(rightItems[j]) <= 0)
			{
				items[k] = leftItems[i];
				i++;
				
				if(i == leftLength)
					leftIsMerged = true;
			}
			else
			{
				items[k] = rightItems[j];
				j++;
				
				if(j == rightLength)
					rightIsMerged = true;
			}
			
			k++;
		}
		
		if(leftIsMerged)
		{
			for(;j < rightLength; j++)
			{
				items[k] = rightItems[j];
				k++;
			}
		}
		else
		{
			for(;i < leftLength; i++)
			{
				items[k] = leftItems[i];
				k++;
			}
		}

	}
	
}
