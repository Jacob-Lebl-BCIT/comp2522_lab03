# Java Coding Standards Cheat Sheet

**Note:** Comments are worth 51% of your mark. If your comments aren't good, your code is not good.

-----

### 1\. JavaDoc Comments Are Critical

Each method must have enough JavaDoc comments that another developer could build the method just by reading them. Some methods may need *pages* of comments.

### 2\. Declare, Then Initialize

Group declarations separately from initializations.

```java
// declaring
final int x;
final int y;
final int z;
final String a;

// initializing
x = 3;
y = 3;
z = 5;
a = "hi";

// using
System.out.println(a.toUpperCase());
System.out.println(x + y + z);
```

### 3\. All Parameters Must Be `final`

**Wrong:**

```java
private String getFullName(String first, String last)
```

**Right:**

```java
private String getFullName(final String first, final String last)
```

### 4\. Use Only What We've Learned

Use only techniques taught in class. Homework tests your skill with what we've covered, nothing more.

### 5\. Explicit Units Always

Variable names should include their units.

**Wrong:**
`price`, `weight`, `date`

**Right:**
`priceUsd`, `weightKg`, `datePublished`

### 6\. No Magic Numbers (except loop counters)

Use constants instead of hard-coded values, except for loop counters like `for (int i = 0; ...)`

**Example:**

```java
private final double TAX_RATE = 0.10;
private final int PERCENT_CONVERSION = 100;
private final double BASE_MULTIPLIER = 1.0;
private final double TAX_MULTIPLIER = BASE_MULTIPLIER + TAX_RATE;

System.out.println("Price has " + (TAX_RATE * PERCENT_CONVERSION) + "% tax added");
```

### 7\. Verbs Are for Methods, Not Variables

Boolean variable names should not be verbs.

**Wrong:**

```java
private final boolean isHappy;
```

**Right:**

```java
private final boolean happy;
```

### 8\. Use Proper Packages

Always use a lowercase, reverse domain, meaningful, and unique package name.

**Wrong:**

```java
package WhoCaresNotME;
```

**Right:**

```java
package ca.bcit.comp1516.petmanager;
```

### 9\. JavaDoc All Public Elements

All non-private classes, constructors, and methods must have JavaDoc comments.

### 10\. Instance Variables Must Be:

  - `private`
  - `final` unless they absolutely need to change

### 11\. Class-Level JavaDoc Required

Each class needs a JavaDoc with a full sentence description, `@author`, and `@version`.

### 12\. One Method = One Action

Split methods that do more than one thing.

**Right:**

```java
calculateDiscount()
```

**Wrong:**

```java
calculateDiscountAndPrintReceipt()
```

### 13\. Method Naming = camelCase Verbs

Use verbs and no abbreviations for method names.

**Right:**

```java
getTotalUsd()
```

**Wrong:**

```java
doStuff()
```

### 14\. Clear Variable Names

Be descriptive with variable names.

**Right:**
`emailSubject`, `weightKg`

**Wrong:**
`temp`, `val`

### 15\. One Class = One Responsibility

Each class should have a single, well-defined purpose.

**Right:**
`InvoiceCalculator`, `TaxHelper`

**Wrong:**
`Utils`

### 16\. No Abbreviations or Slang

Use full words in names.

**Right:**
`quantityKg`, `emailAddress`

**Wrong:**
`qty`, `addr`, `disc`

### 17\. Constants Are Capitalized, Unit-Specific

Constant names should be in `UPPER_SNAKE_CASE` and include units.

**Example:**

```java
private static final int MAX_USERNAME_LENGTH_CHARS = 30;
```

### 18\. No `System.out.print` in Final Code

Use return values or logging instead of print statements. They're only for debugging.

### 19\. Always Use Braces

Even for one-line conditions.

**Right:**

```java
if (happy) {
    doThing();
}
```

### 20\. File Name = Public Class Name

The `.java` file name must match the public class name inside it.

**Example:**
Class: `PetManager` -\> File: `PetManager.java`

### 21\. `final` Applies to Everything

  - Make methods `final` if they shouldn't be overridden.
  - Make classes `final` if they shouldn't be extended.
  - Use `final` for for-each and `catch` variables.

**Wrong:**

```java
for(String name: names)
```

**Right:**

```java
for(final String name: names)
```

**Wrong:**

```java
catch(IOException e)
```

**Right:**

```java
catch(final IOException e)
```

### 22\. Always Code to the Interface

Never declare collections using concrete classes like `ArrayList`, `HashMap`, etc. Declare as an interface (`List` or `Map`), then initialize as the concrete class. Everything must be `final` unless it truly needs to change.

**Right:**

```java
// declaring
private final List<String> names;
private final Map<String, Integer> scores;

// initializing
names = new ArrayList<>();
scores = new HashMap<>();
```

**Wrong:**

```java
private final ArrayList<String> names = new ArrayList<>();
private final HashMap<String, Integer> scores = new HashMap<>();
```