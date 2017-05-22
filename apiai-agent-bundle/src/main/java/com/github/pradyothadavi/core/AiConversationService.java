package com.github.pradyothadavi.core;


import com.github.pradyothadavi.api.ai.request.QueryRequest;
import com.github.pradyothadavi.api.ai.response.QueryResponse;

/**
 * Created by pradyot.ha on 12/05/17.
 */
public interface AiConversationService {
  
  QueryResponse processConversation(QueryRequest queryRequest);
}
