package com.geeks.core.core.models;

import java.util.ArrayList;
import java.util.List;



import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.apache.sling.api.SlingHttpServletRequest;

@Model(adaptables=SlingHttpServletRequest.class,
        defaultInjectionStrategy=DefaultInjectionStrategy.OPTIONAL
)
public class GetList
{

    @ValueMapValue
    private int star;

    List<Integer> n=new ArrayList<Integer>();

    public List<Integer> getList(){
        for(int i=0;i<star;i++){
            n.add(i);
        }
        return n;
    }
    {
       
    }
    
}
