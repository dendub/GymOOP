public class Sub {
    public String name;
    public int duration;
    public int monthPay;

    public Sub(String name, int duration, int monthPay) {
        this.name = name;
        this.duration = duration;
        this.monthPay = monthPay;
    }
    //TWO PARAMETERS
    public static int totalPay(int months, int price) {
        int totalSum = months*price;
        System.out.println(totalSum);
        return totalSum;
    }
    //VARARGS
    public static int subsIncome(int ... totalPayments) {
        int subsIncome = 0;

        for (int i = 0; i < totalPayments.length; i++){
            subsIncome = subsIncome+totalPayments[i];
        }

        return subsIncome;
    }
    public String toString(){
        return String.format("%s/%d/%d", name,duration,monthPay);
    }
}
