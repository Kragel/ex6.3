/* Create two packages: debug and debugoff, containing an identical class
with a debug( ) method. The first version displays its String argument to the console, the
second does nothing. Use a static import line to import the class into a test program, and
demonstrate the conditional compilation effect.
 */

package com.company;

public class AA {
    public static void main(String[] args){
        com.debug.Debug m = new com.debug.Debug();
        com.debugoff.Debug f = new com.debugoff.Debug();
    }
}
