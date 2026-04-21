package uce.edu.pa2.api;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.enterprise.context.control.ActivateRequestContext;
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
        @Inject
        private PagoTarjetaCredito pagoTc;
        @Inject
        private PagoEfectivo pagoE;
        @Inject
        private ComprobantePDF cfe;
        @Inject
        private Factura fc;
        @Inject
        private AmbitoAplicacion ambitoAplicacion;
        @Inject
        private ClaseIntermedia  claseIntermedia;
         @Inject
        private AmbitoRequest ambitoRequest;
        @Inject
        private AmbitoInject ambitoInject;
        @Inject 
        private AmbitoSingleton ambitoSingleton;

        @Override
        public int run(String... args) throws Exception {
       
        System.out.println("***********Ambito Scoped**********");
        System.out.println(this.ambitoAplicacion);
        System.out.println(this.ambitoAplicacion.incrementar());
        System.out.println(this.ambitoAplicacion.incrementar());
        System.out.println(this.ambitoAplicacion.incrementar());

        this.claseIntermedia.imprimirobjetovalor();
        System.out.println("***********Ambito Request**********");
        //System.out.println(this.ambitoRequest.incrementar());
        //System.out.println(this.ambitoRequest.incrementar());
        //System.out.println(this.ambitoRequest.incrementar());
        System.out.println("***********Ambito Depend**********");
        System.out.println(this.ambitoInject);
        System.out.println(this.ambitoInject.incrementar());
        System.out.println(this.ambitoInject.incrementar());
        System.out.println(this.ambitoInject.incrementar());
        System.out.println("***********Ambito Inject**********");
        this.claseIntermedia.imprimirobjetovalorInject();
        System.out.println("***********Ambito Singleton**********");
        System.out.println(this.ambitoSingleton);
        System.out.println(this.ambitoSingleton.incrementar());
        System.out.println(this.ambitoSingleton.incrementar());
        System.out.println(this.ambitoSingleton.incrementar());
        this.claseIntermedia.imprimirobjetovalorSingleton();


        //System.out.println(this.claseIntermedia.imprimirobjetovalor());


/* 
        //2. LookUp o  service locator
        //private PedidoService pedidoService = CDI.current().select(PedidoService.class).get();

        @Override
        public int run(String... args) throws Exception {


        //Caso1
        System.out.println("Caso 1 Email: ");

        Pedido pedido1 = new Pedido("Andy Suquilandi", "Papasfritas", 125.5, null);
        
        pedidoService1.registrar(pedido1, pagoE,fc);
        System.out.println("---------------------------------");

       //Caso 2
        System.out.println("Caso 2 SMS: ");

        Pedido pedido2 = new Pedido("Paul Aguas", "Cola", 75.5, "paul@uce.com");

        pedidoService1.registrar(pedido2, pagoTc, cfe); 
        System.out.println("---------------------------------");
       
        //Caso 3
        System.out.println("Caso 3 Whatsapp: ");

        Pedido pedido3 = new Pedido("Andrez Perez", "PC-Race", 25.5, "paul@uce.edu.ec");
        
        pedidoService1.registrar(pedido3, pagoE, cfe);

        */
            return 0;
        }
    }
}

