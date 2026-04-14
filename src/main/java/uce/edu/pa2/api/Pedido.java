package uce.edu.pa2.api;

public class Pedido {

    
    private String cliente;
    private String producto;
    private double total;
    private String destino;
    private String mensaje;

    public Pedido(){

    }

    public Pedido(String cliente, String producto, double total, String destino) {
        this.cliente = cliente;
        this.producto = producto;
        this.total = total;
        this.destino = destino;

    }
    //Metodos
    public String getCliente() {
        return cliente;
    }
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    public String getProducto() {
        return producto;
    }
    public void setProducto(String producto) {
        this.producto = producto;
    }
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }
    public String getDestino() {
        return destino;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }



}
