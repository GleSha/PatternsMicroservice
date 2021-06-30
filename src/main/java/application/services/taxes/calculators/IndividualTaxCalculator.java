package application.services.taxes.calculators;

import java.math.BigDecimal;

public interface IndividualTaxCalculator {
    BigDecimal getTaxFromAmount(BigDecimal amount);
}
