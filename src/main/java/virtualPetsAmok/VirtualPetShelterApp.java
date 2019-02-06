package virtualPetsAmok;

import java.util.Scanner; 

public class VirtualPetShelterApp {
  
	public static void main (String[] args) {

      Scanner input = new Scanner (System.in);
      
        VirtualPet pets = new OrganicDog("Oliver", 10, 10);
        VirtualPetShelter vpShelter = new VirtualPetShelter();
        vpShelter.addPet(pets);
        VirtualPet oCat = new OrganicCat("Rita", 10,10, 10, 10, 10);
        vpShelter.addPet(oCat);
        VirtualPet rDog = new RoboDog("Les", 10, 10);
        vpShelter.addPet(rDog);
        VirtualPet rCat  = new RoboCat("Pauly", 10, 10 );
        vpShelter.addPet(rCat);
       
        System.out.println("Welcome to Liam's Animal Shelter and Sanctuary!");
        
        String showMenu = "\n\t What would you like to do with the pets?\n" + "\n\t" + "1. Feed the pets in the shelter\n\t"
				+ "2. Give water to the pets\n\t" + "3. Clean dog cages.\n\t" + "4. Clean the litter box.\n\t" + "5. Walk dogs\n\t" + "6. Oil Robot pets\n\t"
				+ "7. Play with a pet\n\t" + "8. Adopt a pet\n\t" + "9. Admit a pet\n\t" + "10. Show all pets currently in the shelter.\n\t" + "11. Quit";
        
        String userChoice;
            while(vpShelter.hasPets()) {
        	do {System.out.println(showMenu);
			userChoice = input.next();
			
			switch (userChoice) {
			case "1": // feed all organics
				vpShelter.tickAllPets(pets);
				vpShelter.feedPets();
				System.out.println("All the living pets are stuffed!");
				break;
			case "2": // water all organics
				vpShelter.tickAllPets(pets);
				vpShelter.waterAllPets();
				System.out.println("All the organic pets have enough water.");
				break;
			case "3": // clean dog cages
				vpShelter.tickAllPets(pets);
				vpShelter.cleanCages();
				System.out.println("The dogs cages are as good as new!");
				break;
			case "4": // clean litter box
				vpShelter.tickAllPets(pets);
				vpShelter.emptyLitterBox();
				System.out.println("The litter box smells like Tidy Cat");
				break;
			case "5": // walk all dogs
				vpShelter.tickAllPets(pets);
				vpShelter.walkDogs();
				System.out.println("The dogs are happy and their cages will not be as dirty");
				break;
			case "6": // oil robots
				vpShelter.tickAllPets(pets);
				vpShelter.oilRobots();
				System.out.println("The robo pets are nice and shiny!");
				break;
			case "7": // play with a pet
				vpShelter.tickAllPets(pets);
				System.out.println("Which pet would you like to play with?");
				vpShelter.showPetName(pets);
				String chosenPet = input.next();
				VirtualPet playPet = vpShelter.getPetNamed(chosenPet);
				playPet.play();
				System.out.println(chosenPet + " had lots for fun but now they need a nap");
				break;
			case "8": // adopt a pet
				vpShelter.tickAllPets(pets);
				vpShelter.showPets(pets);
				System.out.println("Which pet would you like to adopt?");
				String upForAdoption = input.next();
				vpShelter.removePet(upForAdoption);
				System.out.println("Congratulations on your new best friend, " + upForAdoption + "!");
				break;
			case "9": // admit a pet
				vpShelter.tickAllPets(pets);
				System.out.println("Do you have a: \n\tA. Organic Dog \n\t B. Organic Cat \n\t C. Robo Dog \n\t D. Robo Cat");
				String petType = input.next();
				switch (petType.toLowerCase()) {
				case "A":
					System.out.println("What will you name the new dog?");
					String oDogName = input.next();
					VirtualPet newODog = new OrganicDog(oDogName, 10, 10);
					vpShelter.addPet(newODog);
					break;
				case "B":
					System.out.println("What will you name the new cat?");
					String oCatName = input.next();
					VirtualPet newOCat = new OrganicDog(oCatName, 10, 10);
					vpShelter.addPet(newOCat);
					break;
				case "C":
					System.out.println("What will you name the new dog?");
					String rDogName = input.next();
					VirtualPet newRDog = new OrganicDog(rDogName, 10, 10);
					vpShelter.addPet(newRDog);
					break;
				case "D":
					System.out.println("What will you name the new cat?");
					String rCatName = input.next();
					VirtualPet newRCat = new OrganicDog(rCatName, 10, 10);
					vpShelter.addPet(newRCat);
					break;
				}
				System.out.println("Welcome to your new home!" );
				break;
			case "10": 
				vpShelter.tickAllPets(pets);
				System.out.println("These are the pets at our shelter:");
				vpShelter.showPets(pets);
				break;
			case "11":
				System.out.println("Thank you for volunteering at the County Shelter.\nGoodbye!");
				System.exit(0);
				break;
			default: 
				System.out.println("Invalid option.");
			}
			} while (!vpShelter.hasPets());

		}

		input.close();
	}

   }
