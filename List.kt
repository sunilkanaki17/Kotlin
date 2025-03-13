fun printf(SolarSystem: MutableList<String>) {
     for(planet in SolarSystem) {
        println(planet)
    }
}
fun main() {
    var i=0
    var solarSystem = mutableListOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    solarSystem.add(3,"Full Moon")
    solarSystem.add("Pluto")
    
    //printf(solarSystem)
    
   	solarSystem.removeAt(0)
    solarSystem.remove("Pluto")
    
    printf(solarSystem)
    println(solarSystem.contains("Pluto"))
    println("Mars" in solarSystem)
}
