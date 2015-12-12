package org.socramad.recruitment.profile.domain.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CandidateRepositoryTest {
	Candidate candidate;
	CandidateRepository repository;
	Candidate sameCandidate;

	@Before
	public void setup() {
		candidate = new Candidate("Helder", "hdo@hdo.com", "123");
		sameCandidate = new Candidate("Helder", "hdo@hdo.com", "123");
		repository = new CandidateRepository();
	}

	@Test
	public void addCandidate() {
		assertTrue("Candidate not added", repository.add(candidate));
	}

	@Test
	public void addExistingCandidate() throws Exception {
		assertTrue("Candidate not added", repository.add(candidate));
		assertFalse("Candidate added", repository.add(sameCandidate));
	}
}
