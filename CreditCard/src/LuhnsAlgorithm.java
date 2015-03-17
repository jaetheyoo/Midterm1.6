
public class LuhnsAlgorithm {
	private String cardNbr;
    private int length;
    private int total;
    
	protected LuhnsAlgorithm(String creditCard) {
		this.cardNbr = creditCard.substring(0, creditCard.length()-1); //doesn't count the check digit
		this.length = creditCard.length()-1;
	}

	protected int sum() {
		int sum = 0;
        for (int i = 0; i < cardNbr.length(); i += 2) {
            sum += Integer.parseInt(cardNbr.substring(i, i + 1));
        }
        
        for (int j = 1; j < cardNbr.length(); j += 2) {
            int sumEveryOther = Integer.parseInt(cardNbr.substring(j, j + 1)) * 2;
            if (sumEveryOther >= 10) {
                String string = Integer.toString(sumEveryOther);
                sumEveryOther = Integer.parseInt(string.substring(0, 1)) + Integer.parseInt(string.substring(1));
            }
            sum += sumEveryOther;
        }
        return sum;
    }

    public boolean isValid() {
        this.sum();
        this.total += this.length;
        return total % 10 == 0;
    }
}

