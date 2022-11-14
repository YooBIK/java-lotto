package lotto;

public class Yield {
    private double purchasePrice;
    private double profits;

    private double yieldRate;

    public Yield(double purchasePrice, double profits) {
        this.purchasePrice = purchasePrice;
        this.profits = profits;
        if(purchasePrice == 0){
            yieldRate = 0;
            return;
        }
        this.yieldRate = (profits / purchasePrice) * 100;
    }

    public double getYieldRate(){
        return yieldRate;
    }

    public void printYieldRate() {
        System.out.println("총 수익률은 " + yieldRate + "%입니다.");
    }
}
