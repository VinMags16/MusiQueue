package com.example.musiqueue.HelperClasses;

public class QueueSong {
    private String title;
    private long upVotes = 0;
    private long downVotes=0;
    private String id;
    private String user;
    private int state;

    public QueueSong() {

    }

    public QueueSong(String id, String title, String user, long upVotes, long downVotes, int state) {
        this.id = id;
        this.title = title;
        this.user = user;
        this.upVotes = upVotes;
        this.downVotes = downVotes;
        this.state = state;
    }

    public String getTitle() {
        return this.title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public long getUpVotes() {
        return this.upVotes;
    }
    public void setUpVotes(long upVotes) {
        this.upVotes = upVotes;
    }
    public long getDownVotes() {
        return this.downVotes;
    }
    public void setDownVotes(long downVotes) {
        this.downVotes = downVotes;
    }
    public String getId() {return this.id;}
    public void setId(String id) {this.id = id;}
    public void setUser(String user) {this.user= user;}
    public String getUser(){return this.user;}

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
