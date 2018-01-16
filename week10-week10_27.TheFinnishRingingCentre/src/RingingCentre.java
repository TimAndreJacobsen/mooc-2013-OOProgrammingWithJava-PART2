import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RingingCentre {

    private Map<Bird, List<String>> birdList = new HashMap<Bird,List<String>>();



    public void observe(Bird bird, String place) {

        if (birdList.get(bird) == null) {
            birdList.put(bird, new ArrayList<String>());
            birdList.get(bird).add(place);
        } else {
            birdList.get(bird).add(place);

        }
    }



    public void observations(Bird bird) {

        if (birdList.get(bird) == null) {
            System.out.println(bird.toString() + " observations: 0");
            return;
        }

        List<String> places = birdList.get(bird);
        System.out.println(bird.toString() + " observations: " + places.size());

        for (String s : places) {
            if (s != null) {
                System.out.println(s);
            }
        }
    }



}
