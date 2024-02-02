//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weightKilos = 94;
        double heightMeters = 1.75;
        int BmiIndex = service.calculate(weightKilos, heightMeters);
        System.out.println("Bmi Index: " + BmiIndex);
    }
}