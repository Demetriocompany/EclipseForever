package DADProyect;

import java.time.LocalDate;

public class pedidoObj {

    private String n_iden;
    private LocalDate tiempo;
    private double preciototal;
    private boolean realizado;

    public pedidoObj(String n_iden, LocalDate tiempo, double preciototal, boolean realizado) {
        this.n_iden = n_iden;
        this.tiempo = tiempo;
        this.preciototal = preciototal;
        this.realizado = realizado;
    }

    public String getN_iden() {
        return n_iden;
    }

    public void setN_iden(String n_iden) {
        this.n_iden = n_iden;
    }

    public LocalDate getTiempo() {
        return tiempo;
    }

    public void setTiempo(LocalDate tiempo) {
        this.tiempo = tiempo;
    }

    public double getPreciototal() {
        return preciototal;
    }

    public void setPreciototal(double preciototal) {
        this.preciototal = preciototal;
    }

    public boolean isRealizado() {
        return realizado;
    }

    public void setRealizado(boolean realizado) {
        this.realizado = realizado;
    }

}
