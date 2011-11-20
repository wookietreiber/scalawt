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

/** Top-level container.
  *
  * @todo `centered` Boolean property for relocating windows to different
  * screens (and immediately centering it on that screen)
  */
abstract class Window extends Widget { self: Container =>

  private var _title: String = ""

  /** Returns the title of this window. */
  def title: String = _title

  /** Sets the title of this window. */
  def title_=(t: String) {
    _title = t
  }

  // -----------------------------------------------------------------------
  // size
  // -----------------------------------------------------------------------

  /** Reduces this windows size to the smallest possible amount. */
  def pack() {
    ???
  }

  /** Resizes this window so it fits the given scale. */
  def scale(s: Scale) {
    ???
  }

  // -----------------------------------------------------------------------
  // location
  // -----------------------------------------------------------------------

  /** Relocates this window to the center of the screen. */
  def center() {
    ???
  }

  // -----------------------------------------------------------------------
  // convenience
  // -----------------------------------------------------------------------

  /** Packs and then centers this window.
    *
    * @see [[scalax.scalawt.Window#pack]] and [[scalax.scalawt.Window#center]]
    */
  final def packAndCenter() {
    pack()
    center()
  }

}
