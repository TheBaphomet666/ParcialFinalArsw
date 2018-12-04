var BackEndModule =(function(){

    return{
        CelsiusToFahrenheit: async function(value){

            await Promise.resolve(axios.get('/Converter/celsius/'+value))
                .then(async function(response){
                        //console.log(response.data);
                        FrontEndModule.refresh(response.data);



                    }
                )},
        FahrenheitToCelsius: async function(value){

                    await Promise.resolve(axios.get('/Converter/fahrenheit/'+value))
                        .then(async function(response){
                                //console.log(response.data);
                                FrontEndModule.refresh(response.data);



                            }
                        )}
    };


})();