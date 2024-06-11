package com.geeks.core.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.ExporterOption;
import org.apache.sling.models.annotations.Model;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

@Model(adaptables = Resource.class, resourceType = { "geeks-holiday-planners/components/marketing" }, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
@Exporter(name = "jackson", extensions = "json",selector="marketing", options = { @ExporterOption(name = "SerializationFeature.WRITE_DATES_AS_TIMESTAMPS", value = "true") })
public class MarketingModel {

	@Inject
	private List<String> destination;

    @Inject
	private List<String> travelplan;

	public List<String> getDestination() {
		return destination;
	}

    public List<String> getTravelPlan() {
		return travelplan;
	}

	
}