import com.mongodb.client.MongoDatabase;
import models.TrackerResponse;
import org.bson.Document;
import org.testng.annotations.Test;
import retrofit2.Response;

import java.io.IOException;
import java.util.Objects;

import static org.assertj.core.api.Assertions.assertThat;

public class TrackerTests {
  @Test
  public void userInfoTest() throws IOException {
    MongoDatabase database = TrackerHelper.getDatabase();
    Document userData = database.getCollection("users").find().first();
    String email = Objects.requireNonNull(userData).get("email").toString();

    String token = TrackerHelper.authUser(email, "Qwerty123[]");
    Response<TrackerResponse> response = TrackerApiManager.getUserData(token);

    assertThat(response.body()).isNotNull();
    TrackerAsserts.checkUserInfo(userData, response.body().getData());
  }
}
