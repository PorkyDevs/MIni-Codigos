const numeros = Array.from({ length: 37 }, (_, i) => i);
const cantidadTrucado = Math.round((4 / 100) * 100); // %
const numerosP = [...numeros, ...Array(cantidadTrucado).fill(7)];

let cantidadSiete = 0;
for (let i = 0; i < 1000; i++) {
  if (numerosP[Math.floor(Math.random() * numerosP.length)] === 7) {
    cantidadSiete++;
  }
}

console.log(`El número 7 salió ${cantidadSiete} veces en 1000 tiradas.`);
