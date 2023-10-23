public class Snack extends Producto {

    private int gramos;
    private String sabor;
    private String tamanio;
    
    /**
     * @description Constructor de la clase que inicializara tanto los 
     * atributos propios como los heredados
     * @param id
     * @param nombre
     * @param cantDisponible
     * @param cantVendida
     * @param estado
     * @param precio
     * @param gramos
     * @param sabor
     * @param tamanio
     */
    public Snack(int id, String nombre, int cantDisponible, int cantVendida, boolean estado, double precio, int gramos,
            String sabor, String tamanio) {
        super(id, nombre, cantDisponible, cantVendida, estado, precio);
        this.gramos = gramos;
        this.sabor = sabor;
        this.tamanio = tamanio;
    }

    /**
     * @description Metodo que retornara la capacidad del Snack en gramos
     * @return int
     */
    public int getGramos() {
        return gramos;
    }

    /**
     * @description Metodo que asignara la capacidad del Snack en gramos
     * @param gramos
     */
    public void setGramos(int gramos) {
        this.gramos = gramos;
    }

    /**
     * @description Metodo que retornara el sabor del Snack
     * @return String
     */
    public String getSabor() {
        return sabor;
    }

    /**
     * @description Metodo que asignara el sabor del Snack
     * @param sabor
     */
    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    /**
     * @description Metodo que retornara el tamaño del Snack
     * @return String
     */
    public String getTamanio() {
        return tamanio;
    }

    /**
     * @description Metodo que asignara el tamaño del Snack
     * @param tamanio
     */
    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    /**
     * @description Metodo que retornara todos los atributos del Snack
     * @return String
     */
    @Override
    public String toString() {
        return super.toString()+
        "\nGramos: " + gramos + 
        "\nSabor: " + sabor + 
        "\nTamaño: " + tamanio;
    }
}
