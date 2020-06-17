import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import java.util.HashMap;
import java.util.Map;


public class Client {

    public static void main(String[] args) throws Exception {

        Registry registry = LocateRegistry.getRegistry("127.0.0.1",8888);
        for(String i:registry.list()){
            System.out.println(i);
        }
        Remote remote = registry.lookup("liming");
//        remote.getName();

    }
}