package containers;

import java.util.ArrayList;
import java.util.List;

public class ContainerHistory {

    private ArrayList<Double> containerHistory = new ArrayList<Double>();


    public void add(double situation) {
        containerHistory.add(situation);
    }

    public void reset() {
        containerHistory.clear();
    }

    @Override
    public String toString() {
        return this.containerHistory.toString();
    }

    public double maxValue() {

        if (this.containerHistory.size() <= 0) {
            return 0;

        } else {
            double max = 0;

            for (Double aDouble : this.containerHistory) {
                if (max < aDouble) {
                    max = aDouble;
                }
            }
            return max;
        }
    }

    public double minValue() {

        if (this.containerHistory.size() <= 0) {
            return 0;

        } else {
            double min = this.containerHistory.get(0);

            for (Double aDouble : this.containerHistory) {
                if (min > aDouble) {
                    min = aDouble;
                }
            }
            return min;
        }
    }

    public double average() {

        if (this.containerHistory.size() <= 0) {
            return 0;

        } else {
            return sum(containerHistory) / this.containerHistory.size();
        }
    }

    public double sum(List<Double> list) {

    double ans = 0.0;

    for (Double aDouble : list) {
            ans += aDouble;
        }
        return ans;
    }

    public double greatestFluctuation() {
        List<Double> fluctuations = new ArrayList<Double>();
        double ans = 0;

        if(containerHistory.isEmpty() || containerHistory.size() == 1){
            return ans;

        }else{
            for(int i = containerHistory.size() - 1; i >= 1; i--){
                double fluctuation = Math.abs(containerHistory.get(i) - containerHistory.get(i-1));
                fluctuations.add(fluctuation);
            }
        }
        for(double d : fluctuations){
            if(ans < d){
                ans = d;
            }
        }
        return ans;
    }

    public double variance(){
        double ans = 0;
        if(containerHistory.isEmpty() || containerHistory.size() == 1){
            return ans;

        }else{
            for(double d : containerHistory){
                ans += (d - this.average()) * (d - this.average());
            }
        }
        return ans/(containerHistory.size() - 1);
    }




}
