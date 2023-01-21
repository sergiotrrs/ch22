console.log("JS07 Fetch API");

const getUsers = (page = 1) => {
    const url = `https://reqres.in/api/users?page=${page}` ;

    fetch(url)
        .then( response=> {
            console.log("Status: " + response.status);
            return response.json();
        })
        .then( users => {
            console.log("Total de elementos: " +  users.total  );
            //console.log(users);
            //Leer a Data = [ {},{},{} ]
            //console.log( users.data );
            localStorage.setItem("users", JSON.stringify(users)  );
            for ( let user of users.data)
              console.log(`${user.id} - ${user.first_name} ${user.last_name}`);            

        })
        .catch( error => console.log(error));
}


const btnFetchApiPost = document.getElementById("fetch-api-post");
btnFetchApiPost.addEventListener('click', ()=>{

    const url = 'https://reqres.in/api/users';
    const data = {
        name: "Aurelio",
        job: "Obrero"
    };
    
    /**
     * Por default, el fetch api te realiza una solicutud get, para otras
     * solicitudes hay que especificarle el  tipo de solicitud en un  objeto
     * de configuración como parámetro, después de especificar la URL.
     */
    fetch(url, {
      method: 'POST', // or 'PUT'
      body: JSON.stringify(data), // data can be `string` or {object}!
      headers:{
        'Content-Type': 'application/json'
      }
    }).then(res => res.json())
    .then(response => console.log('Success:', response))
    .catch(error => console.error('Error:', error));

});

function readLocalStorage(){
    console.log( JSON.parse(localStorage.getItem('users'))   );
}