// 我是一个单行注释

//=================================================

/**
 * 我是一个多行注释
 */

//==============================================

/*
1、原始数据类型
  1、number:数字  整数/小数/NaN(not a number 一个不是数字类型)
  2、string:字符串   "abc"   "a"   'abc'
  3、boolean:true 和 false
  4、null:一个对象为空的占位符
  5、undefined:未定义。如果一个变量没有给初始值，则会被默认赋值为undefined
2、引用数据类型：对象
* */

//===================================================

/*
变量

*/
var flag2 = false;
var xin = document.getElementById("Xin");
xin.onclick = fun1;
function fun1() {
    if (flag2) {
        xin.innerText = "新用户注册";
        flag2 = false;
    } else {
        xin.innerText = "你点了这里一下！";
        flag2 = true;
    }
}

var flag1 = false;
var yzm_tp = document.getElementById("yzm_tp");

yzm_tp.onclick = fun;

function fun() {
    if (flag1) {
        yzm_tp.src = "images/loading.gif";
        flag1 = false;
    } else {
        yzm_tp.src = "images/closelabel.gif";
        flag1 = true;
    }
}

var OpenBtn = document.getElementById("OpenBtn");
OpenBtn.onclick = fun3;

var NewWindow;

function fun3() {
    NewWindow = open("http://www.baidu.com");
}

var CloseBtn = document.getElementById("CloseBtn");
CloseBtn.onclick = fun4;

function fun4() {
    NewWindow.close();
}

var number = 1;
function fun5() {
    number++;
    if (number < 10) {
        number = "0" + number;
    }

    if (number == 16) {
        number = "01";
    }
    var image = document.getElementById("image");
    image.src = "images/gallery/" + number + ".jpg";
}

var HistoryBtn = document.getElementById("HistoryBtn");
HistoryBtn.onclick = fun6;

function fun6() {
    var h1 = window.history;
    var h2 = history;
    alert(h1);
    alert(h2);
}

var refurbishBtn = document.getElementById("refurbishBtn");
refurbishBtn.onclick = fun7;

function fun7() {
     location.reload();
}

var w163Btn = document.getElementById("w163Btn");
w163Btn.onclick = fun8;

function fun8() {
    var a = location.href;
    alert(a);
    location.href = "http://www.163.com";
}

var SetBtn = document.getElementById("SetBtn");
SetBtn.onclick = fun9;

function fun9() {
    var aa = document.getElementById("UserRegister");
    aa.setAttribute("href","AutoJump.html")
}

var AddBtn = document.getElementById("AddBtn");
AddBtn.onclick = fun10;

function fun10() {
    alert("我是有动作的");
    var id1 = document.getElementById("id1").value;
    var name1 = document.getElementById("name1").value;
    var sex1 = document.getElementById("sex1").value;

    var td_id1 = document.createElement("td");
    var text_id1 = document.createTextNode(id1);
    td_id1.appendChild(text_id1);

    var td_name1 = document.createElement("td");
    var text_name1 = document.createTextNode(name1);
    td_name1.appendChild(text_name1);

    var td_sex1 = document.createElement("td");
    var text_sex1 = document.createTextNode(sex1);
    td_sex1.appendChild(text_sex1);

    var td_cz1 = document.createElement("td");
    var DelBtn = document.createElement("input");
    DelBtn.setAttribute("class","zc");
    DelBtn.setAttribute("type","button");
    DelBtn.setAttribute("value","删除本行");
    td_cz1.appendChild(DelBtn);

    var tr1 = document.createElement("tr");
    tr1.appendChild(td_id1);
    tr1.appendChild(td_name1);
    tr1.appendChild(td_sex1);
    tr1.appendChild(td_cz1);

    var table1 = document.getElementsByTagName("table")[1];
    table1.appendChild(tr1);

}

setInterval(fun5, 2000);
