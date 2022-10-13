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
                + "\n Age :" + ages.getSelectedItem()
                + "\n Emails : " + emails.getText()
                + "\n Phone : " + phone.getText()
                + "\n Address : " + address.getText()
                + "\n Gender : " + student.getGender()
                + "\n Nationaly : " + nationality.getText()
                + "\n Year of Enrollment : " + enrollment.getSelectedItem()
                + "\n Year of Studies: " + studies.getSelectedItem()
                + "\n Programme : " + programms.getSelectedItem() + "\n" + student.getTotal());
    }
}