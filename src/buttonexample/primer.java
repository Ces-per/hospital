/*package buttonexample;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class primer extends JFrame {
    public primer() {
        setTitle("Главное окно");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JButton openButton = new JButton("Открыть форму");
        openButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Создаем и показываем новое окно
                Table.Table newForm = new Table.Table();
                newForm.setVisible(true);
            }
        });

        add(openButton);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            primer mainFrame = new primer();
            mainFrame.setVisible(true);
        });
    }
}

class NewForm extends JFrame {
    public NewForm() {
        setTitle("Новая форма");
        setSize(200, 150);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel label = new JLabel("Это новая форма");
        add(label);
    }
}
*/