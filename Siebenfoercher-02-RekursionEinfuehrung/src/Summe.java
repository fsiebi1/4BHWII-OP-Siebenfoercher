
public class Summe {
	
	private static long min = 1000000000;

	public static void main(String[] args) {

		long x = min + 10000;						// die normale rekursion schafft 10000 zahlen nicht
		
		long t1 = System.nanoTime();
		long a = iterativ(x);
		long t2 = System.nanoTime();
		long b = 0;
//		long b = rekursiv(x);
		long t3 = System.nanoTime();
		long c = endRekursiv(x);
		long t4 = System.nanoTime();
		long d = mathe(x);
		long t5 = System.nanoTime();

		System.out.printf("Iterativ: \t%d\tTime: %dns\n", a, t2-t1);
		System.out.printf("Rekursiv: \t%d\tTime: %dns\n", b, t3-t2);
		System.out.printf("Endrekursiv: \t%d\tTime: %dns\n", c, t4-t3);
		System.out.printf("Mathematisch: \t%d\tTime: %dns\n", d, t5-t4);
	}
	
	private static long iterativ(long x) {
		long sum = 0;
		for(long i = min + 1; i <= x; i++) {
			sum += i;
		}
		return sum;
	}
	
	private static long endRekursiv(long x) {
		return endRekursiv(0, x);
	}
	
	private static long endRekursiv(long s, long x) {
		if(x > min) 
			return endRekursiv(s + x, x - 1);
		return s;
	}
	
	private static long rekursiv(long x) {
		if(x > 0) {
			return rekursiv(x - 1) + x;
		}
		return 0;
	}
	
	private static long mathe(long x) {
		return (x * (x + 1)) / 2 - (min * (min+1)) / 2;
	}

}
