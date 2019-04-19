package pers.mingda.designpatterns.chapt7.facade;

public class HomeTheaterTestDrive {
    public static void main(String[] args) {
        // instantiate components here

        // Here we're creating the components
        // right in the test drive. Normally the 
        // client is given a facade, it doesn't hava
        // to construct one itself.

        HomeTheaterFacade homeTheater = 
            new HomeTheaterFacade(
                new Amplifier(), 
                new Tuner(),
                new DvdPlayer(),
                new CdPlayer(),
                new Projector(),
                new Screen(),
                new TheaterLights(),
                new PopcornPopper()
            );
        homeTheater.watchMovie("Raiders of the Lost Ark");
        homeTheater.endMovie();
    }
}