package repository;

import com.redditclone.backend.model.VerificationToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Optional;

@RepositoryRestResource
@CrossOrigin(origins = "http://localhost:4200")
public interface VerificationTokenRepository
        extends JpaRepository<VerificationToken, Long> {
    Optional<VerificationToken> findByToken(String token);
}
