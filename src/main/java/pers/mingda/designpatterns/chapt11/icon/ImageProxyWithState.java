package pers.mingda.designpatterns.chapt11.icon;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.net.URL;
import java.awt.Component;
import java.awt.Graphics;

// The ImageProxy implements the Icon interface.
public class ImageProxyWithState implements Icon {
    // The imageIcon is the REAL icon that we
    // eventually want ot display when it's loaded.
    ImageIcon imageIcon;
    URL imageURL;
    Thread retrievalThread;
    boolean retrieving = false;
    ImageState imageReadyState;
    ImageState imageLoaingState;
    ImageState currentState;

    public ImageProxyWithState(URL url) { 
        imageURL = url;
        this.imageLoaingState = new ImageLoadingState(this);
        this.imageReadyState = new ImageReadyState(this);
        currentState = imageIcon != null ? imageReadyState : imageReadyState;
    }

    public ImageIcon getImageIcon() {
        return this.imageIcon;
    }

    public URL getImageURL() {
        return imageURL;
    }

    public int getIconWidth() {
        return currentState.getIconWidth();
    }

    public int getIconHeight() {
        return currentState.getIconHeight();
    }

    public ImageState getImageReadyState() {
        return this.imageReadyState;
    }

    public ImageState getImageLoadingState() {
        return this.imageLoaingState;    
    }

    public void paintIcon(final Component c, Graphics g, int x, int y) {
        currentState.paintIcon(c, g, x, y);
    }

    public void setImageState(ImageState newImageState) {
        currentState = newImageState;
    }

    public void setImageIcon(ImageIcon imageIcon) {
        this.imageIcon = imageIcon;
    }
}