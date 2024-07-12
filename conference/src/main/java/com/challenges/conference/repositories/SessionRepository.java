package com.challenges.conference.repositories;

import com.challenges.conference.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session,Long> {
}
