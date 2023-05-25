package ejercicios;

import java.util.concurrent.CompletableFuture;

public class Future {
    public static void main(String[] args) {
        MicroserviceA microserviceA = new MicroserviceA();
        MicroserviceB microserviceB = new MicroserviceB();

        CompletableFuture<Integer> futureA = CompletableFuture.supplyAsync(() -> microserviceA.sum(2, 3));
        futureA.thenAccept(resultA -> {
            System.out.println("Resultado de la llamada A: " + resultA);
            // Aquí puedes realizar acciones adicionales después de que la llamada sin bloqueo se complete
        });
        CompletableFuture<Integer> futureB = futureA.thenApplyAsync(resultA -> microserviceB.sum(resultA, 4));

        futureB.thenAccept(resultB -> {
            System.out.println("Resultado final: " + resultB);
            // Aquí puedes realizar acciones adicionales después de que ambas llamadas sin bloqueo se completen
        });
        try {
            Thread.sleep(5000); // Espera 5 segundos para dar tiempo a que las llamadas asincrónicas se completen
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Continuar con otras tareas mientras las llamadas sin bloqueo se ejecutan en segundo plano

        // No es necesario bloquear o detenerse explícitamente, el flujo continúa mientras las llamadas se ejecutan
    }
}

class MicroserviceA {
    public int sum(int a, int b) {
        // Simulación de retraso de la llamada
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Error en la llamada A");
            e.printStackTrace();
        }
        return a + b;
    }
}

class MicroserviceB {
    public int sum(int a, int b) {
        return a + b;
    }
}

