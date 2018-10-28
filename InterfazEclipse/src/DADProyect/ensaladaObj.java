package DADProyect;

public class ensaladaObj extends productosObj {

    private String tipoensalada;

    public ensaladaObj(String id, double precio, int stock, String tipoproducto, String n_iden, String tipoensalada) {
        super(id, precio, stock, tipoproducto, n_iden);
        this.tipoensalada = tipoensalada;
    }

    public String getTipoensalada() {
        return tipoensalada;
    }

    public void setTipoensalada(String tipoensalada) {
        this.tipoensalada = tipoensalada;
    }
}
