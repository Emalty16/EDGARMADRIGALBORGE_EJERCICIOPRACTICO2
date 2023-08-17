//Create and update
const serviceEntity = "ClienteAps";
const idNameToUse = "idCliente";
let listOfEntities = clientes;
let defaultEntity = clienteDefault;

$(document).on("click", "#btnSearch", function () {
    const currentUrl = document.location.href;
    const url = new URL(currentUrl);
    window.location.href = url.href;
})

const currentUrl = document.location.href;
const url = new URL(currentUrl);
