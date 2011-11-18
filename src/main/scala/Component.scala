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


package scalawt

/** A widget which can be contained by a [[scalawt.Container]].
  *
  * A `Component` can have only one parent `Container`. This includes that it
  * will '''always''' be listed in the contents of '''only one''' `Container`.
  */
abstract class Component extends Widget {

  private var _container: Option[Container] = None

  /** Optionally returns the parent [[scalawt.Container]] of this component. */
  def container: Option[Container] = _container

  /** @todo only `Container` should be allowed to use this def */
  private[scalawt] def container_=(p: Option[Container]) {
    _container = p
  }

}
