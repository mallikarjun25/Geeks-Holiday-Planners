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
package org.apache.sling.scripting.sightly.apps.geeks__002d__holiday__002d__planners.components.__0070__ackage;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class package__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_clientlib = null;
out.write("<html>\n<head>\n    <script src=\"https://code.jquery.com/jquery-3.5.1.min.js\"></script>\n\n</head>\n<body>\n<table>\n\n<tr>\n<th class=\"dest\">Destinations</th>\n</tr>\n\n<tr>\n    <td>\n<input type=\"checkbox\" value=\"goa\" id=\"goa\" name=\"loc\"/>Goa</input>\n</td>\n</tr>\n\n\n<tr>\n    <td>\n<input type=\"checkbox\" value=\"Badrinath\" id=\"badrinath\" name=\"loc\"/>Badrinath</input>\n</td>\n</tr>\n\n<tr>\n<td>\n<input type=\"checkbox\" value=\"kerla\" id=\"kerla\" name=\"loc\"/>kerla</input>\n</tr>\n</tr>\n\n<tr>\n    <th class=\"ses\">Seasons</th>\n    </tr>\n\n\n    <tr>\n        <td>\n    <input type=\"checkbox\" id=\"summer\"/>Summer</input>\n    </td>\n    </tr>\n    \n    <tr>\n        <td>\n    <input type=\"checkbox\" id=\"winter\"/>Winter</input>\n    </td>\n    </tr>\n    \n    <tr>\n    <td>\n    <input type=\"checkbox\" id=\"rainy\"/>Rainy</input>\n    </tr>\n    </tr>\n\n</table>\n\n");
_global_clientlib = renderContext.call("use", "/libs/granite/sightly/templates/clientlib.html", obj());
{
    Object var_templatevar0 = renderContext.getObjectModel().resolveProperty(_global_clientlib, "all");
    {
        String var_templateoptions1_field$_categories = "TravelPlan";
        {
            java.util.Map var_templateoptions1 = obj().with("categories", var_templateoptions1_field$_categories);
            callUnit(out, renderContext, var_templatevar0, var_templateoptions1);
        }
    }
}
out.write("\n\n<h1 class=\"result\"> </h1>\n</body>\n\n</html>");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

