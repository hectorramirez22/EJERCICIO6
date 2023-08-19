package pkgListas;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class SumaValoresNumericos {

    public static void main(String[] args) {
        // Crear una lista para almacenar valores numéricos
        List<Integer> valores = new ArrayList<Integer>();

        // Agregar los números a la lista
        valores.add(500);
        valores.add(1000);
        valores.add(1500);
        valores.add(2000);
        valores.add(2500);

        // Calcular la suma de los valores en la lista
        int suma = 0;
        for (int valor : valores) {
            suma += valor;
        }

        // Imprimir la lista de valores y la suma
        System.out.println("Lista de valores numéricos:");
        for (int valor : valores) {
            System.out.println(valor);
        }
        System.out.println("Suma total de los valores: " + suma);
    }
}

//public class ClsArrayList {
//
//    public void ejemplo1(){
//        List<String> taskList = new ArrayList<String>();
//
//        String lectura = "Ir a votar";
//        taskList.add(lectura);
//        taskList.add("Hacer compras");
//        taskList.add("Sacar el perro");
//        taskList.add("Hacer la cama");
//        taskList.add("Lavar el carro");
//
////        System.out.println(taskList);
////        String primeraTarea = taskList.get(0);
////        System.out.println("primer: "+ primeraTarea);
//
//
//        int elementos =0;
//        //iterate o iteracion
//        for (String tarea : taskList){
//            System.out.println(elementos+"Tarea: "+tarea);
//            elementos++;
//
//        }
//
//
//
//

    }




}
