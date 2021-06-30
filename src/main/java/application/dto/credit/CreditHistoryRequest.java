package application.dto.credit;

public class CreditHistoryRequest {

    private String clientName;
    private String clientType;

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientType() {
        return clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }

    @Override
    public String toString() {
        return "CreditHistoryRequest{" +
                "clientName='" + clientName + '\'' +
                ", clientType='" + clientType + '\'' +
                '}';
    }
}
