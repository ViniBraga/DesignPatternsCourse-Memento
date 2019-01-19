import java.util.Calendar;

public class Contract {

	private Calendar date;
	private String customer;
	private ContractType type;
	
	public Contract(Calendar date, String customer, ContractType type) {
		super();
		this.date = date;
		this.customer = customer;
		this.type = type;
	}

	public Calendar getDate() {
		return date;
	}

	public String getCustomer() {
		return customer;
	}

	public ContractType getType() {
		return type;
	}

	public void goForward() {
		if(type == ContractType.NEW) type = ContractType.IN_PROGRESS;
		else if(type == ContractType.IN_PROGRESS) type = ContractType.DEALED;
		else if(type == ContractType.DEALED) type = ContractType.CONCLUDED;
	}
	
	public State saveState() {
		return new State(new Contract(this.date, this.customer, this.type));
	}
	
}
