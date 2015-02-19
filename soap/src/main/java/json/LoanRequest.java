package json;

public class LoanRequest {
	
	private double amount;
	
	private int term;
	
	private char quoteRate;

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getTerm() {
		return term;
	}

	public void setTerm(int term) {
		this.term = term;
	}

	public char getQuoteRate() {
		return quoteRate;
	}

	public void setQuoteRate(char quoteRate) {
		this.quoteRate = quoteRate;
	}
	
	

}
