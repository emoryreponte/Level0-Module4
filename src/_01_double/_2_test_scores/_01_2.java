package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class _01_2 {

	public static void main(String[] args) {
		String testScore = JOptionPane.showInputDialog("what grade did you get on the test");
		Double score = Double.parseDouble(testScore);
		//JOptionPane.showMessageDialog(null, score);
		
		if (score >= 0 && score < 10) {
			JOptionPane.showMessageDialog(null, "did you even study for it?");
		} else if (score >= 10 && score < 70) {
			JOptionPane.showMessageDialog(null, "was it another last minute midnight test study?");
		} else if (score >= 70 && score < 80) {
			JOptionPane.showMessageDialog(null, "Its an avregde score");
		} else if (score >= 80 && score < 90) {
			JOptionPane.showMessageDialog(null, "Its an okay score could be better");
		} else if (score >= 90) {
			JOptionPane.showMessageDialog(null, "Its an great score keep it up");
		}
	}

}
