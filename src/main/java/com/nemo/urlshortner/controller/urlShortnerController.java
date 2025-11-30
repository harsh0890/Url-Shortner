package com.nemo.urlshortner.controller;

import com.nemo.urlshortner.processor.UrlShortnerRequestProcessor;
import com.nemo.urlshortner.processor.request.UrlShortnerRequest;
import com.nemo.urlshortner.processor.response.UrlShortnerResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class urlShortnerController {

    private UrlShortnerRequestProcessor processor = new UrlShortnerRequestProcessor();

    @GetMapping("/")
    public ResponseEntity<UrlShortnerResponse> serveShortner
            (@RequestParam UrlShortnerRequest request ){

        UrlShortnerResponse shortnerResponse = processor.getOriginalurl(request);
        return new ResponseEntity<>(shortnerResponse, HttpStatus.CREATED);
    }
}
