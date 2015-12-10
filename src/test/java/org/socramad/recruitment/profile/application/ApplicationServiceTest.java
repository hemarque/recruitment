package org.socramad.recruitment.profile.application;

import static org.junit.Assert.*;

import org.junit.Test;
import org.socramad.recruitment.profile.domain.model.Candidate;

public class ApplicationServiceTest {
	@Test
	public void addCandidate() {
		Candidate candidate = new Candidate("Helder", "hdo@hdo.com", "123");
		CandidateApplicationService service = 
				ApplicationRegistry.candidateApplicationService();
		assertTrue("Candidate not added", service.addCandidate(candidate));
	}
}
