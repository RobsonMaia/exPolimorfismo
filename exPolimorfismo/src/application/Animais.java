package application;

public interface Animais {
	void fazerSom();
}

class Dog implements Animais {
	
	public void fazerSom() {
		System.out.println("The dog goes: Woo woof!");
	}
}

class Cat implements Animais {
	public void fazerSom() {
		System.out.println("The cat does: Meow!");
	}
}