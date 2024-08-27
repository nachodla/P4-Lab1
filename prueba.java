import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraSuma extends JFrame {
    private JTextField num1Field, num2Field, resultField;
    private JButton sumarButton;

    public CalculadoraSuma() {
        // Configuración de la ventana
        setTitle("Calculadora Suma");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Campo de texto para el primer número
        num1Field = new JTextField();
        num1Field.setBounds(50, 20, 80, 25);
        add(num1Field);

        // Campo de texto para el segundo número
        num2Field = new JTextField();
        num2Field.setBounds(150, 20, 80, 25);
        add(num2Field);

        // Botón para realizar la suma
        sumarButton = new JButton("suma");
        sumarButton.setBounds(100, 60, 80, 25);
        add(sumarButton);

        // Campo de texto para mostrar el resultado
        resultField = new JTextField();
        resultField.setBounds(100, 100, 80, 25);
        resultField.setEditable(false); // El campo no es editable
        add(resultField);

        // Añadir acción al botón de sumar
        sumarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtener los valores de los campos de texto
                String num1Text = num1Field.getText();
                String num2Text = num2Field.getText();
                try {
                    // Convertir los valores a números
                    double num1 = Double.parseDouble(num1Text);
                    double num2 = Double.parseDouble(num2Text);
                    // Sumar los números
                    double resultado = num1 + num2;
                    // Mostrar el resultado
                    resultField.setText(String.valueOf(resultado));
                } catch (NumberFormatException ex) {
                    // Si el usuario ingresa algo que no es un número
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese números válidos", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    public static void main(String[] args) {
        // Crear y mostrar la calculadora
        CalculadoraSuma calculadora = new CalculadoraSuma();
        calculadora.setVisible(true);
    }
}
