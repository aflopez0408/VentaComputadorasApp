package mundopc.modelo;

public class Raton extends DispositivoEntrada{

    private final int idRaton;
    private static int contadoresRaton;

    public Raton(String tipoDeEntrada, String marca){
        super(tipoDeEntrada,marca);
        idRaton = ++contadoresRaton;
    }

    @Override
    public String toString() {
        return "Raton{" +
                "idRaton=" + idRaton +
                " } " + super.toString();
    }
}
