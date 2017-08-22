package Chapter9.exercise.E9_2;

/**
 * Created by sf on 2017/8/22.
 */
public class Stock {
    private String symbol;
    private String name;
    private double previousClosingPrices;
    private double currenmtPrice;
    Stock(String symbol,String name){
        this.symbol=symbol;
        this.name=name;
    }
    public double getChangePercent(){
        return (currenmtPrice-previousClosingPrices)/previousClosingPrices;
    }

    public void setPreviousClosingPrices(double previousClosingPrices) {
        this.previousClosingPrices = previousClosingPrices;
    }

    public void setCurrenmtPrice(double currenmtPrice) {
        this.currenmtPrice = currenmtPrice;
    }

    public static void main(String[] args) {
        Stock stock=new Stock("ORCL","Oracle Corporation");
        stock.setPreviousClosingPrices(34.5);
        stock.setCurrenmtPrice(34.35);
        System.out.printf("%.2f",stock.getChangePercent()*100);
    }
}
