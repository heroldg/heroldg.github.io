
/* 
Les pseudo de la home page
*/

const btnConnection = document.querySelector('#buttonvalider');
const inputPseudo = document.querySelector('#inputpseudo');

btnConnection.onclick = function pseudoStorage () {
    localStorage.setItem('user', inputPseudo.value); // sauvegarde le pseudo dans le localStorage
    document.location.href = 'quiz.html' ; //Redirige vers qui.html (Quiz)
}






















