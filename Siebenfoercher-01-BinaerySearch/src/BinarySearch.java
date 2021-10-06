import java.util.Arrays;

public class Suche {

	private static int anz = 1000;	// maximale groeße des arrays, maximaler wert der zahlen
	
	private static int[] arr;
	private static int schritte;
	
	public static void main(String[] args) {

		arr = new int[(int) (Math.random() * anz)];
		for(int i = 0; i < arr.length; i++) {
			arr[i] =  (int) (Math.random() * anz);
		}
		Arrays.sort(arr);
		
		int x = (int) (Math.random() * anz);
		
		System.out.printf("Generiertes Array (Laenge %d):\n", arr.length);
		for(int i = 0; i < arr.length; i++) {
			if(i % 50 == 0)
				System.out.println();
			System.out.printf("%3d ", arr[i]);
		}
		System.out.printf("\n\nGesuchtes Element: %d\n\n", x);
		
		
		int i = iterativ(x);
		int j = schritte;
		ausgabe(i, "Iterativ");
		
		int k = binaer(x);
		int l = schritte;
		ausgabe(k, "Binaer");
		
		System.out.println();
		
		if(i != k)
			System.out.println("Ungleicher Index, da das Element mehrfach enthalten ist und die binaere Suche den hinteren Wert zuerst gefunden hat.");
		if(l > j)
			System.out.println("Binaer braucht mehr Schritte");
	}
	
	private static int iterativ(int x) {
		schritte = 0;
		
		for(int i = 0; i < arr.length; i++) {
			schritte++;
			if(arr[i] == x) 
				return i;
		}
		return -1;
	}
		
	public static int binaer(int x) {
		schritte = 0;
		return binaer(x, 0, arr.length);
	}
	
	public static int binaer(int x, int a, int e) {
		if(a + 1 < e) {
			schritte++;
			int mid = (a + e) / 2;
			
			if(arr[mid] == x) 
				return mid;
			
			if(arr[mid] > x) 
				return binaer(x, a, mid);
			
			return binaer(x, mid, e);
		}
		return -1;
	}
	
	private static void ausgabe(int i, String str) {
		if(i == -1) {
			System.out.print("Element wurde nicht gefunden");
		} else {
			System.out.printf("Element wurde an Index %d gefunden", i);
		}
		System.out.printf(" (%s wurden %d Schritte benötigt).\n", str, schritte);
	}
}
