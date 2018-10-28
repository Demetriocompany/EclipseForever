package DADProyect;

public class productosObj {

    private String id;
    private double precio;
    private int stock;
    private String tipoproducto;
    private String n_iden;

    public productosObj(String id, double precio, int stock, String tipoproducto, String n_iden) {
        this.id = id;
        this.precio = precio;
        this.stock = stock;
        this.tipoproducto = tipoproducto;
        this.n_iden = n_iden;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getTipoproducto() {
        return tipoproducto;
    }

    public void setTipoproducto(String tipoproducto) {
        this.tipoproducto = tipoproducto;
    }

    public String getN_iden() {
        return n_iden;
    }

    public void setN_iden(String n_iden) {
        this.n_iden = n_iden;
    }

}
