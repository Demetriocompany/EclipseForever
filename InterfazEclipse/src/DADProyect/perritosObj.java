package DADProyect;

public class perritosObj extends productosObj {

    private String condimentos;

    public perritosObj(String condimentos, String id, double precio, int stock, String tipoproducto, String n_iden) {
        super(id, precio, stock, tipoproducto, n_iden);
        this.condimentos = condimentos;
    }

    public String getCondimentos() {
        return condimentos;
    }

    public void setCondimentos(String condimentos) {
        this.condimentos = condimentos;
    }

}
