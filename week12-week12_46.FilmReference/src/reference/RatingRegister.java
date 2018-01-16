package reference;

import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RatingRegister {

    private Film film;
    private Rating rating;

    private Map<Film, List<Rating>> filmToRatings;
    private List<Rating> ratings;

    private Map<Person, Map<Film,Rating>> personToMap;
    private Map<Film, Rating> personsFilmToRatingMap;


    public RatingRegister() {
        this.filmToRatings = new HashMap<Film, List<Rating>>();
        this.personToMap = new HashMap<Person, Map<Film, Rating>>();
    }

    public void addRating(Film film, Rating rating) {

        if (filmToRatings.get(film) == null) {
            filmToRatings.put(film, new ArrayList<Rating>());
            filmToRatings.get(film).add(rating);

        } else {
            filmToRatings.get(film).add(rating);
        }
    }

    public List<Rating> getRatings(Film film) {
        List<Rating> ratings = new ArrayList<Rating>();
        ratings = filmToRatings.get(film);
        return ratings;
    }

    public Map<Film, List<Rating>> filmRatings() {
        Map<Film, List<Rating>> map = new HashMap<Film, List<Rating>>();
        map = filmToRatings;
        return map;
    }

    public void addRating(Person person, Film film, Rating rating) {

        if (personToMap.get(person) == null) {
            personToMap.put(person, new HashMap<Film, Rating>());
            personToMap.get(person).put(film, rating);
            addRating(film,rating);
        } else {

            if (personToMap.get(person).get(film) == null) {
                personToMap.get(person).put(film, rating);
                addRating(film,rating);
            }
        }
    }

    public Rating getRating(Person person, Film film) {

        if (personToMap.get(person).get(film) == null) {
            return Rating.NOT_WATCHED;
        } else {
            return personToMap.get(person).get(film);
        }
    }

    public Map<Film, Rating> getPersonalRatings(Person person) {

        if (personToMap.get(person) == null) {
            return new HashMap();
        }

        Map<Film, Rating> map = new HashMap<Film, Rating>();
        map = personToMap.get(person);
        return map;
    }

    public List<Person> reviewers() {
        List<Person> reviewers = new ArrayList<Person>(personToMap.keySet());
        return reviewers;
    }

}
