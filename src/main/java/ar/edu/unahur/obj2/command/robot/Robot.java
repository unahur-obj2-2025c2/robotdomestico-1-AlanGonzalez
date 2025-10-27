package ar.edu.unahur.obj2.command.robot;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.command.Casa.Casa;
import ar.edu.unahur.obj2.command.comandos.Ejecutable;
import ar.edu.unahur.obj2.command.comandos.TareaEjecutada;

public class Robot implements IRobot{
    private double bateria = 100.0;
    private List<TareaEjecutada> historial = new ArrayList<>();
    private Casa casa;

    

    public Robot(Casa casa) {
        this.casa = casa;
    }

    @Override
    public void ejecutar(List<Ejecutable> comandos) {
        comandos.forEach(o -> o.execute(this));
    }

    public double getBateria() {
        return bateria;
    }

    public void registrarComando(String nombre, Double duracion){
        historial.add(new TareaEjecutada(nombre, duracion));
    }

    public void cargarBateria(double bateria) {
        this.bateria = Math.max(0, Math.min(bateria, 100)); // entre 0 y 100%
    }

    public void consumirBateria(double consumo) {
        cargarBateria(this.bateria - consumo);
    }

    public Casa getCasa(){
        return casa;
    }

    public Double promedioDuracion() {
        Integer cantTareas = historial.size();
        Double duraciones = historial.stream().mapToDouble(TareaEjecutada :: getDuracion).sum();
        return duraciones / cantTareas;
    }

    
}
