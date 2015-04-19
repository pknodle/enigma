package runtime

import enigma.EnigmaUtil
import enigma.Rotor

// Rotor2 is the fastest rotor, rotor1 is in middle, rotor0 is the slowest.
// Rotor2 is also closest to the reflector.

class EnigmaMachine(rotor0:Rotor, rotor1:Rotor, rotor2:Rotor) {
  var rotorPositions = (0, 0, 0)

  def isAdvancementPoint(rotor : Rotor, position: Int ) = {
    rotor.advancementPoints.map(v => v == position).reduceLeft( (v1, v2) => v1 & v2 )
  }

  def incrementRotors() = {
    // This isn't quite right.  I know the Enigma wheels would trigger a carry over at different
    // places depending on the wheel.  I don't know which ones do this though... more research is
    // required.
    var (p0, p1, p2) = rotorPositions
    var newP2 = p2
    var newP1 = p1
    var newP0 = p0

    if(isAdvancementPoint(rotor2, p2)){
      newP1 = p1 + 1
      newP0 = p0 + 1 // Remember that when the middle rotor advances, it also advances the slowest rotor.  
    }

    if(isAdvancementPoint(rotor1, p1)){
      newP0 = p0 + 1
      
    }

    newP0 %= 26
    newP1 %= 26
    newP2 %= 26

    rotorPositions = (newP0, newP1, newP2)
  }

}

// This is a class to hold the different configurations used in the German Naval Enigma machines
class NavalEnigma() {

  var RotorI          = new Rotor("EKMFLGDQVZNTOWYHXUSPAIBRCJ", List(13))
  var RotorII         = new Rotor("AJDKSIRUXBLHWTMCQGZNPYFVOE", List(13))
  var RotorIII        = new Rotor("BDFHJLCPRTXVZNYEIWGAKMUSQO", List(13))
  var RotorIV         = new Rotor("ESOVPZJAYQUIRHXLNFTGKDCMWB", List(13))
  var RotorV          = new Rotor("VZBRGITYUPSDNHLXAWMJQOFECK", List(13))
  var RotorVI         = new Rotor("JPGVOUMFYQBENHZRDKASXLICTW", List(13))
  var RotorVII        = new Rotor("NZJHGRCXMYSWBOUFAIVLPEKQDT", List(13))
  var RotorVIII       = new Rotor("FKQHTLXOCBJSPDZRAMEWNIUYGV", List(13))
  var Betarotor       = new Rotor("LEYJVCNIXWPBQMDRTAKZGFUHOS", List(13))
  var Gammarotor      = new Rotor("FSOKANUERHMBTIYCWLQPZXVGJD", List(13))


  var reflector_B     = new Rotor("YRUHQSLDPXNGOKMIEBFZCWVJAT", List())
  var reflector_C     = new Rotor("FVPJIAOYEDRZXWGCTKUQSBNMHL", List())
  var reflector_BDunn = new Rotor("ENKQAUYWJICOPBLMDXZVFTHRGS", List())
  var reflector_CDunn = new Rotor("RDOBJNTKVEHMLFCWZAXGYIPSUQ", List())



}

object Enigma {
  def main(args: Array[String]) {
    println("Hello, world!")
  }
}

