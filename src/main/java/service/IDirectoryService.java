package service;

import model.ClientInfo;
import model.FileInfo;
import model.FileOwner;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface IDirectoryService extends Remote {
    /**
     * Method used to registry file from clients
     */
    void registryFile(ClientInfo clientInfo, List<FileInfo> files) throws RemoteException;

    /**
     * Method used to get all Available files from the Directory server
     */
    List<FileOwner> getAllAvailableFiles() throws RemoteException;
}
