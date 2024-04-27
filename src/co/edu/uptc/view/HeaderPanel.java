package co.edu.uptc.view;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HeaderPanel extends JPanel {

    private JLabel label;

    public HeaderPanel() {
        initPanel();
        createTittle();
        centerBySize();
    }

    private void initPanel() {
        this.setBackground(java.awt.Color.gray);
        this.setLayout(null);
        this.setPreferredSize(new Dimension(800, 100));
    }

    private void createTittle() {
        label = new JLabel("Universidad Pedagogica y Tecnologica de Colombia");
        label.setBounds(10, 10, 400, 30);
        this.add(label);
    }

    private void centerElement(JLabel text) {
        Font font = text.getFont();
        FontMetrics metrics = text.getGraphics().getFontMetrics(font);
        int width = metrics.stringWidth(text.getText());
        int height = metrics.getHeight();
        int x = (this.getSize().width / 2) - (width / 2);
        int y = (this.getSize().height / 2) - (height / 2) - text.getY();
        text.setLocation(x, y);
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
