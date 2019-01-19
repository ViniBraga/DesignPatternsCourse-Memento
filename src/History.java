import java.util.ArrayList;
import java.util.List;

public class History {

	private List<State> savedStates = new ArrayList<>();
	
	public State get(int index) {
		return savedStates.get(index);
	}
	
	public void add(State state) {
		savedStates.add(state);
	}
	
}
