import dao.shange_student;
import entity.student;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;

public class update_button {
    public void show(JFrame frame) {

        JPanel windowContent = new JPanel();
        FlowLayout fl = new FlowLayout(FlowLayout.CENTER);
        windowContent.setLayout(fl);

        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(windowContent);
        frame.setSize(360,535);
        frame.setVisible(true);

        JLabel Siral_number = new JLabel("Сирийный номер");
        frame.add(Siral_number);
        Siral_number.setVisible(true);
        Siral_number.setSize(100,20);
        JTextField Siral_field = new JTextField(25);
        Siral_field.setToolTipText("Введите сирийный номер");
        frame.add(Siral_field);
        Siral_field.setVisible(true);
        Siral_field.setSize(100,20);

        JLabel Name_ = new JLabel("Название");
        frame.add(Name_);
        Name_.setVisible(true);
        Name_.setSize(100,20);
        JTextField name_field = new JTextField(25);
        name_field.setToolTipText("Введите название");
        frame.add(name_field);
        name_field.setVisible(true);
        name_field.setSize(100,20);

        JLabel Registr_number = new JLabel("Регистрационный номер");
        frame.add(Registr_number);
        Registr_number.setVisible(true);
        Registr_number.setSize(100,20);
        JTextField Registr_field = new JTextField(25);
        Registr_field.setToolTipText("Введите регистрационный номер");
        frame.add(Registr_field);
        Registr_field.setVisible(true);
        Registr_field.setSize(100,20);

        JLabel Invent_number = new JLabel("Изобретательский номер");
        frame.add(Invent_number);
        Invent_number.setVisible(true);
        Invent_number.setSize(100,20);
        JTextField Invent_field = new JTextField(25);
        Invent_field.setToolTipText("Введите изобретательский номер");
        frame.add(Invent_field);
        Invent_field.setVisible(true);
        Invent_field.setSize(100,20);

        JLabel Otdelenie = new JLabel("Отделение");
        frame.add(Otdelenie);
        Otdelenie.setVisible(true);
        Otdelenie.setSize(100,20);
        JTextField Otdelenie_field = new JTextField(25);
        Otdelenie_field.setToolTipText("Введите отделение");
        frame.add(Otdelenie_field);
        Otdelenie_field.setVisible(true);
        Otdelenie_field.setSize(100,20);

        JLabel Data_input = new JLabel("Дата ввода");
        frame.add(Data_input);
        Data_input.setVisible(true);
        Data_input.setSize(100,20);
        JTextField Data_input_field = new JTextField(25);
        Data_input_field.setToolTipText("Введите Дату ввода");
        frame.add(Data_input_field);
        Data_input_field.setVisible(true);
        Data_input_field.setSize(100,20);

        JLabel Na_spisanie = new JLabel("На списание");
        frame.add(Na_spisanie);
        Na_spisanie.setVisible(true);
        Na_spisanie.setSize(100,20);
        JTextField Na_spisanie_field = new JTextField(25);
        Na_spisanie_field.setToolTipText("Введите На списание");
        frame.add(Na_spisanie_field);
        Na_spisanie_field.setVisible(true);
        Na_spisanie_field.setSize(100,20);

        JLabel Act_spisanie = new JLabel("Акт списания");
        frame.add(Act_spisanie);
        Act_spisanie.setVisible(true);
        Act_spisanie.setSize(100,20);
        JTextField Act_spisanie_field = new JTextField(25);
        Act_spisanie_field.setToolTipText("Введите Акт списания");
        frame.add(Act_spisanie_field);
        Act_spisanie_field.setVisible(true);
        Act_spisanie_field.setSize(100,20);

        JLabel Gurnal_TO = new JLabel("Генеральное ПО");
        frame.add(Gurnal_TO);
        Gurnal_TO.setVisible(true);
        Gurnal_TO.setSize(100,20);
        JTextField Gurnal_TO_field = new JTextField(25);
        Gurnal_TO_field.setToolTipText("Введите Генеральное ПО");
        frame.add(Gurnal_TO_field);
        Gurnal_TO_field.setVisible(true);
        Gurnal_TO_field.setSize(100,20);

        JLabel where_id = new JLabel("В каком Сирийном номере");
        frame.add(where_id);
        where_id.setSize(100,20);
        where_id.setVisible(true);
        JTextField where_field = new JTextField(25);
        where_field.setToolTipText("Введите Сирийный номер");
        frame.add(where_field);
        where_field.setSize(100,20);
        where_field.setVisible(true);

        JButton up = new JButton("Обнавить");
        up.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                student st = new student();
                st.setSiral_number(Siral_field.getText());
                st.setName_(name_field.getText());
                st.setRegistr_number(Registr_field.getText());
                st.setInvent_number(Invent_field.getText());
                st.setOtdelenie(Otdelenie_field.getText());
                st.setData_input(Date.valueOf(Data_input_field.getText()));
                st.setNa_spisanie(Boolean.valueOf(Na_spisanie_field.getText()));
                st.setAct_spisanie(Act_spisanie_field.getText());
                st.setGurnal_TO(Gurnal_TO_field.getText());
                st.setWhere(String.valueOf(where_field.getText()));

                int i = new shange_student().updateStudent(st);
                System.out.println(i);
            }
        });

        windowContent.add(up);
    }
}