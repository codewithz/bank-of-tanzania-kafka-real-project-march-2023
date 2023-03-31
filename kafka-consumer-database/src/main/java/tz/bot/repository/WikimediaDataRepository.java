package tz.bot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tz.bot.model.WikimediaData;

@Repository
public interface WikimediaDataRepository extends JpaRepository<WikimediaData,Integer> {
}
