
public class fibonacci {
	public static void main(String[] args) {
		int num = 0;
		int ber = 1;
		System.out.println(num);
		System.out.println(ber);
		for (int i=0;i<6;i++) {
			num = num + ber;
			System.out.println(num);
			
			ber = num + ber;
			System.out.println(ber);
		}
	}
}
