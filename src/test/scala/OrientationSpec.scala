package scalax.scalawt

import Orientation._
import org.specs2._

class OrientationSpec extends Specification { def is =

  // -----------------------------------------------------------------------
  // fragments
  // -----------------------------------------------------------------------

  "Orientations should include"                                               ^
    "Horizontal"                  ! incl(Horizontal)                          ^
    "Vertical"                    ! incl(Vertical)                            ^
                                                                            end
  // -----------------------------------------------------------------------
  // tests
  // -----------------------------------------------------------------------

  def incl(o: Orientation) = o must beLike { case x: Orientation => ok }

}
