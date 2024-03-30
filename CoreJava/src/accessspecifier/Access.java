package accessspecifier;

public class Access {

    public int publicValue;
    private int privateValue;

    public void publicMethod() {

    }

    private void privateMethod() {

    }

    protected void protectedMthod(){

    }

    void testMethod() {
        publicMethod();
        privateMethod();
    }
}
