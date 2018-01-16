package personnel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {

    ArrayList<Person> personArrayList = new ArrayList<Person>();


    public void add(Person person) {
        this.personArrayList.add(person);
    }

    public void add(List<Person> persons) {
        this.personArrayList.addAll(persons);
    }

    public void print() {
        Iterator<Person> iter = personArrayList.iterator();

        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

    public void print(Education education) {
        Iterator<Person> iter = personArrayList.iterator();

        while (iter.hasNext()) {
            Person p = iter.next();
            if (p.getEducation() == education)
            System.out.println(p);
        }
    }

    public void fire(Education education) {
        Iterator<Person> iter = personArrayList.iterator();

        while (iter.hasNext()) {
            //Person p = iter.next();

            if (iter.next().getEducation() == education)
                iter.remove();
        }
    }
}
