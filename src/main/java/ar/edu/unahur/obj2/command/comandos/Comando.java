package ar.edu.unahur.obj2.command.comandos;


import ar.edu.unahur.obj2.command.robot.Robot;

public abstract class Comando implements Ejecutable {
    
    @Override
    public void execute(Robot robot) {
        robot.consumirBateria(doConsumo(robot)); 
        this.doExecute(robot);
           
    }

    protected abstract void doExecute(Robot robot);
    protected abstract Double doConsumo(Robot robot);
}
