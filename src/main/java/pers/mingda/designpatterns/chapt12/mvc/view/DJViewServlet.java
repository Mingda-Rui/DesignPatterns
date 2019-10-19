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
            // First we grab the model from
            // the servlet context. We can't 
            // manipulate the model without a
            // reference to it.
            BeatModel beatModel = (BeatModel) getServletContext().getAttribute("beatModel");

            // Next we grab all the HTTP
            // commands/parameters
            String bpm = request.getParameter("bpm");
            if (bpm == null) {
                bpm = beatModel.getBPM() + "";
            }

            // If we get a set command, then
            // we get the value of the set,
            // and tell the model.
            String set = request.getParameter("set");
            if (set != null) {
                int bpmNumber = 90;
                bpmNumber = Integer.parseInt(bpm);
                beatModel.setBPM(bpmNumber);
            }

            // To increase or decrease, we get the
            // current BPMs from the model, and 
            // agjust up or down by one.
            String decrease = request.getParameter("decrease");
            if (decrease != null) {
                beatModel.setBPM(beatModel.getBPM() - 1);
            }

            String increase = request.getParameter("increase");
            if (increase != null) {
                beatModel.setBPM(beatModel.getBPM() + 1);
            }

            // If we get an on or off command, we 
            // tell the model to start or stop.
            String on = request.getParameter("on");
            if (on != null) {
                beatModel.start();
            }

            String off = request.getParameter("off");
            if (off != null) {
                beatModel.stop();
            }

            // Finally, our job as a controller
            // is done. All we need to do is 
            // ask the view to take over and 
            // create an HTML view.

            // Following the Model 2 definition, 
            // we pass the JSP a bean with the 
            // model state in it. In this case, we 
            // pass it the actual model, since it
            // happens to be a bean.
            request.setAttribute("beatModel", beatModel);

            RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/DJView.jsp");
            dispatcher.forward(request, response);
        
        }
}