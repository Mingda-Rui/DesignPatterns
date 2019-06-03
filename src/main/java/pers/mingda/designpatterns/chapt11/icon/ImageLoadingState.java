package pers.mingda.designpatterns.chapt11.icon;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

import javax.swing.ImageIcon;

public class ImageLoadingState extends ImageState {

    public ImageLoadingState(ImageProxyWithState imageProxy) {
        this.imageProxy = imageProxy;
    }

    @Override
    public int getIconWidth() {
        return 800;
    }

    @Override
    public int getIconHeight() {
        return 600;
    }

	@Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
		g.drawString("Loading CD cover, please wait...", x+300, y+190);
        Thread retrievalThread = new Thread(new Runnable() {
            public void run() {
                try {
                    URL imageURL = imageProxy.getImageURL();
                    ImageIcon imageIcon = new ImageIcon(imageURL, "CD Cover");
                    imageProxy.setImageIcon(imageIcon);
                    c.repaint();
                    imageProxy.setImageState(imageProxy.getImageReadyState());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        retrievalThread.start();
    }
}