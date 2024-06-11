package com.geeks.core.core.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.apache.sling.api.SlingHttpServletRequest;

@Model(adaptables=SlingHttpServletRequest.class,
        adapters=Marketing.class,
        defaultInjectionStrategy=DefaultInjectionStrategy.OPTIONAL
)
public class MarketingImpl implements Marketing
{
    @Inject
    Resource compResource;

    @ValueMapValue
    private List<String> destination;

    @ValueMapValue
    private List<String> travelplan;

    @Override
    public List<String> getDestinationList() 
    {
        if(destination!=null)
        {
            return new ArrayList<String>(destination);
        }else{
            return Collections.emptyList();
        }
    }
    @Override
    public List<String> getTravelPlan() {
        if(travelplan!=null)
        {
            return new ArrayList<String>(travelplan);
        }else{
            return Collections.emptyList();
        }
    }
    
}
