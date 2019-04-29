package pers.mingda.designpatterns.chapt8;

import java.awt.Graphics;
import javax.swing.JFrame;

// We're extending JFrame, which contains
// a methods update() that controls the
// algorithm for updating the screen.
// We can hook into that algorithm by
// overriding the paint() hook method.
public class MyFrame extends JFrame {

    // Don't look behind the 
    // curtain! Just some
    // initialization here...
    public MyFrame(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(300, 300);
        this.setVisible(true);
    }

    // JFame's update algorithm calls paint(). By
    // default, paint() does nothing... it's a hook.
    // We're overriding paint(), and telling the 
    // JFrame to draw a message in the window.
    public void paint(Graphics graphics) {
        super.paint(graphics);
        String msg = "I rule!!";
        graphics.drawString(msg, 100, 100);
    }
}