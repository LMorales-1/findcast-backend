package operation.findcastbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import operation.findcastbackend.model.Episode;
import operation.findcastbackend.service.EpisodeService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController // This means that this class is a Controller
@RequestMapping(path="/api/episode")
public class EpisodeController {

    @Autowired
    private EpisodeService episodeService;

    @GetMapping(path="/id={id}")
    public Episode getEpisodeById(@PathVariable("id") String episodeId) {
        // This returns a JSON or XML with the users
        return episodeService.getEpisodebyId(episodeId);
    }

    @GetMapping(path="/all/show={id}")
    public List<Episode> getAllEpisodesOfPodcast(@PathVariable("id") String podcastId) {
        // This returns a JSON or XML with the users
        return episodeService.getAllEpisodesOfPodcast(podcastId);
    }
    
}
