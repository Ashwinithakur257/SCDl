public class MethodDifference {
    static void staticMethod() {
        System.out.println("This is a static method");
    }

    void instanceMethod() {
        System.out.println("This is an instance method");
    }

    public static void main(String[] args) {
        staticMethod();
        MethodDifference obj = new MethodDifference();
        obj.instanceMethod();
    }
}

