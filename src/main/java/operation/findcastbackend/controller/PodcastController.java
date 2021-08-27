package operation.findcastbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Pair;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import operation.findcastbackend.model.Episode;
import operation.findcastbackend.model.Podcast;
import operation.findcastbackend.service.PodcastService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController // This means that this class is a Controller
@RequestMapping(path="/api/podcast")
public class PodcastController {
    
    @Autowired
    private PodcastService podcastService;

    @GetMapping(path="/all")
    public List<Podcast> getAllPodcasts() {
        return podcastService.getPodcasts();
    }

    @GetMapping(path="/id={id}")
    public Podcast findPodcastById(@PathVariable("id") String podcastId){
        return podcastService.getPodcastbyId(podcastId);
    }

    @GetMapping(path="episodes/id={id}")
    public Pair<Podcast,List<Episode>> findPodcastAndEpisodesById(@PathVariable("id") String podcastId){
        return podcastService.findPodcastAndEpisodesById(podcastId);
    }

    @GetMapping(path="/name={name}")
    public List<Podcast> findPodcastByName(@PathVariable("name") String podcastName){
        return podcastService.getPodcastbyName(podcastName);
    }

    @GetMapping(path="/{keyword}")
    public List<Podcast> search(@PathVariable("keyword") String keyword){
        return podcastService.searchForPodcast(keyword);
    }


}
