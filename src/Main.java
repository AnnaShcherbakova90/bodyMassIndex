public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weigtKilo = 98;
        double highMetter = 1.87;
        int indexBmi = service.calculate(weigtKilo, highMetter);
        System.out.println("index = " + indexBmi);
    }
}