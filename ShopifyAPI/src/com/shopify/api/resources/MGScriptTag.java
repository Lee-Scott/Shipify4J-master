/**
 * DO NOT MODIFY THIS CODE
 *
 * Place all of your changes in ScriptTag.java
 *
 * It has been machine generated from fixtures and your changes will be
 * lost if anything new needs to be added to the API.
 **/
// Last Generated: 2011-09-26T15:53:49-04:00
package com.shopify.api.resources;

import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * This code has been machine generated by processing the single entry
 * fixtures found from the Shopify API Documentation
 */

public class MGScriptTag extends ShopifyResource {

	@JsonProperty("event")
	public String getEvent() {
		return (String)getAttribute("event");
	}
	@JsonProperty("event")
	public void setEvent(String _event) {
		setAttribute("event", _event);
	}

	@JsonProperty("src")
	public String getSrc() {
		return (String)getAttribute("src");
	}
	@JsonProperty("src")
	public void setSrc(String _src) {
		setAttribute("src", _src);
	}

}