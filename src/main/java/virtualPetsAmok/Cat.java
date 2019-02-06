package virtualPetsAmok;

public class Cat extends VirtualPet {

	public Cat(String name, int health, int happy) {
		super(name, health, happy);
	}

	@Override
	public void tick() {
		petHappy -= 3;

	}

	public void emptyLitterBox() {
		
	}

}
