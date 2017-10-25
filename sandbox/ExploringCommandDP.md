ELECTRONICDEVICE.JAVA

01
public interface ElectronicDevice {
02
     
03
    public void on();
04
     
05
    public void off();
06
     
07
    public void volumeUp();
08
     
09
    public void volumenDown();
10
     
11
}
TELEVISION.JAVA (RECEIVER)

01
public class Television implements ElectronicDevice {
02
 
03
    private int volume = 0;
04
     
05
    public void on() {
06
         
07
        System.out.println("TV is on");
08
         
09
    }
10
 
11
    public void off() {
12
         
13
        System.out.println("TV is off");
14
         
15
    }
16
 
17
    public void volumeUp() {
18
         
19
        volume++;
20
         
21
        System.out.println("TV Volume is at: " + volume);
22
         
23
    }
24
 
25
    public void volumenDown() {
26
         
27
        volume--;
28
         
29
        System.out.println("TV Volume is at: " + volume);
30
         
31
    }
32
     
33
}
COMMAND.JAVA

01
// Each command you want to issue will implement
02
// the Command interface
03
 
04
public interface Command {
05
     
06
    public void execute();
07
     
08
    // You may want to offer the option to undo a command
09
     
10
    public void undo();
11
     
12
}
TURNTVON.JAVA (COMMAND)

01
public class TurnTVOn implements Command {
02
 
03
    ElectronicDevice theDevice;
04
     
05
    public TurnTVOn(ElectronicDevice newDevice){
06
         
07
        theDevice = newDevice;
08
         
09
    }
10
     
11
    public void execute() {
12
         
13
        theDevice.on();
14
         
15
    }
16
 
17
    public void undo() {
18
         
19
        theDevice.off();
20
         
21
    }
22
     
23
}
TURNTVOFF.JAVA (COMMAND)

01
public class TurnTVOff implements Command {
02
 
03
    ElectronicDevice theDevice;
04
     
05
    public TurnTVOff(ElectronicDevice newDevice){
06
         
07
        theDevice = newDevice;
08
         
09
    }
10
     
11
    public void execute() {
12
         
13
        theDevice.off();
14
         
15
    }
16
 
17
    // Used if you want to allow for undo
18
    // Do the opposite of execute()
19
     
20
    public void undo() {
21
         
22
        theDevice.on();
23
         
24
    }
25
     
26
}
TURNTVUP.JAVA (COMMAND)

01
public class TurnTVUp implements Command {
02
 
03
    ElectronicDevice theDevice;
04
     
05
    public TurnTVUp(ElectronicDevice newDevice){
06
         
07
        theDevice = newDevice;
08
         
09
    }
10
     
11
    public void execute() {
12
         
13
        theDevice.volumeUp();
14
         
15
    }
16
 
17
    public void undo() {
18
         
19
        theDevice.volumenDown();
20
         
21
    }
22
     
23
}
DEVICEBUTTON.JAVA (INVOKER)

01
// This is known as the invoker
02
// It has a method press() that when executed
03
// causes the execute method to be called
04
 
05
// The execute method for the Command interface then calls
06
// the method assigned in the class that implements the
07
// Command interface
08
 
09
public class DeviceButton{
10
     
11
    Command theCommand;
12
     
13
    public DeviceButton(Command newCommand){
14
         
15
        theCommand = newCommand;
16
         
17
    }
18
     
19
    public void press(){
20
         
21
        theCommand.execute();
22
         
23
    }
24
     
25
    // Now the remote can undo past commands
26
     
27
    public void pressUndo(){
28
         
29
        theCommand.undo();
30
         
31
    }
32
     
33
}
TVREMOTE.JAVA

1
public class TVRemote {
2
     
3
    public static ElectronicDevice getDevice(){
4
         
5
        return new Television();
6
         
7
    }
8
     
9
}
PLAYWITHREMOTE.JAVA

001
import java.util.ArrayList;
002
import java.util.List;
003
 
004
public class PlayWithRemote{
005
     
006
    public static void main(String[] args){
007
         
008
        // Gets the ElectronicDevice to use
009
         
010
        ElectronicDevice newDevice = TVRemote.getDevice();
011
         
012
        // TurnTVOn contains the command to turn on the tv
013
        // When execute() is called on this command object
014
        // it will execute the method on() in Television
015
         
016
        TurnTVOn onCommand = new TurnTVOn(newDevice);
017
         
018
        // Calling the execute() causes on() to execute in Television
019
         
020
        DeviceButton onPressed = new DeviceButton(onCommand);
021
         
022
        // When press() is called theCommand.execute(); executes
023
         
024
        onPressed.press();
025
         
026
        //----------------------------------------------------------
027
         
028
        // Now when execute() is called off() of Television executes
029
         
030
        TurnTVOff offCommand = new TurnTVOff(newDevice);
031
         
032
        // Calling the execute() causes off() to execute in Television
033
         
034
        onPressed = new DeviceButton(offCommand);
035
         
036
        // When press() is called theCommand.execute(); executes
037
         
038
        onPressed.press();
039
         
040
        //----------------------------------------------------------
041
         
042
        // Now when execute() is called volumeUp() of Television executes
043
         
044
        TurnTVUp volUpCommand = new TurnTVUp(newDevice);
045
                 
046
        // Calling the execute() causes volumeUp() to execute in Television
047
                 
048
        onPressed = new DeviceButton(volUpCommand);
049
                 
050
        // When press() is called theCommand.execute(); executes
051
                 
052
        onPressed.press();
053
        onPressed.press();
054
        onPressed.press();
055
         
056
        //----------------------------------------------------------
057
         
058
        // Creating a TV and Radio to turn off with 1 press
059
         
060
        Television theTV = new Television();
061
         
062
        Radio theRadio = new Radio();
063
         
064
        // Add the Electronic Devices to a List
065
         
066
        List<ElectronicDevice> allDevices = new ArrayList<ElectronicDevice>();
067
         
068
        allDevices.add(theTV);
069
        allDevices.add(theRadio);
070
         
071
        // Send the List of Electronic Devices to TurnItAllOff
072
        // where a call to run execute() on this function will
073
        // call off() for each device in the list
074
         
075
        TurnItAllOff turnOffDevices = new TurnItAllOff(allDevices);
076
         
077
        // This calls for execute() to run which calls for off() to
078
        // run for every ElectronicDevice
079
         
080
        DeviceButton turnThemOff = new DeviceButton(turnOffDevices);
081
         
082
        turnThemOff.press();
083
         
084
        //----------------------------------------------------------
085
         
086
        /*
087
         * It is common to be able to undo a command in a command pattern
088
         * To do so, DeviceButton will have a method called undo
089
         * Undo() will perform the opposite action that the normal
090
         * Command performs. undo() needs to be added to every class
091
         * with an execute()
092
         */
093
         
094
        turnThemOff.pressUndo();
095
         
096
        // To undo more than one command add them to a LinkedList
097
        // using addFirst(). Then execute undo on each item until
098
        // there are none left. (This is your Homework)
099
         
100
    }
101
     
102
}
RADIO.JAVA (RECEIVER)

01
public class Radio implements ElectronicDevice {
02
 
03
    private int volume = 0;
04
     
05
    public void on() {
06
         
07
        System.out.println("Radio is on");
08
         
09
    }
10
 
11
    public void off() {
12
         
13
        System.out.println("Radio is off");
14
         
15
    }
16
 
17
    public void volumeUp() {
18
         
19
        volume++;
20
         
21
        System.out.println("Radio Volume is at: " + volume);
22
         
23
    }
24
 
25
    public void volumenDown() {
26
         
27
        volume--;
28
         
29
        System.out.println("Radio Volume is at: " + volume);
30
         
31
    }
32
     
33
}
TURNITALLOFF.JAVA (COMMAND)

01
import java.util.List;
02
 
03
public class TurnItAllOff implements Command {
04
  List<ElectronicDevice> theDevices;
05
  
06
  public TurnItAllOff(List<ElectronicDevice> newDevices) {
07
      theDevices = newDevices;
08
  }
09
  
10
  public void execute() {
11
  
12
    for (ElectronicDevice device : theDevices) {
13
      device.off();
14
    }
15
  
16
  }
17
 
18
  public void undo() {
19
     
20
    for (ElectronicDevice device : theDevices) {
21
          device.on();
22
        }
23
     
24
  }
25
}
