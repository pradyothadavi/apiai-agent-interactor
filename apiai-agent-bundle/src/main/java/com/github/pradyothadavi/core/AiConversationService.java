package com.github.pradyothadavi.core;


import com.github.pradyothadavi.request.QueryRequest;
import com.github.pradyothadavi.response.QueryResponse;

/**
 * Created by pradyot.ha on 12/05/17.
 */
public interface AiConversationService {
  
  QueryResponse processConversation(QueryRequest queryRequest);
}
