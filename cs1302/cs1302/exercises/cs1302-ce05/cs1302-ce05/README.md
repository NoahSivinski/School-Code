# ce05 API Documentation with Javadoc

![Approved for: Spring 2020](https://img.shields.io/badge/Approved%20for-Spring%202020-blue)

This class exercise is designed to get you acquainted with Javadoc comments. 
In particular, it walks you through the transformation of non-Javadoc comments 
at the class-level and method-level into Javadoc comments so that the Javadoc 
program can be used to generate a documentation website. In addition to the 
generated website, the comments themselves also help programmers who are reading 
your code. **Proper comments save companies and teams real world money by lowering 
transaction costs associated with interpreting code.**

## Prerequisite Knowledge

* A basic understanding of Javadoc tags and generating API documentation.
* [CCSI 1302 Javadoc Tutorial](https://github.com/cs1302uga/cs1302-tutorials/blob/master/javadoc/javadoc.md)
* [CSCI 1302 Style Guide](https://github.com/cs1302uga/cs1302-styleguide)

## Course-Specific Learning Outcomes

* **LO2.b:** (Partial) Define, throw, and propagate exceptions appropriately in a software solution.
* **LO3.b:** Create class, interface, method, and inline documentation that satisfies a 
set of requirements.
* **LO3.c:** Generate user-facing API documentation for a software solution.

## Questions

In your notes, clearly answer the following questions. These instructions assume that you are 
logged into the Nike server. 

**NOTE:** If a step requires you to enter in a command, please provide in your notes the full 
command that you typed to make the related action happen. If context is necessary (e.g., the 
command depends on your present working directory), then please note that context as well.

### Getting Started

1. Use Git to clone the repository for this exercise onto Nike into a subdirectory called `cs1302-ce05`:

   ```
   $ git clone https://github.com/cs1302uga/cs1302-ce05.git
   ```

1. Change into the `cs1302-ce05` directory that was just created and look around. There should be
   a Java file somewhere in the directory structure. To see a listing of all of the 
   files under the `src` subdirectory, use the `find` command as follows:
   
   ```
   $ find src
   ```
   
   For each Java file that you find, fill out a row in a table in your notes similar to the following:
   
   | Name of the Java file | Fully Qualified Name (FQN) |
   |-----------------------|----------------------------|
   |-----------------------|----------------------------|
   |-----------------------|----------------------------|
   |-----------------------|----------------------------|

1. Make sure you are still in the `cs1302-ce05` directory. Write the command to generate 
   the API documentation website for the code contained in this exercise and place it in the 
   preexisting `doc` subdirectory. Be sure to write the full command in your notes, specifying 
   the `-d`, `-sourcepath`, and `-subpackages` options.
   In your notes, briefly explain what each of these options mean.

1. Verify that files were generated and placed in the `doc` directory before continuing.

1. Make sure you are still in the `cs1302-ce05` directory.
   Use `ln` to create a symbolic link (shortcut) named `cs1302-ce05-doc` in your `public_html` 
   directory. The symbolic link should link to the `doc` subdirectory containing the API documentation 
   website created in a previous step. Write the exact command used in your notes.
   
   **NOTE:** Remember, if you use `$(pwd)` as described in the reading, then that expression
   will expand to the absolute path of your present working directory. That is, the string
   that it expands to will differ depending on where you currently are. 
   
   **NOTE:** You are fully responsible for anything that you host through your Nike website.
   
1. The symbolic link created in the last step is called `cs1302-ce05-doc`. You can see it if you
   change into your `public_html` directory and perform an `ls -l`. What are two things in
   the output of `ls -l` that let you know `cs1302-ce05-doc` is a symbolic link?
   
   **NOTE:** If you made a typo while setting up the symbolic link in the previous step, then 
   you may need to delete the link itself in the `~/public_html` directory before trying 
   the recreate the link. If bash tab completes the link name to include a trailing
   `/` (forward slash), then you should remove that `/` when referring to the link with
   the `rm` command.

1. Navigate to the following URL in your web browser, replacing `user` with your Nike
   username (be sure to remember the `~`):

   ```
   http://cobweb.cs.uga.edu/~user/cs1302-ce05-doc/
   ```

   You should see the API documentation website that you generated. Other than the website
   you generated while doing the reading, does this website look similar to any other 
   websites that you may have visited? If so, what? You can be general in your response. 

**CHECKPOINT**
    
### Writing API Documentation

1. From the API documentation website, click on one of the links to the `House` class. In your notes, list
   the name of each method that appears to contain commented documentation. How many 
   such methods currently containing Javadoc comments are there?
   
1. In `House.java`, some of the methods already have multiline, non-Javadoc comments.  Transform the 
   comments into Javadoc using the appropriate syntax. In each Javadoc comment, include one or more 
   properly punctuated sentences that describe the method. You may base these sentences off the existing
   comments. Be sure to also include tags that document, as needed, the parameters and return type. 
   Leave out any propagated exceptions for now. 
   
   Use the `@code` tag where appropriate. The instructor or TA will look for this. A good rule of thumb
   is that nouns that refer to code identifiers (e.g., variable names, class names, method names, etc.)
   should be differentiated using an `@code` tag. If done correctly, readers of the documentation
   website will be able to better identify when a general word is being used versus an
   identifier. 
   
1. In `House.java`, the class itself also has multiline, non-Javadoc comments.  Transform the comments 
   into Javadoc using the appropriate syntax. Try to preserve the multi-paragraph nature of the existing
   comment. Use the `@code` tag where appropriate.
   
1. Run the `javadoc` tool to update your API documentation website on `nike`. You should not need
   to recreate the symbolic link in `~/public_html`, assuming it still exists. This is because the
   symbolic link is pointing to your `doc` folder. When the `doc` folder is updated, the link automatically
   points to this new content.

1. View the updated API documentation website.  
   
1. Repeat the previous three steps until you are confident that the API documentation website
   displays the documentation corresponding to your comments. Once done, write down the direct 
   URL to the API documentation webpage for the `House` class.
   
**CHECKPOINT**

### Throwing Exceptions

1. To ensure that a `House` object cannot have a negative price, modify the constructor and the
   `setPrice` method to throw an 
   [`IllegalArgumentException`](https://docs.oracle.com/javase/8/docs/api/java/lang/IllegalArgumentException.html) 
   with an appropriate detail message when the `price` parameter is negative. 
   
   * In both places, create and explicitly throw the exception using the `throw` keyword inside of
     an appropriate `if` statement.
   * In the constructor, do not list the exception in the signature using `throws`.
   * In the `setPrice` method, do list the exception in the signature using `throws`.
   
1. Is `IllegalArgumentException` a checked or an unchecked exception? How do you know?
   
1. Update your Javadoc comments so that users of the constructor are aware that the constructor may
   throw an exception under certain circumstances. At a minimum, appropriate use of the `@throws` tag
   is needed, regardless of whether the exception is listed using `throws` in the method signature.

1. Run the `javadoc` tool to update your API documentation website on `nike`. Find the constructor and
   `setPrice` method in the "Construtor Detail" and "Method Detail" sections of the `House`
   classes documentation webpage, respectively. How does their documentation _differ_ with respect
   to the exception? Why?
   
   **Note:** In general, when a method throws an unchecked exception, we will not list it in the signature
   of the method. We did it in this exercise for `setPrice` only to see the difference in the documentation
   webpage.

1. Run the 1302 `checkstyle` program on `House.java`. If errors are reported, look up each error message 
   in the [Style Guide](https://github.com/cs1302uga/cs1302-styleguide), fix the error, and repeat until 
   no style errors remain.
   
**CHECKPOINT**

<hr/>

[![License: CC BY-NC-ND 4.0](https://img.shields.io/badge/License-CC%20BY--NC--ND%204.0-lightgrey.svg)](http://creativecommons.org/licenses/by-nc-nd/4.0/)

<small>
Copyright &copy; Michael E. Cotterell, Brad Barnes, and the University of Georgia.
This work is licensed under a <a rel="license" href="http://creativecommons.org/licenses/by-nc-nd/4.0/">Creative Commons Attribution-NonCommercial-NoDerivatives 4.0 International License</a> to students and the public.
The content and opinions expressed on this Web page do not necessarily reflect the views of nor are they endorsed by the University of Georgia or the University System of Georgia.
</small>
