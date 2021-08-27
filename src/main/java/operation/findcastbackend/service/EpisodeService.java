package operation.findcastbackend.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import operation.findcastbackend.model.Episode;
import operation.findcastbackend.repository.EpisodeRepository;

@Service
public class EpisodeService {
    
    @Autowired
    private EpisodeRepository episodeRepository;
    
    public List<Episode> getAllEpisodesOfPodcast(String podcastId){
        List<Episode> episodes = new ArrayList<>();
        episodeRepository.findByPodcastId(podcastId)
        .forEach(episodes::add);

        return episodes;
    }

    public Episode getEpisodebyId(String id){
        return episodeRepository.findById(id).orElse(null);
    }

}
