
public class Fakultaet {

	public static void main(String[] args) {

		long x = 20;
		
		long t1 = System.nanoTime();
		long a = iterativ(x);
		long t2 = System.nanoTime();
		long b = rekursiv(x);
		long t3 = System.nanoTime();
		long c = endRekursiv(x);
		long t4 = System.nanoTime();

		System.out.printf("Iterativ: \t%d\tTime: %dns\n", a, t2-t1);
		System.out.printf("Rekursiv: \t%d\tTime: %dns\n", b, t3-t2);
		System.out.printf("Endrekursiv: \t%d\tTime: %dns\n", c, t4-t3);
	}
	
	private static long iterativ(long x) {
		if(x == 0)
			return 0;
		
		long sum = 1;
		for(int i = 1; i <= x; i++) {
			sum *= i;
		}
		return sum;
	}
	
	private static long endRekursiv(long x) {
		if(x == 0) 
			return x;
		if(x < 0) 
			return -1;
		return endRekursiv(1, x);
	}
	
	private static long endRekursiv(long sum, long x) {
		if(x > 0)
			return endRekursiv(sum * x, x - 1);
		return sum;
	}
	
	private static long rekursiv(long x) {
		if(x <= 0) 
			return 0;
		if(x == 1)
			return 1;
		return rekursiv(x - 1) * x;
	}

}
