package application.services.taxes.calculators.impl.russia;

import application.services.taxes.calculators.IndividualTaxCalculator;

import java.math.BigDecimal;

public class RussiaIndividualTaxCalculator implements IndividualTaxCalculator {
    @Override
    public BigDecimal getTaxFromAmount(BigDecimal amount) {
        return amount.multiply(BigDecimal.valueOf(0.13));
    }
}
