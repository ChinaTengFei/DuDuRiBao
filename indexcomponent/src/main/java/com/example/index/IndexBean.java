package com.example.index;

/**
 * Created by George on 2017/12/13.
 */

public class IndexBean {
    private String mName;
    private int age;

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public IndexBean(String mName, int age) {
        this.mName = mName;
        this.age = age;
    }
}
