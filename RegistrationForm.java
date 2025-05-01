import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RegistrationForm extends JFrame implements ActionListener {
    private JTextField nameField, emailField;
    private JPasswordField passwordField, confirmPasswordField;
    private JLabel nameError, emailError, passwordError, confirmPasswordError, statusLabel;
    private JButton registerButton;

    public RegistrationForm() {
        setTitle("Registration Form");
        setSize(400, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(6, 3, 5, 5));

        // Labels and Inputs
        add(new JLabel("Name:"));
        nameField = new JTextField();
        add(nameField);
        nameError = new JLabel();
        nameError.setForeground(Color.RED);
        add(nameError);

        add(new JLabel("Email:"));
        emailField = new JTextField();
        add(emailField);
        emailError = new JLabel();
        emailError.setForeground(Color.RED);
        add(emailError);

        add(new JLabel("Password:"));
        passwordField = new JPasswordField();
        add(passwordField);
        passwordError = new JLabel();
        passwordError.setForeground(Color.RED);
        add(passwordError);

        add(new JLabel("Confirm Password:"));
        confirmPasswordField = new JPasswordField();
        add(confirmPasswordField);
        confirmPasswordError = new JLabel();
        confirmPasswordError.setForeground(Color.RED);
        add(confirmPasswordError);

        registerButton = new JButton("Register");
        registerButton.addActionListener(this);
        add(new JLabel()); // filler
        add(registerButton);
        statusLabel = new JLabel();
        statusLabel.setForeground(new Color(0, 128, 0));
        add(statusLabel);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        // Reset error messages
        nameError.setText("");
        emailError.setText("");
        passwordError.setText("");
        confirmPasswordError.setText("");
        statusLabel.setText("");

        String name = nameField.getText().trim();
        String email = emailField.getText().trim();
        String password = new String(passwordField.getPassword());
        String confirmPassword = new String(confirmPasswordField.getPassword());

        boolean isValid = true;

        if (name.isEmpty()) {
            nameError.setText("Name is required");
            isValid = false;
        }

        if (email.isEmpty()) {
            emailError.setText("Email is required");
            isValid = false;
        } else if (!email.contains("@")) {
            emailError.setText("Invalid email");
            isValid = false;
        }

        if (password.isEmpty()) {
            passwordError.setText("Password is required");
            isValid = false;
        }

        if (confirmPassword.isEmpty()) {
            confirmPasswordError.setText("Confirm password");
            isValid = false;
        } else if (!password.equals(confirmPassword)) {
            confirmPasswordError.setText("Passwords do not match");
            isValid = false;
        }

        if (isValid) {
            statusLabel.setText("Registration successful!");
        }
    }

    public static void main(String[] args) {
        new RegistrationForm();
    }
}

