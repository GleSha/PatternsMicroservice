package application.services.credit.impl;

import application.services.credit.CreditHistoryScorer;

import java.nio.charset.StandardCharsets;

public class IndividualCreditHistoryScorer extends CreditHistoryScorer {

    public IndividualCreditHistoryScorer(String clientData) {
        super(clientData);
    }

    //special formatting
    @Override
    protected String formatCreditHistory(String decryptedHistory) {
        return "Individual client: " + decryptedHistory;
    }

    //special logic for individuals
    @Override
    protected byte[] getClientData() {
        return (clientData + " individual").getBytes(StandardCharsets.UTF_8);
    }
}
