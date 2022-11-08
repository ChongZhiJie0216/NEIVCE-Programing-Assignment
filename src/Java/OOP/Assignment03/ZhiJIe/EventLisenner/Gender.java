package OOP.Assignment03.ZhiJIe.EventLisenner;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gender implements ActionListener {
    private final JRadioButton male;
    private final JRadioButton female;

    public Gender(JRadioButton male, JRadioButton female){
        this.male = male;
        this.female = female;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == male) {
            female.setSelected(!male.isSelected());

        } else if (e.getSource() == female) {
            male.setSelected(!female.isSelected());

        }

    }
}
