package com.ngd.library.search;

import com.ngd.library.search.requests.SearchRequest;

public interface SearchService {

    /*
    Method to perform a search based on the given SearchRequest and return a SearchResponse.
    */
    SearchResponse search(SearchRequest request);
    
}
