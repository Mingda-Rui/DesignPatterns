package pers.mingda.designpatterns.chapt11.rmi;

// The Naming class (for doing the rmiregistry
// lookup) is in the java.rmi package.
import java.rmi.*;

public class MyRemoteClient {
    public static void main(String[] args) {
        new MyRemoteClient().go();
    }

    public void go() {
         
        try {
            // It comes out of the registry as type
            // Object, so don't forget the cast.
            MyRemote service = (MyRemote) Naming.lookup("rmi://127.0.0.1/RemoteHello");

            // It looks just like a regular old
            // method call! (Except it must
            // acknowledge the RemoteException.)
            String s = service.sayHello();
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}