package com.redditclone.backend.repository;

import com.redditclone.backend.model.Post;
import com.redditclone.backend.model.User;
import com.redditclone.backend.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Optional;

@RepositoryRestResource
@CrossOrigin(origins = "http://localhost:4200")
public interface VoteRepository extends JpaRepository<Vote, Long> {
    Optional<Vote> findTopByPostAndUserOrderByVoteIdDesc(Post post, User currentUser);
}
