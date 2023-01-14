package com.anketAS.MVI.Repository;

import com.anketAS.MVI.Entities.HappinessSurvey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IHappinessSurveyRepo extends JpaRepository<HappinessSurvey, Long> {

}
