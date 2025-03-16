package Table;
//import com.sun.org.apache.xpath.internal.functions.FuncFalse;
import dao.Converter;
//import dao.shange_Aparat;
import dao.shange_Otdelenie;

import button.Otdelenie.create_button_Otdelenie;
import button.Otdelenie.delet_button_Otdelenie;
import button.Otdelenie.update_button_Otdelenie;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.sql.*;

public class Table_Otdelenie extends JFrame{
    public void Table_Otdelenie(JFrame frame) throws SQLException{
        //Создание окна
        //super("Апараты");
        //setDefaultCloseOperation(EXIT_ON_CLOSE);
        //Подключение к базе данных и получение результсета таблицы

        Connection con = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/postgres", "postgres", "1");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT \"Kod\", \"Name\"\n" +
                "\tFROM public.\"Otdelenie\";");
        //Создание таблицы и помещение в блок данных
        shange_Otdelenie sh = new shange_Otdelenie();
        JTable table = new  JTable(Converter.buildTableModel(rs));
        table.setColumnSelectionAllowed(false);
        table.setRowSelectionAllowed(true);
        table.getSelectionModel().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        Box contents = new Box(BoxLayout.X_AXIS);
        contents.add(new JScrollPane(table));




        //Создание кнопки и помещение в панель со всеми кнопками
        JButton insert = new JButton("Добавить запись");
        insert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JFrame frame = new JFrame("добавить отделение");
                create_button_Otdelenie b = new create_button_Otdelenie();
                b.show(frame);

            }
        });

        JButton change = new JButton("Изменить");
        change.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JFrame uframe = new JFrame("изменить отделение");
                update_button_Otdelenie ub = new update_button_Otdelenie();
                ub.show(uframe);
            }
        });

        JButton delet = new JButton("Удалить");
        delet.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JFrame dframe = new JFrame("удалить ");
                delet_button_Otdelenie db = new delet_button_Otdelenie();
                db.show(dframe);

            }
        });

        JButton recon = new JButton("recon");

        recon.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                //setVisible(false);
                contents.remove(new JScrollPane(table));
                //contents.setVisible(false);
                getContentPane().remove(contents);


                try {

                    Connection con = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/postgres", "postgres", "1");
                    Statement stmt = con.createStatement();
                    ResultSet rs = stmt.executeQuery("SELECT \"Kod\", \"Name\"\n" +
                            "\tFROM public.\"Otdelenie\";");
                    //Создание таблицы и помещение в блок данных
                    shange_Otdelenie sh = new shange_Otdelenie();
                    JTable table = new  JTable(Converter.buildTableModel(rs));
                    table.setColumnSelectionAllowed(false);
                    table.setRowSelectionAllowed(true);
                    table.getSelectionModel().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                    Box contents = new Box(BoxLayout.X_AXIS);
                    contents.add(new JScrollPane(table));
                    getContentPane().add(contents);



                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }



                setVisible(true);

            }
        });




        JPanel Buttons = new JPanel();
        Buttons.add(insert);
        Buttons.add(change);
        Buttons.add(delet);
        Buttons.add(recon);

        //Оформление окна(добавление в него блока с таблице и панели кнопок, задача размера)
        getContentPane().add(contents);
        getContentPane().add(Buttons, BorderLayout.NORTH);
        setSize(400,350);
        setVisible(true);


    }
    public static void main(String[] args) throws Exception {
        //Запуск конструктора класса, образующего окно
        new Table_Aparat();
    }
}
// добавтиь кнопку для повторнрого получения даных из таблици