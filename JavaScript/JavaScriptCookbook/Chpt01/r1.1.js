// 1.1 String concatenation

var string1 = "This is a ";
var string2 = "test using +";
var string3 = string1 + string2;
console.log(string3);

string1 += "test using +=";
console.log(string1);

var nwStrng = "".concat("This ", "is a test ", "using concat().");
console.log(nwStrng);
