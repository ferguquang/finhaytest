package com.ngo.ducquang.test.manhinh3;

public class InvestHistoryModel {
    private String id = "";
    private String time = "", actionName = "", money = "";
    private int status;

    public InvestHistoryModel(String time, String actionName, String money, int status) {
        this.time = time;
        this.actionName = actionName;
        this.money = money;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getActionName() {
        return actionName;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
