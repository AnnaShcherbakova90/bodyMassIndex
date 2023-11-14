public class BmiService {
    public int calculate(double weightKg, double highMt) {
        double index = weightKg / (highMt * highMt);
        return (int) index;
    }
}
