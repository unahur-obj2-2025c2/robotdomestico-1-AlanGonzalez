package ar.edu.unahur.obj2.command.comandos;

import ar.edu.unahur.obj2.command.robot.Robot;

public class Carge extends Comando{
    private Double minutos;


    public Carge(Double minutos) {
        this.minutos = minutos;
    }

    @Override
    protected void doExecute(Robot robot) {
        Double cargaPosible = minutos * 0.8;
        Double cargaNecesaria = 100 - robot.getBateria();

        if (cargaPosible > cargaNecesaria) {
            cargaPosible = cargaNecesaria;
        }

        robot.cargarBateria(robot.getBateria() + cargaPosible);

        Double duracion = minutos * 60;
        robot.registrarComando("Carge", duracion);

    }

    @Override
    protected Double doConsumo(Robot robot) {
        return 0.0;
    }

    

}
