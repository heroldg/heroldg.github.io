const suits = ['<span class=\'bold\'>&#9827</span>', '<span class=\'bold\'>&#9824</span>', '<span class=\'bold red-card\'>&#9829</span>', '<span class=\'bold red-card\'>&#9830</span>'];
const values = ['A', '2', '3', '4', '5', '6', '7', '8', '9', '10', 'V', 'D', 'R'];

let deck;
let playerHand = []; let dealerHand = [];
let wins = 0; let losses = 0; let draws = 0;

let playerBank = 100; let betValue = 0;

function askPlayerBet() {
    document.getElementsByClassName("player-bet")[0].classList.remove("hidden");
    document.getElementsByClassName("new-game-button")[0].classList.add("hidden");
    document.getElementsByClassName("game-status")[0].innerHTML = "le joueur annonce son pari";
    document.getElementsByClassName("confirm-bet-button")[0].addEventListener("click", newGame);

}

function newGame() {
    deck = shuffleDeck();
    playerHand = []; dealerHand = [];
    betValue = parseInt(document.querySelector('input[id="player-bet"]').value);
    playerBank -= betValue;

    document.getElementsByClassName("player-bet")[0].classList.add("hidden");

    document.getElementsByClassName("game-status")[0].innerHTML = `Le pari du joueur est de ${betValue}`;
    document.querySelector('.player-bank p').innerHTML = `Banque du joueur: ${playerBank} | Montant du pari ${betValue} `;

    document.getElementsByClassName("new-game-button")[0].classList.add("hidden");



    dealerHand.push(deck.pop());
    playerHand.push(deck.pop());
    playerHand.push(deck.pop());

    let playerHandValue = calculeHandValue(playerHand);
    let dealerHandValue = calculeHandValue(dealerHand);

    document.querySelector(".player h3").innerHTML = `Main du joueur (${playerHandValue})`;

    document.querySelector(".dealer h3").innerHTML = `Main du dealer (${dealerHandValue})`;

    drawCards(playerHand, 'player'); drawCards(dealerHand, 'dealer');

    let dealerCa


    if (playerHandValue == 21) {
        return startDealerTurn();
    }


    document.getElementsByClassName("game-button")[0].classList.remove("hidden");

}

function createDeck() {
    deck = [];

    for (let suit in suits) {
        for (let value in values) {
            deck.push(`${values[value]} ${suits[suit]}`)
        }
    }
    return deck
}



function shuffleDeck() {
    deck = createDeck();
    let m = deck.length, i;

    while (m) {
        i = Math.floor(Math.random() * m--);
        [deck[m], deck[i]] = [deck[i], deck[m]];

    }
    return deck
}

// cette function permet de recuperer la premeiere valeur et la convertir en nombre lorsuqe l'ont a deja par exemple: ["A pique", "10 trèfle"]
function convertValueInNumbers(values) {
    let hand = [];

    for (card in values) {
        let cardValue = values[card].split("")[0];
        /* cette ligne permet de recuperer le premier element càd : ["A", "pique"] -> "A" et ["10", "trèfle"] -> "10" */

        switch (cardValue) {
            case 'A':
                hand.push(1); break;
            case '2':
                hand.push(2); break;
            case '3':
                hand.push(3); break;
            case '4':
                hand.push(4); break;
            case '5':
                hand.push(5); break;
            case '6':
                hand.push(6); break;
            case '7':
                hand.push(7); break;
            case '8':
                hand.push(8); break;
            case '9':
                hand.push(9); break;
            case '10':
            case 'V':
            case 'D':
            case 'R':
                hand.push(10); break;

            default: hand.push(10); // J'ai mis 10 en erreur car il ne comprend pas la valeur '10' dans le case. JE doit trouver l'erreur. Pour l'instant en mettant 10 en default, cela fonction bien.
        }
    }



    return hand;
}

function calculeHandValue(hand) {
    let handValue = 0;
    let cards = convertValueInNumbers(hand);
    // Apres la function convertValueInNumbers nous n'avons plus ["A pique", "10 trèfle"] mais -> [1,10]

    for (value in cards) {
        if (cards[value] == 1) {
            handValue += 11;
            continue;
        }
        /* Le bout de code juste en haut dans la fonction calculateHandValue permet de faire que les ACE ou "A" qui peuvent valoir 1 vont valoir 11.  */

        handValue += cards[value];
        // Permet d'additionner les valeurs transmise par la function convertValueInNumbers(); exemple dans un console.log ligne 108  
    }

    return handValue;
}

// console.log(calculeHandValue(["A pique", "10 trèfle"]));

function drawCards(hand, selector) {
    let drawCard = "";
    drawCard += '<div class="wrapper">';

    for (card in hand) {
        drawCard += '<div class="card">';
        drawCard += `<span class="card-value">${hand[card].split(" ")[0]}</span>`;
        drawCard += `<span class="card-suit">${hand[card].slice(2)}</span>`;
        drawCard += '</div>';

    }

    drawCard += '</div>';
    document.querySelector(`.${selector} p`).innerHTML = drawCard;

}

function triggerCarteButton() {
    playerHand.push(deck.pop());
    drawCards(playerHand, 'player');
    let playerHandValue = calculeHandValue(playerHand);
    document.querySelector(".player h3").innerHTML = `Main du jouer (${playerHandValue})`;
    if (playerHandValue > 21) return startDealerTurn();
}

function triggerDoubleButton() {
    playerHand.push(deck.pop());
    drawCards(playerHand, 'player');
    let playerHandValue = calculeHandValue(playerHand);
    playerBank -= betValue;
    betValue *= 2;
    document.querySelector('.player-bank p').innerHTML = `Banque du joueur: ${playerBank} | Montant du pari ${betValue} `;
    document.querySelector(".player h3").innerHTML = `Main du jouer (${playerHandValue})`;

    return startDealerTurn();
}

function triggerServiButton() {
    startDealerTurn();
}


function startDealerTurn() {
    let playerHandValue = calculeHandValue(playerHand);
    let dealerHandValue = calculeHandValue(dealerHand);

    while (dealerHandValue < 17) {
        dealerHand.push(deck.pop());
        drawCards(dealerHand, 'dealer');
        dealerHandValue = calculeHandValue(dealerHand);
        document.querySelector(".dealer h3").innerHTML = `Main du dealer (${dealerHandValue})`;
    }

    if (playerHandValue > 21 || (dealerHandValue > playerHandValue && dealerHandValue < 22)) {
        losses += 1;
        document.getElementsByClassName('game-status')[0].innerHTML = "Le joueur à perdu";
        updateStatTracker();
        updatesPlayerBank(betValue, "losses");

    } else if (dealerHandValue > 21 && playerHandValue > 21 || dealerHandValue == playerHandValue) {
        if (playerHand.length == 2) {
            wins += 1;
            document.getElementsByClassName('game-status')[0].innerHTML = "Blackjack ! Le joueur à gagné";
            updateStatTracker();
            return updatesPlayerBank(betValue, "blackjack");
        }
        draws += 1;
        document.getElementsByClassName('game-status')[0].innerHTML = "Le joueur et le dealer sont à égalité";
        updateStatTracker();
        updatesPlayerBank(betValue, "draws");

    } else {
        wins += 1;
        document.getElementsByClassName('game-status')[0].innerHTML = "Le joueur à gagné";
        updateStatTracker();
        if (playerHand.length == 2) {
            document.getElementsByClassName("game-status")[0].innerHTML = "Blackjack ! Le joueur à gagné";
            return updatesPlayerBank(betValue, "blackjack");

        }
        updatesPlayerBank(betValue, "wins");
    }

    // if (dealerHandValue > 21 && playerHandValue > 21 || dealerHandValue == playerHandValue) {
    //     if (playerBank.length == 2)
    //     draws += 1;
    //     document.getElementsByClassName("game-status")[0].innerHTML = "le Joueur et le Dealer sont à égalité";
    //     updateStatTracker();
    //     updatesPlayerBank(betValue, 'draws');


    // } else if (playerHandValue > 21 || (dealerHandValue > playerHandValue && dealerHandValue < 22)) {
    //     losses += 1
    //     document.getElementsByClassName("game-status")[0].innerHTML = "le Joueur à perdu";
    //     updateStatTracker()
    //     updatesPlayerBank(betValue, 'losses');

    // } else {
    //     wins += 1;
    //     document.getElementsByClassName("game-status")[0].innerHTML = "le Joueur à gagné";
    //     updateStatTracker()
    //     updatesPlayerBank(betValue, 'wins');

    // }

}


function updateStatTracker() {
    document.getElementsByClassName("new-game-button")[0].classList.remove("hidden");

    document.getElementsByClassName("stat-tracker")[0].innerHTML = `W (gagné): ${wins} | E (égalité): ${draws} | L (perdu): ${losses}`;

    document.getElementsByClassName("game-button")[0].classList.add("hidden");

}

function updatesPlayerBank(bet, status) {
    if (status == 'blackjack') playerBank += (bet * 2.5);
    if (status == 'wins') playerBank += (bet * 2);
    if (status == 'draws') playerBank += bet;
    if (status == 'losses') playerBank;

    document.querySelector('.player-bank p').innerHTML = `Banque du joueur: ${playerBank} `;
}

document.getElementsByClassName("new-game-button")[0].addEventListener("click", askPlayerBet);

document.getElementsByClassName("carte-button")[0].addEventListener("click", triggerCarteButton);

document.getElementsByClassName("double-button")[0].addEventListener("click", triggerDoubleButton);

document.getElementsByClassName("servi-button")[0].addEventListener("click", triggerServiButton);

