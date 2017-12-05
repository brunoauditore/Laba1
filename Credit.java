package java;

/**
 * Created by root on 05.12.17.
 */
public class Credit {

    private int sum;
    private int rate;
    private String bank_name;
    private String client_name;
    private static int result_sum;

    public Credit() {}

    public Credit(int sum, int rate, int result_sum,  String bank_name, String client_name ) {
        this.sum = sum;
        this.rate = rate;
        this.bank_name = bank_name;
        this.client_name = client_name;
        this.result_sum = result_sum;
    }

    public Credit(int sum, int rate, String bank_name, String client_name) {
        this.sum = sum;
        this.rate = rate;
        this.bank_name = bank_name;
        this.client_name = client_name;
    }

    public static int printStaticSum() {
        return result_sum;
    }

    public static int printSum() {
        return result_sum;
    }

    public void resultValues(int sum, int rate, int result_sum,  String bank_name, String client_name) {
        this.sum = sum;
        this.rate = rate;
        this.bank_name = bank_name;
        this.client_name = client_name;
        this.result_sum = result_sum;
    }

    @Override
    public String toString() {
        return "Credit{" +
                "sum=" + sum +
                ", rate=" + rate +
                ", bank_name='" + bank_name + '\'' +
                ", client_name='" + client_name + '\'' +
                ", result_sum=" + result_sum +
                '}';
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public String getBank_name() {
        return bank_name;
    }

    public void setBank_name(String bank_name) {
        this.bank_name = bank_name;
    }

    public String getClient_name() {
        return client_name;
    }

    public void setClient_name(String client_name) {
        this.client_name = client_name;
    }

    public static int getResult_sum() {
        return result_sum;
    }

    public static void setResult_sum(int result_sum) {
        Credit.result_sum = result_sum;
    }
}
