/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factura;

/**
 *
 * @author PC15
 */
public class Partido {
    private Provincia provincia;
    private String nombre;
    private String alias;
    
    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String Nombre) {
        this.nombre = nombre;
    }
    
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }     
}
