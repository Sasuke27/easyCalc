package khentarjiel.cabural.com.example.khent.easy_calc;

/**
 * Created by khent on 7/19/2017.
 */

public class Operations {

    public Numbers results;

    public float add(Numbers results){
        this.results = results;
        return results.getNum1() + results.getNum2();
    }

    public float sub(Numbers results){
        this.results = results;
        return results.getNum1() - results.getNum2();

    }

    public float mult(Numbers results){
        this.results = results;
        return results.getNum1()*results.getNum2();

    }

    public float div(Numbers results){
        this.results = results;
        return results.getNum1() / results.getNum2();

    }
}
