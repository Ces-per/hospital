package button.Remont;

import dao.shange_Aparat;
import entity.database;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;

//import static com.sun.glass.ui.Cursor.setVisible;

public class create_button_remont {

    public void show(JFrame frame) {

        JPanel windowContent = new JPanel();
        FlowLayout fl = new FlowLayout(FlowLayout.CENTER);
        windowContent.setLayout(fl);

        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(windowContent);
        frame.setSize(322,500);
        frame.setVisible(true);



        JLabel Id_Remont = new JLabel("    Id    ");
        frame.add(Id_Remont);
        Id_Remont.setVisible(true);
        Id_Remont.setSize(100,20);
        JTextField Id_Remont_field = new JTextField(25);
        Id_Remont_field.setToolTipText("Введите ID");
        frame.add(Id_Remont_field);
        Id_Remont_field.setVisible(true);
        Id_Remont_field.setSize(100,20);

        JLabel Siral_number = new JLabel("Сирийный номер");
        frame.add(Siral_number);
        Siral_number.setVisible(true);
        Siral_number.setSize(100,20);
        JTextField Siral_field = new JTextField(25);
        Siral_field.setToolTipText("Введите сирийный номер");
        frame.add(Siral_field);
        Siral_field.setVisible(true);
        Siral_field.setSize(100,20);

        /*JLabel Invent_number = new JLabel("Инвертарный номер");
        frame.add(Invent_number);
        Invent_number.setVisible(true);
        Invent_number.setSize(100,20);
        JTextField Invent_field = new JTextField(25);
        Invent_field.setToolTipText("Введите инвертарный номер");
        frame.add(Invent_field);
        Invent_field.setVisible(true);
        Invent_field.setSize(100,20);*/

        JLabel Data_postupleia = new JLabel("Дата поступления");
        frame.add(Data_postupleia);
        Data_postupleia.setVisible(true);
        Data_postupleia.setSize(100,20);
        JTextField Data_postupleia_field = new JTextField(25);
        Data_postupleia_field.setToolTipText("Введите Дату поступления");
        frame.add(Data_postupleia_field);
        Data_postupleia_field.setVisible(true);
        Data_postupleia_field.setSize(100,20);

        JLabel Proved_rabot = new JLabel("Дата провидения работ");
        frame.add(Proved_rabot);
        Proved_rabot.setVisible(true);
        Proved_rabot.setSize(100,20);
        JTextField Proved_rabot_field = new JTextField(25);
        Proved_rabot_field.setToolTipText("Введите Дату провидения работ");
        frame.add(Proved_rabot_field);
        Proved_rabot_field.setVisible(true);
        Proved_rabot_field.setSize(100,20);

        JLabel Data_vypoln = new JLabel("Дата выполнения");
        frame.add(Data_vypoln);
        Data_vypoln.setVisible(true);
        Data_vypoln.setSize(100,20);
        JTextField Data_vypoln_field = new JTextField(25);
        Data_vypoln_field.setToolTipText("Введите Дату выполнения");
        frame.add(Data_vypoln_field);
        Data_vypoln_field.setVisible(true);
        Data_vypoln_field.setSize(100,20);

        JLabel Act_pered_v_remont = new JLabel("Акт перевода в ремонт");
        frame.add(Act_pered_v_remont);
        Act_pered_v_remont.setVisible(true);
        Act_pered_v_remont.setSize(100,20);
        JTextField Act_pered_v_remont_field = new JTextField(25);
        Act_pered_v_remont_field.setToolTipText("Введите Акт перевода в ремонт");
        frame.add(Act_pered_v_remont_field);
        Act_pered_v_remont_field.setVisible(true);
        Act_pered_v_remont_field.setSize(100,20);






        JButton add = new JButton("Добавить");
        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                database st = new database();
                /*st.setId_Remont(Integer.valueOf(Id_Remont_field.getText()));
                st.setSiral_number_Remont(Siral_field.getText());
                //st.setInvent_number_Remont(Invent_field.getText());
                st.setData_postupleia_Remont(Date.valueOf(Data_postupleia_field.getText()));
                st.setProved_rabot_Remont(Date.valueOf(Proved_rabot_field.getText()));
                st.setData_vypoln_Remont(Date.valueOf(Data_vypoln_field.getText()));
                st.setAct_pered_v_remont_Remont(Act_pered_v_remont_field.getText());*/

                new shange_Aparat().createstudent(st);
            }
        });

        windowContent.add(add);
    }
}