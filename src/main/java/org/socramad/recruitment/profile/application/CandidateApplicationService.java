package org.socramad.recruitment.profile.application;

import org.socramad.recruitment.profile.domain.model.Candidate;
import org.socramad.recruitment.profile.domain.model.CandidateRepository;

public class CandidateApplicationService {
	private CandidateRepository candidateRepository;
	void candidateRepository(CandidateRepository candidateRepository){
		this.candidateRepository = candidateRepository;
	}

	public boolean addCandidate(Candidate candidate) {
		return candidateRepository.add(candidate);
	}
}
