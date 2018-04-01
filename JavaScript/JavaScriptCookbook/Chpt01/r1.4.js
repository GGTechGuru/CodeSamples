// Test for a substring

var testValue = "This is the dawn of a new American Century";
var subsValue = "new American Century";

var iValue = testValue.indexOf(subsValue);

if (iValue != -1)	{
	console.log("Found the substring '" + subsValue + "' in target string '" + testValue + "'.");
}
