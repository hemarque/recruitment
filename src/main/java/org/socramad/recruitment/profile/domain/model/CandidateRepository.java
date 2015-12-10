package org.socramad.recruitment.profile.domain.model;

import java.util.ArrayList;
import java.util.List;

public class CandidateRepository {
	List<Candidate> candidates = new ArrayList<Candidate>();
	public boolean add(Candidate candidate) {
		return candidates.add(candidate);
	}
}


