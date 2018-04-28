import javax.swing.JOptionPane;

public class PrimeorNot {
	public static void main(String[] args) {
		String Num = JOptionPane.showInputDialog("Give me a number.");
		int num = Integer.parseInt(Num);
		int div = 0;
		int end = 0;
		int test = 0;
		for (int i=0;i<num;i++) {
			div++;
			test++;
			end = num/div;
		}
			if (end==test) {
				JOptionPane.showMessageDialog(null,"This is not a prime number.");
			}
			else {
				JOptionPane.showMessageDialog(null, "This is a prime number.");
			}
	}
}
