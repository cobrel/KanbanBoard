package kanban;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class KanbanApp {

	private JFrame frmKanbanLogin;
	private JTextField inputEmail;
	private JPasswordField InputPassword;
	private JPasswordField InputOkta;
	WebDriver driverMain;
	
	public WebDriver test(WebDriver driver) {
		System.setProperty("webdriver.gecko.driver", "D:\\programare\\geckodriver.exe");
		driver = new FirefoxDriver();
		return driver;
	}
	
	public WebDriver getDriver(){
		return this.driverMain;
		}

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
	protected void initialize() {
		frmKanbanLogin = new JFrame();
		frmKanbanLogin.setResizable(false);
		frmKanbanLogin.setTitle("Kanban login");
		frmKanbanLogin.setBounds(100, 100, 287, 319);
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
		
		JLabel lblOkta = new JLabel("OKTA");
		lblOkta.setHorizontalAlignment(SwingConstants.LEFT);
		lblOkta.setFont(new Font("Arial", Font.PLAIN, 12));
		lblOkta.setBounds(22, 171, 79, 14);
		frmKanbanLogin.getContentPane().add(lblOkta);
		
		inputEmail = new JTextField();
		inputEmail.setHorizontalAlignment(SwingConstants.LEFT);
		inputEmail.setBounds(22, 64, 209, 26);
		frmKanbanLogin.getContentPane().add(inputEmail);
		inputEmail.setColumns(10);
		
		InputPassword = new JPasswordField();
		InputPassword.setHorizontalAlignment(SwingConstants.LEFT);
		InputPassword.setBounds(22, 130, 209, 26);
		frmKanbanLogin.getContentPane().add(InputPassword);
		
		InputOkta = new JPasswordField();
		InputOkta.addKeyListener(new KeyAdapter() {
			@Override
			//press enter to sendKeys
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					WebDriver driver = test(driverMain);
					driver.manage().window().maximize();
					WebDriverWait wait = new WebDriverWait(driver, 15);					
					driver.get("https://login.work.ea.com/login");
					JavascriptExecutor js = (JavascriptExecutor)driver;	
					String email = inputEmail.getText();
					String password = new String(InputPassword.getPassword());
					String okta = new String(InputOkta.getPassword());
					wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("input[id='email']"))));
					wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("input[id='password']"))));
					driver.findElement(By.cssSelector("input[id='email']")).sendKeys(email);
					driver.findElement(By.cssSelector("input[id='password']")).sendKeys(password, Keys.ENTER);								
					try {
						//wait for page to load to input okta
						wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("input[name='code']"))));
						driver.findElement(By.cssSelector("input[name='code']")).sendKeys(okta, Keys.ENTER);
						wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//h1[text()='Your Account Settings']"))));
						//open kanbanBoard in new tab
						js.executeScript("window.open('" + "https://jaas.ea.com/secure/RapidBoard.jspa?rapidView=5363&projectKey=FIFA22QV&selectedIssue=FIFA22-39674"+ "', '_blank');");
						Set<String> id = driver.getWindowHandles();
						String parent = id.iterator().next();
						id.remove(id.iterator().next());
						String child = id.iterator().next();
						driver.switchTo().window(child);
						wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("input[name='os_username']"))));
						wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("input[name='os_password']"))));
						driver.findElement(By.cssSelector("input[name='os_username']")).sendKeys(email);
						driver.findElement(By.cssSelector("input[name='os_password']")).sendKeys(password, Keys.ENTER);
						wait.until(ExpectedConditions.refreshed(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Quick Filters:']/parent::dl//dd[3]")))).click();
						//open kanbanTimetrack window
						KanbanTimetrack kb = new KanbanTimetrack();
				        kb.KanbanTimetrack.setVisible(true);
				        frmKanbanLogin.dispose();
					}
					catch(Exception ex) {
						int input = JOptionPane.showOptionDialog(InputOkta, "Invalid email/password or okta", "Failed to Sign In", JOptionPane.OK_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE, null, null, null);	
						if(input == JOptionPane.OK_OPTION || input == JOptionPane.CANCEL_OPTION) {
							driver.close();
						}
					}
				}
			}
		});
		InputOkta.setHorizontalAlignment(SwingConstants.LEFT);
		InputOkta.setBounds(22, 196, 209, 26);
		frmKanbanLogin.getContentPane().add(InputOkta);
		
		JButton signinButton = new JButton("SIGN IN");
		//click to log in
		signinButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				WebDriver driver = test(driverMain);
				driver.manage().window().maximize();
				WebDriverWait wait = new WebDriverWait(driver, 15);
				driver.get("https://login.work.ea.com/login");
				JavascriptExecutor js = (JavascriptExecutor)driver;	
				String email = inputEmail.getText();
				String password = new String(InputPassword.getPassword());
				String okta = new String(InputOkta.getPassword());
				wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("input[id='email']"))));
				wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("input[id='password']"))));
				driver.findElement(By.cssSelector("input[id='email']")).sendKeys(email);
				driver.findElement(By.cssSelector("input[id='password']")).sendKeys(password, Keys.ENTER);							
				try {
					//wait for page to load to input okta
					wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("input[name='code']"))));
					driver.findElement(By.cssSelector("input[name='code']")).sendKeys(okta, Keys.ENTER);
					wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//h1[text()='Your Account Settings']"))));
					//open kanbanBoard in new tab
					js.executeScript("window.open('" + "https://jaas.ea.com/secure/RapidBoard.jspa?rapidView=5363&projectKey=FIFA22QV&selectedIssue=FIFA22-39674"+ "', '_blank');");
					Set<String> id = driver.getWindowHandles();
					String parent = id.iterator().next();
					id.remove(id.iterator().next());
					String child = id.iterator().next();
					driver.switchTo().window(child);
					wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("input[name='os_username']"))));
					wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("input[name='os_password']"))));
					driver.findElement(By.cssSelector("input[name='os_username']")).sendKeys(email);
					driver.findElement(By.cssSelector("input[name='os_password']")).sendKeys(password, Keys.ENTER);
					wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[text()='VC-NS']"))));
					int voltaNs = driver.findElements(By.cssSelector(".js-quickfilter-button.aui-button.aui-button-link.ghx-active")).size();
					if(voltaNs > 1) {
						driver.findElement(By.xpath("//*[text()='VC-NS']")).click();
						wait.until(ExpectedConditions.refreshed(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Quick Filters:']/parent::dl//dd[3]")))).click();
				        KanbanTimetrack kb = new KanbanTimetrack();
				        kb.KanbanTimetrack.setVisible(true);
				        frmKanbanLogin.dispose();
						
					}
					else {
						wait.until(ExpectedConditions.refreshed(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Quick Filters:']/parent::dl//dd[3]")))).click();
				        KanbanTimetrack kb = new KanbanTimetrack();
				        kb.KanbanTimetrack.setVisible(true);
				        frmKanbanLogin.dispose();						
					}
					
				}
				catch(Exception ex) {
					int input = JOptionPane.showOptionDialog(signinButton, "Invalid email/password or okta", "Failed to Sign In", JOptionPane.OK_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE, null, null, null);	
					if(input == JOptionPane.OK_OPTION || input == JOptionPane.CANCEL_OPTION) {
						driver.close();
					}
				}
				

				
			}
		});
		signinButton.setFont(new Font("Arial", Font.PLAIN, 12));
		signinButton.setBounds(22, 237, 94, 30);
		frmKanbanLogin.getContentPane().add(signinButton);
	}
}
