# Java Character Encoding Notes (ASCII vs Unicode)

## ASCII

ASCII (American Standard Code for Information Interchange) is an old character encoding standard.

- Uses **7 bits**
- Supports only **128 characters**

### ASCII Includes
- English alphabets (`A-Z`, `a-z`)
- Numbers (`0-9`)
- Special symbols (`$`, `@`, `#`, `%`)
- Control characters

### Example ASCII Values

| Character | ASCII Value |
|------------|-------------|
| A          | 65          |
| a          | 97          |
| $          | 36          |

---

# Limitation of ASCII

ASCII mainly supports English characters only.

It cannot properly represent:
- Hindi → नमस्ते
- Chinese → 你好
- Japanese → こんにちは
- Emojis → 😀

Because 128 characters are not enough for global languages.

---

# Unicode

Unicode is a universal character encoding standard created to support characters from almost all languages.

### Advantages
- Supports international languages
- Supports special symbols and emojis
- Platform independent standard

---

# Java and Unicode

Java uses **Unicode** for character representation.

## Java `char`

```java
char ch = 'A';