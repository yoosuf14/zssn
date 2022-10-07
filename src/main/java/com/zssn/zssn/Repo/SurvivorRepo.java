package com.zssn.zssn.Repo;

import com.zssn.zssn.models.Survivor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SurvivorRepo extends JpaRepository<Survivor, Long> {
    Survivor findByGender(String gender);
    long countByInfected(boolean isInfected);
}
