# cs1302-ce09 More Shapes

![Approved for: Spring 2020](https://img.shields.io/badge/Approved%20for-Spring%202020-blue)
![Max Group Size: 3](https://img.shields.io/badge/Max%20Group%20Size-3-important)

> 十人十色 (Ten People, Ten Colors)
> **--Japanese Idiom**

This class exercise explores how to utilize inheritance in Java to create new classes
that are directly based on existing ones, with an emphasis on code reuse and design
implications. It also revisits how to commit and view changes to a local Git repository.

## Prerequisite Knowledge

* CSCI 1302 [Inheritance Tutorial](https://github.com/cs1302uga/cs1302-tutorials/blob/master/inheritance/inheritance.md)
* CSCI 1302 [UML Tutorial](https://github.com/cs1302uga/cs1302-tutorials/blob/master/uml/uml.md)

## Course-Specific Learning Outcomes

* **LO3.b:** Create class, interface, method, and inline documentation that satisfies a 
set of requirements.
* **LO3.c:** Generate user-facing API documentation for a software solution.
* **LO4.c:** (Partial) Design, create and use inheritance relationships in a software solution.
* **LO4.d:** Utilize inheritance-based polymorphism in a software solution.

## Questions

In your notes, clearly answer the following questions. These instructions assume that you are 
logged into the Nike server. 

**NOTE:** If a step requires you to enter in a command, please provide in your notes the full 
command that you typed to make the related action happen. If context is necessary (e.g., the 
command depends on your present working directory), then please note that context as well.

### Getting Started

1. Use Git to clone the repository for this exercise onto Nike into a subdirectory called `cs1302-ce09`:

   ```
   $ git clone --depth 1 https://github.com/cs1302uga/cs1302-ce09.git
   ```

1. **[ALL GROUP MEMBERS]**
   If you did not setup your Git username and email on Nike when working on `cs1302-ce07`,
   then please revist that exercise and follow the instructions presented there.

1. Change into the `cs1302-ce09` directory that was just created and look around. There should be
   multiple Java files contained within the directory structure. To see a listing of all of the 
   files under the `src` subdirectory, use the `find` command as follows:
   
   ```
   $ find src
   ```

   This is the same starter code from `cs1302-ce08`! Refer to your notes for that exercise about
   any inter-dependencies and/or inheritance between the files.

1. In your notes, draw a complete, proper UML diagram for the three classes contained in the
   starter code. **You might need to devote an entire page to this. We recommend using a pencil.** 
   Refer to the [CSCI 1302 UML Tutorial](https://github.com/cs1302uga/cs1302-tutorials/blob/master/uml/uml.md)
   if needed.
   Specifically, each individual class diagram should contain:

   * Class name;
   * Variables;
   * Constructors and methods;
   * If needed, a solid generalization arrow (`extends`) to a parent class; and
   * If needed, a dashed generalization arrow (`implements`) to an interface.

   In a class diagram, do not list inherited members (methods or attributes) unless they are 
   explicitly overriden. Be sure to include visibility modifiers (e.g., `+`, `#`, `~`, `-`) and
   type / return type information where needed. Also, remember that generalization arrows have a triangle
   arrow head, which differentiates them from dependency and aggregration associations.

**CHECKPOINT**

1. Create and document a `Rectangle` class in the `cs1302.shapes` package. It should extend
   the `Shape` class. In addition to including relevant instance variables for describing
   a rectangle, it should provide a constructor and a set of overrides for the `getArea` and
   `getPerimeter` methods. Additionally, include getter methods for the instance variables. 

1. Compile your `Rectangle` class. If you encounter any compililation errors:

   1. Write the error down in your notes;
   1. Fix the error in your code;
   1. Recompile; then
   1. Note the fix in your notes.
   1. Repeat as needed.

1. Make sure that all Java files pass the `checkstyle` audit. 
   
1. Since we've added a new class to our project, it's a good idea to save our work using Git.
   Check the status of your local copy of the repository using the following command:

   ```
   $ git status
   ```

   You should see a message similar to the following:

   ```
   # On branch master
   # Untracked files:
   #   (use "git add <file>..." to include in what will be committed)
   #
   #	src/cs1302/shapes/Rectangle.java
   nothing added to commit but untracked files present (use "git add" to track)
   ```

   As the message suggests, your `Rectangle.java` file is untracked. This is because it is a
   new file that is not currently tracked by Git. To have Git track changes on this file, 
   use the `git add` command as described in the message. 

1. Now, use Git to commit the changes that you made to your source code to your local
   copy of the repository. Remember to use the `-m` (message) option to give a brief,
   one sentence description of the changes you made to the source code. If you forget
   the `-m` option, then you Git will likely throw you into the Vi program to enter
   a message! 😱 Don't be scared if this happens to you... Press `i`, type your sentence,
   then press the intuitive sequence of keys: `ESC`, `:`, `wq!`, followed by return.
   Next time, remember the `-m` option.
   
   **NOTE:** If you don't want to be inadvertantly thrown into Vi in the future, then
   add the following line to your `~/.bash_profile` to set the default editor to Emacs
   (changes take effect on next login):
   
   ```
   export EDITOR="emacs -nw"
   ```

1. Generate the API documentation website for all of the code in the `cs1302` package
   into the `doc` directory. You may need to create the `doc` directory if it does not already exist.
   Host the documentation on Nike using `cs1302-ce09-doc` as the name for your symbolic link. Write
   the full URL for the `Rectangle` class in your notes.

**CHECKPOINT**

1. Create and document a `Square` class in the `cs1302.shapes` package. It should extend
   your `Rectangle` class. You shouldn't need to introduce any new instance variables,
   but you should include a constructor that makes proper use of the `super` keyword.

1. Compile your `Square` class. If you encounter any compililation errors:

   1. Write the error down in your notes;
   1. Fix the error in your code;
   1. Recompile; then
   1. Note the fix in your notes.
   1. Repeat as needed. 

1. Make sure that all Java files pass the `checkstyle` audit. 

1. You just utilized inheritance to reduce the amount of code needed to create a new class! Your
   `Square` class has everything a `Square` has. How much new code did you need to write? 
   Use `wc` to check your coder stats! 

   1. How many lines are in `Rectangle.java`?
   1. How many lines are in `Square.java`?
   
   Contrary to popular belief, fewer lines of code is usually better. Also, if you need to make a
   change to a `Rectangle` method, then this change will propogate throughout all descendants
   in your heirarchy that don't explicitly perform an override of the relevant method.

1. Tell Git to track changes made to your `Square.java` file, then commit the changes
   to your local copy of the repository. Be sure to include a good log message. 

1. Generate the API documentation website for all of the code in the `cs1302` package
   into the `doc` directory. You may need to create the `doc` directory if it does not already exist.
   Host the documentation on Nike using `cs1302-ce09-doc` as the name for your symbolic link. Write
   the full URL for the `Square` class in your notes.

**CHECKPOINT**

1. Create and document a `ShapeDriver` (driver) class in the `cs1302.shapes` package. Inside of the `main`
   method do the following:

   1. Create a `Shape` array, and populate it with two objects of **each** class (so, 8 total). Something like the
      following (will need to be modified):

      ```java
      Shape[] shapes = new Shape[] {
          new Ellipse(1.1, 2.5), 
          new Circle(1.5)
      };
      ```
      
   1. Loop over the array. For each element in the array, print the name of the shape using the
      `getName` method as well as the return values of the `getArea` and `getPerimeter` methods. Which
      classes do not explicitly define `getArea` and `getPerimeter`?

1. Make sure that all Java files pass the `checkstyle` audit. 

1. Compile the `ShapeDriver` class and run it. Is the output what you expected?

1. Tell Git to track changes made to your `ShapeDriver.java` file, then commit the changes
   to your local copy of the repository. Be sure to include a good log message. 

1. Regenerate the API documentation website for all of the code in the `cs1302` package.
   What is the direct URL to the API documentation for the class that you wrote
   for this checkpoint?

1. Use Git to view your commit log.

**CHECKPOINT**

<hr/>

[![License: CC BY-NC-ND 4.0](https://img.shields.io/badge/License-CC%20BY--NC--ND%204.0-lightgrey.svg)](http://creativecommons.org/licenses/by-nc-nd/4.0/)

<small>
Copyright &copy; Michael E. Cotterell, Brad Barnes, and the University of Georgia.
This work is licensed under a <a rel="license" href="http://creativecommons.org/licenses/by-nc-nd/4.0/">Creative Commons Attribution-NonCommercial-NoDerivatives 4.0 International License</a> to students and the public.
The content and opinions expressed on this Web page do not necessarily reflect the views of nor are they endorsed by the University of Georgia or the University System of Georgia.
</small>
