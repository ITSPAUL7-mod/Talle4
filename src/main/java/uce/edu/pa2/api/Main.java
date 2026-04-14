package uce.edu.pa2.api;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;

import jakarta.inject.Inject;

@QuarkusMain
public class Main {

    public static void main(String... args) {

        Quarkus.run(App.class, args);

    }


    public static class App implements QuarkusApplication{
        @Inject
        private PedidoService pedidoService;

        @Override
        public int run(String... args) throws Exception {
        Pedido pedido1 = new Pedido("Andy Suquilandi", "Papasfritas", 12.5, "andy@gmail.com");
        Pedido pedido2 = new Pedido("Paul Aguas", "Cola", 2.5, "paul@uce.com");
        
       
        

        this.pedidoService.registrar(pedido1);
        this.pedidoService.registrar(pedido2);
        


            return 0;
        }
    }
}

