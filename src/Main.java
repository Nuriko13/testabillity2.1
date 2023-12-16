public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weightInKg = (int) 98;
        double heightInMeters = 1.87;
        int bmi = service.calculate(weightInKg, heightInMeters); // должно получиться 28
        System.out.println(bmi);

    }
}
