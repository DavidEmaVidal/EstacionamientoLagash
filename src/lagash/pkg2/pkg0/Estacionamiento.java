/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lagash.pkg2.pkg0;

import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class Estacionamiento implements ParkingLot {
    int autosenplaya = 0;                       // Inicializo en 0 la cantidad de autos en el estacionamiento

    @Override
    public void IngresoDetectado() {         // Metodo para detectar los ingresos de vehiculos
        if(autosenplaya<100){                // Verifico que la cantidad de autos en la playa de estacionamiento no sea mayor a 100, ya que es el limite
         autosenplaya+=1;                    // Al ingresar un auto sumo uno al contador  
         JOptionPane.showMessageDialog(null, "Ingreso Detectado");
        }
        else{
            System.out.println("No hay lugares Disponibles");
            JOptionPane.showMessageDialog(null, "No hay lugares Disponibles");
        }   
       
    }

    @Override
    public void EgresoDetectado() {          //Metodo para detectar el egreso de vehiculos
        if(autosenplaya>0){                 // Si o si para egresar debe ser mayor a 0 la cantidad de autos
            autosenplaya-=1;                // Al egresar resto en uno la cant de autos
        JOptionPane.showMessageDialog(null, "Egreso Detectado");
        }
        else{
            System.out.println("No hay autos para retirar en Estacionamiento");
            JOptionPane.showMessageDialog(null, "No hay autos para retirar en Estacionamiento");
        }
    }
        @Override
    public int CantidadEstacionados(){      //Metodo para ver la cantidad de Autos estacionados
        if(autosenplaya==0){                //Si la cantidad de autos es cero devuelvo null , sino la cantidad de autos
            System.out.println("null");
             JOptionPane.showMessageDialog(null,"null");
        }
        else{
        System.out.println("La cantidad de autos estacionados es: "+autosenplaya);
         JOptionPane.showMessageDialog(null,"Cantidad autos estacionados: " +autosenplaya);
        }
    return autosenplaya;    
    }
        @Override
    public int EspaciosDiponibles(){        // Metodo para ver la cantidad de espacios disponibles
       int lugaresdisponibles = 100- autosenplaya;       //Son la cantidad total ,100 en este caso, menos la cantidad de autos actuales en la playa
        System.out.println("La cantidad de espacios disponbles es: "+lugaresdisponibles);
        JOptionPane.showMessageDialog(null,"Lugares Disponbiles: " +lugaresdisponibles);
    return lugaresdisponibles;
    }
    

    @Override
    public void FacturaEstadia(int precioPorDia) {          // Metodo para ver la facturacion que se ha hecho en el dia
       int facturapordia = precioPorDia* autosenplaya;     
        System.out.println("El total facturado es; "+facturapordia);
         JOptionPane.showMessageDialog(null,"Total Facturado: " +facturapordia);
        ServicioExterno.EnviarEmail("Precio factura dia", "montofacturado:"+facturapordia, "encargadoestacionamiento@gmail.com");   // Traigo el metodo del sistemaExtorno del envio de email
    }
    
   
}
