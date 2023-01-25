console.log("js09");

//hacer solicitud get con Fetch Api

const getUsersFetch = (url) => {
  fetch(url)
    .then((response) => {
      console.log("Status " + response.status);
      return response.json();
    })
    .then((data) => {
      console.log(data);
    })
    .catch((error) => console.log(error));
};

const getUsersAxios = (url) => {
  axios
    .get(url)
    .then((response) => {
      console.log("Status: " + response.status);
      console.log(response.data);
    })
    .catch((error) => console.log(error));
};

const postUserAxios = () => {
  axios
    .post("https://reqres.in/api/users", {
      name: "Pax",
      job: "CEO",
    })
    .then(function (response) {
      console.log(response);
    })
    .catch(function (error) {
      console.log(error);
    });
};

const getUsersAxiosAwait = async (url) => {
  //Hacer una solicitud get con Axios, usando Async y Await
  try {
    const datos = await axios.get(url);
    return datos.data.data;
  } catch (error) {
    console.log("error");
  }
};

async function solicitudGet(provider, page = 1) {
  const url = `https://reqres.in/api/users?page=${page}`;
  if (provider === "fetch") getUsersFetch(url);
  else if (provider === "axios") getUsersAxios(url);
  else if (provider === "axios-await") console.log(await getUsersAxiosAwait(url));
  else console.warn("No especificaste el proveeedor");
}
