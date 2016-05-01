package ru.stqa.pft.addressbook;

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
}
