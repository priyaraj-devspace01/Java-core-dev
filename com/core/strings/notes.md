# String
## sequence of characters or a character array

### char[] → it seems to be an abstract layer for this as a string
## Properties of String
 - string is immutable
 -  uses - password/ url/ hashes

## Declaration of String in java
1) using String literal( stored inside the string pool )
```code
String s1 = "hello")
```
2) using new keyword
```java
String s2 = new String("hello");

```
## Golden Rule:
 only the compile time constants go to the string pool automatically
 Runtime created string go to heap