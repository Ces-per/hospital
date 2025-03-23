package button.Otdelenie;

import dao.shange_Otdelenie;
import entity.database;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;

public class update_button_Otdelenie{
    public void show(JFrame frame) {

        JPanel windowContent = new JPanel();
        FlowLayout fl = new FlowLayout(FlowLayout.CENTER);
        windowContent.setLayout(fl);

        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(windowContent);
        frame.setSize(350,535);
        frame.setVisible(true);

        JLabel Kod_Otdelenie = new JLabel("Код");
        frame.add(Kod_Otdelenie);
        Kod_Otdelenie.setVisible(true);
        Kod_Otdelenie.setSize(100,20);
        JTextField Kod_Otdelenie_field = new JTextField(25);
        Kod_Otdelenie_field.setToolTipText("Введите код");
        frame.add(Kod_Otdelenie_field);
        Kod_Otdelenie_field.setVisible(true);
        Kod_Otdelenie_field.setSize(100,20);

        JLabel Name_Otdelenie = new JLabel("Название");
        frame.add(Name_Otdelenie);
        Name_Otdelenie.setVisible(true);
        Name_Otdelenie.setSize(100,20);
        JTextField Name_Otdelenie_field = new JTextField(25);
        Name_Otdelenie_field.setToolTipText("Введите название");
        frame.add(Name_Otdelenie_field);
        Name_Otdelenie_field.setVisible(true);
        Name_Otdelenie_field.setSize(100,20);



        JLabel where_id = new JLabel("В каком ID");
        frame.add(where_id);
        where_id.setSize(100,20);
        where_id.setVisible(true);
        JTextField where_field = new JTextField(25);
        where_field.setToolTipText("Введите ID");
        frame.add(where_field);
        where_field.setSize(100,20);
        where_field.setVisible(true);


        JButton up = new JButton("Обнавить");
        up.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                database st = new database();
                st.setKod_Otdelenie(Kod_Otdelenie_field.getText());
                st.setName_Otdelenie(Name_Otdelenie_field.getText());
                st.setWhere_Otdelenie(String.valueOf(where_field.getText()));

                int i = new shange_Otdelenie().updateOtdelenie(st);
                System.out.println(i);
            }
        });

        windowContent.add(up);
    }
}