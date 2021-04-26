/* algo backgroundColor home page*/

var body = document.querySelector("body")
var nav = document.querySelector("#navbar")


nav.onmouseover = function () {
    body.classList.add("bodyblack")
    nav.style.backgroundColor = "black"
}

nav.onmouseout = function () {
    body.classList.remove("bodyblack")
    nav.style.backgroundColor = "rgb(206, 198, 182)"
}

/* algo pour changer forme de la souris (cursor)*/

const cursor = document.querySelector('.cursor');

document.addEventListener('mousemove', e => {
    cursor.setAttribute('style', 'top:'+(e.pageY - 35)+"px; left:"+(e.pageX - 35)+"px;")
})

document.addEventListener('click', ()=>{
    cursor.classList.add('expand');

    setTimeout(()=>{
        cursor.classList.remove("expand");
    }, 500);
})

function scrollAbout () {
    window.scrollBy(-10,0)   
}

function scrollWork () {
    window.scrollBy(-10,0)
}

function scrollContact () {
    window.scrollBy(10,0)
}
