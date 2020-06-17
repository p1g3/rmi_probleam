

import java.rmi.AlreadyBoundException;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.concurrent.CountDownLatch;

public class Server {
    public static void main(String[] args) throws RemoteException, AlreadyBoundException, InterruptedException, NotBoundException {
        User liming = new LocalUser("liming",15);

        Registry registry = LocateRegistry.createRegistry(8888);
        registry.bind("liming",liming);
//        Registry reg = LocateRegistry.getRegistry("127.0.0.1",1099);
//        reg.bind("liming",liming);
//        User remote = (User)reg.lookup("liming");

        System.out.println("registry is running...");

        System.out.println(System.getProperty("java.home"));


        System.out.println("liming is bind in registry");

        CountDownLatch latch=new CountDownLatch(1);

        latch.await();
    }

}
