package ru.stqa.pft.addressbook.model;

public class GroupData {
  private final String name;
  private final String head;
  private final String footer;

  public GroupData(String name, String head, String footer) {
    this.name = name;
    this.head = head;
    this.footer = footer;
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
            "name='" + name + '\'' +
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
