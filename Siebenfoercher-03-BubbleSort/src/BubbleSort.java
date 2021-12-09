
public class BubbleSort {

	public static void main(String[] args) {
		int zahl = 100000;
		
		int[] arr = new int[zahl];
		for(int i = 0; i < arr.length; i++)
			arr[i] = (int) (Math.random() * zahl);
		
		long t1 = System.nanoTime();
		sort(arr);
		long t2 = System.nanoTime();
		
		System.out.printf("It took %d ms.\n", (t2-t1) / 1000000);
		for(int i = 0; i < zahl / 100; i++) {
			for(int j = 0; j < 100; j++) {
				System.out.printf("%d ", arr[i*100 + j]);
			}
			System.out.println();
		}
	}
	
	public static void sort(int[] arr) {
		int n = arr.length;
		boolean swapped = false;
		do {
			swapped = false;
			for(int i = 0; i < n-1; i++) {
				if(arr[i] > arr[i+1]) {
					int a = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = a;
					swapped = true;
				}
			}
			n--;
		} while(swapped);
	}

}
