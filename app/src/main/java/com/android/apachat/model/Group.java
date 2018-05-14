package com.android.apachat.model;


public class Group extends Room{
    public String id;
    public ListFriend listFriend;

    public Group(){
        listFriend = new ListFriend();
    }

    public ListFriend getListFriend() {
        return listFriend;
    }
}
