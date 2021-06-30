package application.services.taxes.factories.impl;

import application.services.taxes.calculators.IndividualTaxCalculator;
import application.services.taxes.calculators.OrganizationTaxCalculator;
import application.services.taxes.calculators.impl.germany.GermanyIndividualTaxCalculator;
import application.services.taxes.calculators.impl.germany.GermanyOrganizationTaxCalculator;
import application.services.taxes.factories.TaxCalculatorFactory;
import org.springframework.stereotype.Component;

@Component("Germany")
public class GermanyTaxCalculatorFactory implements TaxCalculatorFactory {
    @Override
    public IndividualTaxCalculator createIndividualTaxCalculator() {
        return new GermanyIndividualTaxCalculator();
    }

    @Override
    public OrganizationTaxCalculator createOrganizationTaxCalculator() {
        return new GermanyOrganizationTaxCalculator();
    }
}
