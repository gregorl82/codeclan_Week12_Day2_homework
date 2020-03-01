<h1>Java Theme Park Modelling</h1>
<h2>Objectives</h2>
<p>Practice modelling a large real world domain using:</p>
<ul>
<li>classes</li>
<li>inheritance</li>
<li>abstract classes</li>
<li>interfaces</li>
</ul>

<h2>MVP</h2>
<h3>Classes and Abstract Classes</h3>
<p>Look through the start code and understand what is set up for you already.<p>
<ul>
<li>Visitor class with age, height and money.</li>
<li>Attraction abstract class with name, rating and visitCount (which starts at 0).</li>
<li>Rollercoaster, Dodgems, Park and Playground classes which inherit from Attraction</li>
<li>Stall abstract class which has name, owner name, rating and parking spot.</li>
<li>CandyFlossStall. TobaccoStall and IceCreamStall which inherit from Stall.</li>
<li>All of these classes have tests set up for them.</li>
</ul>
<h3>Interfaces</h3>
<p>Introduce some Interfaces to enable charging, restricting and reviewing attractions and stalls:</p>
<ul>
<li>ITicketed promises double defaultPrice() and double priceFor(Visitor)</li>
<li>ISecurity promises boolean isAllowedTo(Visitor)</li>
<li>IReviewed promises int getRating() and String getName()</li>
</ul>
<p>Have some of the classes implement these interfaces. Below are the rules about what the implementations should be:</p>
<ul>
<li>Playground implements ISecurity because it has a maximum age of 15</li>
<li>TobaccoStall implements ISecurity because it has a minimum age of 18</li>
<li>Rollercoster implements ISecurity and requires a visitor to be over 145cm tall and over 12 years of age</li>
<li>All Stalls and Attractions implement IReviewed.</li>
<strong>Note:</strong> Starting prices are:
<ul>
<li>£8.40 for Rollercoaster</li>
<li>£4.50 for Dodgems</li>
</ul>
<li>Rollercoaster implements ITicketed and charges tall people over 200cm double fee</li>
<li>Dodgems implements ITicketed and charge half price to children under 12 years old</li>
</ul>
<h3>Extensions</h3>
<p>Create a ThemePark class to manage the attractions and stalls.</p>
<ul>
<li>ThemePark stores all Attractions and Stalls in it.</li>
<li>ThemePark has a method getAllReviewed() which returns an ArrayList of IReviewed objects.</li>
<li>Add an empty visitedAttractions ArrayList to Visitor which stores a list of Attractions and a method to add an attraction to the list.</li>
<li>ThemePark has a method visit(Visitor, Attraction) calls for the attraction to increment its visitCount by 1 and adds the attraction to the visitors visitedAttractions list.</li>
</ul>
<h3>Advanced Extensions</h3>
<ul>
<li>ThemePark has a method that can return a new HashMap<String, Integer> with all reviews. The HashMap will have a key of the name and value of review.</li>
<li>ThemePark has a method getAllAllowedFor(Visitor) which takes a Visitor and returns an ArrayList of IReviewed that the visitor is allowed to go on.</li>
</ul>
