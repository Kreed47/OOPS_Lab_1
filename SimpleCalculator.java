import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator extends JFrame implements ActionListener {
    private JTextField display;
    private StringBuilder currentInput = new StringBuilder();
    private double result = 0;
    private String operator = "";
    private boolean isOperatorClicked = false;

    public SimpleCalculator() {
        setTitle("Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        display = new JTextField();
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.PLAIN, 24));
        add(display, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel(new GridLayout(4, 4, 5, 5));
        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", "C", "=", "+"
        };

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.BOLD, 20));
            button.addActionListener(this);
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.CENTER);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String input = e.getActionCommand();

        if ("0123456789".contains(input)) {
            if (isOperatorClicked) {
                currentInput.setLength(0);
                isOperatorClicked = false;
            }
            currentInput.append(input);
            display.setText(currentInput.toString());
        } else if ("+-*/".contains(input)) {
            compute();
            operator = input;
            isOperatorClicked = true;
        } else if ("=".equals(input)) {
            compute();
            display.setText(String.valueOf(result));
            operator = "";
            currentInput.setLength(0);
            currentInput.append(result);
        } else if ("C".equals(input)) {
            result = 0;
            currentInput.setLength(0);
            operator = "";
            display.setText("");
        }
    }

    private void compute() {
        double inputValue = currentInput.length() > 0 ? Double.parseDouble(currentInput.toString()) : 0;

        switch (operator) {
            case "+": result += inputValue; break;
            case "-": result -= inputValue; break;
            case "*": result *= inputValue; break;
            case "/": result /= inputValue; break;
            default: result = inputValue;
        }
    }

    public static void main(String[] args) {
        new SimpleCalculator();
    }
}

