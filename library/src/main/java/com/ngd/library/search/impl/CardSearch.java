package com.ngd.library.search.impl;

// import java.io.InputStream;

// import com.fasterxml.jackson.databind.JsonNode;
// import com.fasterxml.jackson.databind.ObjectMapper;
import com.ngd.library.search.Search;

public class CardSearch implements Search {

    // https://dev.to/sadiul_hakim/jackson-tutorial-comprehensive-guide-with-examples-2gdj

    String url = "https://api.scryfall.com/cards/named?fuzzy=blazing&nbsp;crescendo";

    @Override
    public void properties() {

        // ObjectMapper mapper = new ObjectMapper();
        // JsonNode rootNode = mapper.readTree(new InputStream(url));

        



        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'properties'");
    }
    
    
}
