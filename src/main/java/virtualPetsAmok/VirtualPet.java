package virtualPetsAmok;


public abstract class VirtualPet {

	protected String petName;
	protected int petHealth;
	protected int petHappy;

	public VirtualPet(String name, int health, int happy) {
		petName = name;
		petHealth = health;
		petHappy = happy;
		}
	
	public String getName() {
		return petName;			
	}
	
	public void setName() {
		this.petName = getName();
		
	}
	
	
	public int getPetHealth() {
		return petHealth;
	}
	
	public void setPetHealth(int petHealth) {
		 this.petHealth = petHealth;
		
	}

	public int getPetHappy() {
		return petHappy;
	}

	
	public void setPetHappy(int petHappy) {
		this.petHappy = petHappy;
	}
	
	public void play() {
		petHappy +=10;
	}
	
	public abstract void tick();
}