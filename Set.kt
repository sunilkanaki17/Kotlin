fun printf(SolarSystem: MutableList<String>) {
     for(planet in SolarSystem) {
        println(planet)
    }
}
fun main() {
    var i=0
    var solarSystem = mutableSetOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    print(solarSystem.size)
    
    solarSystem.add("Full Moon") //You cannot insert index because set is unordered
    solarSystem.add("Pluto")
    solarSystem.add("Pluto")
    
    print(solarSystem.size)
    //printf(solarSystem)
    
   	//solarSystem.removeAt(0)
    //solarSystem.remove("Pluto")
    
    
    
   // println(solarSystem.contains("Pluto"))
    //println("Mars" in solarSystem)
}
