package observerpattern;

public class ConcreteSubject extends Subject{
	
	private String state;
	
	public void setState(String state) {
		this.state = state;
		notifyObservers(state);
	}
	
	public String getState() {
		return state;
	}
	
}
