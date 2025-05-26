import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Map;



public class login extends JFrame implements MouseListener, ActionListener
{
	ImageIcon img;
	JLabel userLabel, passLabel, imgLabel,header;
	JTextField userTX, customerNameTX, customerIdTX;
	JPasswordField passPF;
	JButton loginBtn, exitBtn, clearcartBtn, cartBtn, cartBtn1, cartBtn2, cartBtn3, cartBtn4;
	JComboBox combo,combo1,combo2,combo3;
	JPanel panel;
	Color clr;
	Font front;
	private FileWriter writer;
	private java.util.Map<String, Integer> cartItems = new java.util.HashMap<>();
	private double totalPrice = 0.0;
	private String customerName = null;
	private String customerId = null;
	private JTextArea cartDisplay;
	
	
	
	 private void setupFileWriter()
	 {
        try {
            File file = new File("calculator_history.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            writer = new FileWriter(file, true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
	
	
	public login()
	{
		
		super("FnF Footwear");
		this.setSize(800, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		clr=new Color(135, 206, 235);
		front=new Font("Cambria",Font.PLAIN,16);
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(clr);
		
		
		
		img = new ImageIcon("banner.jpg");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(200,10,850,220);
		panel.add(imgLabel);
		
		
		
		
		header = new JLabel("LOGIN / REGISTER");
		header.setBounds(1150,250,800,100);
		panel.add(header);
		
		
		
		userLabel = new JLabel("User Name : ");
		userLabel.setBounds(1100,350,100,50);
		panel.add(userLabel);
		
		passLabel = new JLabel("Password : ");
		passLabel.setBounds(1100,400,100,50);
		panel.add(passLabel);
		
		
		
		
		userTX = new JTextField();
		userTX.setBounds(1180,360,140,30);
		panel.add(userTX);
		
		passPF = new JPasswordField();
		passPF.setBounds(1180,410,140,30);
		panel.add(passPF);
		
		
		
		loginBtn = new JButton("Login");
		loginBtn.setBounds(1100,470,100,30);
		loginBtn.setBackground(Color.GREEN);
		loginBtn.addMouseListener(this);
		loginBtn.addActionListener(this); 
		panel.add(loginBtn);
		
		exitBtn = new JButton("Exit");
		exitBtn.setBounds(1220,470,100,30);
		exitBtn.setBackground(Color.RED);
		exitBtn.addMouseListener(this); 
		exitBtn.addActionListener(this);
		panel.add(exitBtn);
		
		
	
		
		String items[] = {"NIKE","Formal","sandle","Casual","sports"};  
        combo = new JComboBox(items);
        combo.setBounds(50,300,100,30);
        panel.add(combo);
		
		String items1[] = {"ADIDAS","Formal","sandle","Casual","sports"};  
        combo1 = new JComboBox(items1);
        combo1.setBounds(200,300,100,30);
        panel.add(combo1);
		
		String items2[] = {"PUMA","Formal","sandle","Casual","sports"};  
        combo2 = new JComboBox(items2);
        combo2.setBounds(350,300,100,30);
        panel.add(combo2);
		
		String items3[] = {"AIR JORDAN","Formal","sandle","Casual","sports"};  
        combo3 = new JComboBox(items3);
        combo3.setBounds(500,300,100,30);
        panel.add(combo3);
		
		
		
		cartBtn= new JButton("View Cart");
		cartBtn.setBounds(700,300,100,30);
		cartBtn.setBackground(Color.ORANGE);
		cartBtn.addMouseListener(this);
		cartBtn.addActionListener(this); 
		panel.add(cartBtn);
		
		clearcartBtn= new JButton("Clear Cart");
		clearcartBtn.setBounds(850,300,100,30);
		clearcartBtn.setBackground(Color.WHITE);
		clearcartBtn.addMouseListener(this);
		clearcartBtn.addActionListener(this); 
		panel.add(clearcartBtn);
		
		cartDisplay = new JTextArea();
		cartDisplay.setEditable(false);
		cartDisplay.setFont(new Font("Monospaced",Font.PLAIN, 14));
		cartDisplay.setBounds(1050,550,300,250);
		cartDisplay.setBorder(BorderFactory.createTitledBorder("Cart Summary"));
		panel.add(cartDisplay);
		
		
		
		img = new ImageIcon("nike1.jpg");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(50,400,200,150);
		panel.add(imgLabel);
		
		header = new JLabel("NIKE Sports - $150");
		header.setBounds(50,520,200,100);
		header.setForeground(Color.BLUE);
		header.setFont(front);
		panel.add(header);
		
		cartBtn1= new JButton("Add To Cart");
		cartBtn1.setBounds(50,600,200,30);
		cartBtn1.setBackground(Color.YELLOW);
		cartBtn1.addMouseListener(this);
		cartBtn1.addActionListener(this); 
		panel.add(cartBtn1);
		
		
		
		img = new ImageIcon("air1.jpg");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(300,400,200,150);
		panel.add(imgLabel);
		
		header = new JLabel("AIR JORDAN Sports - $250");
		header.setBounds(300,520,200,100);
		header.setForeground(Color.BLUE);
		header.setFont(front);
		panel.add(header);
		
		cartBtn2= new JButton("Add To Cart");
		cartBtn2.setBounds(300,600,200,30);
		cartBtn2.setBackground(Color.YELLOW);
		cartBtn2.addMouseListener(this);
		cartBtn2.addActionListener(this); 
		panel.add(cartBtn2);
		
		
		
		img = new ImageIcon("air2.jpg");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(550,400,200,150);
		panel.add(imgLabel);
		
		header = new JLabel("AIR JORDAN Casual - $350");
		header.setBounds(550,520,200,100);
		header.setForeground(Color.BLUE);
		header.setFont(front);
		panel.add(header);
		
		cartBtn3= new JButton("Add To Cart");
		cartBtn3.setBounds(550,600,200,30);
		cartBtn3.setBackground(Color.YELLOW);
		cartBtn3.addMouseListener(this);
		cartBtn3.addActionListener(this); 
		panel.add(cartBtn3);
		
		
		
		img = new ImageIcon("nike2.jpg");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(800,400,200,150);
		panel.add(imgLabel);
		
		header = new JLabel("NIKE Casual - $250");
		header.setBounds(800,520,200,100);
		header.setForeground(Color.BLUE);
		header.setFont(front);
		panel.add(header);
		
		cartBtn4= new JButton("Add To Cart");
		cartBtn4.setBounds(800,600,200,30);
		cartBtn4.setBackground(Color.YELLOW);
		cartBtn4.addMouseListener(this);
		cartBtn4.addActionListener(this); 
		panel.add(cartBtn4);
	
		
		setupFileWriter();
		this.add(panel);
	}
	
	
	private boolean promptCustomerDetailsIfNeeded()
	{
		if(customerName == null || customerId == null)
		{
		   customerName = JOptionPane.showInputDialog(this,"Enter Customer Name:");
		   if(customerName == null || customerName.trim().isEmpty())
		   {
			   JOptionPane.showMessageDialog(this, "Customer Name is required.");
			   customerName = null;
			   return false;
		   }

		   customerId = JOptionPane.showInputDialog(this,"Enter Customer ID:");
		   if(customerId == null || customerId.trim().isEmpty())
		   {
			   JOptionPane.showMessageDialog(this, "Customer ID is required.");
			   customerId = null;
			   return false;
		   }
	    }
	    return true;
    }
	
	
	
	
	private void addToCart(String productName, double price)
	{
		if(!promptCustomerDetailsIfNeeded()) return;
		cartItems.put(productName, cartItems.getOrDefault(productName, 0) + 1);
		totalPrice += price;
		
		JOptionPane.showMessageDialog(this, productName + " added to cart.");
	}


	
	public void mouseClicked(MouseEvent me)
	{
		Object source = me.getSource();
		
		if(source == cartBtn1)
		{
			addToCart("NIKE Sports - $150", 150.0);
		}
		else if(source == cartBtn2)
		{
			addToCart("AIR JORDAN Sports - $250", 250.0);
		}
		else if(source == cartBtn3)
		{
			addToCart("AIR JORDAN Casual - $350", 350.0);
		}
		else if(source == cartBtn4)
		{
			addToCart("NIKE Casual - $250", 250.0);
		}
		else if (source == cartBtn)
		{
			if(cartItems.isEmpty())
			{
				cartDisplay.setText("Your cart is empty.");
			}
			else
			{
				if(customerName == null || customerId == null)
				{
					cartDisplay.setText("Customer info missing. Add an item first.");
					return;
				}

                StringBuilder message = new StringBuilder();
                message.append("Customer Name: ").append(customerName).append("\n");
                message.append("Customer ID: ").append(customerId).append("\n\n");
                message.append("Items in Cart:\n");

                for (Map.Entry<String, Integer> entry : cartItems.entrySet())
				{
					message.append(" ").append(entry.getKey())
                    .append(" (x").append(entry.getValue()).append(")\n");
				}
				message.append("\nTotal Price: $").append(totalPrice);
                cartDisplay.setText(message.toString());

                try
				{
					writer.write("Customer Name: " + customerName + "\n");
                    writer.write("Customer ID: " + customerId + "\n");
                    writer.write("New Cart Session:\n");

                    for(Map.Entry<String, Integer> entry : cartItems.entrySet())
					{
						writer.write(entry.getKey() + " (x" + entry.getValue() + ")\n");
                    }
                    writer.write("Total: $" + totalPrice + "\n");
                    writer.write("----------\n");
                    writer.flush();
				}
				catch(IOException e)
				{
					e.printStackTrace();
				}
			}
		}
		else if(source == clearcartBtn)
		{
			cartItems.clear();
			totalPrice = 0.0;
			customerName = null;
			customerId = null;
			cartDisplay.setText("");
			JOptionPane.showMessageDialog(this,"Cart has been cleared.");
			
		}
    }
	
	
    public void mousePressed(MouseEvent me) {}
    public void mouseReleased(MouseEvent me) {}
	
	
	
	public void mouseEntered(MouseEvent me)
    {
        if(me.getSource()==loginBtn)
        {
            loginBtn.setBackground(Color.BLUE);
            loginBtn.setForeground(Color.WHITE);
        }
        else if(me.getSource()==exitBtn)
        {
            exitBtn.setBackground(Color.BLUE);
            exitBtn.setForeground(Color.WHITE);
        }
    }
	
	
	
	public void mouseExited(MouseEvent me)
    {
        if(me.getSource()==loginBtn)
        {
            loginBtn.setBackground(Color.GREEN);
            loginBtn.setForeground(Color.BLACK);
        }
        else if(me.getSource()==exitBtn)
        {
            exitBtn.setBackground(Color.RED);
            exitBtn.setForeground(Color.BLACK);
        }
    }
	
	
	
	public void actionPerformed(ActionEvent ae)
    {
        String command = ae.getActionCommand();

        if(loginBtn.getText().equals(command))
        {
            JOptionPane.showMessageDialog(this, "Login Successful");
        }
        else if(exitBtn.getText().equals(command))
        {
            System.exit(0);
        }
		
    }
}