package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calci {

	private JFrame frame;
	private JTextField txtdisplay;
	
	double firstnum;
	double secondnum;
	double result;
	String operation;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calci window = new calci();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calci() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 260, 371);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtdisplay = new JTextField();
		txtdisplay.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtdisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		txtdisplay.setBounds(10, 11, 225, 32);
		frame.getContentPane().add(txtdisplay);
		txtdisplay.setColumns(10);
		
		final JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String EnterNumber = txtdisplay.getText() + btn7.getText();
				txtdisplay.setText(EnterNumber );
				
			}
			
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn7.setBounds(10, 107, 57, 53);
		frame.getContentPane().add(btn7);
		
		final JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = txtdisplay.getText() + btn8.getText();
				txtdisplay.setText(EnterNumber );
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn8.setBounds(66, 107, 57, 53);
		frame.getContentPane().add(btn8);
		
		final JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = txtdisplay.getText() + btn9.getText();
				txtdisplay.setText(EnterNumber );
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn9.setBounds(122, 107, 57, 53);
		frame.getContentPane().add(btn9);
		
		JButton btnplus = new JButton("+");
		btnplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				firstnum = Double.parseDouble(txtdisplay.getText());
				txtdisplay.setText("");
				operation = "+";
			}
		});
		btnplus.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnplus.setBounds(178, 54, 57, 53);
		frame.getContentPane().add(btnplus);
		
		final JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = txtdisplay.getText() + btn4.getText();
				txtdisplay.setText(EnterNumber );
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn4.setBounds(10, 160, 57, 53);
		frame.getContentPane().add(btn4);
		
		final JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = txtdisplay.getText() + btn5.getText();
				txtdisplay.setText(EnterNumber );
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn5.setBounds(66, 160, 57, 53);
		frame.getContentPane().add(btn5);
		
		final JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = txtdisplay.getText() + btn6.getText();
				txtdisplay.setText(EnterNumber );
			}
			
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn6.setBounds(122, 160, 57, 53);
		frame.getContentPane().add(btn6);
		
		JButton btnminus = new JButton("-");
		btnminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstnum = Double.parseDouble(txtdisplay.getText());
				txtdisplay.setText("");
				operation = "-";
			}
		});
		btnminus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnminus.setBounds(178, 107, 57, 53);
		frame.getContentPane().add(btnminus);
		
		final JButton button_1 = new JButton("3");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = txtdisplay.getText() + button_1.getText();
				txtdisplay.setText(EnterNumber );
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_1.setBounds(122, 213, 57, 53);
		frame.getContentPane().add(button_1);
		
		final JButton button = new JButton("1");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = txtdisplay.getText() + button.getText();
				txtdisplay.setText(EnterNumber );
			}
			
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 20));
		button.setBounds(10, 213, 57, 53);
		frame.getContentPane().add(button);
		
		final JButton button_2 = new JButton("2");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) { 
				String EnterNumber = txtdisplay.getText() + button_2.getText();
				txtdisplay.setText(EnterNumber );
			}
		});
		button_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_2.setBounds(66, 213, 57, 53);
		frame.getContentPane().add(button_2);
		
		JButton btnmul = new JButton("*");
		btnmul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstnum = Double.parseDouble(txtdisplay.getText());
				txtdisplay.setText("");
				operation = "*";
			}
		});
		btnmul.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnmul.setBounds(178, 160, 57, 53);
		frame.getContentPane().add(btnmul);
		
		final JButton button_4 = new JButton("0");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = txtdisplay.getText() + button_4.getText();
				txtdisplay.setText(EnterNumber );
			}
		});
		button_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_4.setBounds(66, 266, 57, 53);
		frame.getContentPane().add(button_4);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				txtdisplay.setText(null );
				firstnum = Double.parseDouble(null);
				secondnum = Double.parseDouble(null);
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnC.setBounds(66, 54, 57, 53);
		frame.getContentPane().add(btnC);
		
		JButton btnequal = new JButton("=");
		btnequal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String answer;
				secondnum = Double.parseDouble(txtdisplay.getText());
				if (operation == "+")
				{
					result = firstnum + secondnum;
					answer = new Double(result).toString();
					txtdisplay.setText(answer);
					
				}
				else if (operation == "-")
				{
					result = firstnum - secondnum;
					answer = new Double(result).toString();
					txtdisplay.setText(answer);
					
				}
				else if (operation == "*")
				{
					result = firstnum * secondnum;
					answer = new Double(result).toString();
					txtdisplay.setText(answer);
					
				}
				else if (operation == "/")
				{
					result = firstnum / secondnum;
					answer = new Double(result).toString();
					txtdisplay.setText(answer);
					
				}
				else if (operation == "%")
				{
					result = firstnum % secondnum;
					answer = new Double(result).toString();
					txtdisplay.setText(answer);
					
				}
			}
		});
		btnequal.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnequal.setBounds(178, 266, 57, 53);
		frame.getContentPane().add(btnequal);
		
		JButton btndiv = new JButton("/");
		btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstnum = Double.parseDouble(txtdisplay.getText());
				txtdisplay.setText("");
				operation = "/";
			}
			
		});
		btndiv.setFont(new Font("Tahoma", Font.BOLD, 20));
		btndiv.setBounds(178, 213, 57, 53);
		frame.getContentPane().add(btndiv);
		
		JButton btnxf = new JButton("AC");
		btnxf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String backspace=null;
				
				if(txtdisplay.getText().length() > 0){
					StringBuilder strB = new StringBuilder(txtdisplay.getText());
					strB.deleteCharAt(txtdisplay.getText().length() - 1);
					backspace = strB.toString();
					txtdisplay.setText(backspace);
				}
			}
		});
		btnxf.setToolTipText("");
		btnxf.setBackground(new Color(240, 240, 240));
		btnxf.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnxf.setBounds(10, 54, 57, 53);
		frame.getContentPane().add(btnxf);
		
		JButton btnRan = new JButton("%");
		btnRan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstnum = Double.parseDouble(txtdisplay.getText());
				txtdisplay.setText("");
				operation = "%";
			}
		});
		btnRan.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnRan.setBounds(122, 54, 57, 53);
		frame.getContentPane().add(btnRan);
		
		JButton btnpoint = new JButton(".");
		btnpoint.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnpoint.setBounds(10, 266, 57, 53);
		frame.getContentPane().add(btnpoint);
		
		JButton button_9 = new JButton("");
		button_9.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_9.setBounds(122, 266, 57, 53);
		frame.getContentPane().add(button_9);
		
	}
}
