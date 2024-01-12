public class Stocktrading {
    private double tradingCharges;
    private int stockVolume;
    private double stockPrice;
    //private double tradeProceed;
    private String stockName;

    public double getTradingCharges() {
        return tradingCharges;
    }
    public void setTradingCharges(double tradingCharges) {
        this.tradingCharges = tradingCharges;
    }
    public int getStockVolume() {
        return stockVolume;
    }
    public void setStockVolume(int stockVolume) {
        this.stockVolume = stockVolume;
    }
    public double getStockPrice() {
        return stockPrice;
    }
    public void setStockPrice(double stockPrice) {
        this.stockPrice = stockPrice;
    }
    //public double getTradeProceed() {
    //return tradeProceed;
    //}
    //public void setTradeProceed(double tradeProceed) {
    //this.tradeProceed = tradeProceed;
    //}
    public void setStockName(String stockName){
        this.stockName = stockName;
    }

    public String getStockName() {
        return stockName;
    }

    public double calculateGrossTradeAmaount() {
        double tradeGrossAmount = this.stockPrice * this.stockVolume;
        return tradeGrossAmount;
    }

    public double calculateTradeCharges() {
        double tradeCharges = this.tradingCharges * this.calculateGrossTradeAmaount();
        return tradeCharges;
    }
    public double calculateTradeProceed() {
        double proceed = this.calculateGrossTradeAmaount() - this.calculateTradeCharges();
        return proceed;
    }

    public static void main(String[] args) {
        Stocktrading stockTradingSales = new Stocktrading();
        stockTradingSales.setStockPrice(70.55);
        stockTradingSales.setStockVolume(2050);
        stockTradingSales.setStockName("Conoil");
        stockTradingSales.setTradingCharges(0.0128);
        double grossAmount = stockTradingSales.calculateGrossTradeAmaount();
        double transactionCharges = stockTradingSales.calculateTradeCharges();
        double proceedSales = stockTradingSales.calculateTradeProceed();
        int volume = stockTradingSales.getStockVolume();
        String name = stockTradingSales.getStockName();
        double chargeRate = stockTradingSales.getTradingCharges();

        System.out.println("I sold a total of " + volume + " of " + name + " stocks " + "paid a total of " + transactionCharges + " at the rate of " + chargeRate + " as transaction charges, leaving me with a total of " + proceedSales + " as proceed from sales. Though without charges my sales proceed would have been " + grossAmount );



    }
}
