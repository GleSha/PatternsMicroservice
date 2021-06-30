package application.services.credit;

public abstract class CreditHistoryScorer {

    protected final String clientData;

    protected CreditHistoryScorer(String clientData) {
        this.clientData = clientData;
    }

    //template method
    public String getCreditHistory() {
        byte[] authentication = authenticate();
        byte[] creditHistory = requestClientCreditHistory(getClientData(), authentication);
        String decryptedHistory = decryptResult(creditHistory, authentication);
        return formatCreditHistory(decryptedHistory);
    }

    protected String formatCreditHistory(String decryptedHistory) {
        return decryptedHistory;
    }

    protected abstract byte[] getClientData();

    //complex logic of authentication
    protected byte[] authenticate() {
        System.out.println("authenticating on credit history service using credentials of our organization");
        return new byte[] {48, 49, 48, 49};
    }

    protected byte[] requestClientCreditHistory(byte[] clientData, byte[] authenticate) {
        System.out.println("requesting client data");
        byte[] result = new byte[clientData.length + authenticate.length];
        for (int i = 0; i < clientData.length; i++) {
            result[i] = clientData[clientData.length - i - 1];
        }
        for (int i = clientData.length; i < authenticate.length + clientData.length; i++) {
            result[i] = authenticate[i - clientData.length];
        }
        return result;
    }

    //complex decryption algorithm
    protected String decryptResult(byte[] clientHistory, byte[] authentication) {
        return new String(clientHistory);
    }

}
