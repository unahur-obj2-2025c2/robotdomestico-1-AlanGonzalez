package ar.edu.unahur.obj2.command.comandos;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.command.robot.IRobot;

public class Invoker {
    private List<Ejecutable> comandos = new ArrayList<>();
    private IRobot receptor;

    public Invoker(IRobot receptor) {
        this.receptor = receptor;
    }

    public void agregarComando(Ejecutable comando){
        comandos.add(comando);
    }

    public void ejecutar(){
        receptor.ejecutar(comandos);
    }

    public void clean(){
        comandos.clear();
    }
}
