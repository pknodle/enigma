package enigma

object EnigmaUtil {
  def positionInAlphabet(c :Char) = {
    c match {
      case 'a' => 0
      case 'b' => 1
      case 'c' => 2
      case 'd' => 3
      case 'e' => 4
      case 'f' => 5
      case 'g' => 6
      case 'h' => 7
      case 'i' => 8
      case 'j' => 9
      case 'k' => 10
      case 'l' => 11
      case 'm' => 12
      case 'n' => 13
      case 'o' => 14
      case 'p' => 15
      case 'q' => 16
      case 'r' => 17
      case 's' => 18
      case 't' => 19
      case 'u' => 20
      case 'v' => 21
      case 'w' => 22
      case 'x' => 23
      case 'y' => 24
      case 'z' => 25

      case 'A' => 0
      case 'B' => 1
      case 'C' => 2
      case 'D' => 3
      case 'E' => 4
      case 'F' => 5
      case 'G' => 6
      case 'H' => 7
      case 'I' => 8
      case 'J' => 9
      case 'K' => 10
      case 'L' => 11
      case 'M' => 12
      case 'N' => 13
      case 'O' => 14
      case 'P' => 15
      case 'Q' => 16
      case 'R' => 17
      case 'S' => 18
      case 'T' => 19
      case 'U' => 20
      case 'V' => 21
      case 'W' => 22
      case 'X' => 23
      case 'Y' => 24
      case 'Z' => 25
      case _ => -1 // I don't know yet how to deal with errors in Scala.  
    }
  }

  def alphabetPositionToChar(index : Int) = {
    index match {
      case 0  => 'A'
      case 1  => 'B'
      case 2  => 'C'
      case 3  => 'D'
      case 4  => 'E'
      case 5  => 'F'
      case 6  => 'G'
      case 7  => 'H'
      case 8  => 'I'
      case 9  => 'J'
      case 10 => 'K'
      case 11 => 'L'
      case 12 => 'M'
      case 13 => 'N'
      case 14 => 'O'
      case 15 => 'P'
      case 16 => 'Q'
      case 17 => 'R'
      case 18 => 'S'
      case 19 => 'T'
      case 20 => 'U'
      case 21 => 'V'
      case 22 => 'W'
      case 23 => 'X'
      case 24 => 'Y'
      case 25 => 'Z'
      case _  => "?"
    }
  }
}
