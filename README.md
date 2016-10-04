# Programming Language Detector

The Programming Language Detector Project is used to find that the "code" which given as an input is 
written by using which programming language.

## Team Name and Member name

* Team name: Heroes-Of-Tomorrow (HOT)
* Member name: Rakesh Kumar Prajapti & Atanu Das 

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development
and testing purposes. 

#### Prerequisities

To run this project to local machine you need to install some software, like
    * [Java](https://www.java.com/en/download/win10.jsp)
    * [Apache Tomcat Server](https://tomcat.apache.org/download-80.cgi)
    * IDE, you can use any IDE. I used [Eclipse Luna](https://www.eclipse.org/downloads/download.php?file=/oomph/epp/neon/R1/eclipse-inst-win64.exe) IDE.

#### Build With
    * Eclipse Luna
    * jsp
    * Visual Studio code

### Pictorial View
![Language Detector](https://github.com/rakeshec005/Heroes-Of-Tomorrow-HOT-/blob/master/vector.jpg)
### Approach
We broke this problem in pieces so that we can made it easy.
    * We first find out the keywords and syntax of all the programming language.
    * Then we make a container of every programming language and store keywords and syntax in their respective container.
    * The idea is that, we took a code snippet from STDIN and start matching with every keywords and syntax from every 
    container, If we found any matches in respective container then we increase a counter value.

    For Example: I make a container of different programming language like C, C++, java, javascript. After that We'll
    take a code snippet let say,

        ```Java
            public class HelloWorld {
            public static void main(String[] args) {
             // Prints "Hello, World" to the terminal window.
            System.out.println("Hello, World");
            }
            }
        ```
    from STDIN and start matching with every keywords and syntax from each container(C, C++, java, javascript). We'll put 
    counter in each container. If I found any matches from any container then I'll increase the counter by 1 of that container.

    In this code snippet, we'll get more token in java container as compared to another container. So on the basis of this 
    we can say that this code written in JAVA programming language.

    This was our whole Idea.

#### Data Structure
We make a use of Vector, Array & class.

### Alogrithm and Implementation
Step 1: Take the entire code segment as string input from stdin.

Step 2: Create an array of string, containing the entire available language name. Lan[n].

Step 3: Create a vector of vector of String object,

Vector<<Vector>String>> container. Content of this container are Vector<String> type. And contain all the syntax, 
key words and tokens of each individual language. Most of these syntaxes are unique in nature.

Step 4: Make a Call to languageDetector(String str) method, where the input code segment will be passed as string.

    I. Within languageDetector() method each and every vector<string> object is selected from container. And passed to the 
    SyntaxChecker(vec,str) method along with input string object str.

    II. SyntaxChecker(vec,str) method pulls a syntax from vector<string> object and check this syntax with input string,
     whether this syntax exists within this string or not. If input string contains this individual syntax, then make 
     count=count+1; After checking all the syntaxes return count .

    III. languageDetector() collect count and push it into vector<Integer> syntaxCount. syntaxCount holds the number. Number 
    of syntaxes match for a particular language with input string.

Step 5: Make a call to printer() method.

    I. Printer() method finds syntax matching count for each language and compare this count with other language’s syntax
     matching count and finally select the maximum syntax count.

    II. Print the language name which is associated with maximum syntax count .
 
### Running instructions
    * Clone this whole project in your local system.
    * Import this whole project in IDE.
    * Start tomacat server and run frontend.jsp file (localhost:8080/address _where_file_is_kept/frontend.jsp)
    
    1. Open frontend.jsp page : When we click on button it will make a call to the LoadClassifier.java servlet and then servlet
    make a call to the methods of DetectingALanguage.java file.

    2. Write code snippet of supported language which shown in frontend page. 
    3. Click on detect language button

### Future Prospects
This is a sample project with only few features; we have opportunity of working with this project and we will put our
attention on various thing. Here single line comment and multi line comments are not taken care of. In future we will
adopt some new logic so that we can take care of all those comments. And also there is some syntactical ambiguity exists,
sometimes it becomes ambiguous between ruby and python. We will put more logic and clarifications and make the code crystal
clear, so that it can detect python and ruby without any confusion. And also there is something we have thought of. 
Here it only detects a set of seven languages. We have plan for increasing this language number up to maximum. And make it 
a complete application.
