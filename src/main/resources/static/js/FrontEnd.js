var FrontEndModule =(function(){

    return{
        Convert: async function(callback){

            if(document.getElementById('func').value=='CelsiusToFahrenheit'){
                BackEndModule.CelsiusToFahrenheit(document.getElementById('value').value);
            }
            else if(document.getElementById('func').value=='FahrenheitToCelsius'){

                BackEndModule.FahrenheitToCelsius(document.getElementById('value').value);

            }
            //console.log(document.getElementById('func').value);

        },
        refresh: async function(data){
            document.getElementById("data").innerHTML = "";
            document.getElementById("data").innerHTML = JSON.stringify(data);

        }


    };


})();