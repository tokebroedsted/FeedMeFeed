package dk.tokebroedsted.hibernate.tables;

import javax.persistence.*;
import java.util.List;

@Entity
public class Feed {

    @Id
    @GeneratedValue
    private int id;

    @ManyToOne
    private User owner;

    @Column(nullable = false)
    private String title;

    private String html, css;

    @OneToMany(mappedBy = "feed", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<FeedInput> feedInputs;

    @OneToMany(mappedBy = "feed", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Question> questions;

    @OneToMany(mappedBy = "feed", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Calculation> calculations;


    public Feed() {
    }

    public Feed(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    protected void setId(int id) {
        this.id = id;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public String getHtml() {
        return html;
    }

    public void setHtml(String html) {
        this.html = html;
    }

    public String getCss() {
        return css;
    }

    public void setCss(String css) {
        this.css = css;
    }

    public List<FeedInput> getFeedInputs() {
        return feedInputs;
    }

    public void setFeedInputs(List<FeedInput> feedInputs) {
        this.feedInputs = feedInputs;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public List<Calculation> getCalculations() {
        return calculations;
    }
}
