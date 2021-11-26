package kanban;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class KanbanTimetrack extends KanbanApp{

	 JFrame KanbanTimetrack;
	 private JTextField regresiiTextField;
	 private JTextField trainingTextField;
	 private JTextField scrumMeetingsTextField;
	 private JTextField testSetupTextField;
	 private JTextField reportingTextField;
	 private JTextField smokeTextField;
	 private JTextField conChecksTextField;
	 private JTextField performanceTextField;
	 private JTextField adHocTextField;
	 private JTextField mdRatingTextField;
	 private JTextField dftPlaySessionsTextField;
	 private JTextField dftTextField;
	 private JTextField frostbiteIntegrationTextField;
	 private JTextField specialBuildsTextField;
	 private JTextField supportAutomationTextField;
	 private JTextField supportSubmissionTextField;
	 private JTextField milestoneCheckliststextField;
	 private JTextField stabilityTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KanbanTimetrack window = new KanbanTimetrack();
					window.KanbanTimetrack.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public KanbanTimetrack() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	protected void initialize() {
		super.initialize();
		KanbanTimetrack = new JFrame();
		KanbanTimetrack.setResizable(false);
		KanbanTimetrack.setTitle("Time Tracking");
		KanbanTimetrack.setBounds(100, 100, 560, 791);
		KanbanTimetrack.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		KanbanTimetrack.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ai facut regresii ?");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel.setBounds(25, 65, 110, 14);
		KanbanTimetrack.getContentPane().add(lblNewLabel);
		
		JComboBox regresiiComboBox = new JComboBox();
		regresiiComboBox.setModel(new DefaultComboBoxModel(new String[] {"No", "Yes"}));
		regresiiComboBox.setBounds(145, 61, 49, 22);
		KanbanTimetrack.getContentPane().add(regresiiComboBox);
		
		regresiiTextField = new JTextField();
		regresiiTextField.setBounds(405, 62, 80, 20);
		KanbanTimetrack.getContentPane().add(regresiiTextField);
		regresiiTextField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Task");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(25, 123, 252, 14);
		KanbanTimetrack.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Option");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(294, 123, 54, 14);
		KanbanTimetrack.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Hours worked");
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3.setBounds(405, 123, 80, 14);
		KanbanTimetrack.getContentPane().add(lblNewLabel_3);
		
		trainingTextField = new JTextField();
		trainingTextField.setColumns(10);
		trainingTextField.setBounds(405, 160, 86, 20);
		KanbanTimetrack.getContentPane().add(trainingTextField);
		
		JLabel lblNewLabel_4 = new JLabel("Training");
		lblNewLabel_4.setBackground(new Color(100, 149, 237));
		lblNewLabel_4.setOpaque(true);
		lblNewLabel_4.setBorder(null);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_4.setBounds(25, 160, 252, 22);
		KanbanTimetrack.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("Scrum Meetings");
		lblNewLabel_4_1.setBackground(new Color(50, 205, 50));
		lblNewLabel_4_1.setOpaque(true);
		lblNewLabel_4_1.setBorder(null);
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4_1.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_4_1.setBounds(25, 190, 252, 22);
		KanbanTimetrack.getContentPane().add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Test Setup");
		lblNewLabel_4_1_1.setBackground(new Color(100, 149, 237));
		lblNewLabel_4_1_1.setOpaque(true);
		lblNewLabel_4_1_1.setBorder(null);
		lblNewLabel_4_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4_1_1.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_4_1_1.setBounds(25, 220, 252, 22);
		KanbanTimetrack.getContentPane().add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_4_1_1_1 = new JLabel("Reporting ");
		lblNewLabel_4_1_1_1.setBackground(new Color(50, 205, 50));
		lblNewLabel_4_1_1_1.setOpaque(true);
		lblNewLabel_4_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4_1_1_1.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_4_1_1_1.setBounds(25, 250, 252, 22);
		KanbanTimetrack.getContentPane().add(lblNewLabel_4_1_1_1);
		
		JLabel lblNewLabel_4_1_1_1_1 = new JLabel("Smoke");
		lblNewLabel_4_1_1_1_1.setBackground(new Color(100, 149, 237));
		lblNewLabel_4_1_1_1_1.setOpaque(true);
		lblNewLabel_4_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_4_1_1_1_1.setBounds(25, 280, 252, 22);
		KanbanTimetrack.getContentPane().add(lblNewLabel_4_1_1_1_1);
		
		JLabel lblNewLabel_4_1_1_1_1_1 = new JLabel("Connectivity checks");
		lblNewLabel_4_1_1_1_1_1.setBackground(new Color(100, 149, 237));
		lblNewLabel_4_1_1_1_1_1.setOpaque(true);
		lblNewLabel_4_1_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4_1_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_4_1_1_1_1_1.setBounds(25, 310, 252, 22);
		KanbanTimetrack.getContentPane().add(lblNewLabel_4_1_1_1_1_1);
		
		JLabel lblNewLabel_4_1_1_1_1_1_1 = new JLabel("Performance QSPR/Load times");
		lblNewLabel_4_1_1_1_1_1_1.setBackground(new Color(255, 0, 0));
		lblNewLabel_4_1_1_1_1_1_1.setOpaque(true);
		lblNewLabel_4_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4_1_1_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_4_1_1_1_1_1_1.setBounds(25, 340, 252, 22);
		KanbanTimetrack.getContentPane().add(lblNewLabel_4_1_1_1_1_1_1);
		
		JLabel lblNewLabel_4_1_1_1_1_1_1_1 = new JLabel("Ad Hoc Requests/Testing");
		lblNewLabel_4_1_1_1_1_1_1_1.setBackground(new Color(100, 149, 237));
		lblNewLabel_4_1_1_1_1_1_1_1.setOpaque(true);
		lblNewLabel_4_1_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4_1_1_1_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_4_1_1_1_1_1_1_1.setBounds(25, 400, 252, 22);
		KanbanTimetrack.getContentPane().add(lblNewLabel_4_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_4_1_1_1_1_1_1_1_1 = new JLabel("MD Rating");
		lblNewLabel_4_1_1_1_1_1_1_1_1.setBackground(new Color(255, 0, 0));
		lblNewLabel_4_1_1_1_1_1_1_1_1.setOpaque(true);
		lblNewLabel_4_1_1_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4_1_1_1_1_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_4_1_1_1_1_1_1_1_1.setBounds(25, 430, 252, 22);
		KanbanTimetrack.getContentPane().add(lblNewLabel_4_1_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_4_1_1_1_1_1_1_1_1_1 = new JLabel("DFT Play Sessions");
		lblNewLabel_4_1_1_1_1_1_1_1_1_1.setBackground(new Color(50, 205, 50));
		lblNewLabel_4_1_1_1_1_1_1_1_1_1.setOpaque(true);
		lblNewLabel_4_1_1_1_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4_1_1_1_1_1_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_4_1_1_1_1_1_1_1_1_1.setBounds(25, 460, 252, 22);
		KanbanTimetrack.getContentPane().add(lblNewLabel_4_1_1_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_4_1_1_1_1_1_1_1_1_1_1 = new JLabel("DFT (Directed Free Testing)");
		lblNewLabel_4_1_1_1_1_1_1_1_1_1_1.setBackground(new Color(100, 149, 237));
		lblNewLabel_4_1_1_1_1_1_1_1_1_1_1.setOpaque(true);
		lblNewLabel_4_1_1_1_1_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4_1_1_1_1_1_1_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_4_1_1_1_1_1_1_1_1_1_1.setBounds(25, 490, 252, 22);
		KanbanTimetrack.getContentPane().add(lblNewLabel_4_1_1_1_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_4_1_1_1_1_1_1_1_1_1_1_1 = new JLabel("Frostbite Integrations");
		lblNewLabel_4_1_1_1_1_1_1_1_1_1_1_1.setBackground(new Color(255, 0, 0));
		lblNewLabel_4_1_1_1_1_1_1_1_1_1_1_1.setOpaque(true);
		lblNewLabel_4_1_1_1_1_1_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4_1_1_1_1_1_1_1_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_4_1_1_1_1_1_1_1_1_1_1_1.setBounds(25, 520, 252, 22);
		KanbanTimetrack.getContentPane().add(lblNewLabel_4_1_1_1_1_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_4_1_1_1_1_1_1_1_1_1_1_1_1 = new JLabel("Special Builds closed beta etc");
		lblNewLabel_4_1_1_1_1_1_1_1_1_1_1_1_1.setBackground(new Color(100, 149, 237));
		lblNewLabel_4_1_1_1_1_1_1_1_1_1_1_1_1.setOpaque(true);
		lblNewLabel_4_1_1_1_1_1_1_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4_1_1_1_1_1_1_1_1_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_4_1_1_1_1_1_1_1_1_1_1_1_1.setBounds(25, 550, 252, 22);
		KanbanTimetrack.getContentPane().add(lblNewLabel_4_1_1_1_1_1_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_4_1_1_1_1_1_1_1_1_1_1_1_1_1 = new JLabel("Support Automation");
		lblNewLabel_4_1_1_1_1_1_1_1_1_1_1_1_1_1.setBackground(new Color(50, 205, 50));
		lblNewLabel_4_1_1_1_1_1_1_1_1_1_1_1_1_1.setOpaque(true);
		lblNewLabel_4_1_1_1_1_1_1_1_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4_1_1_1_1_1_1_1_1_1_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_4_1_1_1_1_1_1_1_1_1_1_1_1_1.setBounds(25, 580, 252, 22);
		KanbanTimetrack.getContentPane().add(lblNewLabel_4_1_1_1_1_1_1_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_4_1_1_1_1_1_1_1_1_1_1_1_1_1_1 = new JLabel("Support Submission");
		lblNewLabel_4_1_1_1_1_1_1_1_1_1_1_1_1_1_1.setBackground(new Color(100, 149, 237));
		lblNewLabel_4_1_1_1_1_1_1_1_1_1_1_1_1_1_1.setOpaque(true);
		lblNewLabel_4_1_1_1_1_1_1_1_1_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4_1_1_1_1_1_1_1_1_1_1_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_4_1_1_1_1_1_1_1_1_1_1_1_1_1_1.setBounds(25, 610, 252, 22);
		KanbanTimetrack.getContentPane().add(lblNewLabel_4_1_1_1_1_1_1_1_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_4_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1 = new JLabel("Milestone Checklists (alpha/beta checks)");
		lblNewLabel_4_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1.setBackground(new Color(255, 0, 0));
		lblNewLabel_4_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1.setOpaque(true);
		lblNewLabel_4_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_4_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1.setBounds(25, 640, 252, 22);
		KanbanTimetrack.getContentPane().add(lblNewLabel_4_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1);
		
		scrumMeetingsTextField = new JTextField();
		scrumMeetingsTextField.setColumns(10);
		scrumMeetingsTextField.setBounds(405, 190, 86, 20);
		KanbanTimetrack.getContentPane().add(scrumMeetingsTextField);
		
		testSetupTextField = new JTextField();
		testSetupTextField.setColumns(10);
		testSetupTextField.setBounds(405, 220, 86, 20);
		KanbanTimetrack.getContentPane().add(testSetupTextField);
		
		reportingTextField = new JTextField();
		reportingTextField.setColumns(10);
		reportingTextField.setBounds(405, 250, 86, 20);
		KanbanTimetrack.getContentPane().add(reportingTextField);
		
		smokeTextField = new JTextField();
		smokeTextField.setColumns(10);
		smokeTextField.setBounds(405, 280, 86, 20);
		KanbanTimetrack.getContentPane().add(smokeTextField);
		
		conChecksTextField = new JTextField();
		conChecksTextField.setColumns(10);
		conChecksTextField.setBounds(405, 310, 86, 20);
		KanbanTimetrack.getContentPane().add(conChecksTextField);
		
		performanceTextField = new JTextField();
		performanceTextField.setColumns(10);
		performanceTextField.setBounds(405, 340, 86, 20);
		KanbanTimetrack.getContentPane().add(performanceTextField);
		
		adHocTextField = new JTextField();
		adHocTextField.setColumns(10);
		adHocTextField.setBounds(405, 400, 86, 20);
		KanbanTimetrack.getContentPane().add(adHocTextField);
		
		mdRatingTextField = new JTextField();
		mdRatingTextField.setColumns(10);
		mdRatingTextField.setBounds(405, 430, 86, 20);
		KanbanTimetrack.getContentPane().add(mdRatingTextField);
		
		dftPlaySessionsTextField = new JTextField();
		dftPlaySessionsTextField.setColumns(10);
		dftPlaySessionsTextField.setBounds(405, 460, 86, 20);
		KanbanTimetrack.getContentPane().add(dftPlaySessionsTextField);
		
		dftTextField = new JTextField();
		dftTextField.setColumns(10);
		dftTextField.setBounds(405, 490, 86, 20);
		KanbanTimetrack.getContentPane().add(dftTextField);
		
		frostbiteIntegrationTextField = new JTextField();
		frostbiteIntegrationTextField.setColumns(10);
		frostbiteIntegrationTextField.setBounds(405, 520, 86, 20);
		KanbanTimetrack.getContentPane().add(frostbiteIntegrationTextField);
		
		specialBuildsTextField = new JTextField();
		specialBuildsTextField.setColumns(10);
		specialBuildsTextField.setBounds(405, 550, 86, 20);
		KanbanTimetrack.getContentPane().add(specialBuildsTextField);
		
		supportAutomationTextField = new JTextField();
		supportAutomationTextField.setColumns(10);
		supportAutomationTextField.setBounds(405, 580, 86, 20);
		KanbanTimetrack.getContentPane().add(supportAutomationTextField);
		
		supportSubmissionTextField = new JTextField();
		supportSubmissionTextField.setColumns(10);
		supportSubmissionTextField.setBounds(405, 610, 86, 20);
		KanbanTimetrack.getContentPane().add(supportSubmissionTextField);
		
		milestoneCheckliststextField = new JTextField();
		milestoneCheckliststextField.setColumns(10);
		milestoneCheckliststextField.setBounds(405, 640, 86, 20);
		KanbanTimetrack.getContentPane().add(milestoneCheckliststextField);
		
		stabilityTextField = new JTextField();
		stabilityTextField.setColumns(10);
		stabilityTextField.setBounds(405, 370, 86, 20);
		KanbanTimetrack.getContentPane().add(stabilityTextField);
		
		JComboBox trainingComboBox = new JComboBox();
		trainingComboBox.setModel(new DefaultComboBoxModel(new String[] {"No", "Yes"}));
		trainingComboBox.setBounds(294, 160, 54, 22);
		KanbanTimetrack.getContentPane().add(trainingComboBox);
		
		JComboBox scrumMeetingsComboBox = new JComboBox();
		scrumMeetingsComboBox.setModel(new DefaultComboBoxModel(new String[] {"No", "Yes"}));
		scrumMeetingsComboBox.setBounds(294, 190, 54, 22);
		KanbanTimetrack.getContentPane().add(scrumMeetingsComboBox);
		
		JComboBox testSetupComboBox = new JComboBox();
		testSetupComboBox.setModel(new DefaultComboBoxModel(new String[] {"No", "Yes"}));
		testSetupComboBox.setBounds(294, 220, 54, 22);
		KanbanTimetrack.getContentPane().add(testSetupComboBox);
		
		JComboBox reportingComboBox = new JComboBox();
		reportingComboBox.setModel(new DefaultComboBoxModel(new String[] {"No", "Yes"}));
		reportingComboBox.setBounds(294, 250, 54, 22);
		KanbanTimetrack.getContentPane().add(reportingComboBox);
		
		JComboBox smokeComboBox = new JComboBox();
		smokeComboBox.setModel(new DefaultComboBoxModel(new String[] {"No", "Yes"}));
		smokeComboBox.setBounds(294, 280, 54, 22);
		KanbanTimetrack.getContentPane().add(smokeComboBox);
		
		JComboBox conChecksComboBox = new JComboBox();
		conChecksComboBox.setModel(new DefaultComboBoxModel(new String[] {"No", "Yes"}));
		conChecksComboBox.setBounds(294, 310, 54, 22);
		KanbanTimetrack.getContentPane().add(conChecksComboBox);
		
		JComboBox performanceComboBox = new JComboBox();
		performanceComboBox.setModel(new DefaultComboBoxModel(new String[] {"No", "Yes"}));
		performanceComboBox.setBounds(294, 340, 54, 22);
		KanbanTimetrack.getContentPane().add(performanceComboBox);
		
		JComboBox stabilityComboBox = new JComboBox();
		stabilityComboBox.setModel(new DefaultComboBoxModel(new String[] {"No", "Yes"}));
		stabilityComboBox.setBounds(294, 370, 54, 22);
		KanbanTimetrack.getContentPane().add(stabilityComboBox);
		
		JComboBox adHocComboBox = new JComboBox();
		adHocComboBox.setModel(new DefaultComboBoxModel(new String[] {"No", "Yes"}));
		adHocComboBox.setBounds(294, 400, 54, 22);
		KanbanTimetrack.getContentPane().add(adHocComboBox);
		
		JComboBox mdRatingComboBox = new JComboBox();
		mdRatingComboBox.setModel(new DefaultComboBoxModel(new String[] {"No", "Yes"}));
		mdRatingComboBox.setBounds(294, 430, 54, 22);
		KanbanTimetrack.getContentPane().add(mdRatingComboBox);
		
		JComboBox dftPlaySessionsComboBox = new JComboBox();
		dftPlaySessionsComboBox.setModel(new DefaultComboBoxModel(new String[] {"No", "Yes"}));
		dftPlaySessionsComboBox.setBounds(294, 460, 54, 22);
		KanbanTimetrack.getContentPane().add(dftPlaySessionsComboBox);
		
		JComboBox dftComboBox = new JComboBox();
		dftComboBox.setModel(new DefaultComboBoxModel(new String[] {"No", "Yes"}));
		dftComboBox.setBounds(294, 490, 54, 22);
		KanbanTimetrack.getContentPane().add(dftComboBox);
		
		JComboBox frostbiteIntegrationComboBox = new JComboBox();
		frostbiteIntegrationComboBox.setModel(new DefaultComboBoxModel(new String[] {"No", "Yes"}));
		frostbiteIntegrationComboBox.setBounds(294, 520, 54, 22);
		KanbanTimetrack.getContentPane().add(frostbiteIntegrationComboBox);
		
		JComboBox specialBuildsComboBox = new JComboBox();
		specialBuildsComboBox.setModel(new DefaultComboBoxModel(new String[] {"No", "Yes"}));
		specialBuildsComboBox.setBounds(294, 550, 54, 22);
		KanbanTimetrack.getContentPane().add(specialBuildsComboBox);
		
		JComboBox supportAutomationComboBox = new JComboBox();
		supportAutomationComboBox.setModel(new DefaultComboBoxModel(new String[] {"No", "Yes"}));
		supportAutomationComboBox.setBounds(294, 580, 54, 22);
		KanbanTimetrack.getContentPane().add(supportAutomationComboBox);
		
		JComboBox supportSubmissionComboBox = new JComboBox();
		supportSubmissionComboBox.setModel(new DefaultComboBoxModel(new String[] {"No", "Yes"}));
		supportSubmissionComboBox.setBounds(294, 610, 54, 22);
		KanbanTimetrack.getContentPane().add(supportSubmissionComboBox);
		
		JComboBox milestoneChecklistsComboBox = new JComboBox();
		milestoneChecklistsComboBox.setModel(new DefaultComboBoxModel(new String[] {"No", "Yes"}));
		milestoneChecklistsComboBox.setBounds(294, 640, 54, 22);
		KanbanTimetrack.getContentPane().add(milestoneChecklistsComboBox);
		
		JButton createBtn = new JButton("Create");
		createBtn.setFont(new Font("Arial", Font.PLAIN, 13));
		createBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				WebDriver gr = getDriver();			
				gr.getTitle();				
				
				//Actions a = new Actions(gr);
/*				if(trainingComboBox.equals("Yes")) {
				driver.findElement(By.xpath("//a[text()='Create']")).click();
				driver.findElement(By.cssSelector("input#summary")).sendKeys("Training");
				driver.findElement(By.cssSelector("button#assign-to-me-trigger")).click();
				//priority
				Select prio = new Select(driver.findElement(By.cssSelector("select#priority")));
				prio.selectByValue("2");
				//game area
				driver.findElement(By.cssSelector("textarea#customfield_12300-textarea")).sendKeys("Volta");
				//sub-group
				Select sg = new Select(driver.findElement(By.cssSelector("select#customfield_21404")));
				sg.selectByVisibleText("EARO.VC");
				//worktype
				Select worktype = new Select(driver.findElement(By.cssSelector("select#customfield_17001")));
				worktype.selectByVisibleText("Other-LearningAndSharing");
				//create
				driver.findElement(By.cssSelector("input#create-issue-submit")).click();				
				//drag and drop
				WebElement source = driver.findElement(By.xpath("//li[@data-column-id='27208']//span[text()='Training']"));
        		WebElement target = driver.findElement(By.xpath("//li[@data-column-id='27212']"));
        		a.dragAndDrop(source, target).build().perform();
        		//input worked hours and complete task				
				driver.findElement(By.cssSelector("input#log-work-time-logged")).sendKeys("");
				driver.findElement(By.cssSelector("input[value='Done']")).click();
				
			}
			
				if(scrumMeetingsComboBox.equals("Yes")) {
				driver.findElement(By.xpath("//a[text()='Create']")).click();
				driver.findElement(By.cssSelector("input#summary")).sendKeys("Scrum Meetings");
				driver.findElement(By.cssSelector("button#assign-to-me-trigger")).click();
				//priority
				Select prio = new Select(driver.findElement(By.cssSelector("select#priority")));
				prio.selectByValue("3");
				//game area
				driver.findElement(By.cssSelector("textarea#customfield_12300-textarea")).sendKeys("Volta");
				//sub-group
				Select sg = new Select(driver.findElement(By.cssSelector("select#customfield_21404")));
				sg.selectByVisibleText("EARO.VC");
				//worktype
				Select worktype = new Select(driver.findElement(By.cssSelector("select#customfield_17001")));
				worktype.selectByVisibleText("Other-LearningAndSharing");
				//create
				driver.findElement(By.cssSelector("input#create-issue-submit")).click();
				//drag and drop
				WebElement source = driver.findElement(By.xpath("//li[@data-column-id='27208']//span[text()='Scrum Meetings']"));
        		WebElement target = driver.findElement(By.xpath("//li[@data-column-id='27212']"));
        		a.dragAndDrop(source, target).build().perform();
        		//input worked hours and complete task
				driver.findElement(By.cssSelector("input#log-work-time-logged")).sendKeys("");
				driver.findElement(By.cssSelector("input[value='Done']")).click();
				
			}
			
				if(testSetupComboBox.equals("Yes")) {
				driver.findElement(By.xpath("//a[text()='Create']")).click();
				driver.findElement(By.cssSelector("input#summary")).sendKeys("Test Setup");
				driver.findElement(By.cssSelector("button#assign-to-me-trigger")).click();
				//priority
				Select prio = new Select(driver.findElement(By.cssSelector("select#priority")));
				prio.selectByValue("2");
				//game area
				driver.findElement(By.cssSelector("textarea#customfield_12300-textarea")).sendKeys("Volta");
				//sub-group
				Select sg = new Select(driver.findElement(By.cssSelector("select#customfield_21404")));
				sg.selectByVisibleText("EARO.VC");
				//worktype
				Select worktype = new Select(driver.findElement(By.cssSelector("select#customfield_17001")));
				worktype.selectByVisibleText("Build/TestSetup");
				//create
				driver.findElement(By.cssSelector("input#create-issue-submit")).click();
				//drag and drop
				WebElement source = driver.findElement(By.xpath("//li[@data-column-id='27208']//span[text()='Test Setup']"));
        		WebElement target = driver.findElement(By.xpath("//li[@data-column-id='27212']"));
        		a.dragAndDrop(source, target).build().perform();
        		//input worked hours and complete task
				driver.findElement(By.cssSelector("input#log-work-time-logged")).sendKeys("");
				driver.findElement(By.cssSelector("input[value='Done']")).click();
				
			}
			
				if(reportingComboBox.equals("Yes")) {
				driver.findElement(By.xpath("//a[text()='Create']")).click();
				driver.findElement(By.cssSelector("input#summary")).sendKeys("Reporting");
				driver.findElement(By.cssSelector("button#assign-to-me-trigger")).click();
				//priority
				Select prio = new Select(driver.findElement(By.cssSelector("select#priority")));
				prio.selectByValue("3");
				//game area
				driver.findElement(By.cssSelector("textarea#customfield_12300-textarea")).sendKeys("Volta");
				//sub-group
				Select sg = new Select(driver.findElement(By.cssSelector("select#customfield_21404")));
				sg.selectByVisibleText("EARO.VC");
				//worktype
				Select worktype = new Select(driver.findElement(By.cssSelector("select#customfield_17001")));
				worktype.selectByVisibleText("Other-Reporting");
				//create
				driver.findElement(By.cssSelector("input#create-issue-submit")).click();
				//drag and drop
				WebElement source = driver.findElement(By.xpath("//li[@data-column-id='27208']//span[text()='Reporting']"));
        		WebElement target = driver.findElement(By.xpath("//li[@data-column-id='27212']"));
        		a.dragAndDrop(source, target).build().perform();
        		//input worked hours and complete task
				driver.findElement(By.cssSelector("input#log-work-time-logged")).sendKeys("");
				driver.findElement(By.cssSelector("input[value='Done']")).click();
				
			}
			
				if(smokeComboBox.equals("Yes")) {
				driver.findElement(By.xpath("//a[text()='Create']")).click();
				driver.findElement(By.cssSelector("input#summary")).sendKeys("Smoke");
				driver.findElement(By.cssSelector("button#assign-to-me-trigger")).click();
				//priority
				Select prio = new Select(driver.findElement(By.cssSelector("select#priority")));
				prio.selectByValue("2");
				//game area
				driver.findElement(By.cssSelector("textarea#customfield_12300-textarea")).sendKeys("Volta");
				//sub-group
				Select sg = new Select(driver.findElement(By.cssSelector("select#customfield_21404")));
				sg.selectByVisibleText("EARO.VC");
				//worktype
				Select worktype = new Select(driver.findElement(By.cssSelector("select#customfield_17001")));
				worktype.selectByVisibleText("GameHealthChecks");
				//create
				driver.findElement(By.cssSelector("input#create-issue-submit")).click();
				//drag and drop
				WebElement source = driver.findElement(By.xpath("//li[@data-column-id='27208']//span[text()='Smoke']"));
        		WebElement target = driver.findElement(By.xpath("//li[@data-column-id='27212']"));
        		a.dragAndDrop(source, target).build().perform();
        		//input worked hours and complete task
				driver.findElement(By.cssSelector("input#log-work-time-logged")).sendKeys("");
				driver.findElement(By.cssSelector("input[value='Done']")).click();
				
			}
			
				if(conChecksComboBox.equals("Yes")) {
				driver.findElement(By.xpath("//a[text()='Create']")).click();
				driver.findElement(By.cssSelector("input#summary")).sendKeys("Connectivity checks");
				driver.findElement(By.cssSelector("button#assign-to-me-trigger")).click();
				//priority
				Select prio = new Select(driver.findElement(By.cssSelector("select#priority")));
				prio.selectByValue("2");
				//game area
				driver.findElement(By.cssSelector("textarea#customfield_12300-textarea")).sendKeys("Volta");
				//sub-group
				Select sg = new Select(driver.findElement(By.cssSelector("select#customfield_21404")));
				sg.selectByVisibleText("EARO.VC");
				//worktype
				Select worktype = new Select(driver.findElement(By.cssSelector("select#customfield_17001")));
				worktype.selectByVisibleText("GameHealthChecks");
				//create
				driver.findElement(By.cssSelector("input#create-issue-submit")).click();
				//drag and drop
				WebElement source = driver.findElement(By.xpath("//li[@data-column-id='27208']//span[text()='Connectivity checks']"));
        		WebElement target = driver.findElement(By.xpath("//li[@data-column-id='27212']"));
        		a.dragAndDrop(source, target).build().perform();
        		//input worked hours and complete task
				driver.findElement(By.cssSelector("input#log-work-time-logged")).sendKeys("");
				driver.findElement(By.cssSelector("input[value='Done']")).click();
				
			}
			
				if(performanceComboBox.equals("Yes")) {
				driver.findElement(By.xpath("//a[text()='Create']")).click();
				driver.findElement(By.cssSelector("input#summary")).sendKeys("Performance");
				driver.findElement(By.cssSelector("button#assign-to-me-trigger")).click();
				//priority
				Select prio = new Select(driver.findElement(By.cssSelector("select#priority")));
				prio.selectByValue("1");
				//game area
				driver.findElement(By.cssSelector("textarea#customfield_12300-textarea")).sendKeys("Volta");
				//sub-group
				Select sg = new Select(driver.findElement(By.cssSelector("select#customfield_21404")));
				sg.selectByVisibleText("EARO.VC");
				//worktype
				Select worktype = new Select(driver.findElement(By.cssSelector("select#customfield_17001")));
				worktype.selectByVisibleText("MetricsPerformance");
				//create
				driver.findElement(By.cssSelector("input#create-issue-submit")).click();
				//drag and drop
				WebElement source = driver.findElement(By.xpath("//li[@data-column-id='27208']//span[text()='Performance']"));
        		WebElement target = driver.findElement(By.xpath("//li[@data-column-id='27212']"));
        		a.dragAndDrop(source, target).build().perform();
        		//input worked hours and complete task
				driver.findElement(By.cssSelector("input#log-work-time-logged")).sendKeys("");
				driver.findElement(By.cssSelector("input[value='Done']")).click();
				
			}
			
				if(stabilityComboBox.equals("Yes")) {
				driver.findElement(By.xpath("//a[text()='Create']")).click();
				driver.findElement(By.cssSelector("input#summary")).sendKeys("Stability");
				driver.findElement(By.cssSelector("button#assign-to-me-trigger")).click();
				//priority
				Select prio = new Select(driver.findElement(By.cssSelector("select#priority")));
				prio.selectByValue("1");
				//game area
				driver.findElement(By.cssSelector("textarea#customfield_12300-textarea")).sendKeys("Volta");
				//sub-group
				Select sg = new Select(driver.findElement(By.cssSelector("select#customfield_21404")));
				sg.selectByVisibleText("EARO.VC");
				//worktype
				Select worktype = new Select(driver.findElement(By.cssSelector("select#customfield_17001")));
				worktype.selectByVisibleText("StabilityTesting");
				//create
				driver.findElement(By.cssSelector("input#create-issue-submit")).click();
				//drag and drop
				WebElement source = driver.findElement(By.xpath("//li[@data-column-id='27208']//span[text()='Stability']"));
        		WebElement target = driver.findElement(By.xpath("//li[@data-column-id='27212']"));
        		a.dragAndDrop(source, target).build().perform();
        		//input worked hours and complete task
				driver.findElement(By.cssSelector("input#log-work-time-logged")).sendKeys("");
				driver.findElement(By.cssSelector("input[value='Done']")).click();
				
			}
			
				if(adHocComboBox.equals("Yes")) {
				driver.findElement(By.xpath("//a[text()='Create']")).click();
				driver.findElement(By.cssSelector("input#summary")).sendKeys("Ad Hoc Requests/Testing");
				driver.findElement(By.cssSelector("button#assign-to-me-trigger")).click();
				//priority
				Select prio = new Select(driver.findElement(By.cssSelector("select#priority")));
				prio.selectByValue("2");
				//game area
				driver.findElement(By.cssSelector("textarea#customfield_12300-textarea")).sendKeys("Volta");
				//sub-group
				Select sg = new Select(driver.findElement(By.cssSelector("select#customfield_21404")));
				sg.selectByVisibleText("EARO.VC");
				//worktype
				Select worktype = new Select(driver.findElement(By.cssSelector("select#customfield_17001")));
				worktype.selectByVisibleText("AdHocTesting");
				//create
				driver.findElement(By.cssSelector("input#create-issue-submit")).click();
				//drag and drop
				WebElement source = driver.findElement(By.xpath("//li[@data-column-id='27208']//span[text()='Ad Hoc Requests/Testing']"));
        		WebElement target = driver.findElement(By.xpath("//li[@data-column-id='27212']"));
        		a.dragAndDrop(source, target).build().perform();
        		//input worked hours and complete task
				driver.findElement(By.cssSelector("input#log-work-time-logged")).sendKeys("");
				driver.findElement(By.cssSelector("input[value='Done']")).click();
				
			}
			
				if(mdRatingComboBox.equals("Yes")) {
				driver.findElement(By.xpath("//a[text()='Create']")).click();
				driver.findElement(By.cssSelector("input#summary")).sendKeys("MD Rating");
				driver.findElement(By.cssSelector("button#assign-to-me-trigger")).click();
				//priority
				Select prio = new Select(driver.findElement(By.cssSelector("select#priority")));
				prio.selectByValue("1");
				//game area
				driver.findElement(By.cssSelector("textarea#customfield_12300-textarea")).sendKeys("Volta");
				//sub-group
				Select sg = new Select(driver.findElement(By.cssSelector("select#customfield_21404")));
				sg.selectByVisibleText("EARO.VC");
				//worktype
				Select worktype = new Select(driver.findElement(By.cssSelector("select#customfield_17001")));
				worktype.selectByVisibleText("MD/FeatureDelivery");
				//create
				driver.findElement(By.cssSelector("input#create-issue-submit")).click();
				//drag and drop
				WebElement source = driver.findElement(By.xpath("//li[@data-column-id='27208']//span[text()='MD Rating']"));
        		WebElement target = driver.findElement(By.xpath("//li[@data-column-id='27212']"));
        		a.dragAndDrop(source, target).build().perform();
        		//input worked hours and complete task
				driver.findElement(By.cssSelector("input#log-work-time-logged")).sendKeys("");
				driver.findElement(By.cssSelector("input[value='Done']")).click();
				
			}
			
				if(dftPlaySessionsComboBox.equals("Yes")) {
				driver.findElement(By.xpath("//a[text()='Create']")).click();
				driver.findElement(By.cssSelector("input#summary")).sendKeys("DFT Play Sessions");
				driver.findElement(By.cssSelector("button#assign-to-me-trigger")).click();
				//priority
				Select prio = new Select(driver.findElement(By.cssSelector("select#priority")));
				prio.selectByValue("3");
				//game area
				driver.findElement(By.cssSelector("textarea#customfield_12300-textarea")).sendKeys("Volta");
				//sub-group
				Select sg = new Select(driver.findElement(By.cssSelector("select#customfield_21404")));
				sg.selectByVisibleText("EARO.VC");
				//worktype
				Select worktype = new Select(driver.findElement(By.cssSelector("select#customfield_17001")));
				worktype.selectByVisibleText("PlaySession");
				//create
				driver.findElement(By.cssSelector("input#create-issue-submit")).click();
				//drag and drop
				WebElement source = driver.findElement(By.xpath("//li[@data-column-id='27208']//span[text()='DFT Play Sessions']"));
        		WebElement target = driver.findElement(By.xpath("//li[@data-column-id='27212']"));
        		a.dragAndDrop(source, target).build().perform();
        		//input worked hours and complete task
				driver.findElement(By.cssSelector("input#log-work-time-logged")).sendKeys("");
				driver.findElement(By.cssSelector("input[value='Done']")).click();
				
			}
			
				if(dftComboBox.equals("Yes")) {
				driver.findElement(By.xpath("//a[text()='Create']")).click();
				driver.findElement(By.cssSelector("input#summary")).sendKeys("DFT (Directed Free Testing)");
				driver.findElement(By.cssSelector("button#assign-to-me-trigger")).click();
				//priority
				Select prio = new Select(driver.findElement(By.cssSelector("select#priority")));
				prio.selectByValue("2");
				//game area
				driver.findElement(By.cssSelector("textarea#customfield_12300-textarea")).sendKeys("Volta");
				//sub-group
				Select sg = new Select(driver.findElement(By.cssSelector("select#customfield_21404")));
				sg.selectByVisibleText("EARO.VC");
				//worktype
				Select worktype = new Select(driver.findElement(By.cssSelector("select#customfield_17001")));
				worktype.selectByVisibleText("DirectedFreeTesting");
				//create
				driver.findElement(By.cssSelector("input#create-issue-submit")).click();
				//drag and drop
				WebElement source = driver.findElement(By.xpath("//li[@data-column-id='27208']//span[text()='DFT (Directed Free Testing)']"));
        		WebElement target = driver.findElement(By.xpath("//li[@data-column-id='27212']"));
        		a.dragAndDrop(source, target).build().perform();
        		//input worked hours and complete task
				driver.findElement(By.cssSelector("input#log-work-time-logged")).sendKeys("");
				driver.findElement(By.cssSelector("input[value='Done']")).click();
				
			}
			
				if(frostbiteIntegrationComboBox.equals("Yes")) {
				driver.findElement(By.xpath("//a[text()='Create']")).click();
				driver.findElement(By.cssSelector("input#summary")).sendKeys("Frostbite Integrations");
				driver.findElement(By.cssSelector("button#assign-to-me-trigger")).click();
				//priority
				Select prio = new Select(driver.findElement(By.cssSelector("select#priority")));
				prio.selectByValue("1");
				//game area
				driver.findElement(By.cssSelector("textarea#customfield_12300-textarea")).sendKeys("Volta");
				//sub-group
				Select sg = new Select(driver.findElement(By.cssSelector("select#customfield_21404")));
				sg.selectByVisibleText("EARO.VC");
				//worktype
				Select worktype = new Select(driver.findElement(By.cssSelector("select#customfield_17001")));
				worktype.selectByVisibleText("SupportFrostbiteIntegration");
				//create
				driver.findElement(By.cssSelector("input#create-issue-submit")).click();
				//drag and drop
				WebElement source = driver.findElement(By.xpath("//li[@data-column-id='27208']//span[text()='Frostbite Integrations']"));
        		WebElement target = driver.findElement(By.xpath("//li[@data-column-id='27212']"));
        		a.dragAndDrop(source, target).build().perform();
        		//input worked hours and complete task
				driver.findElement(By.cssSelector("input#log-work-time-logged")).sendKeys("");
				driver.findElement(By.cssSelector("input[value='Done']")).click();
				
			}
			
				if(specialBuildsComboBox.equals("Yes")) {
				driver.findElement(By.xpath("//a[text()='Create']")).click();
				driver.findElement(By.cssSelector("input#summary")).sendKeys("Special Builds");
				driver.findElement(By.cssSelector("button#assign-to-me-trigger")).click();
				//priority
				Select prio = new Select(driver.findElement(By.cssSelector("select#priority")));
				prio.selectByValue("2");
				//game area
				driver.findElement(By.cssSelector("textarea#customfield_12300-textarea")).sendKeys("Volta");
				//sub-group
				Select sg = new Select(driver.findElement(By.cssSelector("select#customfield_21404")));
				sg.selectByVisibleText("EARO.VC");
				//worktype
				Select worktype = new Select(driver.findElement(By.cssSelector("select#customfield_17001")));
				worktype.selectByVisibleText("SupportSpecialBuilds");
				//create
				driver.findElement(By.cssSelector("input#create-issue-submit")).click();
				//drag and drop
				WebElement source = driver.findElement(By.xpath("//li[@data-column-id='27208']//span[text()='Special Builds']"));
        		WebElement target = driver.findElement(By.xpath("//li[@data-column-id='27212']"));
        		a.dragAndDrop(source, target).build().perform();
        		//input worked hours and complete task
				driver.findElement(By.cssSelector("input#log-work-time-logged")).sendKeys("");
				driver.findElement(By.cssSelector("input[value='Done']")).click();
				
			}
			
				if(supportAutomationComboBox.equals("Yes")) {
				driver.findElement(By.xpath("//a[text()='Create']")).click();
				driver.findElement(By.cssSelector("input#summary")).sendKeys("Support Automation");
				driver.findElement(By.cssSelector("button#assign-to-me-trigger")).click();
				//priority
				Select prio = new Select(driver.findElement(By.cssSelector("select#priority")));
				prio.selectByValue("3");
				//game area
				driver.findElement(By.cssSelector("textarea#customfield_12300-textarea")).sendKeys("Volta");
				//sub-group
				Select sg = new Select(driver.findElement(By.cssSelector("select#customfield_21404")));
				sg.selectByVisibleText("EARO.VC");
				//worktype
				Select worktype = new Select(driver.findElement(By.cssSelector("select#customfield_17001")));
				worktype.selectByVisibleText("SupportAutomation");
				//create
				driver.findElement(By.cssSelector("input#create-issue-submit")).click();
				//drag and drop
				WebElement source = driver.findElement(By.xpath("//li[@data-column-id='27208']//span[text()='Support Automation']"));
        		WebElement target = driver.findElement(By.xpath("//li[@data-column-id='27212']"));
        		a.dragAndDrop(source, target).build().perform();
        		//input worked hours and complete task
				driver.findElement(By.cssSelector("input#log-work-time-logged")).sendKeys("");
				driver.findElement(By.cssSelector("input[value='Done']")).click();
				
			}
			
				if(supportSubmissionComboBox.equals("Yes")) {
				driver.findElement(By.xpath("//a[text()='Create']")).click();
				driver.findElement(By.cssSelector("input#summary")).sendKeys("Support Submission");
				driver.findElement(By.cssSelector("button#assign-to-me-trigger")).click();
				//priority
				Select prio = new Select(driver.findElement(By.cssSelector("select#priority")));
				prio.selectByValue("2");
				//game area
				driver.findElement(By.cssSelector("textarea#customfield_12300-textarea")).sendKeys("Volta");
				//sub-group
				Select sg = new Select(driver.findElement(By.cssSelector("select#customfield_21404")));
				sg.selectByVisibleText("EARO.VC");
				//worktype
				Select worktype = new Select(driver.findElement(By.cssSelector("select#customfield_17001")));
				worktype.selectByVisibleText("SupportSubmissions");
				//create
				driver.findElement(By.cssSelector("input#create-issue-submit")).click();
				//drag and drop
				WebElement source = driver.findElement(By.xpath("//li[@data-column-id='27208']//span[text()='Support Submission']"));
        		WebElement target = driver.findElement(By.xpath("//li[@data-column-id='27212']"));
        		a.dragAndDrop(source, target).build().perform();
        		//input worked hours and complete task
				driver.findElement(By.cssSelector("input#log-work-time-logged")).sendKeys("");
				driver.findElement(By.cssSelector("input[value='Done']")).click();
				
			}
			
				if(milestoneChecklistsComboBox.equals("Yes")) {
				driver.findElement(By.xpath("//a[text()='Create']")).click();
				driver.findElement(By.cssSelector("input#summary")).sendKeys("Milestone Checklists");
				driver.findElement(By.cssSelector("button#assign-to-me-trigger")).click();
				//priority
				Select prio = new Select(driver.findElement(By.cssSelector("select#priority")));
				prio.selectByValue("1");
				//game area
				driver.findElement(By.cssSelector("textarea#customfield_12300-textarea")).sendKeys("Volta");
				//sub-group
				Select sg = new Select(driver.findElement(By.cssSelector("select#customfield_21404")));
				sg.selectByVisibleText("EARO.VC");
				//worktype
				Select worktype = new Select(driver.findElement(By.cssSelector("select#customfield_17001")));
				worktype.selectByVisibleText("MilestoneChecklists");
				//create
				driver.findElement(By.cssSelector("input#create-issue-submit")).click();
				//drag and drop
				WebElement source = driver.findElement(By.xpath("//li[@data-column-id='27208']//span[text()='Milestone Checklists']"));
        		WebElement target = driver.findElement(By.xpath("//li[@data-column-id='27212']"));
        		a.dragAndDrop(source, target).build().perform();
        		//input worked hours and complete task
				driver.findElement(By.cssSelector("input#log-work-time-logged")).sendKeys("");
				driver.findElement(By.cssSelector("input[value='Done']")).click();
				
			}
			*/
				

			}


		});
		createBtn.setBounds(405, 693, 86, 34);
		KanbanTimetrack.getContentPane().add(createBtn);
		
		JLabel lblNewLabel_5 = new JLabel("Cate ore ?");
		lblNewLabel_5.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_5.setBounds(278, 65, 70, 14);
		KanbanTimetrack.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_4_1_1_1_1_1_1_2 = new JLabel("Stability");
		lblNewLabel_4_1_1_1_1_1_1_2.setOpaque(true);
		lblNewLabel_4_1_1_1_1_1_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4_1_1_1_1_1_1_2.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_4_1_1_1_1_1_1_2.setBackground(Color.RED);
		lblNewLabel_4_1_1_1_1_1_1_2.setBounds(25, 370, 252, 22);
		KanbanTimetrack.getContentPane().add(lblNewLabel_4_1_1_1_1_1_1_2);
		

		

		if(regresiiComboBox.equals("Yes")) {
			int oreRegresii = Integer.parseInt(regresiiTextField.getText());			
		}
		

		
	}
}
