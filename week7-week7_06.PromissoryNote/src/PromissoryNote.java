import java.util.HashMap;

public class PromissoryNote {

    private HashMap<String, Double> hashmap = new HashMap();


    public PromissoryNote() {
    }

    public void setLoan(String toWhom, double value) {
        hashmap.put(toWhom, value);
    }

    public double howMuchIsTheDebt(String whose) {
        if (hashmap.get(whose) == null){
            return 0;
        }
        return hashmap.get(whose);
    }


}
