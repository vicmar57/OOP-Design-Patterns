# Adapter Pattern

The adapter pattern converts the interface of a class into an other interface that clients expect.
Useful when slowly deprecating class/methods

The pattern we want to maintain:
Itarget target = new Adapter(new Adaptee());
target. request();

## UML diagram:

![Alt text](AdapterPatternUML.jpg?raw=true "Pattern's UML diagram")
