package kanban;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class KanbanApp {

	public JFrame frmKanbanLogin;
	public static JTextField inputEmail;
	public static JPasswordField InputPassword;
		

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KanbanApp window = new KanbanApp();
					window.frmKanbanLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public KanbanApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frmKanbanLogin = new JFrame();
		frmKanbanLogin.setResizable(false);
		frmKanbanLogin.setTitle("Kanban login");
		frmKanbanLogin.setBounds(100, 100, 285, 285);
		frmKanbanLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmKanbanLogin.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("EMAIL ADDRESS");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel.setBounds(22, 34, 118, 19);
		frmKanbanLogin.getContentPane().add(lblNewLabel);

		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setHorizontalAlignment(SwingConstants.LEFT);
		lblPassword.setFont(new Font("Arial", Font.PLAIN, 12));
		lblPassword.setBounds(22, 105, 79, 14);
		frmKanbanLogin.getContentPane().add(lblPassword);

		inputEmail = new JTextField();
		inputEmail.setHorizontalAlignment(SwingConstants.LEFT);
		inputEmail.setBounds(22, 64, 209, 26);
		frmKanbanLogin.getContentPane().add(inputEmail);
		inputEmail.setColumns(10);

		InputPassword = new JPasswordField();
		//press enter to log in
		InputPassword.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				if(arg0.getKeyCode() == KeyEvent.VK_ENTER) {
					
					String email = inputEmail.getText();
					String password = new String(InputPassword.getPassword());
					frmKanbanLogin.dispose();
					KanbanTimetrack kb = new KanbanTimetrack();
					kb.KanbanTimetrack.setVisible(true);									
				}
			}
		});
		InputPassword.setHorizontalAlignment(SwingConstants.LEFT);
		InputPassword.setBounds(22, 130, 209, 26);
		frmKanbanLogin.getContentPane().add(InputPassword);

		JButton signinButton = new JButton("SIGN IN");
		signinButton.setFont(new Font("Arial", Font.PLAIN, 12));
		signinButton.setBounds(22, 198, 94, 30);
		frmKanbanLogin.getContentPane().add(signinButton);

		// click to log in
		signinButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String email = inputEmail.getText();
				String password = new String(InputPassword.getPassword());
				frmKanbanLogin.dispose();
				KanbanTimetrack kb = new KanbanTimetrack();
				kb.KanbanTimetrack.setVisible(true);									
			}
		});
	}	

}
