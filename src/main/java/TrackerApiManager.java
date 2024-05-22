import infra.ApiHelper;
import java.io.IOException;
import models.AuthRq;
import models.TrackerResponse;
import retrofit2.Call;
import retrofit2.Response;

public class TrackerApiManager {
  private TrackerApiManager() {}

  static TrackerApi trackerApi = ApiHelper.getClient().create(TrackerApi.class);

  public static Response<TrackerResponse> authUser(AuthRq authRq) throws IOException {
    Call<TrackerResponse> call = trackerApi.authUser(authRq);
    return call.execute();
  }

  public static Response<TrackerResponse> getUserData(String token) throws IOException {
    Call<TrackerResponse> call = trackerApi.getUserData(token);
    return call.execute();
  }
}
