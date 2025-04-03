class Reserva {
    private Cliente cliente;
    private Mesa mesa;
    private String fecha;

    public Reserva(Cliente cliente, Mesa mesa, String fecha) {
        this.cliente = cliente;
        this.mesa = mesa;
        this.fecha = fecha;
        mesa.reservar();
    }

    public void cancelar() {
        mesa.liberar();
    }
}