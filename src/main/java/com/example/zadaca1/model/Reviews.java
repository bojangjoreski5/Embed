package com.example.zadaca1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;
import java.util.List;
@Data
@Entity
public class Reviews {
    @Id
    private Long id;
    private String reviewId;
    private String reviewFullText;
    private String reviewText;
    private int numLikes;
    private int numComments;
    private int numShares;
    private int rating;
    private String reviewCreatedOn;
    private Date reviewCreatedOnDate;
    private int reviewCreatedOnTime;
    private int reviewerId;
    private String reviewerUrl;
    private String reviewerName;
    private String reviewerEmail;
    private String sourceType;
    private String isVerified;
    private String source;
    private String sourceName;
    private String sourceId;
    private String href;
    private String logoHref;

    public Reviews() {
    }

    public Reviews(Long id, String reviewId, String reviewFullText, String reviewText, int numLikes, int numComments, int numShares, int rating, String reviewCreatedOn, Date reviewCreatedOnDate, int reviewCreatedOnTime, int reviewerId, String reviewerUrl, String reviewerName, String reviewerEmail, String sourceType, String isVerified, String source, String sourceName, String sourceId, String href, String logoHref) {
        this.id = id;
        this.reviewId = reviewId;
        this.reviewFullText = reviewFullText;
        this.reviewText = reviewText;
        this.numLikes = numLikes;
        this.numComments = numComments;
        this.numShares = numShares;
        this.rating = rating;
        this.reviewCreatedOn = reviewCreatedOn;
        this.reviewCreatedOnDate = reviewCreatedOnDate;
        this.reviewCreatedOnTime = reviewCreatedOnTime;
        this.reviewerId = reviewerId;
        this.reviewerUrl = reviewerUrl;
        this.reviewerName = reviewerName;
        this.reviewerEmail = reviewerEmail;
        this.sourceType = sourceType;
        this.isVerified = isVerified;
        this.source = source;
        this.sourceName = sourceName;
        this.sourceId = sourceId;
        this.href = href;
        this.logoHref = logoHref;
    }


    public String getReviewId() {
        return reviewId;
    }

    public String getReviewFullText() {
        return reviewFullText;
    }

    public String getReviewText() {
        return reviewText;
    }

    public int getNumLikes() {
        return numLikes;
    }

    public int getNumComments() {
        return numComments;
    }

    public int getNumShares() {
        return numShares;
    }

    public int getRating() {
        return rating;
    }

    public String getReviewCreatedOn() {
        return reviewCreatedOn;
    }

    public Date getReviewCreatedOnDate() {
        return reviewCreatedOnDate;
    }

    public int getReviewCreatedOnTime() {
        return reviewCreatedOnTime;
    }

    public int getReviewerId() {
        return reviewerId;
    }

    public String getReviewerUrl() {
        return reviewerUrl;
    }

    public String getReviewerName() {
        return reviewerName;
    }

    public String getReviewerEmail() {
        return reviewerEmail;
    }

    public String getSourceType() {
        return sourceType;
    }

    public String getVerified() {
        return isVerified;
    }

    public String getSource() {
        return source;
    }

    public String getSourceName() {
        return sourceName;
    }

    public String getSourceId() {
        return sourceId;
    }

    public String getHref() {
        return href;
    }

    public String getLogoHref() {
        return logoHref;
    }

    public void setReviewId(String reviewId) {
        this.reviewId = reviewId;
    }

    public void setReviewFullText(String reviewFullText) {
        this.reviewFullText = reviewFullText;
    }

    public void setReviewText(String reviewText) {
        this.reviewText = reviewText;
    }

    public void setNumLikes(int numLikes) {
        this.numLikes = numLikes;
    }

    public void setNumComments(int numComments) {
        this.numComments = numComments;
    }

    public void setNumShares(int numShares) {
        this.numShares = numShares;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setReviewCreatedOn(String reviewCreatedOn) {
        this.reviewCreatedOn = reviewCreatedOn;
    }

    public void setReviewCreatedOnDate(Date reviewCreatedOnDate) {
        this.reviewCreatedOnDate = reviewCreatedOnDate;
    }

    public void setReviewCreatedOnTime(int reviewCreatedOnTime) {
        this.reviewCreatedOnTime = reviewCreatedOnTime;
    }

    public void setReviewerId(int reviewerId) {
        this.reviewerId = reviewerId;
    }

    public void setReviewerUrl(String reviewerUrl) {
        this.reviewerUrl = reviewerUrl;
    }

    public void setReviewerName(String reviewerName) {
        this.reviewerName = reviewerName;
    }

    public void setReviewerEmail(String reviewerEmail) {
        this.reviewerEmail = reviewerEmail;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    public void setVerified(String verified) {
        isVerified = verified;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public void setLogoHref(String logoHref) {
        this.logoHref = logoHref;
    }

    @Override
    public String toString() {
        return "Reviews{" +
                "id=" + id +
                ", reviewId='" + reviewId + '\'' +
                ", reviewFullText='" + reviewFullText + '\'' +
                ", reviewText='" + reviewText + '\'' +
                ", numLikes=" + numLikes +
                ", numComments=" + numComments +
                ", numShares=" + numShares +
                ", rating=" + rating +
                ", reviewCreatedOn='" + reviewCreatedOn + '\'' +
                ", reviewCreatedOnDate=" + reviewCreatedOnDate +
                ", reviewCreatedOnTime=" + reviewCreatedOnTime +
                ", reviewerId=" + reviewerId +
                ", reviewerUrl='" + reviewerUrl + '\'' +
                ", reviewerName='" + reviewerName + '\'' +
                ", reviewerEmail='" + reviewerEmail + '\'' +
                ", sourceType='" + sourceType + '\'' +
                ", isVerified=" + isVerified +
                ", source='" + source + '\'' +
                ", sourceName='" + sourceName + '\'' +
                ", sourceId='" + sourceId + '\'' +
                ", href='" + href + '\'' +
                ", logoHref='" + logoHref + '\'' +
                '}';
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
