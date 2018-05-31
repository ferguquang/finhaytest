package com.ngo.ducquang.test.mh12_page.request.incomingRequest;

/**
 * Created by ducqu on 5/31/2018.
 */

public class IncomingModel {
    private String id = "";
    private String name = "", content = "", time = "", status = "", manager = "", avatar = "";

    public IncomingModel(String name, String content, String time, String status, String manager, String avatar) {
        this.name = name;
        this.content = content;
        this.time = time;
        this.status = status;
        this.manager = manager;
        this.avatar = avatar;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}
