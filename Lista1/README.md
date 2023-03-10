<h1>Flying Carpet</h1>

A certain magician moves around the world using his flying carpet. The vehicle's propulsion allows him to move at a speed of 25m/s. This speed does not take into account the wind, which can affect the actual speed of the carpet relative to the ground (increasing or decreasing it accordingly). Wind speed is expressed in knots (1kt ≈ 0.51m/s). Design and implement a class structure that reflects the problem and allows you to solve the tasks presented below.

<h3>Young Leosi concert</h3>
The magician took off from his headquarters at 5:00 PM. He plans to arrive at the Young Leosi concert at a location 300km west of him. The wind is blowing from the east at a speed of 10kt, will the magician make it to the concert, which starts at 8:30 PM?

<h3>At the beach in Stegna</h3>
Our magician took off at 11:20 AM from Stegna. He chose a heading towards Wrocław, which is 500km away (assume that Wrocław is directly south of Stegna). For the first 2h30min, the wind blew from the south at a speed of 2kt, then it changed direction to an east wind with a speed of 3kt. At what time will the magician arrive in Wrocław?

<h3>Meeting on the summit</h3>
From Wrocław at 10:15 AM, the magician took off to Krakow, which is 270km east of Wrocław, and 15 minutes later another magician took off from Krakow in the opposite direction. Both magicians are moving at their maximum speeds. The wind is blowing from the west at a speed of 8kt. At what distance from Wrocław and at what time will the magicians meet?

<h3>Speed control</h3>
On the Świnka-Lenie Wielkie section, there is a sectional speed measurement in the airspace. The ground speed limit is 40kt (the speed limit takes into account the wind). The magician took off at 11:55 AM, he covered the 70km section in 40 minutes. During the flight, the wind blew at a speed of 4kt in the opposite direction of the flight (i.e. it increased the speed relative to the ground).
Did the magician exceed the speed limit?

<h3>Task hints</h3>
We assume that the wind can blow from one of four cardinal directions: east, west, north, south, and the carpet can move in the same directions. For example, if the carpet is flying east and the wind is blowing from the west, it increases its speed, from the east it decreases, and the southern and northern winds do not affect its speed.
The program should reflect the problem as universally as possible. That is, most of the program logic should be contained in the methods of the given classes, not in the method responsible for generating the answer.

Proposed classes with example methods:
<ul>
<li>Vector class - stores information about the vector (e.g. 3kt east), has methods that allow vectors to be added</li>
<li>Knot class - represents speed in knots, provides methods to convert speed to m/s</li>
<li>m/s class - represents speed in meters per second, provides methods to convert speed to kt</li>
<li>Time class - operates on time units (using pre-made classes is prohibited)</li>
<li>Carpet class - represents the flying carpet, contains methods to calculate distance, time, and speed taking into account the wind vector.</li>
</ul>
