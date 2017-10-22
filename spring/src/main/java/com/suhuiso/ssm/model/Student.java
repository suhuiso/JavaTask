package com.suhuiso.ssm.model;

import java.io.Serializable;

public class Student implements Serializable{

    private int id;
    private String name;
    private String type;
    private int num;
    private long updateAt;
    private long createAt;
    private String declaration;

    public Student(int id, String name, String type, int num, long updateAt, long createAt, String declaration) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.num = num;
        this.updateAt = updateAt;
        this.createAt = createAt;
        this.declaration = declaration;
    }

    public Student(String name, String type, int num, long updateAt, long createAt, String declaration) {
        this.name = name;
        this.type = type;
        this.num = num;
        this.updateAt = updateAt;
        this.createAt = createAt;
        this.declaration = declaration;
    }

    public Student() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public long getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(long updateAt) {
        this.updateAt = updateAt;
    }

    public long getCreateAt() {
        return createAt;
    }

    public void setCreateAt(long createAt) {
        this.createAt = createAt;
    }

    public String getDeclaration() {
        return declaration;
    }

    public void setDeclaration(String declaration) {
        this.declaration = declaration;
    }

    public String toString() {
        return "[ID = "+id+", Name = "+name+", Type="+type+", Num="+num+", Update At = "+updateAt+", Create At = "+createAt+"]";
    }

}
