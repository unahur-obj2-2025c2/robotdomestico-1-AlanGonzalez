package ar.edu.unahur.obj2.command.robot;

import java.util.List;

import ar.edu.unahur.obj2.command.comandos.Ejecutable;

public interface IRobot {
    void ejecutar(List<Ejecutable> comandos);
}
