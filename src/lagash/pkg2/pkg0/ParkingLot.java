/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lagash.pkg2.pkg0;

/**
 *
 * @author david
 */
public interface ParkingLot {
    int CantidadEstacionados();
    int EspaciosDiponibles ();
    int precioPorDia = 80;
        
    void IngresoDetectado();
    void EgresoDetectado();
    void FacturaEstadia(int precioPorDia);
}
