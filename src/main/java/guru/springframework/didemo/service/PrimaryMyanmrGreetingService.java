package guru.springframework.didemo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("my")
public class PrimaryMyanmrGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    public PrimaryMyanmrGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayHello() {
        return greetingRepository.getMynamarGreeting();
    }
}
