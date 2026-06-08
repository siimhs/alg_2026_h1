# Homework 1

This project is configured to work offline using local libraries in the `lib/` directory. All code resides in the default package.

## 📂 Project Structure

```
h1/
├── src/main/java/       # Application source code
│   └── Sheep.java
├── src/test/java/       # Test code
│   ├── SheepTest.java
│   └── Aout.java        # Test helper utilities
├── lib/                 # Local libraries
│   ├── junit-4.13.2.jar
│   └── hamcrest-core-1.3.jar
├── bin/                 # Compiled class files
└──
```

## 🛠️ Command Line Instructions

Since the project uses the default package and local JAR files, commands differ by operating system (path separator: Windows `;` vs Linux/Mac `:`).

### Windows (Command Prompt / PowerShell)

```bash
# 1. Compile main code
javac -d bin src/main/java/*.java

# 2. Compile tests (requires lib folder and main code in bin)
javac -d bin -cp "lib/*;bin" src/test/java/*.java

# 3. Run application
java -cp bin Sheep

# 4. Run JUnit tests
java -cp "bin;lib/*" org.junit.runner.JUnitCore SheepTest
```

### Linux and macOS

```bash
# 1. Compile main code
javac -d bin src/main/java/*.java

# 2. Compile tests (requires lib folder and main code in bin)
javac -d bin -cp "lib/*:bin" src/test/java/*.java

# 3. Run application
java -cp bin Sheep

# 4. Run JUnit tests
java -cp "bin:lib/*" org.junit.runner.JUnitCore SheepTest
```

---

## 📋 Task Description

Olgu massiivis juhuslikult läbisegi sikud (goat) ja lambad (sheep).
Koostage võimalikult kiire meetod, mis järjestaks massiivi ümber nii,
et kõik sikud oleksid massiivi alguses ja kõik lambad lõpus. 
Arvestage ka piirjuhtumiga, et kõik loomad on üht sorti.
Kui kasutate mingeid allikaid, siis lisage viited programmi algusse 
kommentaaride vormis.
Ei ole mõistlik kasutada List andmetüüpe, sest need annavad 
väga aeglase tulemuse.

An array contains sheep and goats in random order. 
Write a possibly fast method to rearrange the array, 
so that all goats are at the beginning and all sheep 
are at the end of the array. 
Consider the case when all animals are the same kind.
If any sources are used, they must be cited (in form of comments
at the beginning of the code).
Do not use Java List types (lists are very slow for this task).

enum Animal {sheep, goat};

public static void reorder (Animal[] animals)

---

## ⚙️ Requirements

- **Java 8** or higher
