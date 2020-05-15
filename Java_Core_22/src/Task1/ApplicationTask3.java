package Task1;

public class ApplicationTask3 {

	public static void main(String[] args) {

		Frog eat = () -> System.out.println("The frog is eating");
		Frog sleep = () -> System.out.println("The frog is sleeping");
		Frog swimm = () -> System.out.println("The frog is swimming");
		Frog walk = () -> System.out.println("The frog is walking");

		eat.action();
		sleep.action();
		swimm.action();
		walk.action();
	}

}

interface Frog {
	public void action();
}