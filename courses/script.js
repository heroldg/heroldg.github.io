let inputProductName = document.querySelector('#product-name');
let inputProductPrice = document.querySelector('#product-price');
let buttonSubmit = document.querySelector('#product-submit');

let pageRight = document.querySelector('#page-right');

let buttonDelete = document.querySelector('#delete');

let spanSomme = document.querySelector('#somme');

let products = [];

// parseInt(...) = transformer une chaine de caractère en nombre entier
// parseFloat(...) = transformer une chaine de caractère en nombre entier ou à virgule

buttonSubmit.onclick = function () {
    // inputProductName.value.length > 0
    let date = new Date();
    if(inputProductName.value != "" && inputProductPrice.value != "") {
        products.push({
            name: inputProductName.value,
            price: parseFloat(inputProductPrice.value),
            date: date.getHours() + "h" + date.getMinutes()
        });
        inputProductName.value = ""
        inputProductPrice.value = ""
        updatePanier();
    } else {
        alert('Veuillez compléter tous les champs');
    }
};

buttonDelete.onclick = function () {
    // products.splice(0, products.length);
    products = [];
    updatePanier();
};

function updatePanier() {
    console.log(products);

    let html = "";
    let somme = 0;
    for(let i = 0; i < products.length; i++) {
        somme = somme + products[i].price;
        html = html + `
        <div class="product">
            <div>${products[i].name}</div>
            <div>${products[i].price}€</div>
        </div>
        `;
    }

    pageRight.innerHTML = html;
    spanSomme.innerHTML = somme;
}

/**
 * Ajouter une condition pour checker si les inputs sont vides avant de push dans le tableau
 * Ajouter un bouton Vider pour vider le tableau et par conséquent tout le panier
 * Ajouter la somme des produits (le total quoi)
 * Ajouter la propiété date à l'objet avec comme valeur la date précise de validation
 */

// // Exercice 1
// if(input.value == "") {
//     // c'est vide
//     alert('Veuillez entrer du text dans les inputs');
// } else {
//     // c'est pas vide
// }

// // Bouto, supprimer
// tableau = []; // effacer le tableau