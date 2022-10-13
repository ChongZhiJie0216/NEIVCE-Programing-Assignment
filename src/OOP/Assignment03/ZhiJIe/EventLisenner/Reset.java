package OOP.Assignment03.ZhiJIe.EventLisenner;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Reset implements ActionListener {
    private JTextArea ReceiptPanel;
    private JLabel picture;
    private JTextField names;
    private JTextField studis;
    private JComboBox ages;
    private JTextField emails;
    private JTextField phone;
    private JTextArea address;
    private JRadioButton male;
    private JRadioButton female;
    private JTextField nationality;
    private JComboBox enrollment;
    private JComboBox studies;
    private JComboBox programms;

    public Reset(JTextField names, JTextField studis,JComboBox ages,JTextField emails,JTextField phone,JTextArea address,JRadioButton male,JRadioButton female,JTextField nationality,JComboBox enrollment,JComboBox studies,JComboBox programms,JLabel Picture,JTextArea ReceiptPanel) {
            this.names = names;
            this.studis = studis;
            this.ages = ages;
            this.emails = emails;
            this.phone = phone;
            this.address = address;
            this.male = male;
            this.female = female;
            this.nationality = nationality;
            this.enrollment = enrollment;
            this.studies = studies;
            this.programms = programms;
            this.picture = Picture;
            this.ReceiptPanel = ReceiptPanel;
    }

    public void actionPerformed(ActionEvent e) {
        names.setText("");
        studis.setText("");
        ages.setSelectedIndex(0);
        emails.setText("");
        phone.setText("");
        address.setText("");
        male.setSelected(false);
        female.setSelected(false);
        nationality.setText("");
        enrollment.setSelectedIndex(0);
        studies.setSelectedIndex(0);
        programms.setSelectedIndex(0);
        picture.setIcon(new ImageIcon("src/OOP/Assignment03/ZhiJIe/KEKW.jpg"));
        ReceiptPanel.setText("");
        JOptionPane.showMessageDialog(null,"Reset Done");
    }
}
