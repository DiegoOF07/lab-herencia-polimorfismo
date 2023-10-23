/**
 * 
 */
public class Producto {

    protected int id;
    protected String nombre;
    protected int cantDisponible;
    protected int cantVendida;
    protected boolean estado;
    protected double precio;

    /**
     * @description Constructor encargado de inicializar todos los atributos
     * @param  id             id del producto
     * @param  nombre         nombre del producto
     * @param  cantDisponible cantDisponible del producto
     * @param  cantVendida    cantVendida del producto
     * @param  estado         estado del producto
     * @param  precio         precio del producto
     */
    public Producto(int id, String nombre, int cantDisponible, int cantVendida, boolean estado, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.cantDisponible = cantDisponible;
        this.cantVendida = cantVendida;
        this.estado = estado;
        this.precio = precio;
    }

    /**
     * @description metodo que devolvera el id del producto
     * @return int
     */
    public int getId() {
        return id;
    }

    /**
     * @description metodo que asignara el id del producto
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @description metodo que devolvera el nombre del producto
     * @return String
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @description metodo que asignara el nombre del producto
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @description metodo que devolvera la cantidad disponible del producto
     * @return int
     */
    public int getCantDisponible() {
        return cantDisponible;
    }

    /**
     * @description metodo que asignara la cantidad disponible del producto
     * @param cantDisponible
     */
    public void setCantDisponible(int cantDisponible) {
        this.cantDisponible = cantDisponible;
    }

    /**
     * @description metodo que devolvera la cantidad vendida del producto
     * @return int
     */
    public int getCantVendida() {
        return cantVendida;
    }

    /**
     * @description metodo que asignara la cantidad vendida del producto
     * @param cantVendida
     */
    public void setCantVendida(int cantVendida) {
        this.cantVendida = cantVendida;
    }

    /**
     * @description metodo que devolvera el estado del producto
     * @return boolean
     */
    public boolean isEstado() {
        return estado;
    }

    /**
     * @description metodo que asignara el estado del producto
     * @param estado
     */
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    /**
     * @description metodo que devolvera el precio del producto
     * @return double
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @description metodo que asignara el precio del producto
     * @param precio
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @description metodo encargado de retornar todos los atributos
     * @return   String con todos los atributos
     */
    @Override
    public String toString() {
        return "Producto"+
                "\nID: " + id + 
                "\nNombre: " + nombre + 
                "\nCantidad Disponible: " + cantDisponible + 
                "\nCantidad Vendida: "+ cantVendida + 
                "\nEstado: " + estado + 
                "\nPrecio: " + precio;
    }    
}