package example;

import javax.swing.*;

public class ValidationExample {

    public static void main(String[] args) {

    	/* Creates a window titled Validation. */
        JFrame frame = new JFrame("Validation");

        /* JTextField allows the user to enter a name. */
        JTextField nameField = new JTextField(15);
        /* JButton triggers the validation. */
        JButton submit = new JButton("Submit");

        submit.addActionListener(e -> {

            if(nameField.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(frame,
                        "Name cannot be empty");
            } else {
                JOptionPane.showMessageDialog(frame,
                        "Form Submitted Successfully");
            }
        });

        frame.setLayout(new java.awt.FlowLayout());

        frame.add(new JLabel("Name:"));
        frame.add(nameField);
        frame.add(submit);

        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
