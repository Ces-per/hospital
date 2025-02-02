package button.Aparat;

import dao.shange_Aparat;
import entity.database;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;

//import static com.sun.glass.ui.Cursor.setVisible;

public class button {

    public void show(JFrame frame) {

        JPanel windowContent = new JPanel();
        FlowLayout fl = new FlowLayout(FlowLayout.CENTER);
        windowContent.setLayout(fl);

       // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(windowContent);
        frame.setSize(360,500);
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





        JButton add = new JButton("Добавить");
        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                database st = new database();
                st.setSiral_number_Aparat(Siral_field.getText());
                st.setName_Aparat(name_field.getText());
                st.setRegistr_number_Aparat(Registr_field.getText());
                st.setInvent_number_Aparat(Invent_field.getText());
                st.setOtdelenie_Aparat(Otdelenie_field.getText());
                st.setData_input_Aparat(Date.valueOf(Data_input_field.getText()));
                st.setNa_spisanie_Aparat(Boolean.valueOf("false"));
                st.setAct_spisanie_Aparat(Act_spisanie_field.getText());
                st.setGurnal_TO_Aparat(Gurnal_TO_field.getText());
                new shange_Aparat().createstudent(st);
            }
        });

        windowContent.add(add);
    }
}