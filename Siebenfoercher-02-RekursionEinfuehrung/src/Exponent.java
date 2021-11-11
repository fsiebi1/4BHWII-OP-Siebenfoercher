
public class Exponent {

	public static void main(String[] args) {

		long x = 2;
		long exponent = 20;
		
		long t1 = System.nanoTime();
		long a = iterativ(x, exponent);
		long t2 = System.nanoTime();
		long b = rekursiv(x, exponent);
		long t3 = System.nanoTime();
		long c = endRekursiv(x, exponent);
		long t4 = System.nanoTime();
		long d = mathe(x, exponent);
		long t5 = System.nanoTime();

		System.out.printf("Iterativ: \t%d\tTime: %dns\n", a, t2-t1);
		System.out.printf("Rekursiv: \t%d\tTime: %dns\n", b, t3-t2);
		System.out.printf("Endrekursiv: \t%d\tTime: %dns\n", c, t4-t3);
		System.out.printf("Mathematisch: \t%d\tTime: %dns\n", d, t5-t4);
	}
	
	private static long iterativ(long x, long exponent) {
		if(x == 0 || exponent == 0)
			return 0;
		
		long sum = 1;
		for(int i = 0; i < exponent; i++) {
			sum *= x;
		}
		return sum;
	}
	
	private static long endRekursiv(long x, long exponent) {
		if(exponent <= 0)
			return 0;
		return endRekursiv(1, x, exponent);
	}
	
	private static long endRekursiv(long sum, long x, long exponent) {
		if(exponent > 0)
			return endRekursiv(sum * x, x, exponent - 1);
		return sum;
	}
	
	private static long rekursiv(long x, long exponent) {
		if(exponent == 0)
			return 1;
		if(exponent <= 0)
			return 0;
		return rekursiv(x, exponent - 1) * x;
	}
	
	private static long mathe(long x, long exponent) {
		return (long) Math.pow(x, exponent);
	}

}
