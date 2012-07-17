package dk.tokebroedsted.administration.client.model;

import com.google.gwt.user.client.rpc.IsSerializable;

import java.io.Serializable;
import java.util.List;

public class Feed implements IsSerializable, Serializable {

    public List<FeedInput> feedInputList;
    public List<Question> questions;
    public List<Calculation> calculations;

    int width = 600;
    int height = 200;
    String color = "#FFF";

    public Feed() {
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}