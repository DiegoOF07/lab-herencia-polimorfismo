public class Bebida extends Producto {

    private int mililitros;
    private String tipo;

    /**
     * @description Constructor de la clase que inicializara tanto los 
     * atributos propios como los heredados
     * @param id
     * @param nombre
     * @param cantDisponible
     * @param cantVendida
     * @param estado
     * @param precio
     * @param mililitros
     * @param tipo
     */
    public Bebida(int id, String nombre, int cantDisponible, int cantVendida, boolean estado, double precio, int mililitros, String tipo) {
        super(id, nombre, cantDisponible, cantVendida, estado, precio);
        this.mililitros = mililitros;
        this.tipo = tipo;
    }

    /**
     * @description Metodo que retornara la capacidad de la bebida en mililitros
     * @return int
     */
    public int getMililitros() {
        return mililitros;
    }

    /**
     * @description Metodo que asignara la capacidad de la bebida en mililitros
     * @param mililitros
     */
    public void setMililitros(int mililitros) {
        this.mililitros = mililitros;
    }

    /**
     * @description Metodo que retornara el tipo de bebida
     * @return String
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @description Metodo que asignara el tipo de bebida
     * @param tipo
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @description metodo encargado de retornar todos los atributos
     * @return   String con todos los atributos
     */
    @Override
    public String toString() {
        return super.toString()+
        "\nMililitros: " + mililitros + 
        "\nTipo: " + tipo;
    }
}
