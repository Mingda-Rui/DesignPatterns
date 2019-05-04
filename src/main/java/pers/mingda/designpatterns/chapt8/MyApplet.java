package pers.mingda.designpatterns.chapt8;

import java.applet.Applet;
import java.awt.Graphics;

public class MyApplet extends Applet {
    private static final long serialVersionUID = 1L;
    String message;

    // The init hook allows the applet to do whatever
    // it wants to initialize the applet the first time.
    public void init() {
        message = "Hello World, I'm alive!";
        // repaint() is a concrete method in the Applet
        // class that lets upper-level components know
        // the applet needs to be redrawn.
        repaint();
    }

    // The start hook allows the applet to do
    // something when the applet is just about
    // to be displayed on the web page.
    public void start() {
        message = "Now I'm starting up...";
        repaint();
    }

    // And the destroy nook is neds when the applet
    // is goint to be destroyed, say, when the browser
    // pane is closed. We could try to display 
    // somthing there, but what would be the point?
    public void destroy() {
        // applet is going away...
    }

    // Well looky here! Our old friend the 
    // paint() method! Applet also makes
    // use of this method as a hook.
    public void paint(Graphics g) {
        g.drawString(message, 5, 15);
    }

}