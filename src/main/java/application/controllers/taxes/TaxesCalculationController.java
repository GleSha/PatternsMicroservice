package application.controllers.taxes;

import application.dto.taxes.request.TaxCalculationRequest;
import application.dto.taxes.response.TaxesCalculationResponse;
import application.services.taxes.calculators.IndividualTaxCalculator;
import application.services.taxes.calculators.OrganizationTaxCalculator;
import application.services.taxes.factories.TaxCalculatorFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Map;

@RestController
@RequestMapping("/taxes")
public class TaxesCalculationController {

    @Autowired
    private Map<String, TaxCalculatorFactory> taxCalculatorFactories;

    @GetMapping("/calculate")
    public TaxesCalculationResponse calculateTaxAmount(@RequestBody TaxCalculationRequest request) throws Exception {
        if (!request.getClientType().equals("individual") && !request.getClientType().equals("organization")) {
            throw new Exception("No calculator for client type \"" + request.getClientType() + "\"");
        }
        if (taxCalculatorFactories.containsKey(request.getCountry())) {
            TaxCalculatorFactory taxCalculatorFactory = taxCalculatorFactories.get(request.getCountry());
            if (request.getClientType().equals("individual")) {
                IndividualTaxCalculator individualTaxCalculator = taxCalculatorFactory.createIndividualTaxCalculator();
                return new TaxesCalculationResponse(individualTaxCalculator.getTaxFromAmount(request.getAmount()),
                        BigDecimal.ZERO);
            } else {
                OrganizationTaxCalculator organizationTaxCalculator = taxCalculatorFactory.createOrganizationTaxCalculator();
                return new TaxesCalculationResponse(organizationTaxCalculator.getTaxFromAmount(request.getAmount()),
                        organizationTaxCalculator.getAdditionalTaxFromAmount(request.getAmount()));
            }
        } else {
            throw new Exception("No calculator for country \"" + request.getCountry() + "\"");
        }
    }

}
