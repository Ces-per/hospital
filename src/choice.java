//import com.sun.org.apache.xpath.internal.functions.FuncFalse;
import Table.Table_Aparat;
import Table.Table_Zapchasti;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.sql.*;

public class choice extends JFrame{
    public choice() throws SQLException{
        //Создание окна
        super("Запчясти");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //Подключение к базе данных и получение результсета таблицы


        Box contents = new Box(BoxLayout.X_AXIS);





        //Создание кнопки и помещение в панель со всеми кнопками

        JButton Aparat = new JButton("Апараты");
        Aparat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JFrame frame = new JFrame("Апараты");
                Table_Aparat b = new Table_Aparat();
                try {
                    b.Table_Aparat(frame);
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }

            }
        });

        JButton Zapchasti = new JButton("Запчясти");
        Zapchasti.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JFrame frame = new JFrame("Запчясти");
                Table_Zapchasti b = new Table_Zapchasti();
                try {
                    b.Table_Zapchasti(frame);
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }

            }
        });






        JPanel Buttons = new JPanel();
        Buttons.add(Zapchasti);
        Buttons.add(Aparat);

        //Оформление окна(добавление в него блока с таблице и панели кнопок, задача размера)
        getContentPane().add(contents);
        getContentPane().add(Buttons/*, BorderLayout.CENTER*/);
        setSize(800,400);
        setVisible(true);


    }
    public static void main(String[] args) throws Exception {
        //Запуск конструктора класса, образующего окно
        new choice();
    }
}
// добавтиь кнопку для повторнрого получения даных из таблици