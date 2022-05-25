package ende;

/**
 *
 */
class Jugador{

    /**
     * Atributos
     */
    int exitos;      // número de partidas ganadas


    /**
     * Mutador para los exitos
     */
    public void setExitos() {
        exitos++;
    }

    /**
     * Accesor para los exitos
     * @return exitos
     */
    public int getExitos() {
        return(exitos);
    }

    /**
     * Escoge piedra, papel o tijera al azar
     */
    public String opcionAlAzar()
    {
        String opcion = "";
        Integer c = (int)(Math.random()*3);
        switch (c) {
            case 0:
                opcion = ("piedra");
                break;
            case 1:
                opcion = ("papel");
                break;
            case 2:
                opcion = ("tijeras");
        }
        return opcion;
    }
}