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
        private EstadisticasVentasGobales estadisticasVentasGobales;

        @Override
        public int run(String... args) throws Exception {

            Venta v1 = new Venta("Andy Suquilandi", 87);
            Venta v2 = new Venta("Paul Aguas", 69);
            Venta v3 = new Venta("Pedrito Perez", 100);

            this.procesadorVentaService.procesar(v1);
            this.estadisticasVentasGobales.mostrarEstadisticasGlobales();

            this.procesadorVentaService.procesar(v2);

            this.estadisticasVentasGobales.mostrarEstadisticasGlobales();
            this.procesadorVentaService.procesar(v3);

            this.estadisticasVentasGobales.mostrarEstadisticasGlobales();
            
            return 0;
        }
    }
}
