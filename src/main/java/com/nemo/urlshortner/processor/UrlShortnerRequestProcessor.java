package com.nemo.urlshortner.processor;

import com.nemo.urlshortner.processor.request.UrlShortnerRequest;
import com.nemo.urlshortner.processor.response.UrlShortnerResponse;
import org.springframework.stereotype.Service;


@Service
public class UrlShortnerRequestProcessor {

    public UrlShortnerResponse getOriginalurl(UrlShortnerRequest request){
        UrlShortnerResponse response = new UrlShortnerResponse();

        return response;
    }

}
