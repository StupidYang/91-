var Movie = document.getElementsByClassName('movie')[0],
    Input = document.getElementsByClassName('input')[0],
    Btn = document.getElementById('btn'),
    Al = document.getElementsByClassName('al')[0];
var danmu_position = "all";
var danmu_color = "#74738c";
MovieWidth=Movie.offsetWidth;
var timer2;

Btn.onclick=danmu;

Input.onkeydown=function(e){
    if(e.keyCode==13){
        send();
    }
};
function danmu(){
    checkdanmu();
    send();
}

function send(){
    if(Input.value.length<=0 || (/^\s+$/).test(Input.value)){
        Al.style.display='block';
        timer2=setTimeout(function(){
            Al.style.display='none';
        },1500);
        return;
    }
    createSpan(Input.value);
    Input.value="";
}

function createSpan(text){
    var Span=document.createElement('span');
    Span.innerText=text;
    Span.style.left=MovieWidth+'px';
    Movie.appendChild(Span);
    styleSpan(Span);
}
function styleSpan(dom){
    if(danmu_position === "all"){
        dom.style.top=random(0,540)+'px';
    }else if(danmu_position === "top"){
        dom.style.top=random(0,180)+'px';
    }else if (danmu_position === "bottom") {
        dom.style.top=random(360,540)+'px';
    }else {
        dom.style.top=random(0,540)+'px';
    }
    if(danmu_color === "#74738c"){
        dom.style.color='rgb('+random(0,255)+','+random(0,255)+','+random(0,255)+')';
    }else {
        dom.style.color= danmu_color;
    }
    dom.style.fontSize=random(16,32)+'px';
    var domW=dom.offsetWidth;
    var speed = [0, 1, 2][random(0, 2)];
    dom.timer=setInterval(function(){
        switch(speed){
            case 0:
                dom.style.left=dom.offsetLeft-2+'px';
                break;
            case 1:
                dom.style.left=dom.offsetLeft-4+'px';
                break;
            case 2:
                dom.style.left=dom.offsetLeft-4+'px';
        }
        if (dom.offsetLeft <= -domW) {
            clearInterval(dom.timer);
            Movie.removeChild(dom);
        }
    },20)
}
function random(start,end){
    return Math.floor(Math.random()*(end+1-start)+start);
}

function checkdanmu() {
    var position = document.getElementsByName('danmu-position');
    var color = document.getElementsByName('danmu-color');
    for (var i = 0; i < position.length; i++) {
        if (position[i].checked == true) {
            danmu_position = position[i].value;
        }
    }
    //console.log(color[0].value);
    danmu_color = color[0].value;
}
//实时弹幕demo
//获取视频DOM元素
var myVideo = document.getElementById("video1");
myVideo.oncanplay = function(){
    console.log("准备就绪");
};
//使用事件监听方式捕捉事件， 此事件可作为实时监测video 播放状态
myVideo.addEventListener("timeupdate",function(){
    var timeDisplay;
    //用秒数来显示当前播放进度
    timeDisplay = Math.floor(myVideo.currentTime);
    console.log(Math.floor(myVideo.currentTime));

    //当视频播放到 4s的时候发送弹幕
    if(timeDisplay == 4){
        var Span=document.createElement('span');
        Span.innerText="前方高能！";
        Span.style.left=MovieWidth+'px';
        Movie.appendChild(Span);
        styleSpan(Span);
    }
    if(timeDisplay == 10){
        var i = 20;
        while (i>=0){
            var Span=document.createElement('span');
            Span.innerText="小丑！！！";
            Span.style.left=MovieWidth+'px';
            Movie.appendChild(Span);
            styleSpan(Span);
            --i;
        }
    }
},false);