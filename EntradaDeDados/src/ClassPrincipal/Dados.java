package ClassPrincipal;

import javax.swing.JOptionPane;

public class Dados {

	public static void main(String[] args) {
		int idade;
		idade = Integer.parseInt(JOptionPane.showInputDialog("Indicque sua idade: "));
		
		//System.out.println(idade);
		
		JOptionPane.showMessageDialog(null, "Voce informou que tem " + idade + " anos");
	}

}
