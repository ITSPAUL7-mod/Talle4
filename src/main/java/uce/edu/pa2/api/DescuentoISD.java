package uce.edu.pa2.api;

import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Priority(2)

public class DescuentoISD  implements Descuento{

    @Override
    public double aplicar(double valor) {
        System.out.println("Aplicando DescuentoISD");
        double valorDescontar = valor*0.10;
        return valor - valorDescontar;    

    }
    

}


