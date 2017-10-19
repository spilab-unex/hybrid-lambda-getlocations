package es.unex.heatmap.hybrid.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import es.unex.heatmap.hybrid.messages.PostLocationsMessage;


public class PostLocationsFunction  implements RequestHandler<PostLocationsMessage, String>{

	public String handleRequest(PostLocationsMessage locations, Context context) {
		context.getLogger().log("Locations received: "+locations.getRequestId());
		return "OK";
	}

}
