package hello;

public class VirtualPet {

	private String name;
	private int hunger;
	private int boredom;
	
	public VirtualPet(String name, int hunger, int boredom) {
		this.name = name;
		this.hunger = hunger;
		this.boredom = boredom;
	}

	public String getName() {
		return name;
	}

	public int getHunger() {
		return hunger;
	}

	public int getBoredom() {
		return boredom;
	}
	
	
}
