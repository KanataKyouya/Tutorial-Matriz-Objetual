public class principal {
    
    static metodos met = new metodos();
    static ObjPersonas ObjP = new ObjPersonas();
    static clsGenerales cg = new clsGenerales();

    public static void main(String[] args) {
        
        proceso();

    }

    private static void proceso(){

        int n = cg.leerEntero("Ingrese la dimension de la matriz:");
        ObjPersonas[][] matriz = new ObjPersonas[n][n];

        matriz = met.LlenarMatrizCLL(n);

        met.MostrarMatriz(matriz);

    }
    
}
