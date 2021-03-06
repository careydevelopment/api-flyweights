package us.careydevelopment.model.api.youtube;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Channel {

    private String name;
    private String id;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    } 
    
}
