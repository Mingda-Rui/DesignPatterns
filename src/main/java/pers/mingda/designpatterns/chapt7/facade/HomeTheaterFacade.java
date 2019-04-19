package pers.mingda.designpatterns.chapt7.facade;

public class HomeTheaterFacade {
    // Here's the composition; these
    // are all the components of the 
    // subsystem we are going to use.
    Amplifier amp;
    Tuner tuner;
    DvdPlayer dvd;
    CdPlayer cd;
    Projector projector;
    TheaterLights lights;
    Screen screen;
    PopcornPopper popper;

    public HomeTheaterFacade(Amplifier amp, 
                Tuner tuner, 
                DvdPlayer dvd,
                CdPlayer cd,
                Projector projector,
                Screen screen,
                TheaterLights lights,
                PopcornPopper popper) {
        this.amp = amp;
        this.tuner = tuner;
        this.dvd = dvd;
        this.cd = cd;
        this.projector = projector;
        this.screen = screen;
        this.lights = lights;
        this.popper = popper;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        popper.on();
        popper.pop();
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setDvd(dvd);
        amp.setSurroundSound();
        amp.setVolume(5);
        dvd.on();
        dvd.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        popper.off();
        lights.on();
        screen.up();
        projector.off();
        amp.off();
        dvd.stop();
        dvd.off();
    }
}

class Amplifier {
    public void on() {}
    public void off() {}
    public void setDvd(DvdPlayer dvd) {}
    public void setSurroundSound() {}
    public void setVolume(int v) {}
}
class Tuner {}
class DvdPlayer {
    public void on() {}
    public void stop() {}
    public void play(String movie) {}
    public void off() {}
}
class CdPlayer {}
class Projector {
    public void on() {}
    public void off() {}
    public void wideScreenMode() {}
}
class Screen {
    public void up() {}
    public void down() {}
}
class TheaterLights {
    public void on() {}
    public void dim(int i) {}
}
class PopcornPopper {
    public void on() {}
    public void off() {}
    public void pop() {}
}
