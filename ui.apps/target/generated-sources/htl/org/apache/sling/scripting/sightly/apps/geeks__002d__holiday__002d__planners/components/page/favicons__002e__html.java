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
package org.apache.sling.scripting.sightly.apps.geeks__002d__holiday__002d__planners.components.page;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class favicons__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_clientlibresources = null;
out.write("\n");
_global_clientlibresources = "/apps/cq/core/resources";
out.write("<link rel=\"icon\" type=\"image/png\"");
{
    String var_attrcontent0 = (renderContext.getObjectModel().toString(renderContext.call("xss", _global_clientlibresources, "uri")) + "/images/favicons/mou.png");
    out.write(" href=\"");
    out.write(renderContext.getObjectModel().toString(var_attrcontent0));
    out.write("\"");
}
out.write("/>\n<link rel=\"icon\" type=\"image/png\"");
{
    String var_attrcontent1 = (renderContext.getObjectModel().toString(renderContext.call("xss", _global_clientlibresources, "uri")) + "/images/favicons/mou.png");
    out.write(" href=\"");
    out.write(renderContext.getObjectModel().toString(var_attrcontent1));
    out.write("\"");
}
out.write(" sizes=\"32x32\"/>\n\n\n\n<meta name=\"msapplication-TileColor\" content=\"#FFFFFF\"/>\n<meta name=\"msapplication-TileImage\"");
{
    String var_attrcontent2 = (renderContext.getObjectModel().toString(renderContext.call("xss", _global_clientlibresources, "attribute")) + "/images/favicons/mou.png");
    out.write(" content=\"");
    out.write(renderContext.getObjectModel().toString(var_attrcontent2));
    out.write("\"");
}
out.write("/>\n\n\n<link rel=\"preload\"");
{
    String var_attrcontent3 = (renderContext.getObjectModel().toString(renderContext.call("xss", _global_clientlibresources, "uri")) + "/fonts/geeks-holiday-planners-icon-font.ttf");
    out.write(" href=\"");
    out.write(renderContext.getObjectModel().toString(var_attrcontent3));
    out.write("\"");
}
out.write(" as=\"font\" type=\"font/ttf\" crossorigin/>");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

