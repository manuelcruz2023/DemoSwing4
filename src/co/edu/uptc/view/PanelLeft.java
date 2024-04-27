package co.edu.uptc.view;

import javax.swing.JPanel;

public class PanelLeft extends JPanel{
    
    public PanelLeft(){
        initPanel();
    }

    private void initPanel() {
        this.setBackground(java.awt.Color.darkGray);
        this.setPreferredSize(new java.awt.Dimension(150, 0));
    }
}
