<h1>Transport Company<h1>

DSW Transport Company is engaged in international freight forwarding. The company handles both sea freight shipping with container ships, railway transport and trucking. Transport is only done using containers. Prepare a program that can manage the described company.
 
  <h3>Class structure</h3>

The program should consist of the following classes:
<ul>
<li>Transport (abstract class) common to all forms of transport, includes methods:

– transport(from, to) - transports goods from place A to place B (displays the appropriate message of the transport being made, additionally when this method is called, a message about the form of transport should be displayed, e.g. transported by ship (this functionality should rather be implemented in child classes)

– load(...) method allows loading of goods.</li>

  <li>Goods - a class representing goods, includes necessary fields and methods </li>

<li>Container - a class representing a container, includes a field storing an object of the Goods class, includes methods for loading and unloading goods.</li>

<li>Ship, Train, Truck - classes inheriting from the Transport class, extending its methods and implementing methods specific to the given means of transport. Define the capacity of each transport: ship - 90 containers, train - 20 containers, truck - 1 container</li>

  <li>Warehouse - class that stores containers that are waiting for further transport</li>
  </ul>
Additional classes may be implemented if necessary.


<h3>System simulation</h3>

In the class handling the simulation, propose structures that allow storing goods, containers and various means of transport. Perform a simulation consisting of the following steps:
<ol>
<li>Add products: electronic parts, mobile phones, shoes, clothing</li>
<li>Add 40 containers to the company's resources</li>  
<li>Add 1 ship, 2 trains, and 10 trucks to the company's resources. Use a map (HashMap) for this purpose, whose keys are the names of the means of transport, and the values are lists containing specific objects</li>
<li>Define the company's warehouses: Gdańsk, Wrocław, Kraków, Poznań</li>
<li>Load into containers:
  <ul><li>10 containers with electronic parts</li>
<li>20 containers with phones</li>
    <li>5 containers each with shoes and clothing</li></ul>
<li>Load all containers on the ship sailing from New York to Gdańsk</li>
<li>Unload the ship</li>
<li>Load the containers on trains heading to Wrocław. As the trains arrive in Wrocław, unload them and display the warehouse status</li>
<li>Transport all shoes and clothing to Poznań by truck (remember to unload to the warehouse)</li>
<li>Transport all electronic items to Kraków by truck</li>
<li>Tell how many total trips all the means of transport owned by the company have made (use a static field of the class for this purpose)</li>
  </ol>
Notice: At the beginning of the simulation, all transportation vehicles are located in the warehouse in Gdańsk. It is possible that a situation arises where it is necessary to travel "empty," that is, without loaded goods (remember about load limitations).
