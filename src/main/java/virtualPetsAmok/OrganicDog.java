package virtualPetsAmok;

public class OrganicDog extends Dog implements Organic {
	
	         int hungry = 20;
	         int thirsty = 20;
	         int clean = 20;

	public OrganicDog(String name, int health, int happy) {
		super(name, health, happy);
		this.hungry = hungry;
		this.thirsty = thirsty;
		this.clean = clean;
			
	}

	@Override
	public void walk () {
		super.walk();
		clean += 6;
				
	}
	public void cleanCages () {
	   clean +=10;
	
	}


	public void feed() {
		// TODO Auto-generated method stub
		
	}


	public void water() {
		// TODO Auto-generated method stub
		
	}

	public int getHunger() {
		
		return 0;
	}

	public int getClean() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getThirsty() {
		// TODO Auto-generated method stub
		return 0;
	}
}

