package co.edu.uptc.view;

import java.awt.Image;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelRigth extends JPanel{

    private JLabel label;
    
    public PanelRigth(){
        initPanel();
        addImage();
        centerBySize();
    }

    private void initPanel() {
        this.setBackground(java.awt.Color.darkGray);
        this.setPreferredSize(new java.awt.Dimension(150, 0));
    }

    private void addImage() {
        ImageIcon icon = new ImageIcon("imagenes\\circulo.png");
        Image image = icon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        icon = new ImageIcon(image);
        label = new JLabel(icon);
        this.add(label);
    }

    private void centerElement(JLabel jLabel) {
        int x = (this.getSize().width / 2) - (jLabel.getWidth() / 2);
        int y = (this.getSize().height / 2) - (jLabel.getHeight() / 2);
        jLabel.setLocation(x, y);
    }

    private void centerBySize() {
        this.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                centerElement(label);
            }
        });
    }
}
