import java.math.BigDecimal;

public class Loan {
	int tenure;
	BigDecimal ticketSize;
	BigDecimal fee;
	BigDecimal totalLoan;
	BigDecimal installmentPerMonth;
	String status;
	
	public Loan(int tenure, BigDecimal ticketSize, BigDecimal fee, BigDecimal totalLoan, BigDecimal installmentPerMonth, String status) {
		this.tenure = tenure;
		this.ticketSize = ticketSize;
		this.fee = fee;
		this.totalLoan = totalLoan;
		this.installmentPerMonth = installmentPerMonth;
		this.status = status;
	}
}

