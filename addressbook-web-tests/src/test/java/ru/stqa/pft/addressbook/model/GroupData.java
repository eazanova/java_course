package ru.stqa.pft.addressbook.model;

public class GroupData {
  private int id = Integer.MAX_VALUE;
  private String name;
  private String head;
  private String footer;

/*
  public GroupData(String name, String head, String footer) {
    this.id = Integer.MAX_VALUE;
    this.name = name;
    this.head = head;
    this.footer = footer;
  }

  public GroupData(int id, String name, String head, String footer) {
    this.id = id;
    this.name = name;
    this.head = head;
    this.footer = footer;
  }*/

  public  int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getHead() {
    return head;
  }

  public String getFooter() {
    return footer;
  }

  public GroupData withId(int id) {
    this.id = id;
    return this;
  }

  public GroupData withFooter(String footer) {
    this.footer = footer;
    return this;
  }

  public GroupData withName(String name) {
    this.name = name;
    return this;
  }

  public GroupData withHead(String head) {
    this.head = head;
    return this;
  }

  @Override
  public String toString() {
    return "GroupData{" +
            "id='" + id + '\'' +
            ", name='" + name + '\'' +
            '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    GroupData groupData = (GroupData) o;

    return name != null ? name.equals(groupData.name) : groupData.name == null;
  }

  @Override
  public int hashCode() {
    return name != null ? name.hashCode() : 0;
  }
}
