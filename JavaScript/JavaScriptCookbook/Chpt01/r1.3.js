// 1.3 Conditionally comparing strings

var strName = prompt("What's your name?", "");

if (strName.toUpperCase() == "GERARD")	{
	alert("Your name is Gerard! Good for you!");
} else	{
	alert("Your name isn't Gerard. Bummer.");
}

var strObject = new String("Gerard");
var strLiteral = "Gerard";

if (strObject == strLiteral)	{
	console.log("String objects & literals match on '==' for contents")
}

if (strObject !== strLiteral) 	{
	console.log("As expected, a string object should differ from a string literal using '!=='.");
}
