package guru.springframework.didemo.service;

import org.springframework.stereotype.Service;

@Service
public class GetterGreetingService implements GreetingService {
    @Override
    public String sayHello() {
        return "Hello--I was injected by getter";
    }
}
