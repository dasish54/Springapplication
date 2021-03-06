package com.johnsharp.player.domain;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="entries")
public class PlayerEntry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "entry_id")
    private Integer id;

    @NotEmpty
    private String user;

    public PlayerEntry(Integer id, @NotEmpty String user, @NotEmpty String comment) {
        this.id = id;
        this.user = user;
        this.comment = comment;
    }

    @Override
    public String toString(){
        return "PlayerEntry{" +
                "id=" + id +
                ", user='" + user + '\'' +
                ", comment='" + comment + '\''+
                '}';

    }

    public PlayerEntry(){

    }

    @NotEmpty
    private String comment;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
