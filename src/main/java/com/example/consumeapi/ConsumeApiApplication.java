package com.example.consumeapi;

import com.example.consumeapi.service.ServiceData;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConsumeApiApplication implements CommandLineRunner {
    private ServiceData serviceData;

    public ConsumeApiApplication(ServiceData serviceData) {
        this.serviceData = serviceData;
    }

    public static void main(String[] args) {
        SpringApplication.run(ConsumeApiApplication.class, args);
    }

    @Override
    public void run(String... args) {
        serviceData.addFutbolistas();
//        System.out.println("Conteo mayor a 2015: " + serviceData.conteoMayorAnioValido());
        System.out.println("Futbolistas con anio de la data: " + serviceData.futbolistasTransformadosConAnio());
    }
}
