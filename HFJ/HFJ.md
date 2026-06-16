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

### Variables:

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

### Instance Variables, Argument and Parameters:
Classes define what an object knows and what an
object does.
* Things an object knows are its instance variables
(state).
* Things an object does are its methods (behavior).
* Methods can use instance variables so that objects
of the same type can behave differently.
* A method can have parameters, which means you
can pass one or more values in to the method.
* The number and type of values you pass in must
match the order and type of the parameters
declared by the method.
* Values passed in and out of methods can be
implicitly promoted to a larger type or explicitly cast
to a smaller type.
* The value you pass as an argument to a method
can be a literal value (2, ‘c’, etc.) or a variable of
the declared parameter type (for example, x where
x is an int variable). (There are other things you
can pass as arguments, but we’re not there yet.)
* A method must declare a return type. A void return
type means the method doesn’t return anything.
* If a method declares a non-void return type, it must
return a value compatible with the declared return
type.

Reminder: Java
cares about type!
You can’t return a Giraffe when
the return type is declared
as a Rabbit. Same thing with
parameters. You can’t pass a
Giraffe into a method that takes
a Rabbit.

### Encapsulation:

* Encapsulation gives you control over who changes the
data in your class and how.
* Make an instance variable private so it can’t be changed
by accessing the variable directly.
* Create a public mutator method, e.g., a setter, to control
how other code interacts with your data. For example,
you can add validation code inside a setter to make sure
the value isn’t changed to something invalid.
* Instance variables are assigned values by default, even
if you don’t set them explicitly.
* Local variables, e.g., variables inside methods, are
not assigned a value by default. You always need to
initialize them.
* Use == to check if two primitives are the same value.
* Use == to check if two references are the same, i.e., two
object variables are actually the same object.
* Use .equals() to see if two objects are equivalent (but
not necessarily the same object), e.g., to check if two
String values contain the same characters.

### How to write a program ?
Your Java program should start with a high-
level design.
* Typically you’ll write three things when you
create a new class:

   ▪ prep code

   ▪ test code

   ▪ real (Java) code

* Prep code should describe what to do, not
how to do it. Implementation comes later.
* Use the prep code to help design the test
code.
* A class can have one superclass only.
* Write test code before you implement the
methods.
* Choose for loops over while loops when you
know how many times you want to repeat the
loop code.
* The enhanced for loop is an easy way to loop
over an array or collection.
* Use the increment operator to add 1 to a
variable (x++;).
* Use the decrement operator to subtract 1 from
a variable (x--;).
* Use break to leave a loop early (i.e., even if
the boolean test condition is still true).
