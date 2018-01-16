package reference;

import reference.comparator.FilmComparator;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

import java.util.*;

public class Reference {

    private RatingRegister ratingRegister;
    private FilmComparator filmComparator;
    private Film film;

    public Reference(RatingRegister ratingRegister) {
        this.ratingRegister = ratingRegister;
    }

    public Film recommendFilm(Person person) {

        // If person has not watched any movies yet, we return the best rated movie overall.
        if (ratingRegister.getPersonalRatings(person) == null) {
            List<Film> filmList = new ArrayList<Film>(ratingRegister.filmRatings().keySet());
            Collections.sort(filmList, new FilmComparator(ratingRegister.filmRatings()));
            return filmList.get(0);

            // If person has watched all the movies we return null.
        } else if (ratingRegister.getPersonalRatings(person).size() == ratingRegister.filmRatings().keySet().size()) {
            return null;

        } else {
            // We check for similarity match with other persons, and return a movie someone with similar taste has rated well.
            // PLACEHOLDER CODE, need to code in 46.8 /////////////////
            List<Film> filmList = new ArrayList<Film>(ratingRegister.filmRatings().keySet());
            Collections.sort(filmList, new FilmComparator(ratingRegister.filmRatings()));
            return filmList.get(0);
            ///////////////////////////////////////////////////////////
        }
    }


}
