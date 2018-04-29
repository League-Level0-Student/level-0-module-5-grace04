import javax.swing.JOptionPane;

public class PrimeorNot {
	public static void main(String[] args) {
		String Num = JOptionPane.showInputDialog("Give me a number.");
		int num = Integer.parseInt(Num);
		int div = 1;
		if (num==1) {
			JOptionPane.showMessageDialog(null, "1 is neither composite nor prime.");
		}
		for (int i=0;i<num-1;i++) {
			div++;
			if (num%div==0) {
				JOptionPane.showMessageDialog(null,"This is not a prime number.");
				System.exit(0);
			}
			else {
				JOptionPane.showMessageDialog(null, "This is a prime number.");
				System.exit(0);
			}
		}
			
	}
}
