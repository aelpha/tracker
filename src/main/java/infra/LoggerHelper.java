package infra;

import lombok.extern.slf4j.Slf4j;
import models.TrackerResponse;
import retrofit2.Response;

@Slf4j
public class LoggerHelper {

  public static void logResponse(Response<TrackerResponse> response) {
    log.info("Response Code: " + response.code());
    log.info("Response Body: " + response.body());
  }
}
