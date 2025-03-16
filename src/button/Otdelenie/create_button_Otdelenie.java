package button.Otdelenie;

import dao.shange_Otdelenie;
import entity.database;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//import static com.sun.glass.ui.Cursor.setVisible;

public class create_button_Otdelenie {

    public void show(JFrame frame) {

        JPanel windowContent = new JPanel();
        FlowLayout fl = new FlowLayout(FlowLayout.CENTER);
        windowContent.setLayout(fl);

        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(windowContent);
        frame.setSize(300,350);
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







        JButton add = new JButton("Добавить");
        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                database st = new database();
                st.setKod_Otdelenie(Kod_Otdelenie_field.getText());
                st.setName_Otdelenie(Name_Otdelenie_field.getText());
                new shange_Otdelenie().createOtdelenie(st);
            }
        });

        windowContent.add(add);
    }
}