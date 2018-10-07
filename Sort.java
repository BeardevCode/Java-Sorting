import java.util.Arrays;

public class Sort {
	
	/**
	 * Check if an array is sorted
	 * 
	 * @param tab Array of numbers
	 * @return True or false
	 */
	private static boolean isSorted(int[] tab) {
		if (tab.length == 0)
			return true;
		for (int i = 0; i < tab.length - 1; i++)
			if (tab[i] > tab[i + 1])
				return false;
		return true;
	}
	
	/**
	 * Sort an array of numbers using Bubble sort
	 * 
	 * @param tab Array of numbers we want to sort
	 * @param verbose Boolean, if we want to see the tab at every iteration
	 * @param time Boolean, if we want to know the time it took.
	 * @return Tab sorted
	 */
	public static int[] bubbleSort(int[] tab, boolean verbose, boolean time) {
		int tmp = 0;
		long startTime = System.currentTimeMillis();

		while (!isSorted(tab)) {
			for (int i = 0; i < tab.length - 1; i++) {
				if (verbose)
					System.out.println(Arrays.toString(tab));
				if (tab[i] > tab[i + 1]) {
					tmp = tab[i];
					tab[i] = tab[i + 1];
					tab[i + 1] = tmp;
				}
			}
		}
		
		long stopTime = System.currentTimeMillis();
		long timeTaken = stopTime - startTime;
		
		if (verbose)
			System.out.println(Arrays.toString(tab));
		if (time)
			System.out.println("Time: " + timeTaken + " ms");
		
		return tab;
	}
	
	/**
	 * Sort an array of numbers using Selection sort
	 * 
	 * @param tab Array of numbers we want to sort
	 * @param verbose Boolean, if we want to see the tab at every iteration
	 * @param time Boolean, if we want to know the time it took
	 * @return Tab sorted
	 */
	public static int[] selectionSort(int[] tab, boolean verbose, boolean time) {
		long startTime = System.currentTimeMillis();

		while (!isSorted(tab)) {
			for (int i = 0; i < tab.length; i++) {
				if (verbose)
					System.out.println(Arrays.toString(tab));
				int min = tab[i];
				int minIndex = i;
				for (int j = i + 1; j < tab.length; j++) {
					if (tab[j] < min) {
						min = tab[j];
						minIndex = j;
					}
				}
				if (minIndex != i) {
					tab[minIndex] = tab[i];
					tab[i] = min;
				}
			}
		}
		
		long stopTime = System.currentTimeMillis();
		long timeTaken = stopTime - startTime;
		
		if (verbose)
			System.out.println(Arrays.toString(tab));
		if (time)
			System.out.println("Time: " + timeTaken + " ms");
		
		return tab;
	}
}
