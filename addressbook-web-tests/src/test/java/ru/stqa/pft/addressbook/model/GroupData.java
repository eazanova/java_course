package ru.stqa.pft.addressbook.model;

public class GroupData {
  private int id;
  private final String name;
  private final String head;
  private final String footer;

  public GroupData(String name, String head, String footer) {
    this.id = 0;
    this.name = name;
    this.head = head;
    this.footer = footer;
  }

  public GroupData(int id, String name, String head, String footer) {
    this.id = id;
    this.name = name;
    this.head = head;
    this.footer = footer;
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

  public void setId(int id) {

    this.id = id;
  }

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

  @Override
  public String toString() {
    return "GroupData{" +
            "id='" + id + '\'' +
            ", name='" + name + '\'' +
            '}';
  }

}
