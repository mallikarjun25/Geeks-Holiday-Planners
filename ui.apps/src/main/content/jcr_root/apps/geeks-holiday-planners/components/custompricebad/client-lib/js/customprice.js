$(document).ready(function () 
{
  $("#travel-badrinath").click(function () {
	alert("Inside the badrinath");
    var value = $("#badrinathfield").val();
      alert(value);
    var res = 0;
    if (value == 1) {
      $(".resbadrinath").html((res = res + 1000));
    } else if (value == 2) {
      $(".resbadrinath").html((res = res + 2000));
    } else if (value == 3) {
      $(".resbadrinath").html((res = res + 3000));
    } else if (value == 4) {
      $(".resbadrinath").html((res = res + 4000));
    } else if (value == 5) {
      $(".resbadrinath").html((res = res + 5000));
    } else {
      $(".resbadrinath").html("Enter greater than 0 less than 5");
    }
  });
    
});
