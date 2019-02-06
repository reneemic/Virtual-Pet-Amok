package virtualPetsAmok;

public class RoboDog extends VirtualPet implements Robo {
        int maintain = 15;
	   
	public RoboDog(String name, int health, int happy) {
		super(name, health, happy);
		this.maintain = maintain;
	}

	@Override
	public void tick() {
		petHappy -= 5;
		maintain -=3;
		if (maintain <=1 || petHappy <=1) {
			petHealth -=2;
		}

	}

	public void oil() {
		maintain += 8;
		
	}

	public int getMaintain() {
			return 10;
	}

}
