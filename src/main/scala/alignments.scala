/* **************************************************************************
 *                                                                          *
 *  Copyright (C)  2011  Christian Krause                                   *
 *                                                                          *
 *  Christian Krause <kizkizzbangbang@googlemail.com>                       *
 *                                                                          *
 ****************************************************************************
 *                                                                          *
 *  This file is part of 'scalawt'.                                         *
 *                                                                          *
 *  This project is free software: you can redistribute it and/or modify    *
 *  it under the terms of the GNU General Public License as published by    *
 *  the Free Software Foundation, either version 3 of the License, or       *
 *  any later version.                                                      *
 *                                                                          *
 *  This project is distributed in the hope that it will be useful,         *
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of          *
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the           *
 *  GNU General Public License for more details.                            *
 *                                                                          *
 *  You should have received a copy of the GNU General Public License       *
 *  along with this project. If not, see <http://www.gnu.org/licenses/>.    *
 *                                                                          *
 ****************************************************************************/


package scalax.scalawt

/** Holds the actual alignment objects. */
object Alignment {

  // -----------------------------------------------------------------------
  // direction alignments
  // -----------------------------------------------------------------------

  /** Top position. */
  case object Top extends Direction with Vertical {
    /** Returns [[scalax.scalawt.Alignment.Bottom]]. */
    override lazy val opposite = Bottom
  }

  /** Bottom position. */
  case object Bottom extends Direction with Vertical {
    /** Returns [[scalax.scalawt.Alignment.Top]]. */
    override lazy val opposite = Top
  }

  /** Left position. */
  case object Left extends Direction with Horizontal with Text {
    /** Returns [[scalax.scalawt.Alignment.Right]]. */
    override lazy val opposite = Right
  }

  /** Right position. */
  case object Right extends Direction with Horizontal with Text {
    /** Returns [[scalax.scalawt.Alignment.Left]]. */
    override lazy val opposite = Left
  }

  /** Top-left position. */
  case object TopLeft extends Direction {
    /** Returns [[scalax.scalawt.Alignment.BottomRight]]. */
    override lazy val opposite = BottomRight
  }

  /** Bottom-right position. */
  case object BottomRight extends Direction {
    /** Returns [[scalax.scalawt.Alignment.TopLeft]]. */
    override lazy val opposite = TopLeft
  }

  /** Top-right position. */
  case object TopRight extends Direction {
    /** Returns [[scalax.scalawt.Alignment.BottomLeft]]. */
    override lazy val opposite = BottomLeft
  }

  /** Bottom-left position. */
  case object BottomLeft extends Direction {
    /** Returns [[scalax.scalawt.Alignment.TopRight]]. */
    override lazy val opposite = TopRight
  }

  // -----------------------------------------------------------------------
  // text alignments
  // -----------------------------------------------------------------------

  /** Central position. */
  case object Center extends Horizontal with Vertical with Text

  /** Leading edge for text. */
  case object Leading extends Text

  /** Trailing edge for text. */
  case object Trailing extends Text

  /** Text justification. */
  case object Justified extends Text

  val opp = (d: Direction) => d match {
    case Top         => Bottom
    case Bottom      => Top
    case Left        => Right
    case Right       => Left
    case TopLeft     => BottomRight
    case BottomRight => TopLeft
    case TopRight    => BottomLeft
    case BottomLeft  => TopRight
  }

  def opposite(d: Direction) = d match {
    case Top         => Bottom
    case Bottom      => Top
    case Left        => Right
    case Right       => Left
    case TopLeft     => BottomRight
    case BottomRight => TopLeft
    case TopRight    => BottomLeft
    case BottomLeft  => TopRight
  }
}

/** Base of the alignment hierarchy.
  *
  * @see [[scalax.scalawt.Direction]]
  * @see [[scalax.scalawt.Horizontal]]
  * @see [[scalax.scalawt.Vertical]]
  * @see [[scalax.scalawt.Text]]
  */
sealed trait Alignment

/** Base of alignments used for direction-based layouts and movement.
  *
  * @see [[scalax.scalawt.Alignment.Top]]
  * @see [[scalax.scalawt.Alignment.Bottom]]
  * @see [[scalax.scalawt.Alignment.Left]]
  * @see [[scalax.scalawt.Alignment.Right]]
  * @see [[scalax.scalawt.Alignment.TopLeft]]
  * @see [[scalax.scalawt.Alignment.BottomRight]]
  * @see [[scalax.scalawt.Alignment.TopRight]]
  * @see [[scalax.scalawt.Alignment.BottomLeft]]
  */
sealed trait Direction extends Alignment {
  /** Returns the opposite direction. */
  def opposite: Alignment
}

/** Base of the horizontal alignment hierarchy.
  *
  * @see [[scalax.scalawt.Alignment.Left]]
  * @see [[scalax.scalawt.Alignment.Right]]
  * @see [[scalax.scalawt.Alignment.Center]]
  */
sealed trait Horizontal extends Alignment

/** Base of the vertical alignment hierarchy.
  *
  * @see [[scalax.scalawt.Alignment.Top]]
  * @see [[scalax.scalawt.Alignment.Bottom]]
  * @see [[scalax.scalawt.Alignment.Center]]
  */
sealed trait Vertical extends Alignment

/** Base of alignments that can be used to align text.
  *
  * @see [[scalax.scalawt.Alignment.Left]]
  * @see [[scalax.scalawt.Alignment.Right]]
  * @see [[scalax.scalawt.Alignment.Center]]
  * @see [[scalax.scalawt.Alignment.Justified]]
  * @see [[scalax.scalawt.Alignment.Leading]]
  * @see [[scalax.scalawt.Alignment.Trailing]]
  */
sealed trait Text extends Alignment
