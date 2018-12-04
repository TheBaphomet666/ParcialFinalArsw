var BackEndModule =(function(){

    return{
        CelsiusToFahrenheit: async function(callback){

            await Promise.resolve(axios.get('/Converter/celsius/'+document.getElementById('value').value))
                .then(async function(response){
                        console.log(response.data);



                    }
                )},
        FahrenheitToCelsius: async function(callback){

                    await Promise.resolve(axios.get('/Converter/fahrenheit/'+document.getElementById('value').value))
                        .then(async function(response){
                                console.log(response.data);



                            }
                        )}
    };


})();