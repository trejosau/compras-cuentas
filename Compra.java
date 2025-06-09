import java.util.Date;

public class Compra {
    private Date fecha;
    private String descripcion;
    public Double costo;

    public Compra(Date fecha, String descripcion, Double costo) {
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.costo = costo;
    }

    public Double getCosto() {return costo;}

    public String getResumen(){
        return "fecha :" + fecha.toString() + ", Descripcion: " + descripcion + ", costo: " + costo;
    }
}
