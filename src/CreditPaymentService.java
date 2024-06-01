public class CreditPaymentService {
    public int calculate(int amountOfCredit, int creditTerm, double interestRate) {
        double monthlyRate = (interestRate / 12 / 100);
        double monthlyPayment = ((amountOfCredit *   monthlyRate) / (1 - Math.pow(1 + monthlyRate, -creditTerm)));
        return (int) monthlyPayment;

    }
}
