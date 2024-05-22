import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import models.Data;
import org.bson.Document;

public class TrackerAsserts {
  public static void checkUserInfo(Document infoFromDb, Data infoFromResponse) {
    assertThat(infoFromDb.getObjectId("_id").toString())
        .as("id is correct")
        .isEqualTo(infoFromResponse.getId());
    assertThat(infoFromDb.getString("name"))
        .as("name is correct")
        .isEqualTo(infoFromResponse.getName());
    assertThat(infoFromDb.getString("email"))
        .as("id email correct")
        .isEqualTo(infoFromResponse.getEmail());
    assertThat(infoFromDb.getString("dateFormat"))
        .as("date format is correct")
        .isEqualTo(infoFromResponse.getDateFormat());
    assertThat(infoFromDb.getString("locale"))
        .as("locale is correct")
        .isEqualTo(infoFromResponse.getLocale());
    assertThat(infoFromDb.getString("theme"))
        .as("theme is correct")
        .isEqualTo(infoFromResponse.getTheme());
    assertThat(infoFromDb.getBoolean("emailVerified"))
        .as("email verified is correct")
        .isEqualTo(infoFromResponse.getEmailVerified());
  }
}
