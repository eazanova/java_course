package ru.stqa.pft.addressbook;

public class ContactData {
  private final String farstname;
  private final String lastname;
  private final String adress;
  private final String home;
  private final String email;

  public ContactData(String farstname, String lastname, String adress, String home, String email) {
    this.farstname = farstname;
    this.lastname = lastname;
    this.adress = adress;
    this.home = home;
    this.email = email;
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
}
