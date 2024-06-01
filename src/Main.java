//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double monthlyPayment1 = service.calculate(1_000_000, 12, 9.99);
        System.out.println("ежемесячный платеж " + monthlyPayment1 + " рублей");

        double monthlyPayment2 = service.calculate(1_000_000, 24, 9.99);
        System.out.println("ежемесячный платеж " + monthlyPayment2 + " рублей");

        double monthlyPayment3 = service.calculate(1_000_000, 36, 9.99);
        System.out.println("ежемесячный платеж " + monthlyPayment3 + " рублей");



    }
}