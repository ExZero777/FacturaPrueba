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
public class Localidad {
    private Partido partido;
    private String nombre;
    private String alias;
    private String cod_area;
  
    public Partido getPartido() {
        return partido;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
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
    
    public String getCod_Area() {
        return cod_area;
    }

    public void setCod_Area(String cod_area) {
        this.cod_area = cod_area;
    }
    
    
}
