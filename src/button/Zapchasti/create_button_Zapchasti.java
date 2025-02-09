package button.Zapchasti;

import dao.shange_Zapchasti;
import entity.database;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//import static com.sun.glass.ui.Cursor.setVisible;

public class create_button_Zapchasti {

    public void show(JFrame frame) {

        JPanel windowContent = new JPanel();
        FlowLayout fl = new FlowLayout(FlowLayout.CENTER);
        windowContent.setLayout(fl);

       // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(windowContent);
        frame.setSize(300,350);
        frame.setVisible(true);



        JLabel Id_Zapchasti = new JLabel("Id");
        frame.add(Id_Zapchasti);
        Id_Zapchasti.setVisible(true);
        Id_Zapchasti.setSize(100,20);
        JTextField Id_Zapchasti_field = new JTextField(25);
        Id_Zapchasti_field.setToolTipText("Введите ID");
        frame.add(Id_Zapchasti_field);
        Id_Zapchasti_field.setVisible(true);
        Id_Zapchasti_field.setSize(100,20);

        JLabel Kod = new JLabel("Код");
        frame.add(Kod);
        Kod.setVisible(true);
        Kod.setSize(100,20);
        JTextField Kod_field = new JTextField(25);
        Kod_field.setToolTipText("Введите код");
        frame.add(Kod_field);
        Kod_field.setVisible(true);
        Kod_field.setSize(100,20);

        JLabel Name_Zapchasti = new JLabel("Название");
        frame.add(Name_Zapchasti);
        Name_Zapchasti.setVisible(true);
        Name_Zapchasti.setSize(100,20);
        JTextField Name_Zapchasti_field = new JTextField(25);
        Name_Zapchasti_field.setToolTipText("Введите название");
        frame.add(Name_Zapchasti_field);
        Name_Zapchasti_field.setVisible(true);
        Name_Zapchasti_field.setSize(100,20);

        JLabel Characteristics = new JLabel("Характеристики");
        frame.add(Characteristics);
        Characteristics.setVisible(true);
        Characteristics.setSize(100,20);
        JTextField Characteristics_field = new JTextField(25);
        Characteristics_field.setToolTipText("Введите характеристики");
        frame.add(Characteristics_field);
        Characteristics_field.setVisible(true);
        Characteristics_field.setSize(100,20);

        JLabel Photo = new JLabel("Фото");
        frame.add(Photo);
        Photo.setVisible(true);
        Photo.setSize(100,20);
        JTextField Photo_field = new JTextField(25);
        Photo_field.setToolTipText("Введите фото");
        frame.add(Photo_field);
        Photo_field.setVisible(true);
        Photo_field.setSize(100,20);







        JButton add = new JButton("Добавить");
        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                database st = new database();
                st.setKod_Zapchasti(Kod_field.getText());
                st.setName_Zapchasti(Name_Zapchasti_field.getText());
                st.setCharacteristics_Zapchasti(Characteristics_field.getText());
                st.setPhoto_Zapchasti(Photo_field.getText());
                st.setId_Zapchasti(Id_Zapchasti_field.getText());
                new shange_Zapchasti().createZapchasti(st);
            }
        });

        windowContent.add(add);
    }
}