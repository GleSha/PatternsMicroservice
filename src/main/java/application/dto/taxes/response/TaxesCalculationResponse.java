package application.dto.taxes.response;

import java.math.BigDecimal;

public class TaxesCalculationResponse {

    private BigDecimal taxAmount;

    private BigDecimal additionalTaxAmount;

    public TaxesCalculationResponse() { }

    public TaxesCalculationResponse(BigDecimal taxAmount, BigDecimal additionalTaxAmount) {
        this.taxAmount = taxAmount;
        this.additionalTaxAmount = additionalTaxAmount;
    }

    public BigDecimal getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(BigDecimal taxAmount) {
        this.taxAmount = taxAmount;
    }

    public BigDecimal getAdditionalTaxAmount() {
        return additionalTaxAmount;
    }

    public void setAdditionalTaxAmount(BigDecimal additionalTaxAmount) {
        this.additionalTaxAmount = additionalTaxAmount;
    }

    @Override
    public String toString() {
        return "TaxesCalculationResponse{" +
                "taxAmount=" + taxAmount +
                ", additionalTaxAmount=" + additionalTaxAmount +
                '}';
    }
}
