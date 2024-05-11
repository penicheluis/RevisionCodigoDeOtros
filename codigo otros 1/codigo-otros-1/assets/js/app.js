const baseEndpoint = 'https://api.github.com';
const usersEndpoint = `${baseEndpoint}/users`;
const $n = document.querySelector('.name');//Se cambió a .name
const $b = document.querySelector('.blog');//Se cambió a .blog
const $l = document.querySelector('.location');

async function displayUser(username) { //Añadimos async antes de la funcion
  $n.textContent = 'cargando...';
  const response = await fetch(`${usersEndpoint}/${username}`);
  
  console.log(data);
  $n.textContent = '${data.name}';
  $b.textContent = '${data.blog}';
  $l.textContent = '${data.location}';
}

function handleError(err) {
  console.log('OH NO!');
  console.log(err);
  n.textContent = `Algo salió mal: ${err}`
}

displayUser('stolinski').catch(handleError);