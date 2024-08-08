package ejercicios.crakingCode.exception;

public class ConcurrentModificationExpection extends Throwable {
    public ConcurrentModificationExpection() {
    }

    public ConcurrentModificationExpection(String message) {
        super(message);
    }
}
