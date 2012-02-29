package scalax.scalawt

import Alignment._
import org.specs2._

class AlignmentSpec extends Specification { def is =

  // -----------------------------------------------------------------------
  // fragments
  // -----------------------------------------------------------------------

  "Horizontal alignments should include"                                      ^
    "Left"                        ! hori(Left)                                ^
    "Center"                      ! hori(Center)                              ^
    "Right"                       ! hori(Right)                               ^
                                                                             p^
  "Vertical alignments should include"                                        ^
    "Top"                         ! vert(Top)                                 ^
    "Center"                      ! vert(Center)                              ^
    "Bottom"                      ! vert(Bottom)                              ^
                                                                             p^
  "Text alignments should include"                                            ^
    "Left"                        ! text(Left)                                ^
    "Center"                      ! text(Center)                              ^
    "Right"                       ! text(Right)                               ^
    "Justified"                   ! text(Justified)                           ^
    "Leading"                     ! text(Leading)                             ^
    "Trailing"                    ! text(Trailing)                            ^
                                                                             p^
  "Directions should include"                                                 ^
    "Top"                         ! dire(Top)                                 ^
    "Bottom"                      ! dire(Bottom)                              ^
    "Left"                        ! dire(Left)                                ^
    "Right"                       ! dire(Right)                               ^
    "TopLeft"                     ! dire(TopLeft)                             ^
    "TopRight"                    ! dire(TopRight)                            ^
    "BottomLeft"                  ! dire(BottomLeft)                          ^
    "BottomRight"                 ! dire(BottomRight)                         ^
                                                                             p^
  "Directions should have correct opposites"                                  ^
    "Top         -> Bottom"       ! opp(Top,         Bottom)                  ^
    "Bottom      -> Top"          ! opp(Bottom,      Top)                     ^
    "Left        -> Right"        ! opp(Left,        Right)                   ^
    "Right       -> Left"         ! opp(Right,       Left)                    ^
    "TopLeft     -> BottomRight"  ! opp(TopLeft,     BottomRight)             ^
    "BottomRight -> TopLeft"      ! opp(BottomRight, TopLeft)                 ^
    "TopRight    -> BottomLeft"   ! opp(TopRight,    BottomLeft)              ^
    "BottomLeft  -> TopRight"     ! opp(BottomLeft,  TopRight)                ^
                                                                            end
  // -----------------------------------------------------------------------
  // tests
  // -----------------------------------------------------------------------

  def text(a: Alignment) = a must beLike { case x: Text       => ok }
  def dire(a: Alignment) = a must beLike { case x: Direction  => ok }
  def hori(a: Alignment) = a must beLike { case x: Horizontal => ok }
  def vert(a: Alignment) = a must beLike { case x: Vertical   => ok }

  def opp(a: Direction, b: Direction) = a.opposite must_== b

}
