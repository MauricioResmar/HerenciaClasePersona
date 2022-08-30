public class Main {
    public static void main(String[] args) {
//4) Instanciamos la clase cliente que hereda propiedades y funciones de la clase principal <Persona>
    Cliente cliente = new Cliente();
//5) Invocamos a nuestra clase Cliente y le pasamos el paramentro credito
    cliente.imprimeDataCliente(350000);

//6) Invocamos a nuestra clase Trabajador y le pasamos los datos
    Trabajador trabajador = new Trabajador();
    trabajador.imprimeDataTrabajador("Luis",37);

    }
}
//1 Creamos la clase principal o superclase
class Persona {

    int edad = 31;
    String nombre = "Mauricio";
    String telefono = "3505730676";

    public Persona (){
        System.out.println("Estoy en el metodo constructor de persona");
    }
}

//2)Creamos una clase cliente que heredara propiedades y funciones de persona con una variable credito
class Cliente extends Persona {

    int credito;
//3) Creamos una función para imprimir la data del cliente con sus respectivos parametros
public void imprimeDataCliente (int credito){
        System.out.println("El nombre del cliente heredado de la clase 'Persona' es:" + " " + nombre);
        System.out.println("La edad del cliente heredada desde la clase 'Persona' es:" + " " + edad);
        System.out.println("El telefono del cliente heredado desde la clase 'Persona' es:" + " " + telefono);
        System.out.println("El credito, pasado como parametro desde el objeto instanciado es:" + " " + credito);
    }

}

class Trabajador extends Persona {

    int salario = 7000000;

    public void imprimeDataTrabajador(String nombre, int edad){
        System.out.println("El nombre del trabajador enviado como parametro es:" + " " + nombre);
        System.out.println("La edad del trabajador nviado como parametro es:" + " " + edad);
        System.out.println("El numero telefonico del trabajador heredado desde la clase persona es:" + " " + telefono);
        System.out.println("El salario del trabajador como variable local es:" + " " + salario);

    }

}
