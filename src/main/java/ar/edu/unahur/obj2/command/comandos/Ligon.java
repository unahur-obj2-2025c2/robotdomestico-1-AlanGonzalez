package ar.edu.unahur.obj2.command.comandos;

import ar.edu.unahur.obj2.command.robot.Robot;

public class Ligon extends Comando{

    @Override
    protected void doExecute(Robot robot) {
        Double duracion = 0.0;

        if(! robot.getCasa().getLuz()){
            robot.getCasa().encederLuz();
            duracion = 90.0 * 60;
        }
        else{
            duracion = 25.0 * 60;
        }

        robot.registrarComando("Ligon", duracion);


    }

    @Override
    protected Double doConsumo(Robot robot) {
        if(robot.getCasa().getLuz()){
            return 1.0;
        }
        else{
            return 5.0;
        }
    }

}
