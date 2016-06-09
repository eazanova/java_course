package ru.stqa.pft.addressbook.model;

public class ContactData {
  private int id;
  private final String farstname;
  private final String lastname;
  private final String adress;
  private final String home;
  private final String email;
  private String group;

  public ContactData(String farstname, String lastname, String adress, String home, String email, String group) {
    this.id = Integer.MAX_VALUE;
    this.farstname = farstname;
    this.lastname = lastname;
    this.adress = adress;
    this.home = home;
    this.email = email;
    this.group = group;
  }

  public ContactData(int id, String farstname, String lastname, String adress, String home, String email, String group) {
    this.id = id;
    this.farstname = farstname;
    this.lastname = lastname;
    this.adress = adress;
    this.home = home;
    this.email = email;
    this.group = group;
  }

  public int getId() {
    return id;
  }

  public String getFarstname() {
    return farstname;
  }

  public String getLastname() {
    return lastname;
  }

  public String getAdress() {
    return adress;
  }

  public String getHome() {
    return home;
  }

  public String getEmail() {
    return email;
  }

  public String getGroup() {
    return group;
  }

  @Override
  public String toString() {
    return "ContactData{" +
            "id=" + id +
            ", farstname='" + farstname + '\'' +
            ", lastname='" + lastname + '\'' +
            '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    ContactData that = (ContactData) o;

    if (farstname != null ? !farstname.equals(that.farstname) : that.farstname != null) return false;
    return lastname != null ? lastname.equals(that.lastname) : that.lastname == null;

  }

  @Override
  public int hashCode() {
    int result = farstname != null ? farstname.hashCode() : 0;
    result = 31 * result + (lastname != null ? lastname.hashCode() : 0);
    return result;
  }
}
