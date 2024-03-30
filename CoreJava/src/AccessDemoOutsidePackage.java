import accessspecifier.Access;

public class AccessDemoOutsidePackage {

    void test() {
        Access myAccess = new Access();
        //myAccess.publicValue
        myAccess.publicMethod();


    }
}
