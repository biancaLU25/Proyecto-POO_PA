class Mesa {
  private int numero;
  private int capacidad;
  private boolean disponible;

  public Mesa(int numero, int capacidad) {
      this.numero = numero;
      this.capacidad = capacidad;
      this.disponible = true;
  }

  public boolean estaDisponible() {
      return disponible;
  }