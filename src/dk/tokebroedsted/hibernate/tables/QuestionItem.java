package dk.tokebroedsted.hibernate.tables;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class QuestionItem {

    @Id
    @GeneratedValue
    public int id;

    @ManyToOne
    private FeedItem feedItem;

    @ManyToOne
    private Question question;

    private Integer numericAnswer;
    private Boolean boolAnswer;

    @ManyToOne
    private User owner;

    public int getId() {
        return id;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public void setFeedItem(FeedItem feedItem) {
        this.feedItem = feedItem;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public void setNumericAnswer(Integer numericAnswer) {
        this.numericAnswer = numericAnswer;
    }

    public void setId(int id) {
        this.id = id;
    }

    public FeedItem getFeedItem() {
        return feedItem;
    }

    public Question getQuestion() {
        return question;
    }

    public Integer getNumericAnswer() {
        return numericAnswer;
    }

    public User getOwner() {
        return owner;
    }

    public Boolean getBoolAnswer() {
        return boolAnswer;
    }
}
