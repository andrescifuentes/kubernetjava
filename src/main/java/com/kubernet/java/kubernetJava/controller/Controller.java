package com.kubernet.java.kubernetJava.controller;
import com.kubernet.java.kubernetJava.model.TarjetaDebito;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;
import java.util.List;

@RestController

public class Controller {

    @GetMapping("/tarjetaBancaria")
    public List<TarjetaDebito> getCard(){

        TarjetaDebito tarjetaDebito = new TarjetaDebito();
        List<TarjetaDebito>  list = new ArrayList<>();

        tarjetaDebito.setIdTarjeta(100);
        tarjetaDebito.setNombreTitular("Pepito Perez");
        tarjetaDebito.setNumeroTarjeta(123456L);
        list.add(tarjetaDebito);
        return list;
    }
}
