public class Carne extends Producto {
    
    private String tipo;
    private String origen;

    /**
     * @description Constructor de la clase que inicializara tanto los 
     * atributos propios como los heredados
     * @param id
     * @param nombre
     * @param cantDisponible
     * @param cantVendida
     * @param estado
     * @param precio
     * @param tipo
     * @param origen
     */
    public Carne(int id, String nombre, int cantDisponible, int cantVendida, boolean estado, double precio, String tipo,
            String origen) {
        super(id, nombre, cantDisponible, cantVendida, estado, precio);
        this.tipo = tipo;
        this.origen = origen;
    }

    /**
     * @description Metodo que retornara el tipo de carne
     * @return String
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @description Metodo que asignara el tipo de carne
     * @param tipo
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @description Metodo que retornara el origen de la carne
     * @return String
     */
    public String getOrigen() {
        return origen;
    }

    /**
     * @description Metodo que asignara el origen de la carne
     * @param origen
     */
    public void setOrigen(String origen) {
        this.origen = origen;
    }

    /**
     * @description Metodo que retornara todos los atributos de la clase
     * @return String
     */
    @Override
    public String toString() {
        return super.toString()+
        "\nTipo: " + tipo + 
        "\nOrigen: " + origen;
    }

}
