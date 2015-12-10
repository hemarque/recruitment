package org.socramad.recruitment.profile.application;

public class ApplicationRegistry {
	private static CandidateApplicationService candidateApplicationService = new CandidateApplicationService();

	public static CandidateApplicationService candidateApplicationService() {
		return candidateApplicationService;
	}

}
