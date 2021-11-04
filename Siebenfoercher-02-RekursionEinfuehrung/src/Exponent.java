
public class Exponent {

	public static void main(String[] args) {

		long x = 2;
		long exponent = 20;
		
		long t1 = System.currentTimeMillis();
		long a = iterativ(x, exponent);
		long t2 = System.currentTimeMillis();
		long b = rekursiv(x, exponent);
		long t3 = System.currentTimeMillis();
		long c = mathe(x, exponent);
		long t4 = System.currentTimeMillis();

		System.out.printf("Iterativ: \t%d\tTime: %dms\n", a, t2-t1);
		System.out.printf("Rekursiv: \t%d\tTime: %dms\n", b, t3-t2);
		System.out.printf("Mathematisch: \t%d\tTime: %dms\n", c, t4-t3);
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
	
	private static long rekursiv(long x, long exponent) {
		if(exponent <= 0)
			return 0;
		return rekursiv(1, x, exponent);
	}
	
	private static long rekursiv(long sum, long x, long exponent) {
		if(exponent > 0)
			return rekursiv(sum * x, x, exponent - 1);
		return sum;
	}
	
	private static long mathe(long x, long exponent) {
		return (long) Math.pow(x, exponent);
	}

}
