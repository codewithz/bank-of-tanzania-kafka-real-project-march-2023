package tz.bot.model;

import javax.persistence.*;

@Entity
@Table(name="wikimedia_recentchange")
public class WikimediaData {

    @Id
    @SequenceGenerator(
            name = "event_sequence",
            sequenceName = "event_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "event_sequence"
    )
    @Column(
            name="id",
            nullable = false
    )
    private Integer id;

    @Column(
            name = "wiki_event_data",
            columnDefinition = "text"
    )
    private String wikiEventData;

    public WikimediaData() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWikiEventData() {
        return wikiEventData;
    }

    public void setWikiEventData(String wikiEventData) {
        this.wikiEventData = wikiEventData;
    }
}
