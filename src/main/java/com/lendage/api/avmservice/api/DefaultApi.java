/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.3.4).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.lendage.api.avmservice.api;

import java.util.Optional;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.context.request.NativeWebRequest;

import io.swagger.annotations.Api;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-04-12T17:59:29.809-07:00[America/Los_Angeles]")

@Validated
@Api(value = "default", description = "the default API")
public interface DefaultApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }
}