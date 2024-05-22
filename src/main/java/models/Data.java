package models;

import java.util.List;
import lombok.Getter;

@Getter
public class Data {
  public String id;
  public String name;
  public String email;
  public Boolean emailVerified;
  public List<Object> workspaces;
  public Boolean hasApiToken;
  public String dateFormat;
  public String timeFormat;
  public String locale;
  public String theme;
  public String token;
  public String refreshToken;
}
