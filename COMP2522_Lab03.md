# COMP2522 - Lab 3: Inheritance / Abstract

  - **Assigned in:** Lesson 3
  - **Due before:** Lesson 4

## Objective

For this lab, you will create a hierarchy of several classes: `IDevice` (the parent), `IPod`, `IPad`, and `IPhone`.

-----

## Part 1: Class Hierarchy

### `IDevice` (Parent Class)

The parent class, `IDevice`, has the following members:

  - [cite\_start]A `purpose` instance variable (String) that is set in the constructor[cite: 8].
  - [cite\_start]A concrete method `getPurpose()` which returns the `purpose` string[cite: 7].
  - [cite\_start]An `abstract` method `printDetails()` which will print all of the child class's instance variables[cite: 8].

### Child Classes of `IDevice`

You will create three child classes that extend `IDevice`. [cite\_start]Each has a specific purpose and unique instance variables[cite: 9, 14].

#### `IPod`

  - [cite\_start]**Purpose**: `"music"` [cite: 13]
  - **Instance Variables**:
      - [cite\_start]`int numberOfSongsStored` [cite: 18]
      - [cite\_start]`double maxVolumeInDecibels` [cite: 18]

#### `IPad`

  - [cite\_start]**Purpose**: `"learning"` [cite: 13]
  - **Instance Variables**:
      - [cite\_start]`boolean hasACase` [cite: 19]
      - [cite\_start]`String operatingSystemVersion` [cite: 19]

#### `IPhone`

  - [cite\_start]**Purpose**: `"talking"` [cite: 13]
  - **Instance Variables**:
      - [cite\_start]`double numberOfMinutesRemainingOnPhonePlan` [cite: 20]
      - [cite\_start]`String carrier` [cite: 20]

### Common Requirements for Child Classes

Each of the three child classes (`IPod`, `IPad`, `IPhone`) must also include:

  - [cite\_start]A constructor, accessor methods, and mutator methods for their unique data members[cite: 14].
  - An overridden `toString()` method that returns all instance variables in a single String. [cite\_start]You must use the `@Override` annotation and call the parent's `toString()` method[cite: 21, 22].
  - An overridden `equals()` method. [cite\_start]You must use the `@Override` annotation[cite: 23, 27].
      - [cite\_start]`IPod` objects are equal if they have the same number of songs stored[cite: 24].
      - [cite\_start]`IPad` objects are equal if they have the same operating system version[cite: 25].
      - [cite\_start]`IPhone` objects are equal if they have the same number of minutes remaining[cite: 26].
  - [cite\_start]An overridden `hashCode()` method, since you are overriding `equals()`[cite: 28].

-----

## Part 2: Extending the Hierarchy

### `IPhone16` (Child of `IPhone`)

[cite\_start]Extend the `IPhone` class by creating a new child class called `IPhone16`[cite: 30].

#### `IPhone16` Details

  - **Instance Variables**:
      - [cite\_start]`boolean highResolutionCamera` [cite: 32]
      - [cite\_start]`int gigabytesOfMemory` [cite: 33]
  - **Requirements**:
      - [cite\_start]A constructor, accessor methods, and mutator methods for its data members[cite: 31].
      - Override the `toString()` method to return all object data in a String. [cite\_start]Use the `@Override` annotation and call its parent's `toString()` method[cite: 34, 35].
      - [cite\_start]Override the `equals()` method (and therefore `hashCode()`)[cite: 36, 41].
          - [cite\_start]`IPhone16` objects are considered equal if they have the same number of minutes remaining **and** the same value for `highResolutionCamera`[cite: 37].
          - [cite\_start]Use the `@Override` annotation[cite: 38].

-----

## Part 3: Main Method and Testing

[cite\_start]Create a `Main` class with a `main()` method[cite: 43]. Copy and paste the code below into your `main()` method. [cite\_start]You must also **fix all the style violations** present in the code[cite: 43].

```java
public class Main {
    public static void main(final String[] args) {
        // Create IPod objects
        final IPod ipod1;
        final IPod ipod2;
        final IPod ipod3;
        ipod1 = new IPod(300, 80.0); // 300 songs, max volume 80.0 dB
        ipod2 = new IPod(400, 85.0); // 400 songs, max volume 85.0 dB
        ipod3 = new IPod(300, 70.0); // 300 songs, max volume 70.0 dB

        // Test equality and inequality for IPod
        System.out.println("IPod Equality Test:");
        if (!ipod1.equals(ipod2)) {
            System.out.println("CORRECT: ipod1 is not equal to ipod2");
        } else {
            System.out.println("INCORRECT: ipod1 should not be equal to ipod2");
        }
        if (ipod1.equals(ipod3)) {
            System.out.println("CORRECT: ipod1 is equal to ipod3");
        } else {
            System.out.println("INCORRECT: ipod1 should be equal to ipod3");
        }
        System.out.println();

        // Create IPad objects
        final IPad ipad1;
        final IPad ipad2;
        final IPad ipad3;
        ipad1 = new IPad(true, "iPadOS 15"); // Has case, OS version iPadOS 15
        ipad2 = new IPad(false, "iPadOS 14"); // No case, OS version iPadOS 14
        ipad3 = new IPad(true, "iPadOS 15"); // Has case, OS version iPadOS 15

        // Test equality and inequality for IPad
        System.out.println("IPad Equality Test:");
        if (!ipad1.equals(ipad2)) {
            System.out.println("CORRECT: ipad1 is not equal to ipad2");
        } else {
            System.out.println("INCORRECT: ipad1 should not be equal to ipad2");
        }
        if (ipad1.equals(ipad3)) {
            System.out.println("CORRECT: ipad1 is equal to ipad3");
        } else {
            System.out.println("INCORRECT: ipad1 should be equal to ipad3");
        }
        System.out.println();

        // Create IPhone objects
        final IPhone iphone1;
        final IPhone iphone2;
        final IPhone iphone3;
        iphone1 = new IPhone(120.0, "Verizon"); // 120 minutes, carrier Verizon
        iphone2 = new IPhone(180.0, "T-Mobile"); // 180 minutes, carrier T-Mobile
        iphone3 = new IPhone(120.0, "AT&T"); // 120 minutes, carrier AT&T

        // Test equality and inequality for IPhone
        System.out.println("IPhone Equality Test:");
        if (!iphone1.equals(iphone2)) {
            System.out.println("CORRECT: iphone1 is not equal to iphone2");
        } else {
            System.out.println("INCORRECT: iphone1 should not be equal to iphone2");
        }
        if (iphone1.equals(iphone3)) {
            System.out.println("CORRECT: iphone1 is equal to iphone3");
        } else {
            System.out.println("INCORRECT: iphone1 should be equal to iphone3");
        }
        System.out.println();

        // Create IPhone16 objects
        final IPhone16 iphone16_1;
        final IPhone16 iphone16_2;
        final IPhone16 iphone16_3;
        iphone16_1 = new IPhone16(100.0, "Verizon", true, 512); // 100 minutes, high-res camera, 512 GB
        iphone16_2 = new IPhone16(100.0, "Verizon", true, 256); // 100 minutes, high-res camera, 256 GB
        iphone16_3 = new IPhone16(100.0, "Verizon", false, 512); // 100 minutes, no high-res camera, 512 GB
        
        // Test equality and inequality for IPhone16
        System.out.println("IPhone16 Equality Test:");
        if (iphone16_1.equals(iphone16_2)) {
            System.out.println("CORRECT: iphone16_1 is equal to iphone16_2");
        } else {
            System.out.println("INCORRECT: iphone16_1 should be equal to iphone16_2");
        }
        if (!iphone16_1.equals(iphone16_3)) {
            System.out.println("CORRECT: iphone16_1 is not equal to iphone16_3");
        } else {
            System.out.println("INCORRECT: iphone16_1 should not be equal to iphone16_3");
        }
        System.out.println();
    }
}
```