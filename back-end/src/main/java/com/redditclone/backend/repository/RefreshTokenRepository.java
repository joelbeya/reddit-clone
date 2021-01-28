package com.redditclone.backend.repository;

import com.redditclone.backend.model.RefreshToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin(origins = "http://localhost:4200")
public interface RefreshTokenRepository
        extends JpaRepository<RefreshToken, Long> {
    void deleteByToken(String token);
}
