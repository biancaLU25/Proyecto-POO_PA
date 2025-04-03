class Restaurante {
    private Mesa[] mesas;

    public Restaurante(int numMesas) {
        mesas = new Mesa[numMesas];
        for (int i = 0; i < numMesas; i++) {
            mesas[i] = new Mesa(i + 1, 4);
        }
    }

    public Reserva hacerReserva(Cliente cliente, String fecha) {
        for (Mesa mesa : mesas) {
            if (mesa.estaDisponible()) {
                return new Reserva(cliente, mesa, fecha);
            }
        }
        System.out.println("No hay mesas disponibles");
        return null;
    }
}