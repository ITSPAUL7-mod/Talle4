package uce.edu.pa2.api;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class NotificadorSelector {

    @Inject
    private NotificadorMail mail;
    @Inject
    private NotificadorSMS sms;

    public Notificador seleccionar(double total){

         if(total > 100){
            return mail;
         } else{
            return sms;
         }
    }

    
}
