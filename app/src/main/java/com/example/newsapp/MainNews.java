package com.example.newsapp;
import java.util.ArrayList;

public class MainNews {
    private String status;
    private String totalResults;
    private ArrayList<ModalClass> articles;
    // type of array is ModalClass and we have to fetch data of article jsonarray


    public MainNews(String status, String totalResults, ArrayList<ModalClass> articles) {
        this.status = status;
        this.totalResults = totalResults;
        this.articles = articles;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(String totalResults) {
        this.totalResults = totalResults;
    }

    public ArrayList<ModalClass> getArticles() {
        return articles;
    }

    public void setArticles(ArrayList<ModalClass> articles) {
        this.articles = articles;
    }
}
