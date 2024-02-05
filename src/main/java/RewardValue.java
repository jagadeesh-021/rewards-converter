public class RewardValue {
    private double cashValue;
    private double milesValue;

    // Constructor that accepts a cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashToMiles(cashValue);
    }

    // Constructor that accepts a value in miles
    public RewardValue(double milesValue, boolean isMiles) {
        this.milesValue = milesValue;
        this.cashValue = isMiles ? milesToCash(milesValue) : milesValue;
    }

    // Method to get the cash value of the RewardValue
    public double getCashValue() {
        return cashValue;
    }

    // Method to get how many miles the RewardValue is worth
    public double getMilesValue() {
        return milesValue;
    }

    // Convert cash to miles at a rate of 0.0035
    private double cashToMiles(double cashValue) {
        return cashValue / 0.0035;
    }

    // Convert miles to cash at a rate of 0.0035
    private double milesToCash(double milesValue) {
        return milesValue * 0.0035;
    }

    public static void main(String[] args) {
        // Example usage
        RewardValue cashReward = new RewardValue(100.0);
        System.out.println("Cash Value: " + cashReward.getCashValue());
        System.out.println("Miles Value: " + cashReward.getMilesValue());

        RewardValue milesReward = new RewardValue(500, true);
        System.out.println("Cash Value: " + milesReward.getCashValue());
        System.out.println("Miles Value: " + milesReward.getMilesValue());
    }
}
