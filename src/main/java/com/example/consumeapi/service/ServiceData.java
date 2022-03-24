package com.example.consumeapi.service;

import com.example.consumeapi.pojo.Data;
import com.example.consumeapi.pojo.Datum;
import com.example.consumeapi.pojo.Futbolista;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ServiceData {
    private static final String URL_SERVICE = "https://datausa.io/api/data?drilldowns=Nation&measures=Population";
    @Autowired
    RestTemplate restTemplate;
    List<Futbolista> futbolistas = new ArrayList<>();

    public Data getDataFromApi() {
        return restTemplate.getForObject(URL_SERVICE, Data.class);
    }

    public void addFutbolistas() {
        futbolistas.add(new Futbolista(1, "messi", "delantero", 0));
        futbolistas.add(new Futbolista(2, "ronaldo", "delantero", 0));
        futbolistas.add(new Futbolista(3, "mbappe", "delantero", 0));
    }

    public List<Futbolista> getFutbolistasFromApi() {
        return futbolistas;
    }

    public Long conteoMayorAnioValido() {
        List<Datum> dataResponse = getDataFromApi().getData();
        return dataResponse.stream()
                .filter(data -> Integer.parseInt(data.getYear()) > 2015)
                .count();
    }

    public Integer getYear() {
        List<Datum> datos = getDataOrdenadaPorAnio();
        return Integer.parseInt(datos
                .stream()
                .filter(year -> Integer.parseInt(year.getYear()) > 2015)
                .findFirst()
                .get().getYear());
    }


    public List<Datum> getDataOrdenadaPorAnio() {
        List<Datum> datos = getDataFromApi().getData();
        return datos
                .stream()
                .sorted(Comparator.comparing(Datum::getYear)).collect(Collectors.toList());
    }

    public List<Futbolista> futbolistasTransformadosConAnio() {
        List<Futbolista> futbolistas = getFutbolistasFromApi();

        return futbolistas
                .stream()
                .map(
                        futbolista ->
                                new Futbolista(futbolista.getCodigo(),
                                        futbolista.getNombre(),
                                        futbolista.getPosicion(),
                                        getYear())
                ).collect(Collectors.toList());


    }

    public Futbolista addFutbolista(Futbolista futbolista) {
        futbolistas.add(futbolista);
        return futbolista;
    }
}
