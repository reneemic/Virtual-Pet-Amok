package virtualPetsAmok;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClassesTest {

	@Test
	public void shouldCreateAOrganicDog() {
		OrganicDog underTest = new OrganicDog(null, 0, 0);
		assertNotNull(underTest);
	}

	@Test
	public void shouldCreateARobotDog() {
		RoboDog underTest = new RoboDog(null, 0, 0);
		assertNotNull(underTest);
	}

	@Test
	public void shouldCreateAOrganicCat() {
		OrganicCat underTest = new OrganicCat(null, 0, 0, 0, 0, 0);
		assertNotNull(underTest);
	}

	@Test
	public void shouldCreateARobotCat() {
		RoboCat underTest = new RoboCat(null, 0, 0);
		assertNotNull(underTest);
	}

	@Test
	public void walksMakeDogsHappy() {
		Dog underTest = new OrganicDog(null, 0, 0);
		underTest.walk();
		int response = underTest.getPetHappy();
		assertEquals(5, response);
	}

	@Test
	public void playMakesVirtualPetsHappy() {
		VirtualPet underTest = new RoboDog (null, 0, 0);
		underTest.play();
		int response = underTest.getPetHappy();
		assertEquals(5, response);
	}

	@Test
	public void virtualPetsCanTick() {
		VirtualPet underTest = new RoboDog(null, 10, 10);
		underTest.tick();
		int response = underTest.getPetHappy() + underTest.getPetHealth();
		assertEquals(19, response);
	}

	@Test
	public void organicCatsAreThirstyHappyAndHaveWaste() {
		OrganicCat underTest = new OrganicCat("Scratchy", 10, 10, 10, 10, 10);
		int check = underTest.getHunger() + underTest.getThirsty() + underTest.getClean();
		assertEquals(15, check);
	}

	@Test
	public void organicDogsAreThirstyHappyAndHaveWaste() {
		OrganicDog underTest = new OrganicDog("Oliver", 10, 10);
		int check = underTest.getHunger() + underTest.getThirsty() + underTest.getClean();
		assertEquals(30, check);
	}

	@Test
	public void odogTicksShouldReduceAllLevels() {
		OrganicDog underTest = new OrganicDog("Oliver", 10, 10);
		underTest.tick();
		int check = underTest.getPetHappy() + underTest.getPetHealth() + underTest.getHunger()
				+ underTest.getThirsty() + underTest.getClean();
		assertEquals(46, check);
	}
	@Test
	public void ocatTicksShouldReduceAllLevels() {
		OrganicCat underTest = new OrganicCat("Rita", 10, 10, 10, 10, 10);
		underTest.tick();
		int check = underTest.getPetHappy() + underTest.getPetHealth() + underTest.getHunger() + underTest.getThirsty() + underTest.getClean();
		assertEquals(31, check);
	}
	@Test
	public void rDogTicksShouldReduceAllLevels() {
		RoboDog underTest = new RoboDog("Les", 10, 10);
		underTest.tick();
		int check = underTest.getMaintain() + underTest.getPetHappy() + underTest.getPetHealth();
		assertEquals(53, check);
	}
	@Test
	public void rCatTicksShouldReduceAllLevels(){
		RoboCat underTest = new RoboCat("Pauly", 10, 10);
		underTest.tick();
		int check = underTest.getMaintain() + underTest.getPetHappy() + underTest.getPetHealth();
		assertEquals(28, check);
	}
	@Test
	public void shouldBeAbleToFeedOrganics() {
		OrganicCat underTest = new OrganicCat("Rita", 10, 10, 10, 10, 10);
		underTest.feed();
		int check = underTest.getHunger();
		assertEquals(15, check);
	}
	@Test
	public void shouldBeAbleToWaterOrganics() {
		OrganicCat underTest = new OrganicCat("Rita", 10, 10, 10, 10, 10);
		underTest.water();
		int check = underTest.getThirsty();
		assertEquals(15, check);
	}
	@Test
	public void shouldBeAbleToOilRobots() {
		RoboCat underTest = new RoboCat("Rita", 10, 10);
		underTest.oil();
		int check = underTest.getMaintain();
		assertEquals(15, check);
	}
	@Test
	public void walksShouldIncreaseODogCleanliness() {
		OrganicDog underTest = new OrganicDog("Oliver", 10, 10);
		underTest.walk();
		int check = underTest.getClean();
		assertEquals(15, check);
	}
	@Test
	public void shouldBeAbleToCleanLitterBox() {
		OrganicCat underTest = new OrganicCat("Scratchy", 10, 10, 10, 10, 10);
		underTest.emptyLitterBox();
		int check = underTest.getClean();
		assertEquals(15, check);
	}
	@Test
	public void shouldBeAbleToCleanCages() {
		OrganicDog underTest = new OrganicDog("Oliver", 10, 10);
		underTest.cleanCages();
		int check = underTest.getClean();
		assertEquals(15, check);
	}
	@Test
	public void maintenanceShouldAffectHealth() {
		RoboDog underTest = new RoboDog("Robodog", 10, 10);
		underTest.tick();
		int check = underTest.getPetHealth();
		assertEquals(9, check);
	}
}
