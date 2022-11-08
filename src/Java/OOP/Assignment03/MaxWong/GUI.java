package OOP.Assignment03.MaxWong;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PageFormat;
import java.awt.print.PrinterJob;
import java.io.File;

public class GUI extends JFrame implements ActionListener {
    JFrame frmStdReg;
    JTextField stdNametxtField, stdIDtxtField, EmailtxtField, HPtxtField, NationalitytxtField;
    JTextArea ReceipttxtArea, AddrTxtArea, ReceipttxtArea_1;
    JComboBox ageSelect, yearSelect, yrStudiesSelect, ProgrammeSelect;
    JLabel stdRegSys, stdName, stdLabel, Email, HP, Address, Gender, Nationality, Enrollment, Studies, Programme, Age, Photo, nErrLabel, IDErrLabel, eErrLabel, pErrLabel, addErrLabel, natErrLabel, genErrLabel, bgPhoto;
    JRadioButton Male, Female;
    JFileChooser fileChooser;
    Button receiptBtn, browseBtn, printBtn, resetBtn;
    String btn, Name, ID, phone, email, address, nationality;
    Object age, Year, Course;
    FileNameExtensionFilter filter;
    int result;
    PrinterJob pj;
    PageFormat pf;

    GUI() {
        setTitle("Student Registration System");
        frmStdReg = new JFrame();
        frmStdReg.setTitle("Student Registration");
        frmStdReg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmStdReg.getContentPane().setLayout(null);

        ErrorLabel();
        Jbutton();
        JComboBox();
        JTextArea();
        JTextField();
        RadioBtn();
        JLabel();

        getContentPane().add(Photo);
        getContentPane().add(browseBtn);
        getContentPane().add(printBtn);
        getContentPane().add(resetBtn);
        getContentPane().add(receiptBtn);
        getContentPane().add(Female);
        getContentPane().add(Male);
        getContentPane().add(ProgrammeSelect);
        getContentPane().add(yrStudiesSelect);
        getContentPane().add(yearSelect);
        getContentPane().add(ageSelect);
        getContentPane().add(NationalitytxtField);
        getContentPane().add(HPtxtField);
        getContentPane().add(EmailtxtField);
        getContentPane().add(stdIDtxtField);
        getContentPane().add(stdNametxtField);
        getContentPane().add(Age);
        getContentPane().add(Programme);
        getContentPane().add(Studies);
        getContentPane().add(Enrollment);
        getContentPane().add(Nationality);
        getContentPane().add(Gender);
        getContentPane().add(Address);
        getContentPane().add(HP);
        getContentPane().add(Email);
        getContentPane().add(stdLabel);
        getContentPane().add(stdName);
        getContentPane().add(stdRegSys);
        getContentPane().add(ReceipttxtArea);
        getContentPane().add(AddrTxtArea);
        getContentPane().add(ReceipttxtArea_1);
        getContentPane().add(nErrLabel);
        getContentPane().add(eErrLabel);
        getContentPane().add(IDErrLabel);
        getContentPane().add(pErrLabel);
        getContentPane().add(addErrLabel);
        getContentPane().add(natErrLabel);
        getContentPane().add(genErrLabel);
        getContentPane().add(bgPhoto);

    }

    public static void main(String[] args) {
        GUI a = new GUI();
        a.setVisible(true);
        a.setBounds(100, 100, 1280, 720);

    }

    void JLabel() {
        stdRegSys = new JLabel("Student Registration System");
        stdRegSys.setForeground(Color.WHITE);
        stdRegSys.setFont(new Font("Tahoma", Font.BOLD, 34));
        stdRegSys.setBounds(368, 11, 521, 99);

        stdName = new JLabel("Student Name :");
        stdName.setForeground(Color.WHITE);
        stdName.setFont(new Font("Tahoma", Font.PLAIN, 14));
        stdName.setBounds(56, 102, 112, 14);

        stdLabel = new JLabel("Student ID :");
        stdLabel.setForeground(Color.WHITE);
        stdLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        stdLabel.setBounds(56, 142, 112, 14);

        Email = new JLabel("Email :");
        Email.setForeground(Color.WHITE);
        Email.setFont(new Font("Tahoma", Font.PLAIN, 14));
        Email.setBounds(56, 218, 112, 14);

        HP = new JLabel("Phone Number :");
        HP.setForeground(Color.WHITE);
        HP.setFont(new Font("Tahoma", Font.PLAIN, 14));
        HP.setBounds(56, 256, 112, 14);

        Address = new JLabel("Address:");
        Address.setForeground(Color.WHITE);
        Address.setFont(new Font("Tahoma", Font.PLAIN, 14));
        Address.setBounds(56, 292, 112, 14);

        Gender = new JLabel("Gender:");
        Gender.setForeground(Color.WHITE);
        Gender.setFont(new Font("Tahoma", Font.PLAIN, 14));
        Gender.setBounds(56, 416, 112, 14);

        Nationality = new JLabel("Nationality:");
        Nationality.setForeground(Color.WHITE);
        Nationality.setFont(new Font("Tahoma", Font.PLAIN, 14));
        Nationality.setBounds(56, 447, 112, 28);

        Enrollment = new JLabel("Year of Enrollment:");
        Enrollment.setForeground(Color.WHITE);
        Enrollment.setFont(new Font("Tahoma", Font.PLAIN, 14));
        Enrollment.setBounds(56, 494, 151, 14);

        Studies = new JLabel("Year of Studies:");
        Studies.setForeground(Color.WHITE);
        Studies.setFont(new Font("Tahoma", Font.PLAIN, 14));
        Studies.setBounds(56, 534, 151, 14);

        Programme = new JLabel("Programme:");
        Programme.setForeground(Color.WHITE);
        Programme.setFont(new Font("Tahoma", Font.PLAIN, 14));
        Programme.setBounds(56, 562, 151, 35);

        Age = new JLabel("Age :");
        Age.setForeground(Color.WHITE);
        Age.setFont(new Font("Tahoma", Font.PLAIN, 14));
        Age.setBounds(56, 173, 112, 27);

        Photo = new JLabel(new ImageIcon("H:\\New folder\\eclipse\\jojo\\src\\hq2.png"));
        Photo.setBounds(802, 121, 163, 150);

        bgPhoto = new JLabel(new ImageIcon("H:\\New folder\\eclipse\\jojo\\src\\Geometric_Background_12.png"));
        bgPhoto.setBounds(-172, 0, 1639, 687);
    }

    void JTextArea() {
        ReceipttxtArea = new JTextArea();
        ReceipttxtArea.setBounds(644, 365, 483, 129);

        AddrTxtArea = new JTextArea();
        AddrTxtArea.setBounds(178, 296, 344, 111);

        ReceipttxtArea_1 = new JTextArea();
        ReceipttxtArea_1.setBounds(644, 491, 483, 101);
    }

    void JTextField() {
        stdNametxtField = new JTextField();
        stdNametxtField.setBounds(178, 98, 344, 27);
        stdNametxtField.setColumns(10);

        stdIDtxtField = new JTextField();
        stdIDtxtField.setColumns(10);
        stdIDtxtField.setBounds(178, 141, 344, 27);

        EmailtxtField = new JTextField();
        EmailtxtField.setColumns(10);
        EmailtxtField.setBounds(178, 214, 344, 27);

        HPtxtField = new JTextField();
        HPtxtField.setColumns(10);
        HPtxtField.setBounds(178, 255, 344, 27);

        NationalitytxtField = new JTextField();
        NationalitytxtField.setColumns(10);
        NationalitytxtField.setBounds(178, 450, 344, 27);
    }

    void RadioBtn() {
        ButtonGroup radiobtn = new ButtonGroup();
        Male = new JRadioButton("Male");
        Male.setBounds(178, 414, 53, 23);
        radiobtn.add(Male);

        Female = new JRadioButton("Female");
        Female.setBounds(233, 414, 85, 23);
        radiobtn.add(Female);

    }

    void JComboBox() {

        ageSelect = new JComboBox();
        ageSelect.setModel(new DefaultComboBoxModel(new String[]
                {"16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30"}));
        ageSelect.setBounds(178, 177, 91, 22);

        yearSelect = new JComboBox();
        yearSelect.setModel(new DefaultComboBoxModel(new String[]
                {"2020", "2021", "2022", "2023"}));
        yearSelect.setBounds(178, 492, 91, 22);

        yrStudiesSelect = new JComboBox();
        yrStudiesSelect.setModel(new DefaultComboBoxModel(new String[]
                {"1", "2", "3"}));
        yrStudiesSelect.setBounds(178, 532, 91, 22);

        ProgrammeSelect = new JComboBox();
        ProgrammeSelect.setModel(new DefaultComboBoxModel(new String[]{"SEAIR", "SEDSC", "SECEF", "SECVR", "SEIOT"}));
        ProgrammeSelect.setBounds(178, 570, 91, 22);

    }

    void Jbutton() {

        receiptBtn = new Button("Generate Receipt");
        receiptBtn.setBounds(643, 331, 138, 32);
        receiptBtn.addActionListener(this);

        resetBtn = new Button("Reset");
        resetBtn.setBounds(811, 331, 142, 32);
        resetBtn.addActionListener(this);

        printBtn = new Button("Print");
        printBtn.setBounds(977, 332, 151, 32);
        printBtn.addActionListener(this);

        browseBtn = new Button("Browse:");
        browseBtn.setBounds(811, 289, 142, 32);
        browseBtn.addActionListener(this);
        getContentPane().setLayout(null);

    }

    void ErrorLabel() {
        nErrLabel = new JLabel();
        nErrLabel.setForeground(Color.ORANGE);
        nErrLabel.setBounds(355, 126, 167, 14);

        IDErrLabel = new JLabel();
        IDErrLabel.setForeground(Color.ORANGE);
        IDErrLabel.setBounds(355, 168, 167, 14);

        eErrLabel = new JLabel();
        eErrLabel.setForeground(Color.ORANGE);
        eErrLabel.setBounds(355, 240, 167, 14);

        pErrLabel = new JLabel();
        pErrLabel.setForeground(Color.ORANGE);
        pErrLabel.setBounds(355, 281, 167, 14);

        addErrLabel = new JLabel();
        addErrLabel.setForeground(Color.ORANGE);
        addErrLabel.setBounds(355, 407, 157, 14);

        natErrLabel = new JLabel();
        natErrLabel.setForeground(Color.ORANGE);
        natErrLabel.setBounds(355, 477, 167, 14);

        genErrLabel = new JLabel();
        genErrLabel.setForeground(Color.ORANGE);
        genErrLabel.setBounds(178, 436, 157, 14);

    }

    public ImageIcon ResizeImage(String ImagePath) {
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(Photo.getWidth(), Photo.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }

    public void actionPerformed(ActionEvent e) {

        btn = e.getActionCommand();
        if (btn.equals("Generate Receipt")) {
            Name = stdNametxtField.getText();
            ID = stdIDtxtField.getText();
            age = ageSelect.getItemAt(ageSelect.getSelectedIndex());
            email = EmailtxtField.getText();
            phone = HPtxtField.getText();
            Year = yearSelect.getItemAt(yearSelect.getSelectedIndex());
            address = AddrTxtArea.getText();
            nationality = NationalitytxtField.getText();
            Course = ProgrammeSelect.getItemAt(ProgrammeSelect.getSelectedIndex());
            genErrLabel.setText("");
            natErrLabel.setText("");
            addErrLabel.setText("");
            pErrLabel.setText("");
            eErrLabel.setText("");
            IDErrLabel.setText("");
            nErrLabel.setText("");
            ErrorMessage();

        } else if (btn.equals("Reset")) {
            ReceipttxtArea.setText("");
            ReceipttxtArea_1.setText("");
            stdNametxtField.setText("");
            stdIDtxtField.setText("");
            ageSelect.setSelectedIndex(0);
            EmailtxtField.setText("");
            HPtxtField.setText("");
            yearSelect.setSelectedIndex(0);
            yrStudiesSelect.setSelectedIndex(0);
            ProgrammeSelect.setSelectedIndex(0);
            AddrTxtArea.setText("");
            NationalitytxtField.setText("");
            nErrLabel.setText("");
            IDErrLabel.setText("");
            eErrLabel.setText("");
            pErrLabel.setText("");
            addErrLabel.setText("");
            natErrLabel.setText("");
            genErrLabel.setText("");
            Photo.setIcon(new ImageIcon("H:\\New folder\\eclipse\\jojo\\src\\hq2.png"));

            JOptionPane.showMessageDialog(frmStdReg, "Reset Successfully!");

        } else if (btn.equals("Browse:")) {
            fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
            filter = new FileNameExtensionFilter("*.Images", "jpg", "gif", "png");
            fileChooser.addChoosableFileFilter(filter);
            result = fileChooser.showSaveDialog(null);
            if (result == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                String path = selectedFile.getAbsolutePath();
                Photo.setIcon(ResizeImage(path));

            }
        } else if (btn.equals("Print")) {
            pj = PrinterJob.getPrinterJob();
            pj.printDialog();

        }
    }

    void ErrorMessage() {
        if (Name.equals("")) {
            nErrLabel.setText("Name is Required*");
        }
        if (ID.equals("")) {
            IDErrLabel.setText("ID is Required*");
        }
        if (email.equals("")) {
            eErrLabel.setText("Email is Required*");
        }
        if (phone.equals("")) {
            pErrLabel.setText("Phone Number is Required*");
        }
        if (address.equals("")) {
            addErrLabel.setText("Address is Required*");
        }
        if (nationality.equals("")) {
            natErrLabel.setText("Nationality is required*");
        } else if (!Male.isSelected() && !Female.isSelected()) {
            genErrLabel.setText("Gender is Required*");
        } else {
            JOptionPane.showMessageDialog(frmStdReg, "Data Saved Successfully!");
            ReceipttxtArea.setText("---------------------------------------------------FEE RECEIPT---------------------------------------------------------" + "\nStudent Name: " + Name + "\nStudent ID: " + ID + "\nAge: " + age + "\nEmail ID: " + email + "\nPhone Number: " + phone + "\nYear of Enrollment: " + Year + "\nProgram applied for: " + Course);
            calculations();
        }
    }

    void calculations() {
        if (yrStudiesSelect.getSelectedItem().equals("1") && ProgrammeSelect.getSelectedItem().equals("SEAIR")) {
            ReceipttxtArea_1.setText("Enrolled Education Program is Artificial Intelligence and Industrial Robotics" + "\nTotal Fees Payment for 1 Year is RM 20,000");
        } else if (yrStudiesSelect.getSelectedItem().equals("2") && ProgrammeSelect.getSelectedItem().equals("SEAIR")) {
            ReceipttxtArea_1.setText("Enrolled Education Program is Artificial Intelligence and Industrial Robotics" + "\nTotal Fees Payment for 2 Years is RM 40,000");
        } else if (yrStudiesSelect.getSelectedItem().equals("3") && ProgrammeSelect.getSelectedItem().equals("SEAIR")) {
            ReceipttxtArea_1.setText("Enrolled Education Program is Artificial Intelligence and Industrial Robotics" + "\nTotal Fees Payment for 3 Years is RM 60,000");
        } else if (yrStudiesSelect.getSelectedItem().equals("1") && ProgrammeSelect.getSelectedItem().equals("SEDSC")) {
            ReceipttxtArea_1.setText("Enrolled Education Program is Data Science and Commercial Application Development" + "\nTotal Fees Payment for 1 Year is RM 20,000");
        } else if (yrStudiesSelect.getSelectedItem().equals("2") && ProgrammeSelect.getSelectedItem().equals("SEDSC")) {
            ReceipttxtArea_1.setText("Enrolled Education Program is Data Science and Commercial Application Development" + "\nTotal Fees Payment for 2 Years is RM 40,000");
        } else if (yrStudiesSelect.getSelectedItem().equals("3") && ProgrammeSelect.getSelectedItem().equals("SEDSC")) {
            ReceipttxtArea_1.setText("Enrolled Education Program is Data Science and Commercial Application Development" + "\nTotal Fees Payment for 3 Years is RM 60,000");
        } else if (yrStudiesSelect.getSelectedItem().equals("1") && ProgrammeSelect.getSelectedItem().equals("SECEF")) {
            ReceipttxtArea_1.setText("Enrolled Education Program is E-Commerce and Financial Technology" + "\nTotal Fees Payment for 1 Year is RM 15,000");
        } else if (yrStudiesSelect.getSelectedItem().equals("2") && ProgrammeSelect.getSelectedItem().equals("SECEF")) {
            ReceipttxtArea_1.setText("Enrolled Education Program is E-Commerce and Financial Technology" + "\nTotal Fees Payment for 2 Years is RM 30,000");
        } else if (yrStudiesSelect.getSelectedItem().equals("3") && ProgrammeSelect.getSelectedItem().equals("SECEF")) {
            ReceipttxtArea_1.setText("Enrolled Education Program is E-Commerce and Financial Technology" + "\nTotal Fees Payment for 3 Years is RM 45,000");
        } else if (yrStudiesSelect.getSelectedItem().equals("1") && ProgrammeSelect.getSelectedItem().equals("SECVR")) {
            ReceipttxtArea_1.setText("Enrolled Education Program is Computer Games Development and VR" + "\nTotal Fees Payment for 1 Year is RM 15,000");
        } else if (yrStudiesSelect.getSelectedItem().equals("2") && ProgrammeSelect.getSelectedItem().equals("SECVR")) {
            ReceipttxtArea_1.setText("Enrolled Education Program is Computer Games Development and VR" + "\nTotal Fees Payment for 2 Years is RM 30,000");
        } else if (yrStudiesSelect.getSelectedItem().equals("3") && ProgrammeSelect.getSelectedItem().equals("SECVR")) {
            ReceipttxtArea_1.setText("Enrolled Education Program is Computer Games Development and VR" + "\nTotal Fees Payment for 3 Years is RM 45,000");
        } else if (yrStudiesSelect.getSelectedItem().equals("1") && ProgrammeSelect.getSelectedItem().equals("SEIOT")) {
            ReceipttxtArea_1.setText("Enrolled Education Program is Internet of Things" + "\nTotal Fees Payment for 1 Year is RM 15,000");
        } else if (yrStudiesSelect.getSelectedItem().equals("2") && ProgrammeSelect.getSelectedItem().equals("SEIOT")) {
            ReceipttxtArea_1.setText("Enrolled Education Program is Internet of Things" + "\nTotal Fees Payment for 2 Years is RM 30,000");
        } else if (yrStudiesSelect.getSelectedItem().equals("3") && ProgrammeSelect.getSelectedItem().equals("SEIOT")) {
            ReceipttxtArea_1.setText("Enrolled Education Program is Internet of Things" + "\nTotal Fees Payment for 3 Years is RM 45,000");
        }
    }
}