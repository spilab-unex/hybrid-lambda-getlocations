package es.unex.heatmap.hybrid.messages;

import java.util.List;

public class PostLocationsMessage {
	
	private String requestId;
	
	private List<LocationFrequency> locations;
		
	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<LocationFrequency> getLocations() {
		return locations;
	}

	public void setLocations(List<LocationFrequency> locations) {
		this.locations = locations;
	}

	public PostLocationsMessage(){}
	
}
