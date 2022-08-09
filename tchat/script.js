var inputName = document.querySelector('#name');
var inputText = document.querySelector('#text');
var inputColor = document.querySelector('#color');
var button = document.querySelector('#envoyer');
var tchatBody = document.querySelector('#tchat');

function createMessage(name, text, color) {
    var divMessage = document.createElement('div');
    divMessage.classList.add('message');
    
    var divCarre = document.createElement('div');
    divCarre.classList.add('carre');
    divCarre.style.backgroundColor = color;

    var divRight = document.createElement('div');
    divRight.classList.add('right');

    var h4 = document.createElement('h4');
    h4.classList.add('name');
    h4.innerHTML = name + ' le ' + (new Date()).toUTCString();

    var p = document.createElement('p');
    p.innerHTML = text;

    var buttonDelete = document.createElement('button');
    buttonDelete.innerHTML = 'Supprimer';
    buttonDelete.style.float = 'right';

    buttonDelete.onclick = function () {
        divMessage.remove();
    };

    tchatBody.appendChild(divMessage);
    divMessage.appendChild(divCarre);
    divMessage.appendChild(divRight);
    divRight.appendChild(h4);
    divRight.appendChild(p);
    h4.appendChild(buttonDelete);
}

button.onclick = function () {
    createMessage(inputName.value, inputText.value, inputColor.value);
};



/*
Suite exercice:
Créer un tableau messages avec à 
l'intérieure 3 messages 
(bonjour, salut, au revoir)
Et faire en sorte qu'au démarage 
de la page, les 3 messages du 
tableau sont affichés
dans le tchat
*/
