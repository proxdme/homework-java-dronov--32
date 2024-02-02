public class BmiService {
    public int calculate(int weightKilos, double heightMeters) {
        int index;
        index = (int) (weightKilos / (heightMeters * heightMeters));
        return index;
    }
}
