package application.services.taxes.factories.impl;

import application.services.taxes.calculators.IndividualTaxCalculator;
import application.services.taxes.calculators.OrganizationTaxCalculator;
import application.services.taxes.calculators.impl.russia.RussiaIndividualTaxCalculator;
import application.services.taxes.calculators.impl.russia.RussiaOrganizationTaxCalculator;
import application.services.taxes.factories.TaxCalculatorFactory;
import org.springframework.stereotype.Component;

@Component("Russia")
public class RussiaTaxCalculatorFactory implements TaxCalculatorFactory {
    @Override
    public IndividualTaxCalculator createIndividualTaxCalculator() {
        return new RussiaIndividualTaxCalculator();
    }

    @Override
    public OrganizationTaxCalculator createOrganizationTaxCalculator() {
        return new RussiaOrganizationTaxCalculator();
    }
}
