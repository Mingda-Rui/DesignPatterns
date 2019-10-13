package pers.mingda.designpatterns.chapt12.mvc.view;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pers.mingda.designpatterns.chapt12.mvc.model.BeatModel;

// We extend the HttpServlet class
// so that we can do servlet kinds of
// things, like reveive HTTP requests.
public class DJView extends HttpServlet {

    // Here's the init method;
    // this is called when the
    // servlet is first created.
    public void init() throws ServletException {
        // We first create a BeatModel object...
        BeatModel beatModel = new BeatModel();
        beatModel.initialize();
        // ...and place a reference to
        // it in the servlet's context
        // sot that it's easily accessed.
        getServletContext().setAttribute("beatModel", beatModel);
    }

    // doPost method here

    // Here's the doGet() method. This is where the real work
    // happens. We've got its implementation on the next page.
    public void doGet(HttpServletRequest request, HttpServletResponse response) 
        throws IOException, ServletException{
            // implementation here
        }
}