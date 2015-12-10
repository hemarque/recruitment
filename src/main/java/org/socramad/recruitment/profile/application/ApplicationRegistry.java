package org.socramad.recruitment.profile.application;

import org.socramad.recruitment.profile.domain.model.CandidateRepository;

public class ApplicationRegistry {

	private static CandidateRepository candidateRepository = 
			new CandidateRepository();
	private static CandidateApplicationService candidateApplicationService = 
			new CandidateApplicationService();

	public static CandidateApplicationService candidateApplicationService() {
		candidateApplicationService.candidateRepository(candidateRepository);
		return candidateApplicationService;
	}

}
