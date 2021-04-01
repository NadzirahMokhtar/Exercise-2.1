public class Main {

	public static void main(String[] args) {
		Animal cat = new Animal();
		cat.name = "Princess";
		cat.eat = "Royal Canin";
		
		Animal fish = new Animal();
		fish.name = "Delta";
		fish.eat = "Palaquin";
		
		System.out.println("cat");
		System.out.println("name:" + cat.name);
		System.out.println("eat:" + cat.eat);
		
		System.out.println();
		
		System.out.println("Function:");
		cat.Dorsal();
		
		System.out.println();
		
		System.out.println("fish");
		System.out.println("name:" + fish.name);
		System.out.println("eat:" + fish.eat);
		
        System.out.println();
		
		System.out.println("Function:");
		fish.Dorsal();
		
	}
}

