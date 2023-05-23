package telcel.appfacturas.modelo;

public class Producto {

    private int codigo;
    private String nombre;
    private float precion;

    private static int ultimoCodigo;

    public Producto(){
        this.codigo = ++ultimoCodigo;
    }


    public int getCodigo() {
        return codigo;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecion() {
        return precion;
    }

    public void setPrecion(float precion) {
        this.precion = precion;
    }


}
