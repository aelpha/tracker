import static org.assertj.core.api.Assertions.assertThat;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import io.qameta.allure.Step;
import java.io.IOException;
import models.AuthRq;
import models.TrackerResponse;
import retrofit2.Response;

public class TrackerHelper {
  @Step("auth user")
  public static String authUser(String email, String password) throws IOException {
    Response<TrackerResponse> trackerResponse =
        TrackerApiManager.authUser(new AuthRq(email, password));
    assertThat(trackerResponse.body()).isNotNull();
    return trackerResponse.body().getData().getToken();
  }

  public static MongoDatabase getDatabase() {
    MongoClient mongoClient =
        MongoClients.create(
            ;
    MongoDatabase database = mongoClient.getDatabase("tracker-backend-t-master");
    return database;
  }
}
