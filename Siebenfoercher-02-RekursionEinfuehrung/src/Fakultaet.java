
public class Fakultaet {

	public static void main(String[] args) {

		long x = 20;
		
		long t1 = System.currentTimeMillis();
		long a = iterativ(x);
		long t2 = System.currentTimeMillis();
		long b = rekursiv(x);
		long t3 = System.currentTimeMillis();

		System.out.printf("Iterativ: %d\tTime: %dms\n", a, t2-t1);
		System.out.printf("Rekursiv: %d\tTime: %dms\n", b, t3-t2);
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
	
	private static long rekursiv(long x) {
		if(x > 1)
			return x * rekursiv(x - 1);
			
		return x;
	}

}
