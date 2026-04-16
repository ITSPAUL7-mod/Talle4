package uce.edu.pa2.api;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.enterprise.inject.spi.CDI;
import jakarta.inject.Inject;

@QuarkusMain
public class Main {

    public static void main(String... args) {

        Quarkus.run(App.class, args);

    }


    public static class App implements QuarkusApplication{

        //Modelos IoC
        //1. DI
        //@Inject
        //private PedidoService pedidoService;
        @Inject
        private PedidoService1 pedidoService1;

        //2. LookUp o  service locator
        //private PedidoService pedidoService = CDI.current().select(PedidoService.class).get();

        @Override
        public int run(String... args) throws Exception {

        PedidoService1 pedidoService = CDI.current().select(PedidoService1.class).get();

        //Caso1
        System.out.println("Caso 1 Email: ");

        Pedido pedido1 = new Pedido("Andy Suquilandi", "Papasfritas", 125.5, "andy@gmail.com");
        
        pedidoService.registrar(pedido1);

       //Caso 2
        System.out.println("Caso 2 SMS: ");

        Pedido pedido2 = new Pedido("Paul Aguas", "Cola", 75.5, "paul@uce.com");

        pedidoService.registrar(pedido2);
        
        //Caso 3
        System.out.println("Caso 3 Whatsapp: ");

        Pedido pedido3 = new Pedido("Andrez Perez", "PC-Race", 25.5, "paul@uce.edu.ec");
        
        pedidoService.registrar(pedido3);

        
            return 0;
        }
    }
}

