package virtualPetsAmok;

public class Dog extends VirtualPet  {

	public Dog(String name, int health, int happy) {
		super(name, health, happy);
		
	}

	public void walk () {
		petHappy += 10;
	}
	
	@Override
	public void tick() {
		petHappy -=2;

	}

	public void cleanCages() {
		
		
	}


		
	}


