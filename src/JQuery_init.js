// 点击P标签隐藏
/*$(document).ready(function () {
    $("p").click(function () {
        $(this).hide();
    })
});*/
$(function () {
    $("p.one").click(function () {
        $(this).style.color = "#990011";
    })
});
$(function () {
   $("#keypress").KEYPRESS(function () {
       $("#show").text(i+=1);
   });
});
