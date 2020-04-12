package restassure.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
    @JsonProperty("data")
    private Data data;
    @JsonProperty("ad")
    private Ad ad;

    public User() {
    }

    public User(Data data, Ad ad) {
        super();
        this.data = data;
        this.ad = ad;
    }

    @JsonProperty("data")
    public Data getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(Data data) {
        this.data = data;
    }

    @JsonProperty("ad")
    public Ad getAd() {
        return ad;
    }

    @JsonProperty("ad")
    public void setAd(Ad ad) {
        this.ad = ad;
    }
}
