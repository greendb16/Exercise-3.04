package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLogger implements CommandLineRunner{

    @Autowired
    CarRepository repository;

    @Override
    public void run(String... strings) throws Exception{
        Car car = new Car(1978, "Toyota", "Prius");
        repository.save(car);
        car= new Car(2013, "Jeep", "Wrangler");
        repository.save(car);
        car= new Car(1990, "Dodge", "Charger");
        repository.save(car);
    }
}
