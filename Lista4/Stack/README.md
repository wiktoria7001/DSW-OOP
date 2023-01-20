<h1> Stack</h1>
Write a class called Stack, which is designed to store integers.<br>
The Stack class should have:
<ul>
<li>A constructor that takes an integer as an argument - the maximum number of elements that this stack can store. If a negative number is given, an IllegalArgumentException should be thrown.</li>
<li>Methods:
  <ul>
<li> push - adds the integer passed as an argument to the stack if there is still space - if not, throws a new Unchecked exception called StackFullException,</li>
<li> pop - removes the last element added to the stack and returns it - if the stack was empty, throws a new Unchecked exception called StackEmptyException,</li>
<li> clear - empties the stack,</li>
<li> top - returns the last element added to the stack - if the stack was empty, throws an exception of type StackEmptyException,</li>
<li> size - returns the number of elements currently stored in the stack.</li></ul></li>
 </ul>
Create several Stack objects and test their functionality. Handle potential exceptions in a try-catch block.
