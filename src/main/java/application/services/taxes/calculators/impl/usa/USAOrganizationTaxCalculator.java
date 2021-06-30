package application.services.taxes.calculators.impl.usa;

import application.services.taxes.calculators.OrganizationTaxCalculator;

import java.math.BigDecimal;

public class USAOrganizationTaxCalculator implements OrganizationTaxCalculator {
    @Override
    public BigDecimal getTaxFromAmount(BigDecimal amount) {
        return amount.multiply(BigDecimal.valueOf(0.15));
    }

    @Override
    public BigDecimal getAdditionalTaxFromAmount(BigDecimal amount) {
        return amount.multiply(BigDecimal.valueOf(0.15));
    }
}
