package corejava.collection.assignment02.Assignment1.Software;

public class Software {
    private String server;
    private String dataBase;
    private String operatingSystem;
    private Double version;

    public Software(String server, String dataBase, String operatingSystem, double version) {
        this.server = server;
        this.dataBase = dataBase;
        this.operatingSystem = operatingSystem;
        this.version = version;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public String getDataBase() {
        return dataBase;
    }

    public void setDataBase(String dataBase) {
        this.dataBase = dataBase;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public Double getVersion() {
        return version;
    }

    public void setVersion(Double version) {
        this.version = version;
    }

}