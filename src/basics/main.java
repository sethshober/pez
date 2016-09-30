package basics;

public class main {

	public static void main(String[] args) {
		
		// run through PezDispenser functionality
		
		PezDispenser pez = new PezDispenser("Yoda");
		System.out.println("pez created");
		System.out.println("loading pez...");
		pez.load();
		System.out.println("eating pez...");
		while (!pez.isEmpty()) {
			System.out.println(pez.getPezCount());
			pez.dispense();
		}
		if (pez.isEmpty()) {
			System.out.println("out of pez...reloading");
			try {
				pez.load(500);
			} catch (IllegalArgumentException err) {
				System.out.println("oh boy");
				System.out.printf("error: %s", err.getMessage());
			}
		}
	}

}
