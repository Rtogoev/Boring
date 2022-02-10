
let inputString: any = prompt('abcdefghijklmnopqrstuvwxyz');
draw(inputString, 0);

	
function draw(inputString: string, beginIndex: number) {
	let symbol: string = inputString[beginIndex];
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
		case'g': {
			document.body.style.background="rgb(255,255,255)";
			break;	
		}
		case'h': {
			document.body.style.background="rgb(0,0,0)";
			break;	
		}
		default: {
			document.body.style.background=randomColor();
		}
	}
	
	let p: any = document.createElement('p');
    p.innerText = symbol;
    p.style.backgroundColor = randomColor();
    document.body.append(p);
	
	if(beginIndex == (inputString.length-1)) {
		return;
	}
	setTimeout(draw, 1000, inputString, beginIndex + 1);
}

function randomColor() {
	let first: number = Math.random() * 255;
	let second: number = Math.random() * 255;
	let third: number = Math.random() * 255;
	let color: string = "rgb(" + first +","+ second + ","+ third +")";
	return color;
}