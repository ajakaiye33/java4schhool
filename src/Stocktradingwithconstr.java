public class Stocktradingwithconstr {
    private double tradingCharges;
    private int stockVolume;
    private double stockPrices;
    private String stockName;


    Stocktradingwithconstr(){

    }

    public double calculateGrossTradeAmount(){
        double grossTradeAmount = this.stockPrices * this.stockVolume;
        return grossTradeAmount;
    }

    public double calculateTradeCharges(){
        double tradeCharge = this.tradingCharges * this.calculateGrossTradeAmount();
        return tradeCharge;
    }

    public double calculateTotalTradeProceed(){
        double totalTradeProceed = this.calculateGrossTradeAmount() - this.calculateTradeCharges();
        return totalTradeProceed;
    }


    public static void main(String[] args){
        Stocktradingwithconstr oando  = new Stocktradingwithconstr();
        oando.stockName = "Oando";
        oando.stockVolume = 20000;
        oando.stockPrices = 12;
        oando.tradingCharges = 0.0128;
        double oandoCharges = oando.calculateTradeCharges();
        double oandoAmount = oando.calculateGrossTradeAmount();
        double oandoProceed = oando.calculateTotalTradeProceed();
        System.out.println("I sold " + oando.stockVolume + " of " + oando.stockName + " stocks, with a total proceed of " + oandoProceed + " incurring a total charges of " + oandoCharges);
    }
}


