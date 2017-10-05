import java.util.Random;

public class Randomnumber {

	public int[] randomArray() {
		Random random = new Random();
		int[] a = new int[52];
		for (int i = 0; i < a.length; i++) {
		a[i] = random.nextInt(52);

		
		System.out.println(a.length);
		
		}
		return a;
	}

	public static void main(String[] args) {
		Randomnumber r = new Randomnumber();
		r.randomArray();
		
		
			

	}

}
