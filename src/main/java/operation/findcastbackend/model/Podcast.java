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
@Table(name = "podcasts")
public class Podcast {
    
    @Id
    @Column(name = "p_id")
    private String pocastId;

    private String name;
    
    private String description;

    private String publisher;

    private String explicit;

    private String image;
    
}