import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame{
    private Container cp ;
    private JLabel lb = new JLabel();
    private JButton jb = new JButton("Change");
    private TextField tf = new TextField();



    Frame(){
        init();
    }

    public void init() {


        this.setBounds(100, 100, 500, 500);
        cp = this.getContentPane();
        lb.setBounds(100, 0, 100, 100);
        jb.setBounds(200, 0, 100, 100);
        tf.setBounds(300, 0, 100, 100);

        cp.add(lb);
        cp.add(jb);
        cp.add(tf);

        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double d1 = Double.parseDouble(tf.getText());
                    double d2 = d1 * 0.6;
                    lb.setText(Double.toString(d2));
                } catch (NumberFormatException e1) {
                    JOptionPane.showMessageDialog(Frame.this, "error");
                }
            }
        });


    }
}
