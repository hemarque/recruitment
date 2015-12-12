package org.socramad.recruitment.profile.domain.model;

import java.util.HashSet;
import java.util.Set;

public class CandidateRepository {
	Set<Candidate> candidates = new HashSet<Candidate>();
	public boolean add(Candidate candidate) {
		return candidates.add(candidate);
	}
}


