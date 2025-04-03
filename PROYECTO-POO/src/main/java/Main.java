// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    Restaurante restaurante = new Restaurante(5);
    Cliente cliente1 = new Cliente("Ana", "123456789");
    Reserva reserva1 = restaurante.hacerReserva(cliente1, "2025-04-03");
    if (reserva1 != null) {
        System.out.println("Reserva realizada con éxito para " + cliente1.getNombre());
    }

    
  }
}