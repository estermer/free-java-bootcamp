# Java Variables

Think back to that time you were in math class in middle school and just starting to learn algebra.
The teacher started throwing in letters into those equations and stuff and you were like, "How the heck do you add a plus b?".

Well variables in code are a lot like those variables in algebra. They are there as a placeholder to represent something else.
But in the case of code, the variables you can create are not limited to just a number.

## Java Data Types

Variables are able store different types of data. Simply put, a data type is what the data is recognized as by the compiler. 
For example, data types are like saying water is a liquid, oxygen is a gas, and a rock is a solid, it describes the data.

Here is a list of the primitive data types for Java:

Type | Description | Default | Size | Example Literals
--- | --- | --- | --- | --- 
boolean | true or false | false | 1 bit | true, false
byte | twos complement integer | 0 | 8 bits | (none)
char | Unicode character | \u0000 | 16 bits | 'a', '\u0041', '\101', '\\', '\'', '\n', 'ß'
short | twos complement integer | 0 | 16 bits | (none)
int | twos complement integer | 0 | 32 bits | -2, -1, 0, 1, 2
long | twos complement integer | 0 | 64 bits | -2L, -1L, 0L, 1L, 2L
float | IEEE 754 floating point | 0.0 | 32 bits | 1.23e100f, -1.23e-100f, .3f, 3.14F
double | IEEE 754 floating point | 0.0 | 64 bits | 1.23456e300d, -1.23456e-300d, 1e1d
