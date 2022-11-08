package OOP.Assignment03.ZhiJIe.EventLisenner;

import OOP.Assignment03.ZhiJIe.Student;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterJob;

public class Print implements ActionListener {
    private Student checkGroup;

    private final Student student;
    private JTextField names;
    private JTextField studis;
    private JComboBox ages;
    private JTextField emails;
    private JTextField phone;
    private JTextArea address;
    private JTextField nationality;
    private JComboBox enrollment;
    private JComboBox studies;
    private JComboBox programms;

    public Print(JTextField names, JTextField studis, JComboBox ages, JTextField emails, JTextField phone,
                 JTextArea address, JTextField nationality, JComboBox enrollment, JComboBox studies,
                 JComboBox programms, Student student) {
        this.names = names;
        this.studis = studis;
        this.ages = ages;
        this.emails = emails;
        this.phone = phone;
        this.address = address;
        this.nationality = nationality;
        this.enrollment = enrollment;
        this.studies = studies;
        this.programms = programms;
        this.student = student;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
/*
        JOptionPane.showMessageDialog(null,((JButton)e.getSource()).getText());
*/
        String Gender;
        String Info = "Names : " + names.getText() + "\nStudent ID : " + studis.getText() + "\n Age :" + ages.getSelectedItem()
                + "\n Emails : " + emails.getText() + "\n Phone : " + phone.getText() + "\n Address : " + address.getText()
                + "\n Gender : " + student.getGender() + "\n Nationaly : " + nationality.getText()
                + "\n Year of Enrollment : " + enrollment.getSelectedItem() + "\n Year of Studies: " + studies.getSelectedItem()
                + "\n Programme : " + programms.getSelectedItem() + "\n" + student.getTotal();
        PrinterJob pj = PrinterJob.getPrinterJob();
        pj.printDialog();
    }
}
