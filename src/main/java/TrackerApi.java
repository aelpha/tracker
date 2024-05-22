import models.AuthRq;
import models.TrackerResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface TrackerApi {

  @POST("/api/v1/auth/signin")
  Call<TrackerResponse> authUser(@Body AuthRq authRq);

  @GET("api/v1/myself")
  Call<TrackerResponse> getUserData(@Header("Authorization") String token);
}
