public class GarbageCollectionExample {
    public static void main(String[] args) {
        GarbageCollectionExample obj1 = new GarbageCollectionExample();
        GarbageCollectionExample obj2 = new GarbageCollectionExample();
        obj1 = null;
        obj2 = null;
        System.gc();
        System.out.println("Garbage collection requested");
    }

    protected void finalize() {
        System.out.println("Garbage collected for object");
    }
}
