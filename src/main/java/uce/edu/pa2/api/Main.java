package uce.edu.pa2.api;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.enterprise.context.control.ActivateRequestContext;
import jakarta.enterprise.inject.spi.CDI;
import jakarta.inject.Inject;
import net.bytebuddy.asm.Advice.This;

@QuarkusMain

public class Main {

    public static void main(String... args) {

        Quarkus.run(App.class, args);

    }

    public static class App implements QuarkusApplication {

        @Inject
        private ProcesadorVentaService procesadorVentaService;
       
        @Inject
        private ProcesadorVentaService1 procesadorVentaService1;
        
        @Inject
        private EstadisticasVentasGobales estadisticasVentasGobales;

        @Inject
        private ProcesadorVentaEnlineaService enlineaService;

        @Override
        public int run(String... args) throws Exception {

            Venta v1 = new Venta("Andy Suquilandi", 87);
            Venta v2 = new Venta("Paul Aguas", 69);
            Venta v3 = new Venta("Pedrito Perez", 100);
            Venta v4 = new Venta("Pedrito Perez", 100);
            Venta v5 = new Venta("Pedrito l", 100);
            Venta v6 = new Venta("Pedrito l", 100);
            Venta v7 = new Venta("Pedrito en linea", 100);
            Venta v8 = new Venta("Pedrito en linea 2", 100);
            
            System.out.println("Ventas Service");

            this.procesadorVentaService.procesar(v1);

            this.procesadorVentaService.procesar(v2);

            this.procesadorVentaService.procesar(v3);

            System.out.println("Ventas Service new");
            
            this.procesadorVentaService1.procesar(v4);
            
            this.procesadorVentaService1.procesar(v5);
            
            System.out.println("Ventas en Linea");
            this.enlineaService.procesar(v6);
            
            this.enlineaService.procesar(v7);
            
            this.enlineaService.procesar(v8);
            this.estadisticasVentasGobales.registrarVenta(23);
            this.estadisticasVentasGobales.mostrarEstadisticasGlobales();
            
            return 0;
        }
    }
}
