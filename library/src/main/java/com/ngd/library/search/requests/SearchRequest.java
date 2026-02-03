package com.ngd.library.search.requests;

// TODO import com.ngd.core.....need to setup the bean?? ugh
// move to common code (outside library when able)

import com.ngd.library.common.Request;  // eventually will be connected to the core module

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SearchRequest implements Request{
    // Define fields and methods for search request handling

    String uri;

    


}
