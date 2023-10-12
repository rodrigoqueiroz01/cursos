var text = "Asdflib afdslvjbdf sdflvjdfv scdsd scad vrgtb Fsdf Hbrg vvsdf QQWER sdf wdsfs";

var HackerTextException = function (message) {
    this.message = message;
    this.name = "HackerTextException";
}

var toHackerCase = function (text) {
    if (!text) throw "Invalid text.";
    if (typeof text !== "string") throw new HackerTextException("Invalid type.");

    var hackerTextArray = [];
    var i = 0;

    while (i < text.length) {
        switch (text.charAt(i)) {
            case "o":
                hackerTextArray.push(0);
                break;
            case "l":
                hackerTextArray.push(1);
                break;
            case "e":
                hackerTextArray.push(2);
                break;
            case "a":
                hackerTextArray.push(3);
                break;
            case "s":
                hackerTextArray.push(4);
                break;
            case "t":
                hackerTextArray.push(5);
                break;
            default:
                hackerTextArray.push(text.charAt(i));
        }

        i++;
    }

    return hackerTextArray.join("");
}

try {
    console.log(toHackerCase());
} catch (e) {
    console.log("Error: " + e.message + " " + e.name);
}

try {
    console.log(toHackerCase(10));
} catch (e) {
    console.log("Error: " + e.message + " " + e.name);
}

console.log(toHackerCase(text));