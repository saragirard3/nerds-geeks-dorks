package com.ngd.library.search.impl;

import com.ngd.library.search.SearchResponse;
import com.ngd.library.search.requests.MagicCardRequest;
import com.ngd.library.search.requests.SearchRequest;

public class CardSearch extends Search {

    // https://dev.to/sadiul_hakim/jackson-tutorial-comprehensive-guide-with-examples-2gdj
    // <scryfall.api.url>https://api.scryfall.com/</scryfall.api.url>

    // String url = "/cards/named?fuzzy=blazing+crescendo";
    MagicCardRequest cardRequest;
    SearchResponse searchResponse;

    public SearchResponse search(SearchRequest request) {
        
        cardRequest = (MagicCardRequest) request;

        String uri = createUri(cardRequest);

        String finalRequest = formatRequest(cardRequest);

        return sendRequest(uri,finalRequest);

    }

    private String createUri(MagicCardRequest cardRequest) {
        // TODO
        // Build URI based on cardRequest parameters

        return null;
    }

    private String formatRequest(MagicCardRequest cardRequest) {
        // TODO 
        // Build URL based on cardRequest parameters
        

        return null;
    }

    private SearchResponse sendRequest(String uri, String finalRequest) {
        // TODO
        // Send HTTP request and parse response into SearchResponse object

        return null;
    }
        
}