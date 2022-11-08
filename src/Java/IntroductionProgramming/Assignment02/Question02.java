package IntroductionProgramming.Assignment02;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Question02 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Unit Calculator");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 475, 386);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
        JPanel contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        frame.setContentPane(contentPane);
        contentPane.setLayout(null);

        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
        tabbedPane.setBounds(0, 0, 461, 349);
        contentPane.add(tabbedPane);

        JPanel panel = new JPanel();
        tabbedPane.addTab("Length", null, panel, null);
        panel.setLayout(null);

        JTextField txtCM = new JTextField();
        txtCM.setBounds(36, 78, 145, 25);
        panel.add(txtCM);
        txtCM.setColumns(10);

        JLabel lblNewLabel = new JLabel("CM");
        lblNewLabel.setBounds(36, 54, 45, 13);
        panel.add(lblNewLabel);

        JTextField txtM1 = new JTextField();
        txtM1.setColumns(10);
        txtM1.setBounds(272, 81, 145, 25);
        panel.add(txtM1);

        JLabel lblTo = new JLabel("To");
        lblTo.setHorizontalAlignment(SwingConstants.CENTER);
        lblTo.setBounds(203, 84, 45, 13);
        panel.add(lblTo);

        JLabel lblM = new JLabel("M");
        lblM.setBounds(272, 54, 45, 13);
        panel.add(lblM);

        JLabel lblM_2 = new JLabel("M");
        lblM_2.setBounds(36, 136, 45, 13);
        panel.add(lblM_2);

        JTextField txtM2 = new JTextField();
        txtM2.setColumns(10);
        txtM2.setBounds(36, 160, 145, 25);
        panel.add(txtM2);

        JLabel lblTo_1 = new JLabel("To");
        lblTo_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblTo_1.setBounds(203, 166, 45, 13);
        panel.add(lblTo_1);

        JTextField txtKM = new JTextField();
        txtKM.setColumns(10);
        txtKM.setBounds(272, 163, 145, 25);
        panel.add(txtKM);

        JLabel lblKm = new JLabel("KM");
        lblKm.setBounds(272, 136, 45, 13);
        panel.add(lblKm);

        JButton btnLength = new JButton("Convert");
        btnLength.setBounds(100, 254, 94, 25);
        panel.add(btnLength);

        JButton btnLengthClear = new JButton("Clear");
        btnLengthClear.setBounds(245, 254, 94, 25);
        panel.add(btnLengthClear);

        btnLengthClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txtCM.setText("");
                txtM1.setText("");
                txtM2.setText("");
                txtKM.setText("");
            }
        });

        btnLength.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(txtCM.getText().isEmpty() && !txtM1.getText().isEmpty()){
                    float text2 = Float.parseFloat(txtM1.getText());
                    txtCM.setText(String.valueOf(text2*100));
                }else if(txtM1.getText().isEmpty() && !txtCM.getText().isEmpty()){
                    float text1 = Float.parseFloat(txtCM.getText());
                    txtM1.setText(String.valueOf(text1/100));
                }

                if(txtM2.getText().isEmpty() && !txtKM.getText().isEmpty()){
                    float text2 = Float.parseFloat(txtKM.getText());
                    txtM2.setText(String.valueOf(text2*1000));
                }else if(txtKM.getText().isEmpty() && !txtM2.getText().isEmpty()){
                    float text1 = Float.parseFloat(txtM2.getText());
                    txtKM.setText(String.valueOf(text1/100));
                }
            }
        });

        JPanel panel_1 = new JPanel();
        tabbedPane.addTab("Mass", null, panel_1, null);
        panel_1.setLayout(null);

        JLabel lblKg = new JLabel("KG");
        lblKg.setBounds(37, 96, 45, 13);
        panel_1.add(lblKg);

        JTextField txtKG = new JTextField();
        txtKG.setColumns(10);
        txtKG.setBounds(37, 120, 145, 25);
        panel_1.add(txtKG);

        JLabel lblPound = new JLabel("Pound");
        lblPound.setBounds(273, 96, 45, 13);
        panel_1.add(lblPound);

        JLabel lblTo_2 = new JLabel("To");
        lblTo_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblTo_2.setBounds(204, 126, 45, 13);
        panel_1.add(lblTo_2);

        JTextField txtPound = new JTextField();
        txtPound.setColumns(10);
        txtPound.setBounds(273, 123, 145, 25);
        panel_1.add(txtPound);

        JButton btnMass = new JButton("Convert");
        btnMass.setBounds(100, 254, 94, 25);
        panel_1.add(btnMass);

        JButton btnMassClear = new JButton("Clear");
        btnMassClear.setBounds(245, 254, 94, 25);
        panel_1.add(btnMassClear);
        btnMassClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txtKG.setText("");
                txtPound.setText("");
            }
        });

        btnMass.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(txtKG.getText().isEmpty()){
                    float text2 = Float.parseFloat(txtPound.getText());
                    txtKG.setText(String.valueOf(text2 * 0.45359237));
                }else if(txtPound.getText().isEmpty()){
                    float text1 = Float.parseFloat(txtKG.getText());
                    txtPound.setText(String.valueOf(text1 * 2.20462262 ));
                }
            }
        });
        JPanel panel_2 = new JPanel();
        tabbedPane.addTab("Time", null, panel_2, null);
        panel_2.setLayout(null);

        JLabel lblHour = new JLabel("Hour");
        lblHour.setBounds(38, 53, 45, 13);
        panel_2.add(lblHour);

        JTextField txtHour = new JTextField();
        txtHour.setColumns(10);
        txtHour.setBounds(38, 77, 145, 25);
        panel_2.add(txtHour);

        JLabel lblTo_3 = new JLabel("To");
        lblTo_3.setHorizontalAlignment(SwingConstants.CENTER);
        lblTo_3.setBounds(205, 83, 45, 13);
        panel_2.add(lblTo_3);

        JLabel lblMinute = new JLabel("Minutes");
        lblMinute.setBounds(274, 53, 75, 13);
        panel_2.add(lblMinute);

        JTextField txtMin1 = new JTextField();
        txtMin1.setColumns(10);
        txtMin1.setBounds(274, 80, 145, 25);
        panel_2.add(txtMin1);

        JLabel lblSeconds = new JLabel("Seconds");
        lblSeconds.setBounds(274, 135, 75, 13);
        panel_2.add(lblSeconds);

        JTextField txtSecond = new JTextField();
        txtSecond.setColumns(10);
        txtSecond.setBounds(274, 162, 145, 25);
        panel_2.add(txtSecond);

        JLabel lblTo_1_1 = new JLabel("To");
        lblTo_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblTo_1_1.setBounds(205, 165, 45, 13);
        panel_2.add(lblTo_1_1);

        JTextField txtMin2 = new JTextField();
        txtMin2.setColumns(10);
        txtMin2.setBounds(38, 159, 145, 25);
        panel_2.add(txtMin2);

        JLabel lblM_2_1 = new JLabel("Minutes");
        lblM_2_1.setBounds(38, 135, 75, 13);
        panel_2.add(lblM_2_1);

        JButton btnTime = new JButton("Convert");
        btnTime.setBounds(100, 254, 94, 25);
        panel_2.add(btnTime);

        JButton btnTimeClear = new JButton("Clear");
        btnTimeClear.setBounds(245, 254, 94, 25);
        panel_2.add(btnTimeClear);

        btnTimeClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txtMin1.setText("");
                txtMin2.setText("");
                txtHour.setText("");
                txtSecond.setText("");
            }
        });

        btnTime.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(txtHour.getText().isEmpty() && !txtMin1.getText().isEmpty()){
                    float text2 = Float.parseFloat(txtMin1.getText());
                    txtHour.setText(String.valueOf(text2 / 60));
                }else if(txtMin1.getText().isEmpty() && !txtHour.getText().isEmpty()){
                    float text1 = Float.parseFloat(txtHour.getText());
                    txtMin1.setText(String.valueOf(text1 * 60 ));
                }

                if(txtSecond.getText().isEmpty() && !txtMin2.getText().isEmpty()){
                    float text2 = Float.parseFloat(txtMin2.getText());
                    txtSecond.setText(String.valueOf(text2 * 60));
                }else if(txtMin2.getText().isEmpty() && !txtSecond.getText().isEmpty()){
                    float text1 = Float.parseFloat(txtSecond.getText());
                    txtMin2.setText(String.valueOf(text1 / 60));
                }
            }
        });

        JPanel panel_3 = new JPanel();
        tabbedPane.addTab("Temperature", null, panel_3, null);
        panel_3.setLayout(null);

        JLabel lblCelcius = new JLabel("Celcius");
        lblCelcius.setBounds(37, 120, 45, 13);
        panel_3.add(lblCelcius);

        JTextField txtC = new JTextField();
        txtC.setColumns(10);
        txtC.setBounds(37, 144, 145, 25);
        panel_3.add(txtC);

        JLabel lblTo_2_1 = new JLabel("To");
        lblTo_2_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblTo_2_1.setBounds(204, 150, 45, 13);
        panel_3.add(lblTo_2_1);

        JTextField txtF = new JTextField();
        txtF.setColumns(10);
        txtF.setBounds(273, 147, 145, 25);
        panel_3.add(txtF);

        JLabel lblFahrenheit = new JLabel("Fahrenheit");
        lblFahrenheit.setBounds(273, 120, 71, 13);
        panel_3.add(lblFahrenheit);

        JButton btnTemp = new JButton("Convert");
        btnTemp.setBounds(100, 254, 94, 25);
        panel_3.add(btnTemp);

        JButton btnTempClear = new JButton("Clear");
        btnTempClear.setBounds(245, 254, 94, 25);
        panel_3.add(btnTempClear);

        btnTempClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txtC.setText("");
                txtF.setText("");
            }
        });

        btnTemp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(txtC.getText().isEmpty()){
                    float text2 = Float.parseFloat(txtF.getText());
                    txtC.setText(String.valueOf((text2-32) * 5/9));
                }else if(txtF.getText().isEmpty()){
                    float text1 = Float.parseFloat(txtC.getText());
                    txtF.setText(String.valueOf((text1 * 9/5) + 32 ));
                }
            }
        });
    }
}

