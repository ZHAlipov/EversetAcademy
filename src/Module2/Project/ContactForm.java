package Module2.Project;

import javax.swing.*;
import java.awt.*;

public class ContactForm extends JFrame {

    public ContactForm() {
        super("Контактная форма");
        super.setBounds(200, 100, 600, 230);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = super.getContentPane();
        container.setLayout(new GridLayout( 4, 2, 2, 10));

        JLabel hello = new JLabel("Добро пожаловать в Библиотеку");
        JLabel hello1 = new JLabel("");

        JLabel name = new JLabel("Введите имя:");
        JTextField name_field = new JTextField("", 1);

        JLabel password = new JLabel("Введите пароль:");
        JTextField password_field = new JTextField("", 1);

        container.add(hello);
        container.add(hello1);
        container.add(name);
        container.add(name_field);
        container.add(password);
        container.add(password_field);

        JButton send_button = new JButton("Ввод");
        container.add(send_button);

        //send_button.addActionListener(new ButtonEventManager());

    }
}
