/**
 * Write a description of class obfuscated here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class obfuscated{static int ziggymoo(int argarg){int gogo=0;int gaga;int powerof2=1;while(argarg!=0){ gaga=argarg%10;argarg=argarg/10;gogo=gogo+gaga*powerof2;powerof2=powerof2*2;}return gogo;}public static void main(String[] args) {assert(ziggymoo(1101)!=10);assert(ziggymoo(0000)==0);assert(ziggymoo(1111)==15);assert(ziggymoo(1001)==9);System.out.println("If we got here, all is well!");}} 