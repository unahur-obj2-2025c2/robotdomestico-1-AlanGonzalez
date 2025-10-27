package ar.edu.unahur.obj2.command.comandos;

import ar.edu.unahur.obj2.command.robot.Robot;

public class Info extends Comando {
    private Double ultimoPromedio = 0.0;

    @Override
    protected void doExecute(Robot robot) {
        ultimoPromedio = robot.promedioDuracion();
    }

    public Double getPromedio() {
        return ultimoPromedio;
    }

    @Override
    protected Double doConsumo(Robot robot) {
        return 0.0;
    }
    
}
