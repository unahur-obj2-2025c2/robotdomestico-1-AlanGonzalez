package ar.edu.unahur.obj2.command.comandos;

import ar.edu.unahur.obj2.command.robot.Robot;

public class Ligoff extends Comando{

    @Override
    protected void doExecute(Robot robot) {
        Double duracion = 0.0;
        if(robot.getCasa().getLuz()){
            robot.getCasa().apagarLuz();
            duracion = 25.0 * 60;
        }
        else{
            duracion = 90.0 * 60;
        }

        robot.registrarComando("Ligoff", duracion);
    }

    @Override
    protected Double doConsumo(Robot robot) {
        return robot.getCasa().getLuz() ? 5.0 : 1.0;
    }

}
