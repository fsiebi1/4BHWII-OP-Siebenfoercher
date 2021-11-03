
public class Summe {

	public static void main(String[] args) {

		long x = 10000;						// groeﬂere zahlen laest mein stack nicht zu
		
		long t1 = System.currentTimeMillis();
		long a = iterativ(x);
		long t2 = System.currentTimeMillis();
		long b = rekursiv(x);
		long t3 = System.currentTimeMillis();
		long c = mathe(x);
		long t4 = System.currentTimeMillis();

		System.out.printf("Iterativ: %d\tTime: %dms\n", a, t2-t1);
		System.out.printf("Rekursiv: %d\tTime: %dms\n", b, t3-t2);
		System.out.printf("Mathematisch: %d\tTime: %dms\n", a, t4-t3);
	}
	
	private static long iterativ(long x) {
		long sum = 0;
		for(int i = 1; i <= x; i++) {
			sum += i;
		}
		return sum;
	}
	
	private static long rekursiv(long x) {
		if(x > 0)
			return x + rekursiv(x - 1);
		
		return 0;
	}
	
	private static long mathe(long x) {
		return (x * (x + 1)) / 2;
	}

}
