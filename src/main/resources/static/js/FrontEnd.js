var FrontEndModule =(function(){

    return{
        Convert: async function(callback){
            if(document.getElementById('func').value=='CelsiusToFahrenheit'){
                BackEndModule.CelsiusToFahrenheit();
            }
            else if(document.getElementById('func').value=='Fahrenheit'){
            }
                BackEndModule.FahrenheitToCelsius();

            }


    };


})();