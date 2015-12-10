package org.socramad.recruitment.profile;

import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;
import org.socramad.recruitment.profile.application.ApplicationRegistry;
import org.socramad.recruitment.profile.application.CandidateApplicationService;
import org.socramad.recruitment.profile.domain.model.Candidate;

@RunWith(ConcordionRunner.class)
public class CandidateTest {
	public boolean addCandidate(String name, String email, String phone){
		Candidate candidate = new Candidate(name, email, phone);
		CandidateApplicationService candidateApplicationService = 
				ApplicationRegistry.candidateApplicationService();
		return candidateApplicationService.addCandidate(candidate);
	}
}
