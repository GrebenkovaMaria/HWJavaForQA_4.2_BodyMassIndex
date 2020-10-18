public class BmiService {
    public double calculate(double weight, double height) {
        double bmi = weight / Math.pow(height, 2);// weight in kilos (for 58,5 it's = 58.5), height in m (for 1,62, it's = 1.62)
        return bmi;
    }
}

