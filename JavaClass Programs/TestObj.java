//Inner Classes in Java
class foo {

    void foofunction() {
        System.out.println("This belongs to foo class");
        bar obj = new bar();
        obj.barfunction();
    }

    class bar {

        void barfunction() {
            System.out.println("This belongs to bar class");
        }
    }
}

public class TestObj {

    public static void main(String[] args) {
        foo obj = new foo();
        obj.foofunction();
    }
}
