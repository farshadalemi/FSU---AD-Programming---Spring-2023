public class Stock {
    private int shares;
    private double value;

    public Stock(int intialShares, double initialValue){
        shares = intialShares;
        value = initialValue;
    }
    

    public String toString(){
        String output = String.format("#shares=%d ", shares);
        output += String.format("value=%.2f", value);
        return output;
    }
}
