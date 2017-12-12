package edu.mum.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.validator.constraints.NotEmpty;

public class Comment implements Serializable{
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comment_id")
    private Long id;

    private Date postingTime;

    @NotEmpty(message = "{NotEmpty.validation}")
    private String title;

    @NotEmpty(message = "{NotEmpty.validation}")
    @Column(name="content", columnDefinition="TEXT")
    private String content;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinColumn(name = "episode_id")
    private Episode episode ;

    public Comment() {}

    public Comment(String title, String content) {
        this.title = title;
        this.content = content;
    }

}
