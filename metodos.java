public class metodos {

    clsGenerales cg = new clsGenerales();

    public ObjPersonas[][] LlenarMatriz(int n){

        ObjPersonas[][] matriz = new ObjPersonas[n][n];

        for (int i = 0; i < matriz.length; i++){

            for (int j = 0; j < matriz.length; j++){

                ObjPersonas obj = new ObjPersonas();

                obj.setNombre(cg.leerCadena2("Ingrese el nombre:"));
                obj.setApellido(cg.leerCadena2("Ingrese el apellido:"));
                obj.setDireccion(cg.leerCadena2("Ingrese la direccion:"));
                obj.setTelefono(cg.leerEntero("Ingrese el telefono:"));

                matriz[i][j] = obj;
            }

        }

        return matriz;

    }

    public void MostrarMatriz(ObjPersonas[][] matriz){

        String txt = "Personas\n";

        for (int i = 0; i < matriz.length; i++){

            for (int j = 0; j < matriz.length; j++){

                txt += "Persona [" + i + "][" + j + "]:\nNombre: " + matriz[i][j].getNombre() + "\nApellido: " + matriz[i][j].getApellido() + "\nDireccion: " + matriz[i][j].getDireccion() + "\nTelefono: " + matriz[i][j].getTelefono() + "\n";

            }

        }

        cg.Mensaje(txt);

    }

    public ObjPersonas[][] LlenarMatrizCLL(int n){

        ObjPersonas[][] matriz = new ObjPersonas[n][n];

        String nombre, apellido, direccion;
        int telefono;

        for (int i = 0; i < matriz.length; i++){

            for (int j = 0; j < matriz.length; j++){

                nombre = cg.leerCadena2("Ingrese el nombre:");
                apellido = cg.leerCadena2("Ingrese el apellido:");
                direccion = cg.leerCadena2("Ingrese la direccion:");
                telefono = cg.leerEntero("Ingrese el telefono:");

                ObjPersonas o = new ObjPersonas(nombre, apellido, direccion, telefono);
                matriz[i][j] = o;
            }

        }

        return matriz;

    }

}
