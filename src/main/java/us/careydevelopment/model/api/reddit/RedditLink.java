package us.careydevelopment.model.api.reddit;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class RedditLink extends RedditContent {

    private String url;
    private String description;
    private String siteName;
    private String subject;
    
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getSiteName() {
        return siteName;
    }
    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }
    
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
