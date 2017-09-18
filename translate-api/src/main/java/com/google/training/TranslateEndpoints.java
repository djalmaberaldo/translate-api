package com.google.training;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.Named;
import com.google.api.server.spi.config.ApiMethod.HttpMethod;
import com.google.training.Constants;
import com.google.training.Translate;

@Api(name = "helloworldendpoints", version = "v1",
scopes = {Constants.EMAIL_SCOPE },
        clientIds = {Constants.WEB_CLIENT_ID, Constants.API_EXPLORER_CLIENT_ID },
        description = "API for google translate.")

public class TranslateEndpoints {

    // Declare this method as a method available externally through Endpoints
    @ApiMethod(name = "detect", path = "languange.detections",
            httpMethod = HttpMethod.POST)

    public String detectLanguage(@Named("text") String text) {
        return text;
    }

}
