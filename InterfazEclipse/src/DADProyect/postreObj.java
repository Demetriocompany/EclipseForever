package DADProyect;

public class postreObj extends productosObj {

    private String tipoPostre;

    public postreObj(String tipoPostre, String id, double precio, int stock, String tipoproducto, String n_iden) {
        super(id, precio, stock, tipoproducto, n_iden);
        this.tipoPostre = tipoPostre;
    }

    public String getTipoPostre() {
        return tipoPostre;
    }

    public void setTipoPostre(String tipoPostre) {
        this.tipoPostre = tipoPostre;
    }

}
