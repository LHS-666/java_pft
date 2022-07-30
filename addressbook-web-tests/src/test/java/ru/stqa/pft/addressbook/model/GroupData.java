package ru.stqa.pft.addressbook.model;

public class GroupData {
    private int id;
    private String name;
    private String header;
    private String footer;


    public GroupData(String name, String header, String footer) {
    this.id = Integer.MAX_VALUE;
    //this.id = id;
    this.name = name;
    this.header = header;
    this.footer = footer;
}
    public GroupData(int id, String name, String header, String footer) {
        this.id = id;
        this.name = name;
        this.header = header;
        this.footer = footer;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setHeader(String header) {
        this.header = header;
    }
    public void setFooter(String footer) {
        this.footer = footer;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GroupData groupData = (GroupData) o;
        if (id != groupData.id) return false;
        return name != null ? name.equals(groupData.name) : groupData.name == null;
    }
    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "GroupData{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
    public String header() {
    return header;
    }
    public String footer() {
    return footer;
    }
}