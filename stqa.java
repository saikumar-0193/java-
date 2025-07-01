import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class stqa{
    public static void main(String[] args) {
        JFrame frame = new JFrame("ComboBox Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(null);

        String[] items = { "Item 1", "Item 2", "Item 3", "Item 4" };
        JComboBox<String> comboBox = new JComboBox<>(items);
        comboBox.setBounds(50, 30, 150, 25);
        frame.add(comboBox);

        JLabel resultLabel = new JLabel("Number of items: ");
        resultLabel.setBounds(50, 90, 200, 25);
        frame.add(resultLabel);

        JButton countButton = new JButton("Get Item Count");
        countButton.setBounds(50, 60, 150, 25);
        frame.add(countButton);

        countButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int count = comboBox.getItemCount();
                resultLabel.setText("Number of items: " + count);
            }
        });

        frame.setVisible(true);
    }
}
