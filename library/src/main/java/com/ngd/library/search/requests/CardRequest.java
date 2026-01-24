package com.ngd.library.search.requests;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CardRequest extends SearchRequest {
    Long id;
    String cardId;
    String cardName;
    String json;
    Boolean isExact;
    Boolean isFuzzy;
}
