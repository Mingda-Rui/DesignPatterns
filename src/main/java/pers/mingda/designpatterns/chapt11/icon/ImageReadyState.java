package pers.mingda.designpatterns.chapt11.icon;

import java.awt.Component;
import java.awt.Graphics;

public class ImageReadyState extends ImageState {

    public ImageReadyState(ImageProxyWithState imageProxy) {
        this.imageProxy = imageProxy;
    }

    @Override
    public int getIconWidth() {
        return imageProxy.getImageIcon().getIconWidth();
    }

    @Override 
    public int getIconHeight() {
        return imageProxy.getImageIcon().getIconHeight();
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        if (imageIconNotExist()) {
            imageProxy.setImageState(imageProxy.getImageLoadingState());
            imageProxy.paintIcon(c, g, x, y);
        } else 
            imageProxy.getImageIcon().paintIcon(c, g, x, y);
    }

    public boolean imageIconNotExist() {
        return imageProxy.getImageIcon() == null;
    }
}