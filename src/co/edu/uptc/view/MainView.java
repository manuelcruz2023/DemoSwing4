package co.edu.uptc.view;

import javax.swing.JFrame;

public class MainView extends JFrame{
    
    public MainView(){
        initFrame();
        initPanel();
    }

    private void initFrame() {
        this.setTitle("Gestor de Estudiantes");
        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    private void initPanel() {
        this.add(new HeaderPanel(), java.awt.BorderLayout.NORTH);
        this.add(new PanelLeft(), java.awt.BorderLayout.WEST);
        this.add(new PanelCenter(), java.awt.BorderLayout.CENTER);
        this.add(new FooterPanel(), java.awt.BorderLayout.SOUTH);
        this.add(new PanelRigth(), java.awt.BorderLayout.EAST);
    }
}
