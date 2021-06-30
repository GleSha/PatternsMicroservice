package application.services.taxes.calculators.impl.germany;

import application.services.taxes.calculators.IndividualTaxCalculator;

import java.math.BigDecimal;

public class GermanyIndividualTaxCalculator implements IndividualTaxCalculator {
    @Override
    public BigDecimal getTaxFromAmount(BigDecimal amount) {
        return amount.multiply(BigDecimal.valueOf(0.11));
    }
}
