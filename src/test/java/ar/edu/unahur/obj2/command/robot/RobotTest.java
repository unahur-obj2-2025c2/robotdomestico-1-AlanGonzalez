package ar.edu.unahur.obj2.command.robot;

import static org.junit.jupiter.api.Assertions.assertEquals;



import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.command.Casa.Casa;
import ar.edu.unahur.obj2.command.comandos.Carge;
import ar.edu.unahur.obj2.command.comandos.Clean;
import ar.edu.unahur.obj2.command.comandos.Ejecutable;
import ar.edu.unahur.obj2.command.comandos.Info;
import ar.edu.unahur.obj2.command.comandos.Invoker;
import ar.edu.unahur.obj2.command.comandos.Ligoff;
import ar.edu.unahur.obj2.command.comandos.Ligon;

public class RobotTest {
    Casa casa1 = new Casa(Boolean.TRUE, 500.0);
    Robot robot = new Robot(casa1);

    Ejecutable carga = new Carge(15.0);
    Ejecutable ligoff = new Ligoff();
    Ejecutable ligon = new Ligon();
    Ejecutable clear = new Clean(100.0);
    Info info = new Info();

    Invoker invoker = new Invoker(robot);

    @Test
    void testGeneral(){
        invoker.agregarComando(carga);
        invoker.agregarComando(ligon);
        invoker.agregarComando(clear);
        invoker.agregarComando(info);

        invoker.ejecutar();

        assertEquals(0.0, robot.getBateria());
        assertEquals(400.0, casa1.getMetrosTotales());
        assertEquals(Boolean.TRUE, casa1.getLuz());
        assertEquals(6800.0, info.getPromedio());
    }
    
    

}
