/**
 * Тестовый класс создания диалоговых окон
 */
import javax.swing.*;
import java.awt.event.*;

public class q extends JFrame
{
    private static final long serialVersionUID = 1L;
    public q() {
        super("DialogWindows");
        // Выход из программы при закрытии
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // Кнопки для создания диалоговых окон
        JButton button1 = new JButton("Немодальное окно");
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

               /* Box contents = new Box(BoxLayout.X_AXIS);
                Table.Table t = new Table.Table();
                t.show(contents);*/

            }
        });
        JButton button2 = new JButton("Модальное окно");
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JDialog dialog = createDialog("Модальное", true);
                dialog.setVisible(true);
            }
        });




        //Создание кнопки и помещение в панель со всеми кнопками
        JButton insert = new JButton("Добавить запись");
        insert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JFrame frame = new JFrame("табличка ученики");
                button b = new button();
                b.show(frame);

            }
        });




        // Создание панели содержимого с размещением кнопок
        JPanel contents = new JPanel();
        contents.add(button1);
        contents.add(button2);
        contents.add(insert);
        setContentPane(contents);
        // Определение размера и открытие окна
        setSize(350, 100);
        setVisible(true);
    }
    /** Функция создания диалогового окна.
     * @param title - заголовок окна
     * @param modal - флаг модальности
     */
    private JDialog createDialog(String title, boolean modal)
    {
        JDialog dialog = new JDialog(this, title, modal);
        dialog.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        dialog.setSize(180, 90);
        return dialog;
    }

    public static void main(String[] args)
    {
        new q();
    }
}