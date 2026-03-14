package model;

import java.io.Serializable;
import java.util.List;

public class FileOwner implements Serializable {
    private FileInfo fileInfo;
    private List<ClientInfo> clientInfos; // List of clients that hold this file

    public FileInfo getFileInfo() {
        return fileInfo;
    }

    public void setFileInfo(FileInfo fileInfo) {
        this.fileInfo = fileInfo;
    }

    public List<ClientInfo> getClientInfos() {
        return clientInfos;
    }

    public void setClientInfos(List<ClientInfo> clientInfos) {
        this.clientInfos = clientInfos;
    }
}
