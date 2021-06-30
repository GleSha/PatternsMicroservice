package application.services.taxes.calculators.impl.usa;

import application.services.taxes.calculators.IndividualTaxCalculator;

import java.math.BigDecimal;

public class USAIndividualTaxCalculator implements IndividualTaxCalculator {
    @Override
    public BigDecimal getTaxFromAmount(BigDecimal amount) {
        return amount.multiply(BigDecimal.valueOf(0.15));
    }
}
