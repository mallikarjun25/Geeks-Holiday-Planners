$(document).ready(function () 
{
  $("#Goa-kerla").click(function () {
    var value = $("#Goa-Kerlafield").val();
    var res = 0;
    if (value == 1) {
      $(".resgoakerla").html((res = res + 10000));
    } else if (value == 2) {
      $(".resgoakerla").html((res = res + 12000));
    } else if (value == 3) {
      $(".resgoakerla").html((res = res + 14000));
    } else if (value == 4) {
      $(".resgoakerla").html((res = res + 16000));
    } else if (value == 5) {
      $(".resgoakerla").html((res = res + 18000));
    } else {
      $(".resgoakerla").html("Enter greater than 0 less than 5");
    }
  });
    
});
