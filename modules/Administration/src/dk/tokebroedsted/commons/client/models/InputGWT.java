package dk.tokebroedsted.commons.client.models;

import com.google.gwt.user.client.rpc.IsSerializable;

import java.io.Serializable;

public class InputGWT implements IsSerializable, Serializable {

    //TODO Implement more types
    public enum Type {
        string
    }

    private String name;
    private Type type;

    public void setName(String name) {
        this.name = name;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public String getVariabelId() {
        return "<%input " + name + "%>";
    }
}