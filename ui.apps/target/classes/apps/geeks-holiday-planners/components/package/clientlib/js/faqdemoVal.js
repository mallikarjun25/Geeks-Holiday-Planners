$(document).ready(function() { 
           $("#xy").click(function()
           {
              var a=$("#goa").prop("checked");
              var b=$("#badrinath").prop("checked");
              var c=$("#kerla").prop("checked");
               var d=$("#summer").prop("checked");
              var e=$("#winter").prop("checked");
              var f=$("#rainy").prop("checked"); 

               if(d){
               $(".krlPkg").hide();
                  $(".BadPkg").hide();
                  $(".pkgGoa").show();
                  $(".pkgGoaKer").hide();
                  $(".result").html("Sorry No Package Available! ").hide();
               }
               if(e){
               $(".krlPkg").hide();
                  $(".BadPkg").show();
                  $(".pkgGoa").show();
                  $(".pkgGoaKer").hide();
                   $(".result").html("Sorry No Package Available! ").hide();
               }
               if(f){
               $(".krlPkg").show();
                  $(".BadPkg").hide();
                  $(".pkgGoa").show();
                  $(".pkgGoaKer").show();
                   $(".result").html("Sorry No Package Available! ").hide();
               }
               if(d && e && f){
               $(".krlPkg").hide();
                  $(".BadPkg").hide();
                  $(".pkgGoa").show();
                  $(".pkgGoaKer").hide();
                   $(".result").html("Sorry No Package Available! ").hide();
               }


              if((b && f)  || (b && d) || (c && d) || (c && e) ) 
              {


                $(".krlPkg").hide();
                  $(".BadPkg").hide();
                  $(".pkgGoa").hide();
                  $(".pkgGoaKer").hide();
                  $(".result").html("Sorry No Package Available! ").show();
              }
               if(a || ((a &&d)|| (a&&e) || (a&&f)))
              {
                $(".krlPkg").hide();
                  $(".BadPkg").hide();
                  $(".pkgGoa").show();
                  $(".pkgGoaKer").hide();
                  $(".result").html("Sorry No Package Available! ").hide();

              }
              if(b &&(!(b&&d)) && (!(b&&f)))
              {
                $(".krlPkg").hide();
                  $(".BadPkg").show();
                  $(".pkgGoa").hide();
                  $(".pkgGoaKer").hide();
                  $(".result").html("Sorry No Package Available! ").hide();
              }
               if(c &&(!(c && d))  && (!(c && e))){
                $(".krlPkg").show();
                  $(".BadPkg").hide();
                  $(".pkgGoa").hide();
                  $(".pkgGoaKer").hide();
                   $(".result").html("Sorry No Package Available! ").hide();
              }
              if(a&& c){
                $(".krlPkg").hide();
                  $(".BadPkg").hide();
                  $(".pkgGoa").hide();
                  $(".pkgGoaKer").show();
                  $(".result").html("Sorry No Package Available! ").hide();
              }
              if(a &&b){
                $(".krlPkg").hide();
                  $(".BadPkg").show();
                  $(".pkgGoa").show();
                  $(".pkgGoaKer").hide();
                  $(".result").html("Sorry No Package Available! ").hide();
              }
              if(b && c){
                $(".krlPkg").show();
                  $(".BadPkg").show();
                  $(".pkgGoa").hide();
                  $(".pkgGoaKer").hide();
                  $(".result").html("Sorry No Package Available! ").hide();
              }
              if(a && b && c){
                $(".krlPkg").show();
                  $(".BadPkg").show();
                  $(".pkgGoa").show();
                  $(".pkgGoaKer").show();
                  $(".result").html("Sorry No Package Available! ").hide();
              }

              if((b && e)){
                $(".krlPkg").hide();
                  $(".BadPkg").show();
                  $(".pkgGoa").hide();
                  $(".pkgGoaKer").hide();
                  $(".result").html("Sorry No Package Available! ").hide();


              }
              if((c&&f)){
                $(".krlPkg").show();
                  $(".BadPkg").hide();
                  $(".pkgGoa").hide();
                  $(".pkgGoaKer").show();
                  $(".result").html("Sorry No Package Available! ").hide();
              }

              if(!(a) &&(!b) &&(!c) &&(!d) &&(!e) &&(!f)  )
              {
                  $(".krlPkg").show();
                  $(".BadPkg").show();
                  $(".pkgGoa").show();
                  $(".pkgGoaKer").show();
                  $(".result").html("Sorry No Package Available! ").hide();

              }


           });    
        
    });