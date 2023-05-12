package com.company;
import javax.swing.*;
import java.awt.*;

public class MyFrame extends JPanel {
        JFrame frame = new JFrame("Split Images");
        JPanel panel = new JPanel();
        JLabel title = new JLabel("Split Images");
        JPanel textPanel = new JPanel();
        JPanel textFieldPanel = new JPanel();
        JTextField heightOfBox = new JTextField();
        JTextField widthOfBox = new JTextField();
    public void setFrame() {
        frame.setLayout(null);
        frame.setSize(500, 500);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    public void setPanel() {
        panel.setLayout(new BorderLayout());
        panel.setBackground(Color.darkGray);
        panel.setSize(500, 500);
        panel.setVisible(true);
        frame.add(panel);
    }
    public void createDisplay() {

        //set up the title panel
        textPanel.setLayout(new GridBagLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        textPanel.setSize(500, 40);
        textPanel.setVisible(true);
        textPanel.setBackground(Color.red);

        title.setText("Sprite Splitter");
        title.setSize(150, 20);
        title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 24));
        textPanel.add(title);
        panel.add(textPanel, BorderLayout.NORTH);

        //set up the text field panel
        textFieldPanel.setLayout(new BoxLayout(textFieldPanel, BoxLayout.Y_AXIS));
        textFieldPanel.setBackground(Color.blue);
        textFieldPanel.setSize(250, 250);
        textFieldPanel.setVisible(true);

        panel.add(textFieldPanel, BorderLayout.CENTER);
        heightOfBox.setSize(50, 50);
        Dimension dim = new Dimension(100, 50);
        textFieldPanel.add(Box.createRigidArea(new Dimension(0,25)));
        heightOfBox.setMaximumSize(dim);
        widthOfBox.setSize(50, 50);
        textFieldPanel.add(heightOfBox);
        widthOfBox.setMaximumSize(dim);
        textFieldPanel.add(Box.createRigidArea(new Dimension(0,25)));
        textFieldPanel.add(widthOfBox);


    }
    public void algorithm() {

    }
}
