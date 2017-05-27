/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 **/
package ed06_tareaproyecto;

/**
 *
 * @author ED06
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("1245678M","Perico de los Palotes");
        
        empleado1.setDireccion("C/del Pez,6");
        empleado1.setNumHijos(3);
        Empleado.imprimir_emp(empleado1);
    }    
}
