package application.services.taxes.calculators.impl.germany;

import application.services.taxes.calculators.OrganizationTaxCalculator;

import java.math.BigDecimal;

public class GermanyOrganizationTaxCalculator implements OrganizationTaxCalculator {
    @Override
    public BigDecimal getTaxFromAmount(BigDecimal amount) {
        return amount.multiply(BigDecimal.valueOf(0.22));
    }

    @Override
    public BigDecimal getAdditionalTaxFromAmount(BigDecimal amount) {
        return amount.multiply(BigDecimal.valueOf(0.11));
    }
}
