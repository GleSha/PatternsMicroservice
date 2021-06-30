package application.controllers.credit;

import application.dto.credit.CreditHistoryRequest;
import application.services.credit.CreditHistoryScorer;
import application.services.credit.impl.IndividualCreditHistoryScorer;
import application.services.credit.impl.OrganizationCreditHistoryScorer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/credit")
public class CreditHistoryController {

    @GetMapping("/get-history")
    public String getCreditHistory(@RequestBody CreditHistoryRequest request) throws Exception {
        if (!request.getClientType().equals("individual") && !request.getClientType().equals("organization")) {
            throw new Exception("No scorer for client type \"" + request.getClientType() + "\"");
        }
        CreditHistoryScorer scorer;
        if (request.getClientType().equals("individual")) {
            scorer = new IndividualCreditHistoryScorer(request.getClientName());
        } else {
            scorer = new OrganizationCreditHistoryScorer(request.getClientName());
        }
        return scorer.getCreditHistory();
    }

}
