$(document).ready(function () 
{
  $("#travel-kerla").click(function () {
    var value = $("#kerlafield").val();
    var res = 0;
    if (value == 1) {
      $(".reskerla").html((res = res + 3000));
    } else if (value == 2) {
      $(".reskerla").html((res = res + 6000));
    } else if (value == 3) {
      $(".reskerla").html((res = res + 9000));
    } else if (value == 4) {
      $(".reskerla").html((res = res + 12000));
    } else if (value == 5) {
      $(".reskerla").html((res = res + 15000));
    } else {
      $(".reskerla").html("Enter greater than 0 less than 5");
    }
  });
    
});
