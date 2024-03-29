var inputString = prompt('abcdefghijklmnopqrstuvwxyz');
draw(inputString, 0);
function draw(inputString, beginIndex) {
    var symbol = inputString[beginIndex];
    switch (symbol) {
        case 'a': {
            document.body.style.background = "rgb(255,0,0)";
            break;
        }
        case 'b': {
            document.body.style.background = "rgb(0,255,0)";
            break;
        }
        case 'c': {
            document.body.style.background = "rgb(0,0,255)";
            break;
        }
        case 'd': {
            document.body.style.background = "rgb(0,255,255)";
            break;
        }
        case 'e': {
            document.body.style.background = "rgb(255,0,255)";
            break;
        }
        case 'f': {
            document.body.style.background = "rgb(255,255,0)";
            break;
        }
        case 'g': {
            document.body.style.background = "rgb(255,255,255)";
            break;
        }
        case 'h': {
            document.body.style.background = "rgb(0,0,0)";
            break;
        }
        default: {
            document.body.style.background = randomColor();
        }
    }
    var p = document.createElement('p');
    p.innerText = symbol;
    p.style.backgroundColor = randomColor();
    document.body.append(p);
    if (beginIndex == (inputString.length - 1)) {
        return;
    }
    setTimeout(draw, 1000, inputString, beginIndex + 1);
}
function randomColor() {
    var first = Math.random() * 255;
    var second = Math.random() * 255;
    var third = Math.random() * 255;
    var color = "rgb(" + first + "," + second + "," + third + ")";
    return color;
}
