package application.services.taxes.calculators.impl.russia;

import application.services.taxes.calculators.OrganizationTaxCalculator;

import java.math.BigDecimal;

public class RussiaOrganizationTaxCalculator implements OrganizationTaxCalculator {

    @Override
    public BigDecimal getTaxFromAmount(BigDecimal amount) {
        return amount.multiply(BigDecimal.valueOf(0.2));
    }

    @Override
    public BigDecimal getAdditionalTaxFromAmount(BigDecimal amount) {
        return amount.multiply(BigDecimal.valueOf(0.07));
    }
}
