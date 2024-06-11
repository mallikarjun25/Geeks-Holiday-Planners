/*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 ******************************************************************************/
package org.apache.sling.scripting.sightly.apps.geeks__002d__holiday__002d__planners.components.socialmediaicons;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class socialmediaicons__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _dynamic_properties = bindings.get("properties");
out.write("<div>\n<h3>Follow Us</h3><br/>\n\n");
{
    Object var_testvariable0 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "facebook");
    if (renderContext.getObjectModel().toBoolean(var_testvariable0)) {
        out.write("\n<a href=\"https://www.facebook.com\" target=\"_blank\"><i class=\"icon ion-social-facebook\"></i></a>\n");
    }
}
out.write("\n\n");
{
    Object var_testvariable1 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "twitter");
    if (renderContext.getObjectModel().toBoolean(var_testvariable1)) {
        out.write("\n<a href=\"https://www.twitter.com\" target=\"_blank\"><i class=\"icon ion-social-twitter\"></i></a>\n");
    }
}
out.write("\n\n\n");
{
    Object var_testvariable2 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "snap");
    if (renderContext.getObjectModel().toBoolean(var_testvariable2)) {
        out.write("\n<a href=\"https://www.snapchat.com/\" target=\"_blank\"><i class=\"icon ion-social-snapchat\"></i></a>\n");
    }
}
out.write("\n\n");
{
    Object var_testvariable3 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "insta");
    if (renderContext.getObjectModel().toBoolean(var_testvariable3)) {
        out.write("\n<a href=\"https://www.instagram.com/\" target=\"_blank\"><i class=\"icon ion-social-instagram\"></i></a>\n");
    }
}
out.write("\n\n\n");
{
    Object var_testvariable4 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "youtube");
    if (renderContext.getObjectModel().toBoolean(var_testvariable4)) {
        out.write("\n<a href=\"https://www.youtube.com/\" target=\"_blank\"><i class=\"icon ion-social-youtube\"></i></a>\n");
    }
}
out.write("\n</div>\n\n<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css\"/>\n\n\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

