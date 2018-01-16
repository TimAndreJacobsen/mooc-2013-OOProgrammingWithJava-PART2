package reader.criteria;

public class Both implements Criterion {

    private Criterion criterionOne;
    private Criterion criterionTwo;

    public Both(Criterion criterionOne, Criterion criterionTwo) {
        this.criterionOne = criterionOne;
        this.criterionTwo = criterionTwo;
    }

    @Override
    public boolean complies(String line) {
        if (criterionOne.complies(line) && criterionTwo.complies(line)) {
            return true;
        }
        return false;
    }
}
