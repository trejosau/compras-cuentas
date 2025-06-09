import java.util.ArrayList;

public class Cuenta {
    private String numero;
    private String tipo;
    private Double saldo;
    private ArrayList<Compra> compras;

    public Cuenta(String numero, String tipo, Double saldo){
        this.numero = numero;
        this.tipo = tipo;
        this.saldo = saldo;
        this.compras = new ArrayList<>();
    }

    public void agregarCompra(Compra compra){
        if (saldo >= compra.getCosto()){
            compras.add(compra);
            saldo -= compra.getCosto();
            System.out.println("Compra realizada con exito");
        } else {
            System.out.println("Compra fallida");
        }

    }

    public String getNumero() {return numero;}
    public void setNumero(String numero) {this.numero = numero;}

    public String getTipo() {return tipo;}
    public void setTipo(String tipo) {this.tipo = tipo;}

    public Double getSaldo() {return saldo;}
    public void setSaldo(Double saldo) {this.saldo = saldo;}

    public ArrayList<Compra> getCompras() {return compras;}



}

