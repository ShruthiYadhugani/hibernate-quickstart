package com.challenges.conference.repositories;

import com.challenges.conference.models.Session;
import com.challenges.conference.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker,Long> {
}
