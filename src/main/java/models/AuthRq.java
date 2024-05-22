package models;

public class AuthRq {
  public String email;
  public String password;

  public AuthRq(String email, String password) {
    this.email = email;
    this.password = password;
  }
}
