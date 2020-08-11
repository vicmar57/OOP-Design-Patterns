# Singleton Pattern

Makes sure a class has only a single instance of it (basically creates a single global object).
This happens through making the constructor private and keeping a single class instance.

Not reccomended in most cases since things don't exist only once.
Useful in banking apps when we can have only a single bankAccount object, 
or for game windows, where we want only a single game window to be created.

## UML diagram:

![Alt text](SingletonUML.jpg?raw=true "Pattern's UML diagram")
