package DADProyect;

public class pizzaObj extends productosObj {

    private String tipopizza;

    public pizzaObj(String tipopizza, String id, double precio, int stock, String tipoproducto, String n_iden) {
        super(id, precio, stock, tipoproducto, n_iden);
        this.tipopizza = tipopizza;
    }

    public String getTipopizza() {
        return tipopizza;
    }

    public void setTipopizza(String tipopizza) {
        this.tipopizza = tipopizza;
    }

}
