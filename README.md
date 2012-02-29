Scala Widget Toolkit
====================

The primary goal of this project is to provide a way to write user interfaces
not just for different operating systems but for different environments, too.

Developers want to write UIs only once and users want to run applications
wherever they currently are, be it a terminal, windowing system, web browser,
... this toolkit extends "write once, run anywhere" by "write once, use
anywhere".


Why yet another toolkit?
------------------------

- toolkits like AWT, Swing, ... depend on a windowing system which is not
  necessarily needed to provide a good user interface
- pluggable I/O implementations / views
- I/O implementations / views use libraries like Cairo, DirectFB or SDL which
  all support many systems (especially SDL) and TUIs via ncurses as well as web
  user interfaces for browsers
- scala-idiomatic usage like mixin composition: powerful for widgets that
  naturally come with certain "traits", e.g. being "focusable"


Roadmap
-------

1. basic widget logic and basic widgets
2. abstract I/O and simple I/O implementation for specifications / testing
4. from here on: real I/O implementations and more complicated widgets

