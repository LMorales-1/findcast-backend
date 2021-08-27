package operation.findcastbackend.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Pair;
import org.springframework.stereotype.Service;

import operation.findcastbackend.model.Episode;
import operation.findcastbackend.model.Podcast;
import operation.findcastbackend.repository.EpisodeRepository;
import operation.findcastbackend.repository.PodcastRepository;

@Service
public class PodcastService {

    @Autowired
    private PodcastRepository podcastRepository;

    @Autowired
    private EpisodeRepository episodeRepository;
    
    public List<Podcast> getPodcasts(){
        return podcastRepository.findAll();
    }

    public Podcast getPodcastbyId(String id){
        return podcastRepository.findById(id).orElse(null);
    }

    public List<Podcast> getPodcastbyName(String name){
        List<Podcast> podcast = new ArrayList<>();
        
        podcastRepository.findByName(name)
        .forEach(podcast::add);

        return podcast;
    }

    public Pair<Podcast,List<Episode>> findPodcastAndEpisodesById(String podcastId){
        Podcast podcast = podcastRepository.findById(podcastId).orElse(null);
        List<Episode> episodes = new ArrayList<>();
        
        if(podcast != null){
            episodeRepository.findByPodcastId(podcastId)
            .forEach(episodes::add);
        }

        return Pair.of(podcast, episodes);
    }

    public List<Podcast> searchForPodcast(String keyword){
        List<Podcast> podcast = new ArrayList<>();
        
        podcastRepository.search(keyword)
        .forEach(podcast::add);
        
        return podcast;
    }
}
