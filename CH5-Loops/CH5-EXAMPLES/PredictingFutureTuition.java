
public class PredictingFutureTuition {
    public static void main(String[] args) {
        double tuition = 100000;
        int year = 0;

        while (tuition < 200000) {
            tuition = tuition * 1.07;
            year++;
        }

        System.out.print("Tuition will doubled in " + year + " year");
    }
}