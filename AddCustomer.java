package tCurlySalesManager;

import java.util.*;
import java.util.List;
import java.io.File;
import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;
import java.awt.event.ActionEvent;
import java.awt.event.*;

public class AddCustomer extends JFrame implements ActionListener{
    private Scanner scan = new Scanner(System.in);
    static File file = new File("Customers.txt");
    String input;

    private Container container;
    private JLabel title;
        
    private JLabel fNameLabel;
    private JTextField fNameField;
    private JLabel lNameLabel;
    private JTextField lNameField;
    private JLabel emailLabel;
    private JTextField emailField;
    private JLabel pNumLabel;
    private JTextField pNumField;
    private JLabel addressLabel;
    private JTextField addressField;
    private JLabel ageLabel;
    private JTextField ageField;
    private JLabel idLabel;
    private JTextField idField;
    private JTextField searchbar;
    

    private JButton submitBtn;
    private JButton resetBtn;
    private JButton searchBtn;
    private JButton backBtn;
    private Icon backIcon;
    private JTextArea notify;
    
    //private JFrame frame;

    Color darkblue = (new  Color(86, 96, 240));
    Color aqua = (new  Color(140, 255, 251));
    Color white = (new  Color(255, 255, 255));
    Color lightblue = (new  Color(0,168,243));
    Color black = (new  Color(0,0,0));
    //private String n;

    public AddCustomer(){
        

        setTitle("TCurly Sales Manager");
        setBounds(300, 90, 900, 700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        container = getContentPane();
        container.setBackground(darkblue);
        container.setLayout(null);
        
          title = new JLabel("New Customer");
          title.setFont(new Font("Arial", Font.BOLD, 35));
          title.setSize(300, 30);
          title.setLocation(300, 30);
          title.setForeground(black);
          container.add(title);

          fNameLabel = new JLabel("First Name:");
          fNameLabel.setFont(new Font("Arial", Font.BOLD, 20));
          fNameLabel.setSize(150, 20);
          fNameLabel.setLocation(100, 100);
          fNameLabel.setForeground(lightblue);
          container.add(fNameLabel);
 
          fNameField = new JTextField();
          fNameField.setFont(new Font("Arial", Font.PLAIN, 15));
          fNameField.setBackground(Color.white);
          fNameField.setSize(190, 20);
          fNameField.setLocation(310, 100);
          container.add(fNameField);
          
          lNameLabel = new JLabel("Last Name:");
          lNameLabel.setFont(new Font("Arial", Font.BOLD, 20));
          lNameLabel.setSize(150, 20);
          lNameLabel.setLocation(100, 150);
          lNameLabel.setForeground(lightblue);
          container.add(lNameLabel);
 
          lNameField = new JTextField();
          lNameField.setFont(new Font("Arial", Font.PLAIN, 15));
          lNameField.setBackground(Color.white);
          lNameField.setSize(190, 20);
          lNameField.setLocation(310, 150);
          container.add(lNameField);

          emailLabel = new JLabel("Email:");
          emailLabel.setFont(new Font("Arial", Font.BOLD, 20));
          emailLabel.setSize(100, 20);
          emailLabel.setLocation(100, 200);
          emailLabel.setForeground(lightblue);
          container.add(emailLabel);
 
          emailField = new JTextField();
          emailField.setFont(new Font("Arial", Font.PLAIN, 15));
          emailField.setBackground(Color.white);
          emailField.setSize(190, 20);
          emailField.setLocation(310, 200);
          container.add(emailField);

          pNumLabel = new JLabel("Phone:");
          pNumLabel.setFont(new Font("Arial", Font.BOLD, 20));
          pNumLabel.setSize(100, 20);
          pNumLabel.setLocation(100, 250);
          pNumLabel.setForeground(lightblue);
          container.add(pNumLabel);
 
          pNumField = new JTextField();
          pNumField.setFont(new Font("Arial", Font.PLAIN, 15));
          pNumField.setBackground(Color.white);
          pNumField.setSize(190, 20);
          pNumField.setLocation(310, 250);
          container.add(pNumField);
          
          addressLabel = new JLabel("Address:");
          addressLabel.setFont(new Font("Arial", Font.BOLD, 20));
          addressLabel.setSize(100, 20);
          addressLabel.setLocation(100, 300);
          addressLabel.setForeground(lightblue);
          container.add(addressLabel);
 
          addressField = new JTextField();
          addressField.setFont(new Font("Arial", Font.PLAIN, 15));
          addressField.setBackground(Color.white);
          addressField.setSize(190, 20);
          addressField.setLocation(310, 300);
          container.add(addressField);

          ageLabel = new JLabel("Age:");
          ageLabel.setFont(new Font("Arial", Font.BOLD, 20));
          ageLabel.setSize(100, 25);
          ageLabel.setLocation(100, 350);
          ageLabel.setForeground(lightblue);
          container.add(ageLabel);
 
          ageField = new JTextField(3);
          ageField.setFont(new Font("Arial", Font.PLAIN, 15));
          ageField.setBackground(Color.white);
          ageField.setSize(190, 20);
          ageField.setLocation(310, 350);
          container.add(ageField);

          idLabel = new JLabel("Customer ID:");
          idLabel.setFont(new Font("Arial", Font.BOLD, 20));
          idLabel.setSize(100, 25);
          idLabel.setLocation(100, 400);
          idLabel.setForeground(lightblue);
          container.add(idLabel);
 
          idField = new JTextField();
          idField.setFont(new Font("Arial", Font.PLAIN, 15));
          idField.setBackground(Color.white);
          idField.setSize(190, 20);
          idField.setLocation(310, 400);
          container.add(idField);

          submitBtn = new JButton("Submit");
          submitBtn.setFont(new Font("Arial", Font.BOLD, 18));
          submitBtn.setForeground(black);
          submitBtn.setBackground(aqua);
          submitBtn.setSize(190, 25);
          submitBtn.setLocation(310, 450);
          submitBtn.addActionListener(this);
          container.add(submitBtn);
  
          resetBtn = new JButton("Reset");
          resetBtn.setFont(new Font("Arial", Font.BOLD, 18));
          resetBtn.setForeground(black);
          resetBtn.setBackground(aqua);
          resetBtn.setSize(190, 50);
          resetBtn.setLocation(100, 520);
          resetBtn.addActionListener(this);
          container.add(resetBtn);
          
          notify = new JTextArea();
          notify.setFont(new Font("Arial", Font.PLAIN, 20));
          notify.setSize(300, 320);
          notify.setForeground(Color.black);
          notify.setBackground(Color.white);
          notify.setLocation(570, 100);
          notify.setLineWrap(true);
          notify.setEditable(false);
          notify.setBorder(BorderFactory.createLineBorder(darkblue));
          container.add(notify);

          searchBtn = new JButton("Search");
          searchBtn.setFont(new Font("Arial", Font.BOLD, 18));
          searchBtn.setBackground(aqua);
          searchBtn.setSize(190, 50);
          searchBtn.setLocation(600, 520);
          searchBtn.addActionListener(this);
          container.add(searchBtn);
          
          
          searchbar = new JTextField();
          searchbar.setFont(new Font("Arial", Font.PLAIN, 15));
          searchbar.setBackground(Color.white);
          searchbar.setSize(190, 25);
          searchbar.setLocation(600, 485);
          container.add(searchbar);
          
          
          backIcon = new ImageIcon("icons/exit.png");
          backBtn= new JButton   ("Return", backIcon);
          backBtn.setFont(new Font("Arial", Font.BOLD, 18));
          backBtn.addActionListener(new CloseButtonListener());
          backBtn.setSize(190, 50);
          backBtn.setBackground(aqua);
          backBtn.setLocation(350, 520);
          container.add(backBtn);

        setVisible(true);
    }
    public void actionPerformed(ActionEvent event){
        	  
            File file = new File("Customers.txt");

            if (event.getSource() == submitBtn){

                String fName = fNameField.getText();
                String lName = lNameField.getText();
                String email = emailField.getText();
                String pNum = pNumField.getText();
                String address = addressField.getText();
                String age = ageField.getText();
                String id = idField.getText();
                notify.setText("");
                System.out.println(email);

                if(pNum.length() == 7){
                    pNum = "876" + pNum;
                }

                if (validateName(fName) == false){
                    notify.setText("The submitted first name is not valid. Only letters and certain symbols are permitted.");
                }

                else if (validateName(lName) == false){
                    notify.setText("The submitted last name is not valid. Only letters and certain symbols are permitted.");
                }

                else if (validateEmail(email) == false){
                    notify.setText("Please enter a valid email address");
                    System.out.println(email);
                    System.out.println(validateEmail(email));
                }
                else if (validatePhone(pNum) == false){
                    notify.setText("Phone number is not valid.");
                }

                else if (validateAddress(address) == false){
                    notify.setText("Please enter a valid address");
                }

                else if (validateAge(age) == false){
                    notify.setText("Please enter a valid age - number between 1 and 130.");
                }
                
                else{
                    notify.setText("");
                    String blank = "";
                    fNameField.setText(blank);
                    lNameField.setText(blank);
                    emailField.setText(blank);
                    pNumField.setText(blank);
                    addressField.setText(blank);
                    ageField.setText(blank);
                    idField.setText(blank);

                    Customer c = new Customer(fName, lName, email, pNum, address, Integer.valueOf(age), id);
                    System.out.println(c);

                    if(SearchCustomer(c.getID()) == "No customer with this ID was found."
                            || SearchCustomer(c.getID()) == "An error has occured" )
                        {

                    try{
                        BufferedWriter writer = new BufferedWriter(new FileWriter(file,true));
                        writer.write(c.getfName()+"!"+c.getlName()+"!"+c.getEmail()+"!"+c.getPhone()+"!"+c.getAddress()+"!"+c.getAge()+"!"+c.getID()+"\n");
                        notify.setText("Customer has been added" + "\n" + c.toString());
                        writer.close();
                    }catch(Exception e){return;}

                        }

                        else{

                            notify.setText("ID is already in use" + "\n" +SearchCustomer(c.getID()));
                        }
                }
            }else if (event.getSource() == resetBtn){
                String blank ="";
                fNameField.setText(blank);
                lNameField.setText(blank);
                emailField.setText(blank);
                pNumField.setText(blank);
                addressField.setText(blank);
                ageField.setText(blank);
                idField.setText(blank);
                notify.setText(blank);
                searchbar.setText(blank);
                fNameField.setBackground(Color.white);
                lNameField.setBackground(Color.white);
                emailField.setBackground(Color.white);
                pNumField.setBackground(Color.white);
                addressField.setBackground(Color.white);
                ageField.setBackground(Color.white);
                idField.setBackground(Color.white);
            }else if(event.getSource() == searchBtn) {

                String id = searchbar.getText();

                if (id.isEmpty()){
                    notify.setText("Please enter the ID you would like to search.");
                }

                else {

                    String blank ="";
                    fNameField.setText(blank);
                    lNameField.setText(blank);
                    emailField.setText(blank);
                    pNumField.setText(blank);
                    addressField.setText(blank);
                    ageField.setText(blank);
                    idField.setText(blank);

                    notify.setText(SearchCustomer(id));

                }
            }


        }




    public static String SearchCustomer(String input){
        try{
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            int i = 0;
            List<String> rdata = new ArrayList<String>();

            //Scanner scan = new Scanner(System.in);

            while((line = reader.readLine()) != null){

                rdata.add(line);

                String[] dataFound = rdata.get(i).split("!");
                
                if(input.equals(dataFound[6])){
                    return ("Customer ID("+dataFound[6]+") Found\n----------------------------\n["
                    +dataFound[0]+" "+dataFound[1]+
                    "]\nEmail:\n-"+dataFound[2]+
                    "\nTelephone:\n-"+dataFound[3]+
                    "\nAddress:\n-"+dataFound[4]+
                    "\nAge:\n-"+Integer.valueOf(dataFound[5]));
                }
                i = i + 1;
            }
            return ("No customer with this ID was found.");
        }catch(Exception e){
            System.out.println("exception: " + e);
            return "An error has occured";}
    }

    public boolean validateName(String name) {
        if (isEmpty(name)){
            return false;
        }

        else{  
        char[] chars = name.toCharArray();
        for (char c : chars) {
            if((!Character.isLetter(c) && !(c=='-') && !(c==' '))) {
            //if the name contains characters aside from letters, "-" or a space, it is invalid
                System.out.println("Invalid Name");
                return false;
            }
        }
        return true;
    }
    }

    public boolean validateEmail(String email) {

        if (isEmpty(email)){
            return false;
        }
        else{


        
        int atCount = 0;
        int dotCount = 0;
        char[] chars = email.toCharArray();

        if (!Character.isLetter(email.charAt(0)) && !Character.isDigit(email.charAt(0))){
        //if the email does not begin with a letter or number, it is invalid
            System.out.println("Invalid Email");
            return false;
        }else{
            for (char c : chars){
                if((!Character.isLetter(c) && !(Character.isDigit(c)) && !(c=='@') && !(c=='.'))) {
                //if the email contains characters that are not letters, numbers, '@' or '.', it is invalid
                    System.out.println("Invalid Email");
                    return false;
                }
                if(c == '@'){
                //counting the number of '@' in the email
                    atCount = atCount + 1;
                }
                if(c == '.'){
                //counting the number of '.' in the email
                    dotCount = dotCount + 1;
                }
            }
            if((atCount != 1) || (dotCount < 1)){
            //if the email does not include only 1 '@' and at least 1 '.', it is invalid
                System.out.println("Invalid Email");
                return false;
            }

            return true;
        }
    }
    }

    public boolean validateAddress(String address) {
        boolean hasLetter = false;
        boolean hasNum = false;

        char[] chars = address.toCharArray();
        for (char c : chars) {
            if(Character.isLetter(c)){
            //checks if the address has letters

                hasLetter = true;
            }
            if(Character.isDigit(c)){
            //checks if the address has numbers
                hasNum = true;
            }
        }
        if((hasLetter == true) && (hasNum == true)){
        //if the address does not have both a number and letters, it is invalid
            return true;
        }else{
            System.out.println("Invalid Address");
            return false;
        }
    }

    public boolean validateAge(String age){
         //returns true if the age is a valid human age between 0 and 130
        
        if (!isStringInt(age)) {
            return false;
        }

        else{
            int age1 = Integer.parseInt(age);
            return ((age1 >= 0) && (age1 <= 130));
        }
   
        
       
    }

    public boolean validatePhone(String pNum) {
        if (pNum.length() == 7){
            pNum = "876"+pNum;
        }
        if (pNum.length() != 10){
            //a phone number must be 10 digits including its area code to be valid
            System.out.println("Invalid Phone Number");
            return false;
        }else{
            if ((pNum.charAt(3) == '0') || (pNum.charAt(3) == '1')){
            //if the number after the area code begins with 0 or 1, it is invalid
                System.out.println("Invalid Phone Number");
                return false;
            }else{
                char[] num = pNum.toCharArray();
                for (char n : num) {
                    if(!(Character.isDigit(n))){
                    //if any character is not a digit, the number is invalid
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public boolean isEmpty(String value) {    
        return value.length() == 0;    
    }   

    public boolean isStringInt(String s){
            try{
        Integer.parseInt(s);
        return true;}
         catch (NumberFormatException ex)
                {
        return false;
        }
        }

    public boolean validateID(String id) {
        boolean hasLetter = false;
        boolean hasNum = false;

        char[] chars = id.toCharArray();
        for (char c : chars) {
        //if the id has neither a letter nor number, it is invalid
            if(Character.isLetter(c)){
                hasLetter = true;
            }
            if(Character.isDigit(c)){
                hasNum = true;
            }
            if(c == '!'){
                return false;
            }
        }
        if((hasLetter == true) || (hasNum == true)){
            return true;
        }else{
            System.out.println("Invalid ID");
            return false;
        }
    }

    public class CloseButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)//listener for Close button, initiates when button is clicked
        {
        	MainMenu.createAndShowGUI();
            container.setVisible(false);
            dispose();
        }

    }




}