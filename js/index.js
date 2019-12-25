let items = [
    {
        title: '复仇者联盟',
        desc: '终局之战',
        url: 'images/1.jpg'
    },
    {
        title: '小丑',
        desc: '人心中的恶魔',
        url: 'images/2.jpg'
    },
    {
        title: '星球大战',
        desc: '天行者崛起',
        url: 'images/3.jpg'
    },
    {
        title: '釜山行',
        desc: '末世该如何生存',
        url: 'images/4.jpg'
    },
    {
        title: '天气之子',
        desc: '雨后小故事',
        url: 'images/5.jpg'
    },
];   // 数据
let curIndex = 0;   // 当前索引
let isAutoMove = true;  // 是否可以自动改变图片
let interval = 2000;  // 自动轮播的间隔时间
function createTag(tag) {
    return document.createElement(tag);
}
function createText(text) {
    return document.createTextNode(text);
}
function initItemList() {
    let ul = document.getElementsByClassName('item-list')[0];
    for (let i = 0; i < items.length; i++) {
        let li = createTag('li');
        if (i == 0) { li.classList.add('active') }
        let span1 = createTag('span');
        let span2 = createTag('span');
        let span3 = createTag('span');
        let text1 = createText(items[i].title);
        let text2 = createText('：');
        let text3 = createText(items[i].desc);
        span1.appendChild(text1);
        span2.appendChild(text2);
        span3.appendChild(text3);
        li.appendChild(span1);
        li.appendChild(span2);
        li.appendChild(span3);
        ul.appendChild(li);
        //跳转
        li.onclick = function(){
          location.href="www.baidu.com";
        };
        addHoverListener(li, i);
    }
}
function addHoverListener(trigger, index) {
    trigger.addEventListener('mouseenter', function () {
        curIndex = index;
        changeImage();
        activeText();
    });
}
function changeImage() {
    //console.log('curIndex: ', curIndex);
    let imgUrl = items[curIndex].url;
    let imgWrap = document.getElementsByClassName('img-wrap')[0];
    imgWrap.style.cssText = "background-image: url('" + imgUrl + "')";
}
function activeText() {
    let activeObj = document.getElementsByClassName('active')[0];
    let li = document.getElementsByTagName('li')[curIndex];
    if (activeObj) {
        activeObj.classList.remove('active');
    }
    li.classList.add('active');
}
function addEnterListener() {
    let wrap = document.getElementsByClassName('wrap')[0];
    wrap.addEventListener('mouseenter', function () {
        isAutoMove = false;
    });
    wrap.addEventListener('mouseleave', function () {
        isAutoMove = true;
    });
}
function autoMove() {
    let timer = setInterval(function () {
        if (isAutoMove) {
            if (curIndex < 9) {
                curIndex ++;
            } else {
                curIndex = 0;
            }
            changeImage();
            activeText();
        }
    }, interval);
}