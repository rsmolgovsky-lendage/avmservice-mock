package com.lendage.api.avmservice.api;

import java.util.Optional;

import javax.validation.Valid;

import com.lendage.api.avmservice.model.AVMRequest;
import com.lendage.api.avmservice.model.AVMResponse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.NativeWebRequest;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-04-12T17:59:29.809-07:00[America/Los_Angeles]")

@Controller
@RequestMapping("${openapi.aVMAdapter.base-path:}")
public class DefaultApiController implements DefaultApi {
    @Value("${storage.url.prefix}")
    private String storageUrlPrefix;

    private final NativeWebRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public DefaultApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @ApiOperation(value = "getAvmScore", nickname = "getAvmScoreUsingPOST", notes = "", response = AVMResponse.class, tags = {
            "avm-controller" })
    @ApiResponses({ @ApiResponse(code = 200, message = "OK", response = AVMResponse.class),
            @ApiResponse(code = 201, message = "Created"), @ApiResponse(code = 400, message = "Error getting the data"),
            @ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Not Found"), @ApiResponse(code = 500, message = "Server error") })
    @RequestMapping(value = { "/" }, produces = { "application/json" }, consumes = { "application/json" }, method = {
            RequestMethod.POST })
    public ResponseEntity<AVMResponse> getAvmScoreUsingPOST(
            @ApiParam(value = "avmRequest", required = true) @Valid @RequestBody AVMRequest avMRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType : MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String srcUrl = this.storageUrlPrefix
                            + avMRequest.getAddress().getStreetAddress().replaceAll(" ", "-") + "-"
                            + avMRequest.getAddress().getZip() + ".json";
                    System.out.println("!!!!!!! URL: " + srcUrl);

                    try {
                        ApiUtil.setExampleResponse(request, "application/json", ApiUtil.readFileFromURL(srcUrl));
                    } catch (Exception e) {
                        ApiUtil.setExampleResponse(request, "application/json",
                                "{  \"error_message\" : \"Property not found!\" }");
                    }
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.OK);

    }
}
