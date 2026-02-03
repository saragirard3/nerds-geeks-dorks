package com.ngd.library.search.impl;

import com.ngd.library.search.*;
import com.ngd.library.search.requests.*;

public class Search implements SearchService { 

    @Override
    public SearchResponse search(SearchRequest request) {
        
        // see if the request type is a card request or set request, forward them to the correct handler
        if (request instanceof MagicCardRequest) {
            // handle card request
            CardSearch cardSearch = new CardSearch();
            return cardSearch.search(request);
        }

        else if (request instanceof SetRequest) {
            // handle set request
            SetSearch setSearch = new SetSearch();
            return setSearch.search(request);
        }

        else {
            // unknown request type
            
            return null;

        }
        
    }

}