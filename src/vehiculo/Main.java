
package vehiculo;

/**
 *
 * @author IES Aguadulce
 */
public class Main {
    
      public static void main(String[] args) {
        VehiculoMartinezSanchezMiguelAngel2223 miVehiculoMartinezSanchezMiguelAngel2223;
        int stockActual;
        
        miVehiculoMartinezSanchezMiguelAngel2223 = new VehiculoMartinezSanchezMiguelAngel2223("Seat",18000,100);
        operativaVehiculosMartinezSanchezMiguelAngel2223(miVehiculoMartinezSanchezMiguelAngel2223, 50); 
        stockActual = miVehiculoMartinezSanchezMiguelAngel2223.obtenerStock();
        System.out.println("El stock actual es"+ stockActual );
    }

    public static void operativaVehiculosMartinezSanchezMiguelAngel2223(VehiculoMartinezSanchezMiguelAngel2223 miVehiculoMartinezSanchezMiguelAngel2223, int cantidad) {
        try
        {
            System.out.println("Venta de Vehiculos");
            miVehiculoMartinezSanchezMiguelAngel2223.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculoMartinezSanchezMiguelAngel2223.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
    }

}
    
