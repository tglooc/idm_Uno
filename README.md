# Tanguy GROSSIN M2ILa
# IMD project : Uno 

### Q1.
- two_players_rules : regles des passe / changement de sens à 2
- Time : temps limité ou non
- Rotating_cards : zero et sept font bouger les paquets
- Playing_same_cards : jouer sur la carte si elle a la même valeur, et éventuellement la meme couleur
- Draw : pioche une carte ou pioche jusqu'à pouvoir jouer (max 3 cartes)

Il existe une infinité de variantes vu le nombre de règles qu'il existe. Si l'on prend uniquement en compte celles de mon FM, il en existe 24.

### Q3.
Je développerais un générateur où l'on fournit la configuration voulue au programme en JSON, qui sera validé grâce au schéma JSON, puis le programme lit le JSON, et le convertit grâce au compilateur.
### Q5.
On peut faire une fonction qui traduit chaque règle en ligne json, et une fonction inverse, pour tranformer ligne par ligne un fichier en un autre.
