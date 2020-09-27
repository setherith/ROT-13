package net.cadmuslabs.ui;

import net.cadmuslabs.core.Encoder;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EncoderUI extends JFrame {

    public static void main(String[] args) {
        new EncoderUI();
    }

    public EncoderUI() {
        setTitle("ROT-13 Encoder v1.0");
        setSize(400, 145);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel lblInput = new JLabel("Input:");
        lblInput.setBounds(10, 10, 75, 25);

        JTextField txtInput = new JTextField();
        txtInput.setBounds(75, 10, 315, 25);

        JLabel lblOutput = new JLabel("Output:");
        lblOutput.setBounds(10, 40, 75, 25);

        JTextField txtResult = new JTextField();
        txtResult.setBounds(75, 40, 315, 25);

        JButton btnExit = new JButton("Exit");
        btnExit.setBounds(10, 70, 100, 25);
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        JButton btnEncode = new JButton("Encode");
        btnEncode.setBounds(287, 70, 100, 25);
        btnEncode.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String encodedMessage = Encoder.Encode(txtInput.getText());
                txtResult.setText(encodedMessage);
            }
        });


        add(lblInput);
        add(txtInput);
        add(lblOutput);
        add(txtResult);
        add(btnExit);
        add(btnEncode);

        setVisible(true);
    }

}
