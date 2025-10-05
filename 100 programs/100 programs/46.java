class ClassA {
    void displayA() {
        System.out.println("This is Class A");
    }
}

class ClassB {
    void displayB() {
        System.out.println("This is Class B");
    }
}

public class MultipleClassExample {
    public static void main(String[] args) {
        ClassA a = new ClassA();
        ClassB b = new ClassB();
        a.displayA();
        b.displayB();
    }
}
