
public class Summe {
	
	private static long min = 1000000000;

	public static void main(String[] args) {

		long x = min + 10000;						// groeﬂere zahlen laest mein stack nicht zu
		
		long t1 = System.currentTimeMillis();
		long a = iterativ(x);
		long t2 = System.currentTimeMillis();
		long b = rekursiv(x);
		long t3 = System.currentTimeMillis();
		long c = mathe(x);
		long t4 = System.currentTimeMillis();

		System.out.printf("Iterativ: \t%d\tTime: %dms\n", a, t2-t1);
		System.out.printf("Rekursiv: \t%d\tTime: %dms\n", b, t3-t2);
		System.out.printf("Mathematisch: \t%d\tTime: %dms\n", c, t4-t3);
	}
	
	private static long iterativ(long x) {
		long sum = 0;
		for(long i = min + 1; i <= x; i++) {
			sum += i;
		}
		return sum;
	}
	
	private static long rekursiv(long x) {
		return rekursiv(0, x);
	}
	
	private static long rekursiv(long s, long x) {
		if(x > min) 
			return rekursiv(s + x, x - 1);
		return s;
	}
	
	private static long mathe(long x) {
		return (x * (x + 1)) / 2 - (min * (min+1)) / 2;
	}

}
