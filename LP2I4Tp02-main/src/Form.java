//Marcelo Marques Araujo CB3005631

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.util.ArrayList;
import java.util.List;
import java.awt.GridLayout;

public class Form implements ActionListener {
	private JFrame tela = new JFrame();
	private JLabel label = new JLabel("NOME:");
	private JLabel label1 = new JLabel("IDADE");
	private JLabel label2 = new JLabel("ENDEREÇO");
	private JTextField texto = new JTextField(10);
	private JTextField texto1 = new JTextField(10);
	private JTextField texto2 = new JTextField(10);
	private JButton button = new JButton();
	private JButton button1 = new JButton();
	private JButton button2 = new JButton();
	private JButton button3 = new JButton();
	private JPanel panel = new JPanel();
	private JPanel panel1 = new JPanel();
	private JPanel panel2 = new JPanel();
	private List<Aluno> alunos = new ArrayList<Aluno>();

	Form(){
		tela.setSize(400,180);
		tela.setLocation(200,200);
		tela.setTitle("Tp02_Lp2I4 - Marcelo Marques");
		tela.add(panel);
		panel.setBackground(Color.GRAY);
		panel1.setBackground(Color.GRAY);
		panel2.setBackground(Color.GRAY);
		panel.add(panel1);
		panel1.setLayout(new GridLayout(3,2,10,10));
		panel1.add(label);
		panel1.add(texto);
		panel1.add(label1);
		panel1.add(texto1);
		panel1.add(label2);
		panel1.add(texto2);
		panel.add(panel2);
		button.setText("OK");
		button.addActionListener(this);
		button1.setText("Limpar");
		button1.addActionListener(this);
		button2.setText("Mostrar");
		button2.addActionListener(this);
		button3.setText("Sair");
		button3.addActionListener(this);
		panel2.add(button);
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		tela.setVisible(true);
		}
	public void clean() {
		texto.setText("");
		texto1.setText("");
		texto2.setText("");
	}
	public void actionPerformed(ActionEvent e) {
		String x = e.getActionCommand();
		if("OK".equals(x)) {
			alunos.add(new Aluno(texto2.getText(),Integer.parseInt(texto1.getText()),texto.getText()));
			clean();
		}
		if("Limpar".equals(x)) {
			clean();
		}
		
		if("Mostrar".equals(x)) {
			String mensagem = "";
			for (Aluno y : alunos) {
			mensagem += "UUID: " +  y.getUuid() + "";
			mensagem += "Nome: " +  y.getNome() + "";
			mensagem += "\n";
			}
			JOptionPane.showMessageDialog(null, mensagem);
		}
		if("Sair".equals(x)) {
			tela.dispose();
		}
	}
	public static void main(String[]args) {
		Form t = new Form();
	}
}