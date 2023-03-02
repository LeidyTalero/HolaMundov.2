
package modelo;

import java.util.Objects;

public class SesionDTO {
    private String correo;
    private String clave;
    private String nombre;
    private String telefono;

    public SesionDTO() {
    }

    public SesionDTO(String correo, String clave, String nombre, String telefono) {
        this.correo = correo;
        this.clave = clave;
        this.nombre = nombre;
        this.telefono = telefono;
    }
    
    public SesionDTO(String correo, String clave) {
        this.correo = correo;
        this.clave = clave;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public int hashCode() { //Codigo que le añade un codigo aleatorio
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.correo);
        hash = 83 * hash + Objects.hashCode(this.clave);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SesionDTO other = (SesionDTO) obj;
        if (!Objects.equals(this.correo, other.correo)) {
            return false;
        }
        return Objects.equals(this.clave, other.clave);
    }
}
