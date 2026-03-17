package LambdaAndFunctionalInterfaces;

@FunctionalInterface
public interface Operation {
    // Single abstract method
    int apply(int a, int b);

    // Helper to execute an operation
    static int execute(int a, int b, Operation op) {
        return op.apply(a, b);
    }
}
