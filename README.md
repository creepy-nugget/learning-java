# learning-java

### BASICS:
In java,
* Statements end in a semicolon ;
* Code blocks are defined by a pair of curly braces { }
* Declare an int variable with a name and a type: int x;
* The assignment operator is one equals sign =
* The equals operator uses two equals signs ==
* A while loop runs everything within its block (defined by curly
braces) as long as the conditional test is true.
* If the conditional test is false, the while loop code block won’t
run, and execution will move down to the code immediately
after the loop block.
* Put a boolean test inside parentheses:
while (x == 4) { }


### Objects and Class:

A class is like a recipe.
Objects are like cookies.

* Object-oriented programming lets you extend
a program without having to touch previously
tested, working code.

* All Java code is defined in a class.
* A class describes how to make an object of
that class type. A class is like a blueprint.
* An object can take care of itself; you don’t
have to know or care how the object does it.
* An object knows things and does things.
* Things an object knows about itself are called
instance variables. They represent the state
of an object.
* Things an object does are called methods.
They represent the behavior of an object.
* When you create a class, you may also want
to create a separate test class that you’ll use
to create objects of your new class type.
* A class can inherit instance variables and
methods from a more abstract superclass.
* At runtime, a Java program is nothing more
than objects “talking” to other objects.

### Varibles:

* Variables come in two flavors: primitive and
reference.
* Variables must always be declared with a name
and a type.
* A primitive variable value is the bits representing
the value (5, ‘a’, true, 3.1416, etc.).
* A reference variable value is the bits
representing a way to get to an object on the
heap.
* A reference variable is like a remote control.
Using the dot operator (.) on a reference
variable is like pressing a button on the remote
control to access a method or instance variable.
* A reference variable has a value of null when
it is not referencing any object.
* An array is always an object, even if the array
is declared to hold primitives. There is no such
thing as a primitive array, only an array that
holds primitives.