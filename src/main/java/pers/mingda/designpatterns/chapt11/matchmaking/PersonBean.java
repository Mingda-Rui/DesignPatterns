package pers.mingda.designpatterns.chapt11.matchmaking;

// This is the interface; we'll
// get to the implmementation
// in just a sec...
public interface PersonBean {

    // Here we can get information
    // about the person's name, 
    // gender, interests and 
    // HotOrNot rating (1-10)
    String getName();
    String getGender();
    String getInterests();
    int getHotOrNotRating();

    // We can also set the same
    // information through the 
    // respective method calls.
    void setName(String name);
    void setGender(String gender);
    void setInterests(String interests);
    // setHotOrNotRating() takes
    // an integer and adds it to the
    // running average for this person.
    void setHotOrNotRating(int rating);
}