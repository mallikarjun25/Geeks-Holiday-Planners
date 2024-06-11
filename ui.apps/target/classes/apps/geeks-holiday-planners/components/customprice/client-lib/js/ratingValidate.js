$("#tra").click(function()
 {

    var value = $("#xyz").val();
     var res=0;
     if(value==1){
         $(".price").html(res=res+2000);
     }
     else if(value==2){

$(".price").html(res=res+4000);
     }
 else if(value==3){

$(".price").html(res=res+5000);
     }
      else if(value==4){

$(".price").html(res=res+6000);
     }
      else if(value==5){

$(".price").html(res=res+7000);
     }
     else{
$(".price").html("Enter greater than 0 less than 5");
     }


 });    

