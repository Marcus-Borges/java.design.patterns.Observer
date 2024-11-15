package observerpattern;

public class Main {

	public static void main(String[] args) {
		ConcreteSubject subject = new ConcreteSubject();

        Observer observer1 = new ConcreteObserver("DIO");
        Observer observer2 = new ConcreteObserver("Digital Innovation One");

        subject.addObserver(observer1);
        subject.addObserver(observer2);

        subject.setState("Novo Estado!");

	}

}
