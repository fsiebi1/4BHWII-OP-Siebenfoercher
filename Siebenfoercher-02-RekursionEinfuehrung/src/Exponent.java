
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

		System.out.printf("Iterativ: %d\tTime: %dms\n", a, t2-t1);
		System.out.printf("Rekursiv: %d\tTime: %dms\n", b, t3-t2);
		System.out.printf("Mathematisch: %d\tTime: %dms\n", a, t4-t3);
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
		if(exponent == 0)
			return 0;
		
		if(exponent > 1)
			return x * rekursiv(x, exponent - 1);
			
		return x;
	}
	
	private static long mathe(long x, long exponent) {
		return (x * (x + 1)) / 2;
	}

}
