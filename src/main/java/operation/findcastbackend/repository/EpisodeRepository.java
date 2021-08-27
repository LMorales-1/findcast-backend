package operation.findcastbackend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import operation.findcastbackend.model.Episode;

@Repository
public interface EpisodeRepository extends JpaRepository<Episode, String>{

    public List<Episode> findByPodcastId(String podcastId);

}
