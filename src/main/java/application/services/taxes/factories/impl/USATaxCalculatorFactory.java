package application.services.taxes.factories.impl;

import application.services.taxes.calculators.IndividualTaxCalculator;
import application.services.taxes.calculators.OrganizationTaxCalculator;
import application.services.taxes.calculators.impl.usa.USAIndividualTaxCalculator;
import application.services.taxes.calculators.impl.usa.USAOrganizationTaxCalculator;
import application.services.taxes.factories.TaxCalculatorFactory;
import org.springframework.stereotype.Component;

@Component("USA")
public class USATaxCalculatorFactory implements TaxCalculatorFactory {
    @Override
    public IndividualTaxCalculator createIndividualTaxCalculator() {
        return new USAIndividualTaxCalculator();
    }

    @Override
    public OrganizationTaxCalculator createOrganizationTaxCalculator() {
        return new USAOrganizationTaxCalculator();
    }
}
