package operation.findcastbackend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import operation.findcastbackend.model.Podcast;

@Repository
public interface PodcastRepository extends JpaRepository<Podcast, String>{

    public List<Podcast> findByName(String name);
    
    @Query(value = "SELECT * FROM podcasts "
            + "WHERE MATCH(name, description, publisher)"
            + "AGAINST (?1)",
            nativeQuery = true)
    public List<Podcast> search(String keyword);
    
}
