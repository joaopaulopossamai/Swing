import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloSwing extends JFrame{
    private JButton buttonMensagem;
    public JPanel panelPrincipal;
    private JTextField textMensagem;
    private JRadioButton radioButton1;

    public HelloSwing() {
    buttonMensagem.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(buttonMensagem,
                    textMensagem.getText());
        }
    });
}
}
