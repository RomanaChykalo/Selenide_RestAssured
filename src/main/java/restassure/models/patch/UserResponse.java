package restassure.models.patch;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserResponse {
    @JsonProperty
    private String name;
    @JsonProperty
    private String job;
    @JsonProperty
    private String updatedAt;

    public UserResponse(String name, String job, String updatedAt) {
        this.name = name;
        this.job = job;
        this.updatedAt = updatedAt;
    }

    public UserResponse() {
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

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }
}
