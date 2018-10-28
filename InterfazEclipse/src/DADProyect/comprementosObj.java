package DADProyect;

public class comprementosObj extends productosObj {

    private String nombre;

    public comprementosObj(String id, double precio, int stock, String tipoproducto, String n_iden, String nombre) {
        super(id, precio, stock, tipoproducto, n_iden);
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
