import java.util.Calendar;

public class State {

	public Contract contract;
	public Calendar savedDate;
	
	public State(Contract contract) {
		this.contract = contract;
		savedDate = Calendar.getInstance();
	}
	
	public Contract getState() {
		return contract;
	}
	
}
