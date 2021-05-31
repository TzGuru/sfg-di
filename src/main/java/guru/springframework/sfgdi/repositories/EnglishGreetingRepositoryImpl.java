package guru.springframework.sfgdi.repositories;

/**
 * Created by Emmanuel Jonas on 28/05/2021
 */
public class EnglishGreetingRepositoryImpl implements EnglishGreetingRepository {
    @Override
    public String sayGreeting() {
        return "Hello World Repository- EN";
    }
}
