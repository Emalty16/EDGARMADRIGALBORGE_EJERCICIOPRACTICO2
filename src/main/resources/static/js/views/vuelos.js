//CREATE AND UPDATE
const serviceEntity = "vuelos";
const idNameToUse = "idVuelo";
let listOfEntities = vuelos;
let defaultEntity = vuelosDefault;

 

$(document).on("click", "#btnSearch", function () {
    const currentUrl = document.location.href;
    const url = new URL(currentUrl);
    window.location.href = url.href;
})

 


const currentUrl = document.location.href;
const url = new URL(currentUrl);