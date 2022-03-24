package com.example.consumeapi.controller;

import com.example.consumeapi.pojo.Futbolista;
import com.example.consumeapi.service.ServiceData;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/data/futbolistas")
public class ApiRestController {
    ServiceData serviceData;

    public ApiRestController(ServiceData serviceData) {
        this.serviceData = serviceData;
    }

    @GetMapping("/")
    public List<Futbolista> getFutbolistas() {
        return serviceData.getFutbolistasFromApi();
    }

    @GetMapping("/anio")
    public List<Futbolista> getFutbolistasAnio() {
        return serviceData.futbolistasTransformadosConAnio();
    }

    @PostMapping("/")
    public Futbolista add(@RequestBody Futbolista futbolista) {
        return serviceData.addFutbolista(futbolista);
    }
}
