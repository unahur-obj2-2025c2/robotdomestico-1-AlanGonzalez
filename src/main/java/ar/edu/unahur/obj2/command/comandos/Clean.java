package ar.edu.unahur.obj2.command.comandos;

import ar.edu.unahur.obj2.command.robot.Robot;

public class Clean extends Comando{
    private Double metro;
    
    public Clean(Double metro) {
        this.metro = metro;
    }

    @Override
    protected void doExecute(Robot robot) {
        robot.getCasa().limpiarSuelo(metro);
        Double duracion = metro * 180.0;
        robot.registrarComando("Clean", duracion);
    }

    @Override
    protected Double doConsumo(Robot robot) {
        return metro * 5.0;
    }

}
