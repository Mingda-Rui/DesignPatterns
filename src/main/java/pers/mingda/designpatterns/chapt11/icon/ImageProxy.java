package pers.mingda.designpatterns.chapt11.icon;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.net.URL;
import java.awt.Component;
import java.awt.Graphics;

// The ImageProxy implements the Icon interface.
public class ImageProxy implements Icon {
    // The imageIcon is the REAL icon that we
    // eventually want ot display when it's loaded.
    ImageIcon imageIcon;
    URL imageURL;
    Thread retrievalThread;
    boolean retrieving = false;

    // We pass the URL of the image into
    // the constructor. This i sthe image 
    // we need to display once it's loaded!
    public ImageProxy(URL url) { imageURL = url; }

    public int getIconWidth() {
        if (imageIcon != null) {
            return imageIcon.getIconWidth();
        } else {
            // We return a default width and height
            // until the imageIcon is loaded; then we
            // turn it over to the imageIcon.
            return 800;
        }
    }

    public int getIconHeight() {
        if (imageIcon != null) {
            return imageIcon.getIconHeight();
        } else {
            return 600;
        }
    }

    public void paintIcon(final Component c, Graphics g, int x, int y) {
        if (imageIcon != null) {
            imageIcon.paintIcon(c, g, x, y);
        } else {
            g.drawString("Loading CD cover, please wait...", x+300, y+190);
            if (!retrieving) {
                retrieving = true;
                retrievalThread = new Thread(new Runnable() {
                    public void run() {
                        try {
                            imageIcon = new ImageIcon(imageURL, "CD Cover");
                            c.repaint();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });
                retrievalThread.start();
            }
        }
    }
}