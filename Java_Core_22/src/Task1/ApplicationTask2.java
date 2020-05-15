package Task1;

public class ApplicationTask2 {

	public static void main(String[] args) {

		Overload o = () -> "Nums - ";
		nums(o.over(), 2, 3);

	}

	public static void nums(String nums, int a, int b) {
		System.out.println(nums + a + " " + b);
	}
}

interface Overload {
	String over();
}