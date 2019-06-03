package pers.mingda.designpatterns.chapt11.icon;

import java.awt.Component;
import java.awt.Graphics;

public abstract class ImageState {
    ImageProxyWithState imageProxy;
    abstract int getIconWidth();
    abstract int getIconHeight();
    abstract void paintIcon(final Component c, Graphics g, int x, int y);
}