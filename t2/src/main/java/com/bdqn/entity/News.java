package com.bdqn.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@JsonIgnoreProperties(value = { "hibernateLazyInitializer"})
public class News {
    private int nid;
    private String ntitle;
    private String nauthor;
    private Date ncreatedate;
    private String npicpath;
    private String ncontent;
    private Date nmodifydate;
    private String nsummary;
    private Topic topicByNtid;

    @Id
    @Column(name = "nid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getNid() {
        return nid;
    }

    public void setNid(int nid) {
        this.nid = nid;
    }

    @Basic
    @Column(name = "ntitle")
    public String getNtitle() {
        return ntitle;
    }

    public void setNtitle(String ntitle) {
        this.ntitle = ntitle;
    }

    @Basic
    @Column(name = "nauthor")
    public String getNauthor() {
        return nauthor;
    }

    public void setNauthor(String nauthor) {
        this.nauthor = nauthor;
    }

    @Basic
    @Column(name = "ncreatedate")
    public Date getNcreatedate() {
        return ncreatedate;
    }

    public void setNcreatedate(Date ncreatedate) {
        this.ncreatedate = ncreatedate;
    }

    @Basic
    @Column(name = "npicpath")
    public String getNpicpath() {
        return npicpath;
    }

    public void setNpicpath(String npicpath) {
        this.npicpath = npicpath;
    }

    @Basic
    @Column(name = "ncontent")
    public String getNcontent() {
        return ncontent;
    }

    public void setNcontent(String ncontent) {
        this.ncontent = ncontent;
    }

    @Basic
    @Column(name = "nmodifydate")
    public Date getNmodifydate() {
        return nmodifydate;
    }

    public void setNmodifydate(Date nmodifydate) {
        this.nmodifydate = nmodifydate;
    }

    @Basic
    @Column(name = "nsummary")
    public String getNsummary() {
        return nsummary;
    }

    public void setNsummary(String nsummary) {
        this.nsummary = nsummary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        News news = (News) o;
        return nid == news.nid &&
                Objects.equals(ntitle, news.ntitle) &&
                Objects.equals(nauthor, news.nauthor) &&
                Objects.equals(ncreatedate, news.ncreatedate) &&
                Objects.equals(npicpath, news.npicpath) &&
                Objects.equals(ncontent, news.ncontent) &&
                Objects.equals(nmodifydate, news.nmodifydate) &&
                Objects.equals(nsummary, news.nsummary);
    }

    @Override
    public int hashCode() {

        return Objects.hash(nid, ntitle, nauthor, ncreatedate, npicpath, ncontent, nmodifydate, nsummary);
    }

    @ManyToOne
    @JoinColumn(name = "ntid", referencedColumnName = "tid")
    public Topic getTopicByNtid() {
        return topicByNtid;
    }

    public void setTopicByNtid(Topic topicByNtid) {
        this.topicByNtid = topicByNtid;
    }
}
