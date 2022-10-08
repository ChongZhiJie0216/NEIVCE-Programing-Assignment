package OOP.Assignment03.ZhiJIe;

import javax.swing.*;
import java.awt.*;

public class GUI_RUN extends Design {
    JLabel title,stdnames,stdid,stdage,stdemail,stdphn,stdads,stdgen,stdnat,stdyoe,stdyof,stdpgm;
    JTextField names,id,mail,phn,ads,nat;
    JComboBox sctage,sctyear,sctstu,sctprg;
    GUI_RUN(){
        setType(Type.UTILITY);
        setTitle("2022 Student Registration System");
        setBounds(100, 100, 450, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1366,768);

        JComboBox();
        JTextField();
        JLabel();

        getContentPane().add(title);
        getContentPane().add(stdnames);
        getContentPane().add(stdid);
        getContentPane().add(stdage);
        getContentPane().add(stdemail);
        getContentPane().add(stdphn);
        getContentPane().add(stdads);
        getContentPane().add(stdgen);
        getContentPane().add(stdnat);
        getContentPane().add(stdyoe);
        getContentPane().add(stdyof);
        getContentPane().add(stdpgm);
        getContentPane().add(sctage);
        getContentPane().add(sctyear);
        getContentPane().add(sctstu);
        getContentPane().add(sctprg);
        getContentPane().add(names);
        getContentPane().add(id);
        getContentPane().add(mail);
        getContentPane().add(phn);
        getContentPane().add(ads);
        getContentPane().add(nat);


        setVisible(true);
    }

    public static void main(String[] args) {
        GUI_RUN design = new GUI_RUN();
        design.GUI_RUN();
    }

    void JLabel(){
        title=new JLabel("Student Registration System");
        title.setFont(new Font("Arial", Font.BOLD, 40));
        title.setBounds(400, 11, 550, 50);

        stdnames=new JLabel("Names:");
        stdnames.setFont(new Font("Arial", Font.BOLD, 20));
        stdnames.setBounds(60, 110, 90, 40);

        stdid= new JLabel("Student ID:");
        stdid.setFont(new Font("Arial", Font.BOLD, 20));
        stdid.setBounds(50, 160, 120, 40);

        stdage= new JLabel("Student Age:");
        stdage.setFont(new Font("Arial", Font.BOLD, 20));
        stdage.setBounds(50, 210, 90, 40);

        stdemail=new JLabel("Email ID:");
        stdemail.setFont(new Font("Arial", Font.BOLD, 20));
        stdemail.setBounds(50, 260, 120, 40);

        stdphn= new JLabel("Phone No:");
        stdphn.setFont(new Font("Arial", Font.BOLD, 20));
        stdphn.setBounds(50, 310, 120, 40);

        stdads= new JLabel("Address:");
        stdads.setFont(new Font("Arial", Font.BOLD, 20));
        stdads.setBounds(50, 360, 110, 40);

        stdgen= new JLabel("Gender:");
        stdgen.setFont(new Font("Arial", Font.BOLD, 20));
        stdgen.setBounds(50, 460, 120, 40);

        stdnat= new JLabel("Nationality:");
        stdnat.setFont(new Font("Arial", Font.BOLD, 20));
        stdnat.setBounds(50, 510, 120, 40);

        stdyoe=new JLabel("Year of Enrollment:");
        stdyoe.setFont(new Font("Arial", Font.BOLD, 20));
        stdyoe.setBounds(50, 560, 190, 40);

        stdyof= new JLabel("Year of Studies:");
        stdyof.setFont(new Font("Arial", Font.BOLD, 20));
        stdyof.setBounds(50, 610, 190, 40);

        stdpgm= new JLabel("Programme");
        stdpgm.setFont(new Font("Arial", Font.BOLD, 20));
        stdpgm.setBounds(50, 660, 190, 40);
    }
    void JTextField(){
        names = new JTextField();
        names.setFont(new Font("Arial", Font.PLAIN, 11));
        names.setBounds(160, 110, 200, 40);
        names.setColumns(10);

        id = new JTextField();
        id.setFont(new Font("Arial", Font.PLAIN, 11));
        id.setColumns(10);
        id.setBounds(160, 160, 200, 40);

        mail = new JTextField();
        mail.setFont(new Font("Arial", Font.PLAIN, 11));
        mail.setColumns(10);
        mail.setBounds(160, 260, 200, 40);

        phn = new JTextField();
        phn.setFont(new Font("Arial", Font.PLAIN, 11));
        phn.setColumns(10);
        phn.setBounds(160, 310, 200, 40);

        ads = new JTextField();
        ads.setFont(new Font("Arial", Font.PLAIN, 11));
        ads.setHorizontalAlignment(SwingConstants.LEFT);
        ads.setBounds(160, 360, 200, 100);

        nat= new JTextField();
        nat.setColumns(10);
        nat.setBounds(160, 510, 200, 40);
    }
    void JComboBox(){
        sctage = new JComboBox();
        sctage.setFont(new Font("Arial", Font.BOLD, 20));
        sctage.setModel(new DefaultComboBoxModel(new String[] {"16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30"}));
        sctage.setBounds(160, 210, 200, 40);

        sctyear = new JComboBox();
        sctyear.setFont(new Font("Arial", Font.BOLD, 25));
        sctyear.setModel(new DefaultComboBoxModel(new String[] {"2021", "2022", "2023", "2024"}));
        sctyear.setBounds(260, 560, 100, 40);

        sctstu = new JComboBox();
        sctstu.setModel(new DefaultComboBoxModel(new String[] {"2", "3"}));
        sctstu.setFont(new Font("Arial", Font.BOLD, 25));
        sctstu.setBounds(260, 610, 100, 40);

        sctprg = new JComboBox();
        sctprg.setModel(new DefaultComboBoxModel(new String[] {"SEAIR", "SEDSC", "SECEF", "SECVR", "SEIOT"}));
        sctprg.setFont(new Font("Arial", Font.BOLD, 25));
        sctprg.setBounds(250, 660, 110, 40);
    }
}