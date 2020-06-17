

import java.io.Serializable;
import java.rmi.RemoteException;

public interface User extends java.rmi.Remote,Serializable {
    public String getName() throws RemoteException;;
    public User getUser() throws RemoteException;
    public void updateName(String name) throws RemoteException;;
}
