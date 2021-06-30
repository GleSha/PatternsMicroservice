package application.services.credit.impl;

import application.services.credit.CreditHistoryScorer;

import java.nio.charset.StandardCharsets;

public class OrganizationCreditHistoryScorer extends CreditHistoryScorer {

    public OrganizationCreditHistoryScorer(String clientData) {
        super(clientData);
    }

    //special logic for organizations
    @Override
    protected byte[] getClientData() {
        return (clientData + " organization").getBytes(StandardCharsets.UTF_8);
    }
}
