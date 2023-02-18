
package coche;

/**
 *
 * @author juan gabriel mateo vargas
 */
public class Main {
    
      public static void main(String[] args) {
        Coche miCoche;
        int stockActual;
        
        miCoche = new Coche("Opel",12000,500);
        OperativaVentaJuanGabrielMateoVargas2223(miCoche);
        
        OperativaCompraMateoVargasJuanGabriel2223(miCoche);
    }
      
    private static void OperativaCompraMateoVargasJuanGabriel2223(Coche miCoche) {
        int stockActual;
        try
        {
            System.out.println("Compra de Coches");
            miCoche.comprar(500);
        } catch (Exception e)
        {
            System.out.print("Fallo al ingresar");
        }
        stockActual = miCoche.obtenerStock();
        System.out.println("El stock actual es"+ stockActual );
    }

    private static void OperativaVentaJuanGabrielMateoVargas2223(Coche miCoche) {
        try
        {
            System.out.println("Venta de Coches");
            miCoche.vender(300);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
    }

}
    
//Esto es una prueba MATEO VARGAS JUAN GABRIEL 2223.