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
        private ProcesadorVentaServiceTiempo procesadorVentaServiceTiempo;
       
        @Inject
        private InventarioService inventarioService;
        

        @Override
        public int run(String... args) throws Exception {


            System.out.println("Ventas");
            Venta v1 = new Venta("Andy Suquilandi", 87);
            Venta v2 = new Venta("Paul Aguas", 69);
            
            this.procesadorVentaServiceTiempo.procesar(v1);
            this.procesadorVentaServiceTiempo.REprocesar(v2);
            System.out.println("**************************");
            System.out.println("Inventario");
            Pedido p1 = new Pedido("Andy", "Laptop", 1500, "");
            Pedido p2 = new Pedido("Paul", "Refrigeradora", 1200, "");
            this.inventarioService.Registrar(p1);
            this.inventarioService.Registrar(p2);


            return 0;
        }
    }
}
