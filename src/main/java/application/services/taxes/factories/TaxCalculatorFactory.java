package application.services.taxes.factories;

import application.services.taxes.calculators.IndividualTaxCalculator;
import application.services.taxes.calculators.OrganizationTaxCalculator;

public interface TaxCalculatorFactory {
    IndividualTaxCalculator createIndividualTaxCalculator();
    OrganizationTaxCalculator createOrganizationTaxCalculator();
}
