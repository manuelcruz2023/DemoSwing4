package co.edu.uptc.view;

import java.awt.Dimension;

import javax.swing.JPanel;

public class FooterPanel extends JPanel{
    
    public FooterPanel(){
        initPanel();
    }

    private void initPanel() {
        this.setBackground(java.awt.Color.gray);
        this.setPreferredSize(new Dimension(800, 100));
    }
}
