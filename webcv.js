/*   changement de backgroundColor home page*/

var body = document.querySelector("body")
var nav = document.querySelector("#navbar")


nav.onmouseover = function () {
    body.classList.add("bodyblack");
    nav.style.backgroundColor = "black";
}

nav.onmouseout = function () {
    body.classList.remove("bodyblack")
    nav.style.backgroundColor = "rgb(206, 198, 182)";
    nav.style.color ="black";
}

/*  changer forme de la souris (cursor)*/

const cursor = document.querySelector('.cursor');

document.addEventListener('mousemove', e => {
    cursor.setAttribute('style', 'top:'+(e.pageY - 35)+"px; left:"+(e.pageX - 35)+"px;")
});

document.addEventListener('click', ()=>{
    cursor.classList.add('expand');

    setTimeout(()=>{
        cursor.classList.remove("expand");
    }, 500);
});

/* Scroll latéral de la nav about, work , contact pour le format au dessus de 800px */

function scrollContact () {
    window.scrollBy(10,0)
};
function scrollAbout () {
    window.scrollBy(-10,0)   
};

function scrollWork () {
    window.scrollBy(-10,0)
};
