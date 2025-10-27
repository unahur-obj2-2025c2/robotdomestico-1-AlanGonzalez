package ar.edu.unahur.obj2.command.comandos;

public class TareaEjecutada {
    private String nombre;
    private Double duracion;

    public TareaEjecutada(String nombre, Double duracion) {
        this.nombre = nombre;
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getDuracion() {
        return duracion;
    }

    

    
}
