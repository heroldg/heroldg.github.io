// Function pour mettre en place l'api de weatherapi.com

const buttonMeteo = document.querySelector('#buttonMeteo');
const inputCity = document.querySelector('#city');
const meteoDiv = document.querySelector('#meteo-result');
const meteoForecastDiv = document.querySelector('#meteo-forecast');

buttonMeteo.onclick = function () {

    // TODAY RESULT
    fetch('https://api.weatherapi.com/v1/current.json?key=0809a88a72264e0f8dd221409222612&q=' + inputCity.value).then(function (response) {
        return response.json();
    })
        .then(function (json) {
            let html = `
        <div>    
        ${json.location.name}    
        <br>
        ${json.location.country}
        <br>
        ${json.current.condition.text}
        </div>
        <div>
        <a href="https:${json.current.condition.icon}" title="icon weather"><img src='https:${json.current.condition.icon}' alt=" ${json.current.condition.icon}" border="0"></a>        
        ${json.current.temp_c}°C
        </div>
        `;

            meteoDiv.innerHTML = html;
        })


    fetch('https://api.weatherapi.com/v1/forecast.json?key=0809a88a72264e0f8dd221409222612&q=' + inputCity.value).then(
        function (response) {
            return response.json();
        }
    ).then(function (json) {
        let html = `
        <div>
        Sunrise 🌄: ${json.forecast.forecastday[0].astro.sunrise}
        <br>
        Sunset 🌇: ${json.forecast.forecastday[0].astro.sunset}
        </div>
        
        
       
        `;
        meteoDiv.innerHTML += html;
    })


   

    // FORECAST RESULT
    fetch('https://api.weatherapi.com/v1/forecast.json?key=0809a88a72264e0f8dd221409222612&q=' + inputCity.value + '&days=10').then(
        function (response) {
            return response.json();
        }
    ).then(function (json) {
        let html = `
        <div id="meteo-forecast-result">
        <div>
        ${json.location.name} , (${json.location.country}) 
        Aujourd'hui: 
        <br>
        <br>
        ${json.forecast.forecastday[0].day.condition.text}
        <a href="https:${json.forecast.forecastday[0].day.condition.icon}" title="icon weather"><img src='https:${json.forecast.forecastday[0].day.condition.icon}' alt="${json.forecast.forecastday[0].day.condition.icon}" border="0"></a>    
        ${json.forecast.forecastday[0].day.avgtemp_c}°C
        </div>
        
        <hr>

        <div>
        ${json.location.name} , (${json.location.country}) 
        Demain:
        <br>
        <br>
        ${json.forecast.forecastday[1].day.condition.text}
        <a href="https:${json.forecast.forecastday[1].day.condition.icon}" title="icon weather"><img src='https:${json.forecast.forecastday[1].day.condition.icon}' alt="${json.forecast.forecastday[1].day.condition.icon}" border="0"></a>    
        ${json.forecast.forecastday[1].day.avgtemp_c}°C
        </div>
        
        <hr>

        <div>
        ${json.location.name} , (${json.location.country}) 
        Dans 2 jours: 
        <br>
        <br>
         ${json.forecast.forecastday[2].day.condition.text}
         <a href="https:${json.forecast.forecastday[2].day.condition.icon}" title="icon weather"><img src='https:${json.forecast.forecastday[2].day.condition.icon}' alt="${json.forecast.forecastday[2].day.condition.icon}" border="0"></a>    
         ${json.forecast.forecastday[2].day.avgtemp_c}°C
        </div>
        
        </div>
        
      
        
        
       
        `;
        meteoForecastDiv.innerHTML = html;
    })




}






