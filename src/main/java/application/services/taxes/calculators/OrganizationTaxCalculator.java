package application.services.taxes.calculators;

import java.math.BigDecimal;

public interface OrganizationTaxCalculator {
    BigDecimal getTaxFromAmount(BigDecimal amount);
    //additional tax for organizations
    BigDecimal getAdditionalTaxFromAmount(BigDecimal amount);
}
