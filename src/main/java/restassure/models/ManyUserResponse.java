package restassure.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ManyUserResponse {
    @JsonProperty("page")
    private long page;
    @JsonProperty("per_page")
    private long perPage;
    @JsonProperty("total")
    private long total;
    @JsonProperty("total_pages")
    private long totalPages;
    @JsonProperty("data")
    private List<Datum> data;
    @JsonProperty("ad")
    private Ad ad;

    public ManyUserResponse() {
    }
    public ManyUserResponse(long page, long perPage, long total, long totalPages, List<Datum> data, Ad ad) {
        super();
        this.page = page;
        this.perPage = perPage;
        this.total = total;
        this.totalPages = totalPages;
        this.data = data;
        this.ad = ad;
    }

    @JsonProperty("page")
    public long getPage() {
        return page;
    }

    @JsonProperty("page")
    public void setPage(long page) {
        this.page = page;
    }

    @JsonProperty("per_page")
    public long getPerPage() {
        return perPage;
    }

    @JsonProperty("per_page")
    public void setPerPage(long perPage) {
        this.perPage = perPage;
    }

    @JsonProperty("total")
    public long getTotal() {
        return total;
    }

    @JsonProperty("total")
    public void setTotal(long total) {
        this.total = total;
    }

    @JsonProperty("total_pages")
    public long getTotalPages() {
        return totalPages;
    }

    @JsonProperty("total_pages")
    public void setTotalPages(long totalPages) {
        this.totalPages = totalPages;
    }

    @JsonProperty("data")
    public List<Datum> getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(List<Datum> data) {
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
