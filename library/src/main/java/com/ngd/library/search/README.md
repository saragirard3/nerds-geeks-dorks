<h1>Search Service</h1>

<h3>Search Service provides responses to all the search requests based on type.</h3>

    SearchService :: SearchResponse search(SearchRequest request)
        Incoming search request object will get sorted based on the type being requested (ie. card, set, etc).
            > move to individual impl search type class (ie. CardSearch, SetSearch, etc.)
        Impl will build the request as required by the api
            > send api the request
        Impl will receive the response and reformat into a SearchReponse and return it back to the requestor

    SearchService > Search > Impl > API > Impl > Search > Requestor


<h2>Tests</h2>

// TODO