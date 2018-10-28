package DADProyect;

public class hamburguesaObj extends productosObj {

    private String condimentos;
    private String tipocarne;

    public hamburguesaObj(String id, double precio, int stock, String tipoproducto, String n_iden, String condimentos, String tipocarne) {
        super(id, precio, stock, tipoproducto, n_iden);

        this.condimentos = condimentos;
        this.tipocarne = tipocarne;

    }

    public String getCondimentos() {
        return condimentos;
    }

    public void setCondimentos(String condimentos) {
        this.condimentos = condimentos;
    }

    public String getTipocarne() {
        return tipocarne;
    }

    public void setTipocarne(String tipocarne) {
        this.tipocarne = tipocarne;
    }

}
