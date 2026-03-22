* ## Today Topics:
    * ### Variable
    * ### Datatypes
        * int
        * long
        * float
        * double
        * char
        * String
        * boolean


* # Variable:
    * ### Definition:
        Variables are named memory locations used to store data. <br> ```int age = 10``` , where ```int``` is Datatype and ```age``` is variable name and ```10``` is Value hold by variable and ```=``` sign is assign operator.<br>
        * In Java, there are different types of variables, for example:
            * **String** - stores text, such as **```"Habibi"```**. String values are surrounded by double quotes.
            * **int** - stores integers (whole numbers), without decimals, such as 123 or -123.
            * **float** - stores floating point numbers, with decimals, such as 19.99 or -19.99.
            * **char** - stores single characters, such as **```'a'```** or **```'B'```**. Char values are surrounded by single quotes.
            * **boolean** - stores values with two states: true or false.

    * ### To create a variable in Java, you need to:
        * Choose a type (like ```int``` or ```String```).
        * Give the variable a name (like ```x```, ```age```, or ```name```).
        * Optionally assign it a value using ```=```.

    * ### Syntax:
        *```type variableName = value;```*

    * ### Example:
        * ```String name = "John"```;
        * ```System.out.println(name)```;

    * ### Rules:
        * **Allowed Characters:** Variable names can contain letters (A-Z, a-z), digits (0-9), the underscore character (_), and the dollar sign ($).
        * **Starting Character:** A name must start with a letter, the dollar sign ($), or an underscore (_). It cannot begin with a digit.
        * **No Keywords:** You cannot use any of the Java reserved keywords (e.g., int, for, class) as a variable name. The literals true, false, and null also cannot be used as identifiers.
        * **No Spaces:** Variable names cannot contain white spaces.
        * **Case Sensitive:** Java is case-sensitive, so age and Age would be treated as two different variables.
        * **Uniqueness:** A variable must be unique within its specific scope. 

* # Datatype:
    * ### Primitive Data Types:
        * Store simple values directly in memory.
    * ### Non-Primitive (Reference) Data Types:
        * Store memory references to objects.

    * ### Datatype Details:
    ![Datatype Details](https://github.com/maiaabidhoon/Learning-Java/blob/main/Day1/data_types_in_java.webp)

    
    | Type    | Description                  | Default   | Size               | Example           | Range                          |
    |---------|------------------------------|-----------|--------------------|-------------------|--------------------------------|
    | boolean | Logical values               | false     | Not JVM-defined    | true, false       | true or false                  |
    | byte    | 8-bit signed integer         | 0         | 1 byte             | 10                | -128 to 127                    |
    | char    | 16-bit Unicode character     | \u0000    | 2 bytes            | 'A', '\u0041'     | 0 to 65,535                    |
    | short   | 16-bit signed integer        | 0         | 2 bytes            | 2000              | -32,768 to 32,767              |
    | int     | 32-bit signed integer        | 0         | 4 bytes            | 1000, -500        | -2,147,483,648 to 2,147,483,647|
    | long    | 64-bit signed integer        | 0L        | 8 bytes            | 123456789L        | ±9.22e18                       |
    | float   | 32-bit floating point        | 0.0f      | 4 bytes            | 3.14f             | ~6–7 digits precision          |
    | double  | 64-bit floating point        | 0.0d      | 8 bytes            | 3.14159d          | ~15–16 digits precision        |

