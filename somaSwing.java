import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class somaSwing {
    private JButton btnSoma;
    private JPanel panel1;
    private JTextField txtN1;
    private JTextField txtN2;
    private JLabel lblResultado;

    public somaSwing() {
        btnSoma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n1 = Integer.parseInt(txtN1.getText());
                int n2 = Integer.parseInt(txtN2.getText());
                int s = n1 + n2;
                lblResultado.setText(Integer.toString(s));
            }
        });
    }
}
