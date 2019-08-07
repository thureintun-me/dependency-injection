package guru.springframework.didemo.service;

import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImp implements GreetingRepository{

    @Override
    public String getEnglihGreeting() {
        return "Hello--Primary  Greeting Service";
    }

    @Override
    public String getMynamarGreeting() {
        return "Miglabar--Primary Greeting Service";
    }

    @Override
    public String getSpanishGreetig() {
        return "Servicio de Saludo Primario";
    }
}
