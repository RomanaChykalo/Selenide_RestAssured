package restassure.models.post;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserRequest {
    @JsonProperty
    private String name;
    @JsonProperty
    private String job;

    public UserRequest(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public UserRequest() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
