package com.projet.repository;

import com.projet.domain.FichePresence;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the FichePresence entity.
 */
@SuppressWarnings("unused")
@Repository
public interface FichePresenceRepository extends JpaRepository<FichePresence, Long>, JpaSpecificationExecutor<FichePresence> {}
