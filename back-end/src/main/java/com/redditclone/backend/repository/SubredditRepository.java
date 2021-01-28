package com.redditclone.backend.repository;

import com.redditclone.backend.model.Subreddit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Optional;

@RepositoryRestResource
@CrossOrigin(origins = "http://localhost:4200")
public interface SubredditRepository extends JpaRepository<Subreddit, Long> {
    Optional<Subreddit> findByName(String subredditName);
}
