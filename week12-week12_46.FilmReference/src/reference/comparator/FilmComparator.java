package reference.comparator;

import reference.domain.Film;
import reference.domain.Rating;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class FilmComparator implements Comparator<Film> {

    Map<Film,List<Rating>> ratings;

    public FilmComparator(Map<Film, List<Rating>> ratings) {
        this.ratings = ratings;
    }



    @Override
    public int compare(Film o1, Film o2) {
        List<Rating> o1List = ratings.get(o1);
        List<Rating> o2List = ratings.get(o2);

        double o1Avg = getAverage(o1List);
        double o2Avg = getAverage(o2List);

        if (o1Avg > o2Avg) {
            return -1;
        } else if (o2Avg > o1Avg) {
            return 1;
        } else {
            return 0;
        }
    }

    private double getAverage(List<Rating> list) {
        int sum = 0;

        for (Rating rating : list) {
            sum += rating.getValue();
        }

        return (double) sum / list.size();
    }
}
