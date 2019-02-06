package virtualPetsAmok;

public class OrganicCat extends Cat implements Organic {
       	int hungry = 15;
        int thirsty = 15;
        int clean = 15;
        

public OrganicCat(String name, int health, int happy, int hungry, int thirsty, int clean) {
	super(name, health, happy);
	this.hungry = hungry;
	this.thirsty = thirsty;
	this.clean = clean;
}


@Override
public void tick() {
	petHappy -=5;
	hungry -= 3;
	thirsty -=6;
	clean -=2;
			
	
}

public void water() {
	thirsty +=10;
	
}
public void feed() {
	hungry +=10;
	thirsty -=3;
}

public void emptyLitterBox() {
	clean += 5;
}


public int getHunger() {
		return 10;
}


public int getThirsty() {
	return 10;
}


public int getClean() {
	return 10;
}
}	


