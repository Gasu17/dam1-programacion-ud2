import utilidades.CuentaBancaria ; 

public class Main {
    public static void main(String[] args) {
    
 CuentaBancaria cuenta = new CuentaBancaria();

        // ================================
        // EJERCICIO 1: Uso de atributos
        // ================================
        // 1. Intenta acceder directamente al atributo saldo:
        //    System.out.println(cuenta.saldo);
        // 2. Observa el error de compilación.

        // Tu código aquí ↓
         System.out.println(cuenta.saldo);
        

        // ================================
        // EJERCICIO 2: Métodos públicos
        // ================================
        // 1. Ingresa 100€ usando depositar().
        // 2. Retira 30€ usando retirar().
        // 3. Imprime el saldo con getSaldo().

        // Tu código aquí ↓
        cuenta.depositar( 100);
        cuenta.retirar( 30) ;
        cuenta.getSaldo() ;

        // ================================
        // EJERCICIO 3: Métodos privados
        // ================================
        // 1. Intenta llamar al método registrarOperacion("Hackeo", 9999).
        // 2. Observa el error de compilación.

        // Tu código aquí ↓
            cuenta.registrarOperacion("Hackeo", 9999) ; 

        

        // ================================
        // EJERCICIO 4: Libre
        // ================================
        // Puedes hacer pruebas adicionales con los métodos disponibles
        // para asegurarte de que comprendes la diferencia entre public y private.

            


// ================================
// RESPUESTAS DE REFLEXIÓN
// ================================
// Ejercicio 1: ¿por qué no puedo acceder al saldo directamente?
// Respuesta: Porque es un atributo Privado

// Ejercicio 2: ¿por qué sí puedo usar los métodos depositar(), retirar() y getSaldo()?
// Respuesta: Porque esos metodos son publicos 

// Ejercicio 3: ¿qué significa el error al intentar llamar a registrarOperacion()?
// Respuesta: Ese metodo  solo lo puede usar la propia clase 

// Ejercicio 4: 
// - ¿Qué ventajas tiene que saldo sea private?
//  Obliga a manejar el saldo atraves de metodos como depositar, retirar, etc 

// - ¿Qué pasaría si saldo fuera public?
// Cualquier persona podria modificar el saldo por ejemplo cuenta.saldo = 5000000$
// - ¿Por qué registrarOperacion es private en lugar de public?
// Respuesta:  Evita q el usuario registre operaciones falsas como registrar ingresos q no existen etc
    
}
}