const buttonGif = document.querySelector('#buttonGif');
const inputSearch = document.querySelector('#search');
const divResult = document.querySelector('#gif-result');

function afficheLeResultat(json) {
    console.log(json);
    let html = '';
    for(let i = 0; i < json.data.length; i++) {
        html += `
        <div class="gif">
        <img src="${json.data[i].images.original.url}">
        </div>`;
    }
    divResult.innerHTML = html;
}

buttonGif.onclick = function () {
    const search = inputSearch.value;

    const req = new XMLHttpRequest();
    req.open('GET', 'https://api.giphy.com/v1/gifs/search?api_key=aFFKTuSMjd6j0wwjpFCPXZipQbcnw3vB&fmt=json&limit=20&q=' + search, true);
    req.onload = function () {
        const json = JSON.parse(req.responseText);
        afficheLeResultat(json);
    };
    req.send();

    // fetch('https://api.giphy.com/v1/gifs/search?api_key=aFFKTuSMjd6j0wwjpFCPXZipQbcnw3vB&fmt=json&limit=20&q=' + search)
    //     .then(function (response) {
    //         return response.json();
    //     })
    //     .then(function (json) {
    //         afficheLeResultat(json);
    //     });

};




///////////////////////////////

// const mafonction = () => "hello";

// const buttonMeteo = document.querySelector('#buttonMeteo');
// const inputCity = document.querySelector('#city');
// const meteoDiv = document.querySelector('#meteo-result');

// buttonMeteo.onclick = function () {
//     fetch('https://goweather.herokuapp.com/weather/' + inputCity.value)
//         .then(function (response) {
//             return response.json();
//         })
//         .then(function (json) {
//             let html = `
//                 <div>
//                     Aujourd'hui: ${json.description} ${json.temperature}<br>
//                     Demain: ${json.forecast[0].temperature}<br>
//                     Dans 2 jours: ${json.forecast[1].temperature}<br>
//                     Dans 3 jours: ${json.forecast[2].temperature}
//                 </div>
//             `;
//             meteoDiv.innerHTML = html;
//         });
// };

