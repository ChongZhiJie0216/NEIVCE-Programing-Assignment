package OOP.Assignment03.ZhiJIe.EventLisenner;

import OOP.Assignment03.ZhiJIe.Student;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Recipe implements ActionListener {
    private final Student student;
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

    public Recipe(JTextField names, JTextField studis, JComboBox ages, JTextField emails, JTextField phone,
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
        Student.ReceiptPanel.setText(
                "Names : " + names.getText()
                        + "\nStudent ID : " + studis.getText()
                        + "\nAge :" + ages.getSelectedItem()
                        + "\nEmails : " + emails.getText()
                        + "\nPhone : " + phone.getText()
                        + "\nAddress : " + address.getText()
                        + "\nGender : " + student.getGender()
                        + "\nNationally : " + nationality.getText()
                        + "\nYear of Enrollment : " + enrollment.getSelectedItem()
                        + "\nYear of Studies: " + studies.getSelectedItem()
                        + "\nProgramme : " + programms.getSelectedItem() + "\n" + student.getTotal());
    }
}