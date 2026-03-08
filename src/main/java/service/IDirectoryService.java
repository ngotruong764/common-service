package service;

import model.FileInfo;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface IDirectoryService extends Remote {
    /**
     * Method used to registry file from clients
     */
    void registryFile(String clientId, List<FileInfo> files) throws RemoteException;
}
