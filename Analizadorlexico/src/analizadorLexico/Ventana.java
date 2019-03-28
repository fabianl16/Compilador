package analizadorLexico;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class Ventana extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 769, 468);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textLexica = new JTextArea();
		textLexica.setBounds(425, 45, 282, 301);
		contentPane.add(textLexica);
		
		JTextPane textCodigo = new JTextPane();
		textCodigo.setBounds(10, 45, 273, 301);
		contentPane.add(textCodigo);
		
		JButton btnRun = new JButton("Run");
		btnRun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String patrones=("(mas|menos|por|entre)|([a-zA-Z]+)|([>|<|=|+|*|-|/]+)|([0-9]+)|([{|}]+)|(;)"); 
				String texto = textCodigo.getText();
				Pattern p = Pattern.compile(patrones);
		        Matcher matcher = p.matcher(texto);
		        while (matcher.find()){
		        	/*-------------------------------------*/
		        	String TokenPR = matcher.group(1);
		        	if(TokenPR!=null){
		        		textLexica.append("palabra reservada:"+TokenPR+"\n");        	
		        	}
		        	
		        	String TokenV = matcher.group(2);
		            	if(TokenV !=null){
		  
		            		textLexica.append("variable:"+TokenV+"\n");
		        	}
		            	
		            	String TokenOP = matcher.group(3);
		            	if(TokenOP !=null){
		            		textLexica.append("operador:"+TokenOP+"\n");
		        	}	
		            	String TokenNUM = matcher.group(4);
		            	if(TokenNUM !=null){
		            	
		            		textLexica.append("numero:"+TokenNUM+"\n");
		        	}
		            	String TokenAG = matcher.group(5);
		            	if(TokenAG !=null){
		            		textLexica.append("agrupadores:"+TokenAG+"\n");
		        	}
		            	String TokenI = matcher.group(6);
		            	if(TokenI !=null){
		            		
		            		textLexica.append("indicador:"+TokenI+"\n");
		        	}
		            	
		        }
		        
		      
			}
		});
		btnRun.setBounds(10, 11, 89, 23);
		contentPane.add(btnRun);
		
		
		
		
		
		
	}
}
