/* Un empresario del transporte cuenta con 30 vehículos entre buses, 
busetas y colectivos. Al final del día se elabora por cada vehículo 
un registro con la placa, el tipo (1= bus, 2= buseta, 3= colectivo) y 
el número de pasajeros transportados. Elabore un diagrama que imprima
por cada vehículo la placa, el dinero recolectado y el pago para el 
conductor que es el 20 % del total recolectado. También tenga en cuenta
que el precio del pasaje en Bus es de $3000.oo, en Buseta es de $ 3500.oo 
y en Colectivos es de $4000.oo.

 */
package trasporte;

import java.util.Scanner;


public class Trasporte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner objeread=new Scanner(System.in);
        int nro_pasajeros, tipo;
        float dinero_recolectado, total;
        String  placa;
        for (int i = 1; i < 30; i++) {
        System.out.print("\n ingrese numero de pasajeros");
        nro_pasajeros=objeread.nextInt();
        System.out.println("\n ingrese placa");
        placa=objeread.next();
        System.out.println("\n ingrese 1 si es bus, 2 si es buseta, 3 si es colectivo");
        tipo=objeread.nextInt();
        
        switch (tipo){
            case 1 = 3000;
            case 2 =3500;
            
                }
         
        }
            
        }
        
        
        
        
    }
    
}
