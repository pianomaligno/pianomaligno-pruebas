/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed06_tareaproyecto;

/**
 * Esta clase crea un objeto empleado en el cual se recogen una serie de datos de la persona. También tiene métodos para
 * calcular el sueldo o imprimir por pantalla toda la información que tenemos.
 * @author ED06
 * @version 1.0
 * @see calcula_sueldo
 * @see imprimir_emp
 */
public class Empleado {
    private String dni;
    private String nombre;
    private String direccion;
    private String cargo;
    private int numHijos;
    private String descripcion;
    
/** 
 * Este es el constructor de la clase Empleado, la cual recibe dos parámetros:
 * @param dni para insertar el dni del empleado.
 * @param nombre donde se indica el nombre de la persona en cuestión.
 */
    public Empleado (String dni, String nombre){
        this.dni=dni;
        this.nombre=nombre;
        this.cargo="EMPLEADO";
        this.numHijos=0;
    }
    
    /**
     * Este método se encarga de imprimir en pantalla los información que deseamos visualizar del empleado. Recibe por parámetro
     * el objeto empleado del cual deseamos ver los datos.
     * @param empleado1 
     */
    public static void imprimir_emp(Empleado empleado1) {
        System.out.println("DNI: " + empleado1.getDni());
        System.out.println("Nombre: " + empleado1.getNombre());
        System.out.println("Cargo: " + empleado1.getCargo());
        System.out.println("N\u00famero de hijos: " + empleado1.getNumHijos());
        System.out.println("Sueldo: " + empleado1.calcula_sueldo(1200));
    }
    
    /**
     * Este método se encarga de calcular el sueldo de cada empleado en función del cargo y del número de hijos que tiene.
     * @param base
     * @return 
     */
    public double calcula_sueldo(double base){
        double total=base;
        
        if(getCargo().equals("ENCARGADO"))
            total+=300+getNumHijos()*50;
        else if(getCargo().equals("DIRECTOR"))
            total+=1000+getNumHijos()*50;
        
        return total;
    }

    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * @return the numHijos
     */
    public int getNumHijos() {
        return numHijos;
    }

    /**
     * @param numHijos the numHijos to set
     */
    public void setNumHijos(int numHijos) {
        this.numHijos = numHijos;
    }
}
