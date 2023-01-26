package factory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FactoryFrame extends JFrame implements ActionListener {
    public JPanel mainPanel = new JPanel(new BorderLayout());
    public JPanel gridContent= new JPanel(new GridLayout(4,1,15,5));
    public JButton exit=new JButton("Exit");
    public JButton easy=new JButton("Easy");
    public JButton normal=new JButton("Normal");
    public JLabel text=new JLabel("Select Difficulty");
    public void gamemode(){
        this.setSize(150,150);
        this.setTitle("Welcome");
        easy.addActionListener(this);
        normal.addActionListener(this);
        exit.addActionListener(this);
        gridContent.add(text);
        gridContent.add(easy);
        gridContent.add(normal);
        gridContent.add(exit);
        mainPanel.add(gridContent);
        this.add(mainPanel);
        pack();
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Easy")){
            System.out.println("easy is pressed");
            DiffFactory frame=new DiffFactory();
            frame.getDiff("Easy").draw();
            this.dispose();
        }else if(e.getActionCommand().equals("Normal")){
            System.out.println("normal is pressed");
            DiffFactory frame=new DiffFactory();
            frame.getDiff("Normal").draw();
            this.dispose();
        }
        else{
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.dispose();
        }
    }
}
