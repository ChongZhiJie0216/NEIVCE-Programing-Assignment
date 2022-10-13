package OOP.Assignment03.ZhiJIe;

import OOP.Assignment03.ZhiJIe.EventLisenner.*;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.print.PageFormat;
import java.awt.print.PrinterJob;


public class Student extends JFrame  {

    public static JTextArea ReceiptPanel;
    JLabel bgPhoto,title,name,id,age,email,hp,add,gnd,nat,yoe,yos,prog,picture;
    JTextField names,stuid,emails,phone,nationality;
    JTextArea address;
    JComboBox ages,enrollment,studies,programs;
    JRadioButton male,female;
    JButton Receipt,Reset,Print,Brown;
    String total;
    FileNameExtensionFilter filter;
    PrinterJob pj;
    PageFormat pf;

    JFrame frame = new JFrame();

    Student() {
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\01-Workspace\\Java\\NEIVCE-Programing-Assignment\\src\\OOP\\Assignment03\\ZhiJIe\\KEKW.png"));
        frame.setTitle("2022 Student Registration System");
        frame.setFont(new Font("Arial", Font.BOLD, 18));
        frame.setType(Type.NORMAL);
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1366, 768);
        frame.getContentPane().setLayout(null);

        JLabel();
        JTextField();
        JTextArea();
        JComboBox();
        JRadioButton();
        JButton();

        /*JLabel*/
        frame.getContentPane().add(title);
        frame.getContentPane().add(name);
        frame.getContentPane().add(id);
        frame.getContentPane().add(age);
        frame.getContentPane().add(email);
        frame.getContentPane().add(hp);
        frame.getContentPane().add(add);
        frame.getContentPane().add(gnd);
        frame.getContentPane().add(nat);
        frame.getContentPane().add(yoe);
        frame.getContentPane().add(yos);
        frame.getContentPane().add(prog);
        frame.getContentPane().add(picture);
        /*JTextField*/
        frame.getContentPane().add(names);
        frame.getContentPane().add(stuid);
        frame.getContentPane().add(emails);
        frame.getContentPane().add(phone);

        frame.getContentPane().add(nationality);
        /*JTextArea*/
        frame.getContentPane().add(address);
        frame.getContentPane().add(ReceiptPanel);
        /*JComboBox*/
        frame.getContentPane().add(ages);
        frame.getContentPane().add(enrollment);
        frame.getContentPane().add(studies);
        frame.getContentPane().add(programs);
        /*JRadioButton*/
        frame.getContentPane().add(male);
        frame.getContentPane().add(female);
        /*JButton*/
        frame.getContentPane().add(Receipt);
        frame.getContentPane().add(Reset);
        frame.getContentPane().add(Print);
        frame.getContentPane().add(Brown);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Student window = new Student();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    void JLabel(){

        title = new JLabel("Student Registration System");
        title.setFont(new Font("Arial", Font.BOLD, 40));
        title.setBounds(400, 11, 550, 50);

        name = new JLabel("Names:");
        name.setFont(new Font("Arial", Font.BOLD, 20));
        name.setBounds(50, 110, 90, 40);

        id = new JLabel("Student ID:");
        id.setFont(new Font("Arial", Font.BOLD, 20));
        id.setBounds(50, 160, 120, 40);

        age = new JLabel("Age");
        age.setFont(new Font("Arial", Font.BOLD, 20));
        age.setBounds(50, 210, 90, 40);

        email = new JLabel("Email ID:");
        email.setFont(new Font("Arial", Font.BOLD, 20));
        email.setBounds(50, 260, 120, 40);

        hp = new JLabel("Phone No:");
        hp.setFont(new Font("Arial", Font.BOLD, 20));
        hp.setBounds(50, 310, 120, 40);

        add=new JLabel("Address:");
        add.setFont(new Font("Arial", Font.BOLD, 20));
        add.setBounds(50, 360, 110, 40);

        gnd = new JLabel("Gender");
        gnd.setFont(new Font("Arial", Font.BOLD, 20));
        gnd.setBounds(50, 460, 120, 40);

        nat = new JLabel("Nationality:");
        nat.setFont(new Font("Arial", Font.BOLD, 20));
        nat.setBounds(50, 510, 120, 40);

        yoe = new JLabel("Year of Enrollment:");
        yoe.setFont(new Font("Arial", Font.BOLD, 20));
        yoe.setBounds(50, 560, 190, 40);

        yos = new JLabel("Year of Studies:");
        yos.setFont(new Font("Arial", Font.BOLD, 20));
        yos.setBounds(50, 610, 190, 40);

        prog = new JLabel("Programme:");
        prog.setFont(new Font("Arial", Font.BOLD, 20));
        prog.setBounds(50, 660, 190, 40);

        picture = new JLabel(new ImageIcon("src/OOP/Assignment03/ZhiJIe/KEKW.jpg"));
        picture.setBounds(430, 110, 200, 225);

    }
    void JTextField(){
        names = new JTextField();
        names.setFont(new Font("Arial", Font.PLAIN, 11));
        names.setBounds(160, 110, 200, 40);
        names.setColumns(10);

        stuid = new JTextField();
        stuid.setFont(new Font("Arial", Font.PLAIN, 11));
        stuid.setColumns(10);
        stuid.setBounds(160, 160, 200, 40);

        emails = new JTextField();
        emails.setColumns(10);
        emails.setBounds(160, 260, 200, 40);

        phone = new JTextField();
        phone.setColumns(10);
        phone.setBounds(160, 310, 200, 40);

        nationality = new JTextField();
        nationality.setColumns(10);
        nationality.setBounds(160, 510, 200, 40);
    }
    void JTextArea(){
        address = new JTextArea();
        address.setColumns(10);
        address.setBounds(160, 360, 200, 100);

        ReceiptPanel = new JTextArea();
        ReceiptPanel.setFont(new Font("Arial", Font.BOLD, 15));
        ReceiptPanel.setColumns(10);
        ReceiptPanel.setBounds(700, 110, 550, 600);
        ReceiptPanel.setEditable(false);
    }
    void JComboBox(){
        ages = new JComboBox();
        ages.setFont(new Font("Arial", Font.BOLD, 20));
        ages.setModel(new DefaultComboBoxModel(new String[] {"16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30"}));
        ages.setBounds(160, 210, 200, 40);

        enrollment = new JComboBox();
        enrollment.setFont(new Font("Arial", Font.BOLD, 25));
        enrollment.setModel(new DefaultComboBoxModel(new String[] {"2021", "2022", "2023", "2024"}));
        enrollment.setBounds(260, 560, 100, 40);

        studies = new JComboBox();
        studies.setModel(new DefaultComboBoxModel(new String[] {"2", "3"}));
        studies.setFont(new Font("Arial", Font.BOLD, 25));
        studies.setBounds(260, 610, 100, 40);

        programs = new JComboBox();
        programs.setModel(new DefaultComboBoxModel(new String[] {"SEAIR", "SEDSC", "SECEF", "SECVR", "SEIOT"}));
        programs.setFont(new Font("Arial", Font.BOLD, 25));
        programs.setBounds(250, 660, 110, 40);
    }
    void JRadioButton(){
        male = new JRadioButton("Male");
        male.setFont(new Font("Arial", Font.BOLD, 25));
        male.setToolTipText("");
        male.setBounds(160, 460, 90, 40);

        female = new JRadioButton("Female");
        female.setToolTipText("");
        female.setFont(new Font("Arial", Font.BOLD, 25));
        female.setBounds(252, 460, 120, 40);

        male.addActionListener(new Gender(male,female));
        female.addActionListener(new Gender(male,female));
    }
    void JButton(){
        Receipt = new JButton("Generate Receipt");
        Receipt.setFont(new Font("Arial", Font.BOLD, 20));
        Receipt.setBounds(430, 360, 200, 40);
        Receipt.addActionListener(new Recipe(names,stuid,ages,emails,phone,address,nationality,enrollment,studies,programs,this));
        Total();

        Reset = new JButton("Reset");
        Reset.setFont(new Font("Arial", Font.BOLD, 20));
        Reset.setBounds(430, 410, 200, 40);
        Reset.addActionListener(new Reset(names,stuid,ages,emails,phone,address,male,female,nationality,enrollment,studies,programs,picture,ReceiptPanel));

        Print= new JButton("Print");
        Print.setFont(new Font("Arial", Font.BOLD, 20));
        Print.setBounds(430, 460, 200, 40);
        Print.addActionListener(new Print(names,stuid,ages,emails,phone,address,nationality,enrollment,studies,programs,this));

        Brown = new JButton("Browns");
        Brown.setFont(new Font("Arial", Font.BOLD, 20));
        Brown.setBounds(430, 510, 200, 40);
        Brown.addActionListener(new Brw(picture));

    }

    void Total() {
        if(studies.getSelectedItem().equals("1")&&programs.getSelectedItem().equals("SEAIR")) {
            total=("Enrolled Education Program is Artificial Intelligence and Industrial Robotics"+"\nTotal Fees Payment for 1 Year is RM 20,000");
        }
        else if (studies.getSelectedItem().equals("2")&&programs.getSelectedItem().equals("SEAIR")) {
            total=("Enrolled Education Program is Artificial Intelligence and Industrial Robotics"+"\nTotal Fees Payment for 2 Years is RM 40,000");
        }
        else if (studies.getSelectedItem().equals("3")&&programs.getSelectedItem().equals("SEAIR")) {
            total=("Enrolled Education Program is Artificial Intelligence and Industrial Robotics"+"\nTotal Fees Payment for 3 Years is RM 60,000");
        }
        else if (studies.getSelectedItem().equals("1")&&programs.getSelectedItem().equals("SEDSC")) {
            total=("Enrolled Education Program is Data Science and Commercial Application Development"+"\nTotal Fees Payment for 1 Year is RM 20,000");
        }
        else if (studies.getSelectedItem().equals("2")&&programs.getSelectedItem().equals("SEDSC")) {
            total=("Enrolled Education Program is Data Science and Commercial Application Development"+"\nTotal Fees Payment for 2 Years is RM 40,000");
        }
        else if (studies.getSelectedItem().equals("3")&&programs.getSelectedItem().equals("SEDSC")) {
            total=("Enrolled Education Program is Data Science and Commercial Application Development"+"\nTotal Fees Payment for 3 Years is RM 60,000");
        }
        else if (studies.getSelectedItem().equals("1")&&programs.getSelectedItem().equals("SECEF")) {
            total=("Enrolled Education Program is E-Commerce and Financial Technology"+"\nTotal Fees Payment for 1 Year is RM 15,000");
        }
        else if (studies.getSelectedItem().equals("2")&&programs.getSelectedItem().equals("SECEF")) {
            total=("Enrolled Education Program is E-Commerce and Financial Technology"+"\nTotal Fees Payment for 2 Years is RM 30,000");
        }
        else if (studies.getSelectedItem().equals("3")&&programs.getSelectedItem().equals("SECEF")) {
            total=("Enrolled Education Program is E-Commerce and Financial Technology"+"\nTotal Fees Payment for 3 Years is RM 45,000");
        }
        else if (studies.getSelectedItem().equals("1")&&programs.getSelectedItem().equals("SECVR")) {
            total=("Enrolled Education Program is Computer Games Development and VR"+"\nTotal Fees Payment for 1 Year is RM 15,000");
        }
        else if (studies.getSelectedItem().equals("2")&&programs.getSelectedItem().equals("SECVR")) {
            total=("Enrolled Education Program is Computer Games Development and VR"+"\nTotal Fees Payment for 2 Years is RM 30,000");
        }
        else if (studies.getSelectedItem().equals("3")&&programs.getSelectedItem().equals("SECVR")) {
            total=("Enrolled Education Program is Computer Games Development and VR"+"\nTotal Fees Payment for 3 Years is RM 45,000");
        }
        else if (studies.getSelectedItem().equals("1")&&programs.getSelectedItem().equals("SEIOT")) {
            total=("Enrolled Education Program is Internet of Things"+"\nTotal Fees Payment for 1 Year is RM 15,000");
        }
        else if (studies.getSelectedItem().equals("2")&&programs.getSelectedItem().equals("SEIOT")) {
            total=("Enrolled Education Program is Internet of Things"+"\nTotal Fees Payment for 2 Years is RM 30,000");
        }
        else if (studies.getSelectedItem().equals("3")&&programs.getSelectedItem().equals("SEIOT")) {
            total=("Enrolled Education Program is Internet of Things"+"\nTotal Fees Payment for 3 Years is RM 45,000");
        }
    }
    public String getTotal() {
        return total;
    }
    public void setTotal(String total) {
        this.total = total;
    }
    public String getGender() {
        if (male.isSelected()) return "Male";
        if (female.isSelected()) return "Female";
        return "Not selected" ;
    }
    void Brown(){

    }
}
