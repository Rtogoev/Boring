"use strict";

let inputString = prompt('abcdefghijklmnopqrstuvwxyz');
 for(let index = 0; index < inputString.length; index++) {
	let symbol = inputString[index];
	setTimeout(draw, (index + 1) * 1000, symbol);
 }


	
function draw(symbol) {
	
	switch (symbol) {
		case'a': {
			document.body.style.background="rgb(255,0,0)";
			break;	
		}
		case'b': {
			document.body.style.background="rgb(0,255,0)";
			break;	
		}
		case'c': {
			document.body.style.background="rgb(0,0,255)";
			break;	
		}
		case'd': {
			document.body.style.background="rgb(0,255,255)";
			break;	
		}
		case'e': {
			document.body.style.background="rgb(255,0,255)";
			break;	
		}
		case'f': {
			document.body.style.background="rgb(255,255,0)";
			break;	
		}
		default: {
			document.body.style.background=randomColor();
		}
	}
	
	let p = document.createElement('p');
    p.innerText = symbol;
    p.style.backgroundColor = randomColor();
    document.body.append(p);
}

function randomColor() {
	let first = Number.parseInt(Math.random() * 255);
	let second = Number.parseInt(Math.random() * 255);
	let third = Number.parseInt(Math.random() * 255);
	let color = "rgb(" + first +","+ second + ","+ third +")";
	return color;
}