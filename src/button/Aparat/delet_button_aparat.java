package button.Aparat;

import dao.shange_Aparat;
import entity.database;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class delet_button_aparat {
    public void show(JFrame frame) {

        JPanel windowContent = new JPanel();
        FlowLayout fl = new FlowLayout(FlowLayout.CENTER);
        windowContent.setLayout(fl);

        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(windowContent);
        frame.setSize(310,400);
        frame.setVisible(true);

        JLabel where_id = new JLabel("В каком Id");
        frame.add(where_id);
        where_id.setSize(100,20);
        where_id.setVisible(true);
        JTextField where_field = new JTextField(25);
        where_field.setToolTipText("Введите id");
        frame.add(where_field);
        where_field.setSize(100,20);
        where_field.setVisible(true);

        JButton up = new JButton("Удалить");
        up.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                database st = new database();
                st.setWhere_Aparat(String.valueOf(where_field.getText()));
                int i = new shange_Aparat().deletStudent(st);
            }
        });

        windowContent.add(up);
    }
}