package com.lambda.sprint.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name="todos")
public class Todo
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long todoid;

    @Column(nullable = false)
    private String desc;

    //datestarted
    //datecompleted

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="userid")
    @JsonIgnoreProperties({"todos", "hibernateLazyInitializer"})
    private User user;


    public Todo()
    {
    }

    public Todo(String desc, User user)
    {
        this.desc = desc;
        this.user = user;
    }

    public long getTodoid()
    {
        return todoid;
    }

    public void setTodoid(long todoid)
    {
        this.todoid = todoid;
    }

    public String getDesc()
    {
        return desc;
    }

    public void setDesc(String desc)
    {
        this.desc = desc;
    }

    public User getUser()
    {
        return user;
    }

    public void setUser(User user)
    {
        this.user = user;
    }
}
