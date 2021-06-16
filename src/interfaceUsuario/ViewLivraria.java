package interfaceUsuario;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;
import javax.swing.JTextField;


import excecoes.LivrariaException;
import logicaNegocio.Fachada;


import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

public class ViewLivraria {

	private JFrame frame;
	private JTextField txtId;
	private JLabel lblTitle;
	private JLabel lblAuthor;
	private JLabel lblPrice;
	private JLabel lblQty;
	private JTextField txtTitle;
	private JTextField txtAuthor;
	private JTextField txtPrice;
	private JTextField txtQty;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewLivraria window = new ViewLivraria();
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
	public ViewLivraria() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 770, 597);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Livraria");
		frame.getContentPane().setLayout(null);
		
		JButton btnInserir = new JButton("Inserir");
		btnInserir.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnInserir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					BooksEntity book = new BooksEntity(Integer.parseInt(txtId.getText()),
					txtTitle.getText(),txtAuthor.getText(), Float.parseFloat(txtPrice.getText()),
					Integer.parseInt(txtQty.getText()));
					Fachada fachada = new Fachada();
					fachada.inserirLivro(book);
					JOptionPane.showMessageDialog(null, "Livro inserido!");
			}catch (LivrariaException msn) {
				JOptionPane.showMessageDialog(null, "Algo errado! " + msn.getMessage());
				
			}catch (NumberFormatException msn) {
				JOptionPane.showMessageDialog(null, "Os campos price e qty devem conter valores númericos!"
						+ msn.getMessage());
			}catch (Exception msn) {
				JOptionPane.showMessageDialog(null, "Algo errado! " + msn.getMessage());
			}
				
				
		}});
		btnInserir.setBounds(598, 280, 112, 31);
		frame.getContentPane().add(btnInserir);
		
		txtId = new JTextField();
		txtId.setBounds(97, 29, 189, 19);
		frame.getContentPane().add(txtId);
		txtId.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Id:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(20, 21, 67, 31);
		frame.getContentPane().add(lblNewLabel);
		
		lblTitle = new JLabel("Title:");
		lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTitle.setBounds(20, 62, 67, 31);
		frame.getContentPane().add(lblTitle);
		
		lblAuthor = new JLabel("Author:");
		lblAuthor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAuthor.setBounds(20, 103, 67, 31);
		frame.getContentPane().add(lblAuthor);
		
		lblPrice = new JLabel("Price:");
		lblPrice.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPrice.setBounds(20, 144, 67, 31);
		frame.getContentPane().add(lblPrice);
		
		lblQty = new JLabel("Qty:");
		lblQty.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblQty.setBounds(20, 185, 67, 31);
		frame.getContentPane().add(lblQty);
		
		txtTitle = new JTextField();
		txtTitle.setColumns(10);
		txtTitle.setBounds(97, 70, 189, 19);
		frame.getContentPane().add(txtTitle);
		
		txtAuthor = new JTextField();
		txtAuthor.setColumns(10);
		txtAuthor.setBounds(97, 111, 189, 19);
		frame.getContentPane().add(txtAuthor);
		
		txtPrice = new JTextField();
		txtPrice.setColumns(10);
		txtPrice.setBounds(97, 152, 189, 19);
		frame.getContentPane().add(txtPrice);
		
		txtQty = new JTextField();
		txtQty.setColumns(10);
		txtQty.setBounds(97, 193, 189, 19);
		frame.getContentPane().add(txtQty);
	}
}
