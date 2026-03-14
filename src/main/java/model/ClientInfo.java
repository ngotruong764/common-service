package model;

import java.io.Serializable;

/**
 * A class that stores client information
 */
public class ClientInfo implements Serializable {
    private String id; // PK
    private String clientName;
    private String files; // List of files that client has
    private String socketAddr;
    private int socketPort;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getFiles() {
        return files;
    }

    public void setFiles(String files) {
        this.files = files;
    }

    public String getSocketAddr() {
        return socketAddr;
    }

    public void setSocketAddr(String socketAddr) {
        this.socketAddr = socketAddr;
    }

    public int getSocketPort() {
        return socketPort;
    }

    public void setSocketPort(int socketPort) {
        this.socketPort = socketPort;
    }
}
