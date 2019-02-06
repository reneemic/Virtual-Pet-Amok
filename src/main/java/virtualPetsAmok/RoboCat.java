package virtualPetsAmok;

public class RoboCat extends VirtualPet implements Robo {
        
	int maintain = 20;
	
	public RoboCat(String name, int health, int happy) {
		super(name, health, happy);
	}

	@Override
	public void tick() {
		petHappy -= 8;
		maintain -= 6;
		if (maintain <=0 || petHappy <=0) {
			petHealth -=2;
		}
	}
	
	public void oil() {
		maintain += 10;
		
	}

	public int getMaintain() {
		return 10;
	}

}
