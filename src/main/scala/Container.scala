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

/** Mixin for a [[scalax.scalawt.Widget]] that lets it contain components. */
trait Container { self: Widget =>

  /** Returns the contained components. */
  def components: Seq[Component]

  /** Sets `container` and `owner` of the new child component to this container
    * and its owner. */
  protected final def addChild(c: Component) {
    c.container = this
    c.owner = owner
  }

  /** Unsets `container` and `owner` of the to be removed child. */
  protected final def removeChild(c: Component) {
    c.container = None
    c.owner = None
  }

}
