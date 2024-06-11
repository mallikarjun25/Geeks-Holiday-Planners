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
package org.apache.sling.scripting.sightly.apps.geeks__002d__holiday__002d__planners.components.starrating;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class starrating__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _dynamic_properties = bindings.get("properties");
out.write("<h3>Ratings</h3>\n\n");
{
    boolean var_testvariable0 = (org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.strictEq(renderContext.getObjectModel().resolveProperty(_dynamic_properties, "star"), "1"));
    if (var_testvariable0) {
        out.write("\n<a href=\"#\"><i class=\"icon ion-android-star\"></i></a>\n");
    }
}
out.write("\n\n");
{
    boolean var_testvariable1 = (org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.strictEq(renderContext.getObjectModel().resolveProperty(_dynamic_properties, "star"), "2"));
    if (var_testvariable1) {
        out.write("\n<a href=\"#\"><i class=\"icon ion-android-star\"></i></a>\n<a href=\"#\"><i class=\"icon ion-android-star\"></i></a>\n");
    }
}
out.write("\n\n");
{
    boolean var_testvariable2 = (org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.strictEq(renderContext.getObjectModel().resolveProperty(_dynamic_properties, "star"), "3"));
    if (var_testvariable2) {
        out.write("\n<a href=\"#\"><i class=\"icon ion-android-star\"></i></a>\n<a href=\"#\"><i class=\"icon ion-android-star\"></i></a>\n<a href=\"#\"><i class=\"icon ion-android-star\"></i></a>\n");
    }
}
out.write("\n\n");
{
    boolean var_testvariable3 = (org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.strictEq(renderContext.getObjectModel().resolveProperty(_dynamic_properties, "star"), "4"));
    if (var_testvariable3) {
        out.write("\n<a href=\"#\"><i class=\"icon ion-android-star\"></i></a>\n<a href=\"#\"><i class=\"icon ion-android-star\"></i></a>\n\n<a href=\"#\"><i class=\"icon ion-android-star\"></i></a>\n<a href=\"#\"><i class=\"icon ion-android-star\"></i></a>\n");
    }
}
out.write("\n\n");
{
    boolean var_testvariable4 = (org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.strictEq(renderContext.getObjectModel().resolveProperty(_dynamic_properties, "star"), "5"));
    if (var_testvariable4) {
        out.write("\n<a href=\"#\"><i class=\"icon ion-android-star\"></i></a>\n<a href=\"#\"><i class=\"icon ion-android-star\"></i></a>\n<a href=\"#\"><i class=\"icon ion-android-star\"></i></a>\n<a href=\"#\"><i class=\"icon ion-android-star\"></i></a>\n<a href=\"#\"><i class=\"icon ion-android-star\"></i></a>\n\n");
    }
}
out.write("\n\n");
{
    String var_5 = (("<!-- <ul data-sly-list=\"" + renderContext.getObjectModel().toString(renderContext.call("xss", (new Object[] {0, 1, 2, 3, 4, 5}), "comment"))) + "\">\n    <li id=\"data\"><a href=\"#\"><i class=\"icon ion-android-star\" ></i></a></li>\n    </ul> -->");
    out.write(renderContext.getObjectModel().toString(var_5));
}
out.write("\n<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css\"/>");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

