package ar.edu.unahur.obj2.command.Casa;



public class Casa {
    private Boolean luzPrendida;
    private Double metrosTotales;


    public Casa(Boolean luzPrendida, Double metrosTotales) {
        this.luzPrendida = luzPrendida;
        this.metrosTotales = metrosTotales;
    }

    public boolean getLuz() {
        return luzPrendida;
    }

    public Double getMetrosTotales(){
        return metrosTotales;
    }

    public void encederLuz() {
        luzPrendida = Boolean.TRUE;
    }

    public void apagarLuz() {
        luzPrendida = Boolean.FALSE;
    }

    public void limpiarSuelo(Double metro) {
        metrosTotales = metrosTotales - metro;
    }

}
