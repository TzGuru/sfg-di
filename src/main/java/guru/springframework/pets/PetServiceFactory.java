package guru.springframework.pets;

/**
 * Created by Emmanuel Jonas on 28/05/2021
 */
public class PetServiceFactory {

    public PetService getPetService(String petType) {
        switch (petType) {
            case "dog":
                return new DogPetService();
            case "cat":
                return new CatPetService();
            default:
                return null;
        }
    }
}
