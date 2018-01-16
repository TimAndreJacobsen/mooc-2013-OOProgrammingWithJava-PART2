package reader.criteria;

import java.util.List;

public class AtLeastOne implements Criterion {

    private Criterion[] criteria;

    public AtLeastOne(Criterion... criterion) {
        this.criteria = criterion;
    }

    @Override
    public boolean complies(String line) {

        for (Criterion crit : criteria) {
            if (crit.complies(line)) {
                return true;
            }
        }
        return false;
    }
}
