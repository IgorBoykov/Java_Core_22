package Task1;

public class ApplicationTask1 {

	public static void main(String[] args) {

		Animal cow = () -> "ί κξπξβΰ- Μσσσ-Μσσσ";
		Animal cat = () -> "ί κ³ς- Μÿσσσ-Μÿσσσ";
		Animal dog = () -> "ί οερ - Γΰσσσ-Γΰσσσ";

		voice(cow.voice(), "Booryonka", 8);
		voice(cat.voice(), "Murchik", 5);
		voice(dog.voice(), "Sharik", 7);

	}

	public static void voice(String voice, String name, int age) {
		System.out.println(voice + " " + name + " " + age);
	}
}

interface Animal {
	String voice();

}