var second = 3;
var time =document.getElementById("time");

function ShowTime() {
    second--;
    time.innerText = second;
    if (second == 0) {
        clearInterval(a);
        history.back();
    }
}

var a = setInterval(ShowTime, 500);