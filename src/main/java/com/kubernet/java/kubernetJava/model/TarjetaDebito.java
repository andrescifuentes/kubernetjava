package com.kubernet.java.kubernetJava.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;




@AllArgsConstructor
@NoArgsConstructor
@Data
public class TarjetaDebito {

    private Integer idTarjeta;
    private String nombreTitular;
    private Long numeroTarjeta;


}
