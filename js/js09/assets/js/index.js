console.log("js09");

//hacer solicitud get con Fetch Api

const getUsersFetch = (url) => {
  fetch(url)
    .then(response => {
      console.log("Status " + response.status);
      return response.json();
    })
    .then(data => {
      console.log(data);
    })
    .catch(error => console.log(error));
};

const getUsersAxios = (url) => {
  axios.get(url)
    .then( response => {
        console.log("Status: " + response.status)
        console.log(response.data)
    })
    .catch( error => console.log(error));
};

function solicitudGet(provider, page = 1) {
  const url = `https://reqres.in/api/users?page=${page}`;
  if (provider === "fetch") getUsersFetch(url);
  else if (provider === "axios") getUsersAxios(url);
  else console.warn("No especificaste el proveeedor");
}
