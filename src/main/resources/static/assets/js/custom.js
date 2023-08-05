/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(function () {
	
	
	   $.ajax({
                type: 'GET',
                url: "loadFragment",
                data: {"fragment": 'home'},
                success: function (data) {
					console.log(data);
                    $("#bodyContent").html(data);
                }, error: function (jqXHR, textStatus, errorThrown) {
                    alert(textStatus);
                }
            });


    $(".nav-opt").click(function (e) {
  //  alert();
        var fragName = this.id;
        console.log(fragName);
//                    console.log($("#userRole").val());

        if (fragName === "ndd") {

        } else {
//            $(".menu-link").removeClass("active");
            console.log("Menu Id= " + this.id);
//                    var urll = $("#userRole").val()+"/loadFragment";
            $.ajax({
                type: 'GET',
                url: "loadFragment",
                data: {"fragment": fragName},
                success: function (data) {
                    $("#bodyContent").html(data);
                }, error: function (jqXHR, textStatus, errorThrown) {
                    alert(textStatus);
                }
            });
        }
    });

});

