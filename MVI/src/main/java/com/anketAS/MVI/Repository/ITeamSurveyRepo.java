package com.anketAS.MVI.Repository;

import com.anketAS.MVI.Entities.TeamSurvey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITeamSurveyRepo extends JpaRepository<TeamSurvey, Long> {
}
