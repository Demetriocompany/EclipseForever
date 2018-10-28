package DADProyect;

public class menuEspecialObj extends productosObj {

    private String descripcion;

    public menuEspecialObj(String descripcion, String id, double precio, int stock, String tipoproducto, String n_iden) {
        super(id, precio, stock, tipoproducto, n_iden);
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
