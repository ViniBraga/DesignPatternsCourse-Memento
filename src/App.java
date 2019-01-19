import java.util.Calendar;

public class App {

	public static void main(String[] args) {
		
		History history = new History();
		Contract c1 = new Contract(Calendar.getInstance(), "Vinicius", ContractType.NEW);
		history.add(c1.saveState());
		
		c1.goForward();
		history.add(c1.saveState());
		
		c1.goForward();
		history.add(c1.saveState());
		
		State previousState = history.get(0);
		System.out.println(previousState.getState().getType());
	}
	
}
