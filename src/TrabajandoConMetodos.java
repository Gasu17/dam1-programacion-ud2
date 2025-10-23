import utilidades.Cancion;
import utilidades.DemoMetodos ; 

public class TrabajandoConMetodos {
    public static void main(String[] args) {
        DemoMetodos method = new DemoMetodos();

        // ================================
        // EJERCICIO 1: Métodos void
        // ================================
        // 1. Llama al método saludar() de la clase DemoMetodos.
        // Tu código aquí ↓
            method.saludar();

        // ================================
        // EJERCICIO 2: Métodos con retorno
        // ================================
        // 1. Llama al método sumar(5, 3).
        // 2. Guarda el resultado en una variable e imprímelo.
        // 3. Llama al método presentar("Lucía") e imprime el resultado.
        // Tu código aquí ↓
            int resultado = method.sumar(5, 3) ; 
            System.out.println(resultado);
             String nombre = method.presentar("Lucia") ; 
             System.out.println(nombre);
            



        // ================================
        // EJERCICIO 3: Paso por valor (primitivos)
        // ================================
        // 1. Declara una variable int n = 10.
        // 2. Llama a method.incrementar(n).
        // 3. Imprime n después de llamar al método.
        // Tu código aquí ↓
            int n = 10 ; 
            method.incrementar(n);
            System.out.println(n);
        

        // ================================
        // EJERCICIO 4: Paso por referencia (objetos)
        // ================================
        // 1. Crea un objeto Cancion con título "Original" - Usa el constructor parametrizado
        //  que recibe 2 argumentos: título y artista.
        // 2. Llama a method.cambiarTitulo(cancion).
        // 3. Imprime la canción después.
        // Tu código aquí ↓
        Cancion cancion = new Cancion ("original", "asdsa") ; 
        method.cambiarTitulo(cancion);
        System.out.println(cancion);


    }
}

// ================================
// RESPUESTAS DE REFLEXIÓN
// ================================
// Ejercicio 1: ¿Qué ocurre al llamar a un método void como saludar()?
// Respuesta: 
    // No devuelve nada fuera del metodo 
// Ejercicio 2: ¿Qué diferencia hay entre un método void y uno con retorno?
// Respuesta: En el metodo Void no se realizan los cambios fuera del metodo pero dentro del metodo si se realizan, en cambio en uno con retorno si cambiaria la variable fuera del metodo

// Ejercicio 3: ¿Ha cambiado la variable n fuera del método incrementar()?
// ¿Por qué?
// Respuesta: No, solo cambia dentro del metodo

// Ejercicio 4: ¿Qué ha ocurrido con el título de la Cancion al usar cambiarTitulo()?
// ¿Por qué es diferente al caso del int?
// Respuesta: Cambio el titulo de la cancion porque el metodo era  void