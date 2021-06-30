package application.dto.taxes.request;

import java.math.BigDecimal;

public class TaxCalculationRequest {

    private String country;

    //"individual" or "organization"
    private String clientType;

    private BigDecimal amount;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getClientType() {
        return clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "TaxCalculationRequest{" +
                "country='" + country + '\'' +
                ", clientType='" + clientType + '\'' +
                ", amount=" + amount +
                '}';
    }
}
