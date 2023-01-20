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
            for ( let user of users.data)
              console.log(`${user.id} - ${user.first_name} ${user.last_name}`);            

        })
        .catch( error => console.log(error));
}