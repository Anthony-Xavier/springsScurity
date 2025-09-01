package xavier.springsecurity.entities.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import xavier.springsecurity.entities.Tweet;

public interface TweetRepository extends JpaRepository<Tweet,Long> {
}
