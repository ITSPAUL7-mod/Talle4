package uce.edu.pa2.api;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.Dependent;

@Dependent
public class TrakingVenta {
    private long tiempoInicio = 0;
    private long tiempoFinal = 0;

    public void iniciar() {
        this.tiempoInicio = this.tiempoInicio + System.currentTimeMillis();
    }

    public void finalizar() {
        this.tiempoFinal = this.tiempoFinal + System.currentTimeMillis();

        long tiempoEjecucion = tiempoFinal - tiempoInicio ;
        
        System.out.println("Tiempo de ejecucion:" + tiempoEjecucion + " ms");
    }
}
