package operation.findcastbackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "episodes")
public class Episode {
    
    @Id
    @Column(name = "e_id")
    private String episodeId;

    @Column(name = "p_id")
    private String podcastId;

    private String name;

    private String description;

    @Column(name = "release_date")
    private String releaseDate;

    private String explicit;

    @Column(name = "duration_ms")
    private int durationMs;

}
