package model;


public class Bonus {
    private double valor;
    private String tipo;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    public Bonus() {
        this.valor = 0;
    }    
    
    
}
