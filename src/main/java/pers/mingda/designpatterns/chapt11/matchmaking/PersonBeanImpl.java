package pers.mingda.designpatterns.chapt11.matchmaking;

// The PersonBeanImpl implements the PersonBean interface
public class PersonBeanImpl implements PersonBean {
    // The instance variables.
    String name;
    String gender;
    String interests;
    int rating;
    int ratingCount = 0;

    // All the getter methods; they each return
    // the appropriate instance variable...
    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getInterests() {
        return interests;
    }

    // ...except for getHotOrNotRating(), which
    // computes the average of the ratings 
    // by dividing the ratings by ratingCount.
    public int getHotOrNotRating() {
        if (ratingCount == 0) return 0;
        return (rating/ratingCount);
    }

    // And here's all the setter 
    // methods, which set the
    // corresponding instance variable.
    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setInterests(String interests) {
        this.interests = interests;
    }

    // Finally, the setHotOrNotRating() 
    // method increments the total
    // ratingCount and adds the 
    // rating to the running total.
    public void setHotOrNotRating(int rating) {
        this.rating += rating;
        ratingCount++;
    }
}