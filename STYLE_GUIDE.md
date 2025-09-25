# Java Code Style Guide

Based on analysis of the comp2522-lab2group project, this document outlines the coding standards and conventions used throughout the codebase.

## 1. File Organization

### Package Structure
- Follow standard Java package naming conventions (reverse domain name notation)
- Example: `package ca.bcit.comp2522.lab2;`

### Class Organization
- Classes are organized with related functionality grouped together
- Exception classes are kept simple and focused
- Main classes contain comprehensive functionality with proper encapsulation

## 2. Naming Conventions

### Classes
- PascalCase for class names
- Descriptive names that clearly indicate purpose
- Examples: `Creature`, `Dragon`, `Elf`, `DamageException`

### Constants
- UPPER_SNAKE_CASE for constants
- Descriptive names with clear purpose
- Examples: `MIN_DAMAGE`, `FIRE_POWER_USAGE`, `MAX_HEALTH`

### Variables and Methods
- camelCase for variables and methods
- Descriptive names that indicate purpose
- Examples: `dateOfBirth`, `firePower`, `takeDamage()`, `validateName()`

### Parameters
- camelCase for parameters
- Use `final` keyword for parameters
- Examples: `final String name`, `final int health`

## 3. Code Formatting

### Indentation and Spacing
- 4 spaces for indentation (no tabs)
- Consistent indentation throughout all blocks
- Proper spacing around operators and after commas

### Braces
- Opening braces on the same line for class declarations
- Opening braces on new line for method declarations and control structures
- Consistent brace placement across all files

**Example:**
```java
public class Creature
{
    private final String name;

    public void takeDamage(final int damage)
    {
        if (damage < MIN_DAMAGE)
        {
            throw new DamageException("Invalid damage");
        }
    }
}
```

### Line Length and Wrapping
- Lines are generally kept to a reasonable length
- Long parameter lists are wrapped with proper alignment
- String concatenation is done on multiple lines when necessary

**Example:**
```java
public Creature(final String name,
                final LocalDate dateOfBirth,
                final int health)
{
    // constructor body
}
```

## 4. Documentation Standards

### Class Documentation
- Every class has comprehensive Javadoc documentation
- Includes @author and @version tags
- Clear description of class purpose and functionality

**Example:**
```java
/**
 * Creature class with name, birthdate, and health parameters.
 *
 * @author Samuel Pita
 * @version 1.0
 */
public class Creature
{
    // class implementation
}
```

### Method Documentation
- Public methods have detailed Javadoc documentation
- Includes parameter descriptions with @param tags
- Includes return value description with @return tag
- Includes exception documentation with @throws tags
- References constants using {@value #CONSTANT_NAME} syntax

**Example:**
```java
/**
 * Inflicts damage on the creature, reducing its health.
 * The creature's health will not fall below {@value #MIN_HEALTH}.
 *
 * @param damage           The amount of damage to inflict. Must be at least
 *                         {@value MIN_DAMAGE}.
 * @throws DamageException If the damage amount is less than {@value MIN_DAMAGE}.
 */
public void takeDamage(final int damage)
{
    // method implementation
}
```

### Field Documentation
- Constants and important fields have inline comments
- Comments are clear and descriptive
- Group related constants together

**Example:**
```java
// Damage constants.
private static final int MIN_DAMAGE = 0;

// Health constants.
private static final int MIN_HEALTH = 0;
private static final int MAX_HEALTH = 100;
```

## 5. Code Structure and Design

### Encapsulation
- Private fields with proper accessors
- Static validation methods for input validation
- Proper use of final keyword for immutable fields

**Example:**
```java
private final String name;
private int health;

private static void validateName(final String name)
{
    if (name == null || name.isEmpty())
    {
        throw new IllegalArgumentException("Name is null or empty");
    }
}
```

### Exception Handling
- Custom exception classes for specific error conditions
- Exceptions extend appropriate base classes (RuntimeException or Exception)
- Clear, descriptive error messages

**Example:**
```java
public class LowManaException extends RuntimeException
{
    public LowManaException(String message)
    {
        super(message);
    }
}
```

### Inheritance and Polymorphism
- Proper use of inheritance with @Override annotations
- Super class methods are called using super keyword
- Method signatures are consistent across inheritance hierarchy

**Example:**
```java
@Override
public void getDetails()
{
    super.getDetails();
    System.out.println("Mana: " + this.mana);
}
```

## 6. Best Practices

### Constants
- Use constants instead of magic numbers
- Group related constants together
- Use descriptive names for constants

### Validation
- Validate all input parameters
- Throw IllegalArgumentException for invalid inputs
- Use static validation methods for reusable validation logic

### Resource Management
- No external resources that need explicit management in current codebase
- Follow standard Java practices when dealing with resources

### Method Design
- Methods have single responsibility
- Proper parameter validation
- Clear return values and exception handling

## 7. Examples of Well-Formatted Code

### Complete Class Example
```java
package ca.bcit.comp2522.lab2;

import java.time.LocalDate;

/**
 * Dragon class that extends from Creature. It has firepower abilities.
 *
 * @author Samuel Pita
 * @version 1.0
 */
public class Dragon extends Creature
{
    // Firepower constants.
    private static final int FIRE_POWER_USAGE = 10;
    private static final int FIRE_POWER_DAMAGE = 20;
    private static final int MIN_FIRE_POWER = 0;
    private static final int MAX_FIRE_POWER = 100;

    // Instance variables.
    private int firePower;

    /**
     * Constructs a new Dragon instance.
     *
     * @param name        The name of the creature.
     * @param dateOfBirth The date of birth of the creature.
     * @param health      The initial health of the creature.
     * @param firePower   The initial firepower of the dragon.
     * @throws IllegalArgumentException If the firepower is not within the valid range of
     *                                  {@value MIN_FIRE_POWER} to {@value MAX_FIRE_POWER}.
     */
    public Dragon(final String name,
                  final LocalDate dateOfBirth,
                  final int health,
                  final int firePower)
    {
        super(name, dateOfBirth, health);
        validateFirePower(firePower);
        this.firePower = firePower;
    }

    private static void validateFirePower(final int firePower)
    {
        if (firePower < MIN_FIRE_POWER || firePower > MAX_FIRE_POWER)
        {
            throw new IllegalArgumentException(
                "Fire power must be set between " + MIN_FIRE_POWER + " and " + MAX_FIRE_POWER);
        }
    }

    /**
     * Reduces the dragon's firepower and inflicts damage on another creature.
     *
     * @param creature The creature to inflict damage upon.
     * @throws LowFirePowerException If the dragon's current firepower is insufficient.
     */
    public void breatheFire(final Creature creature) throws LowFirePowerException
    {
        if (this.firePower < FIRE_POWER_USAGE)
        {
            throw new LowFirePowerException(
                "Cannot breathe fire; firePower is less than " + FIRE_POWER_USAGE);
        }

        this.firePower -= FIRE_POWER_USAGE;
        creature.takeDamage(FIRE_POWER_DAMAGE);
    }
}
```

### Exception Class Example
```java
package ca.bcit.comp2522.lab2;

/**
 * Custom exception to be thrown when an elf's mana is too low to cast spells.
 *
 * @author Jacob, May, Samuel, Son
 * @version 1.0
 */
public class LowManaException extends RuntimeException
{
    public LowManaException(String message)
    {
        super(message);
    }
}
```

## 8. Tools and Configuration

### IDE Configuration
- Project uses IntelliJ IDEA configuration files
- Code style is set to "Default" in project settings
- No custom code style configurations detected

### Build Tools
- No build configuration files detected (pom.xml, build.gradle, etc.)
- Project appears to be a simple Java project without external build dependencies

## 9. Maintenance and Consistency

- All files follow the same formatting conventions
- Consistent documentation style across all classes
- Regular code reviews ensure adherence to standards
- New code should follow the established patterns and conventions

This style guide should be referenced by all AI agents working on this codebase to ensure consistency and maintainability.