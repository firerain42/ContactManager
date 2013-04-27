package cm.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class AddressForm extends JFrame{
	
	

	
	public AddressForm() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setMinimumSize(new Dimension(600, 500));
		setTitle("ContactManager");
		
		Container conPane = getContentPane();
		conPane.setLayout(new BorderLayout());
		
		createInputArea(conPane);
		
		createControlPanel(conPane);
		
	}

	private void createControlPanel(Container conPane) {
		JPanel pControlArea = new JPanel();
		pControlArea.setBorder(new EmptyBorder(3, 5, 5, 3));
		GridLayout ctrlAreaLayout = new GridLayout(1, 6);
		ctrlAreaLayout.setHgap(5);
		pControlArea.setLayout(ctrlAreaLayout);
		
		JButton bPrevious = new JButton("<< Prev");
		pControlArea.add(bPrevious);
		
		JButton bAdd = new JButton("Add");
		pControlArea.add(bAdd);
		
		JButton bDelete = new JButton("Delete");
		pControlArea.add(bDelete);
		
		JButton bLoad = new JButton("Load");
		pControlArea.add(bLoad);
		
		JButton bSave = new JButton("Save");
		pControlArea.add(bSave);
		
		JButton bNext = new JButton("Next >>");
		pControlArea.add(bNext);
		
		conPane.add(pControlArea, BorderLayout.SOUTH);
	}

	private void createInputArea(Container conPane) {
		JPanel pDataArea = new JPanel();
		
		pDataArea.setLayout(new GridBagLayout());
		
		GridBagConstraints gbcDefault = new GridBagConstraints();
		gbcDefault.fill = GridBagConstraints.BOTH;
		gbcDefault.weighty = 0.25;
		gbcDefault.insets  = new Insets(3, 5, 3, 5);
		
		GridBagConstraints gbc = (GridBagConstraints) gbcDefault.clone();
		gbc.gridx = 0;
		gbc.gridy = 0;
		pDataArea.add(new JLabel("Name:"), gbc);
		
		gbc = (GridBagConstraints) gbcDefault.clone();
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.weightx = 1;
		JTextArea taName = new JTextArea("Name");
		JScrollPane spName = new JScrollPane(taName);
		spName.setPreferredSize(new Dimension(20, 100));
		pDataArea.add(spName, gbc);
		
		gbc = (GridBagConstraints) gbcDefault.clone();
		gbc.gridx = 0;
		gbc.gridy = 1;
		pDataArea.add(new JLabel("Address:"), gbc);
		
		gbc = (GridBagConstraints) gbcDefault.clone();
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.weightx = 1;
		JTextArea taAddress = new JTextArea("Address");
		JScrollPane spAddress = new JScrollPane(taAddress);
		spAddress.setPreferredSize(new Dimension(20, 100));
		pDataArea.add(spAddress, gbc);
		
		gbc = (GridBagConstraints) gbcDefault.clone();
		gbc.gridx = 0;
		gbc.gridy = 2;
		pDataArea.add(new JLabel("Phone:"), gbc);
		
		gbc = (GridBagConstraints) gbcDefault.clone();
		gbc.gridx = 1;
		gbc.gridy = 2;
		gbc.weightx = 1;
		JTextArea taPhone = new JTextArea("Phone");
		JScrollPane spPhone = new JScrollPane(taPhone);
		spPhone.setPreferredSize(new Dimension(20, 100));
		pDataArea.add(spPhone, gbc);
		
		
		gbc = (GridBagConstraints) gbcDefault.clone();
		gbc.gridx = 0;
		gbc.gridy = 3;
		pDataArea.add(new JLabel("Email:"), gbc);
		
		gbc = (GridBagConstraints) gbcDefault.clone();
		gbc.gridx = 1;
		gbc.gridy = 3;
		gbc.weightx = 1;
		JTextArea taEmail = new JTextArea("Email");
		JScrollPane spEmail = new JScrollPane(taEmail);
		spEmail.setPreferredSize(new Dimension(20, 100));
		pDataArea.add(spEmail, gbc);
		
		conPane.add(pDataArea, BorderLayout.CENTER);
	}

}















