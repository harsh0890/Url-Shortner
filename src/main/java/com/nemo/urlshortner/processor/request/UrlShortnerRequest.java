package com.nemo.urlshortner.processor.request;


import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.URL;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UrlShortnerRequest {

    @NotBlank(message = "URL cannot be empty")
    @URL(message = "Invalid URL format")
    private String url;

}
