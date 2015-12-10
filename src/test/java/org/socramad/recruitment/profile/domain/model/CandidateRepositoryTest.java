package org.socramad.recruitment.profile.domain.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class CandidateRepositoryTest {

	@Test
	public void addCandidate() {
		Candidate candidate = new Candidate("Helder", "hdo@hdo.com", "123");
		CandidateRepository repository = new CandidateRepository();
		assertTrue("Candidate not added", repository.add(candidate));
	}

}
