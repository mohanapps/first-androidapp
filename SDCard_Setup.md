There are many places in which we need SDCard storage to work with some apps like to store some mp3 file for playing music and store images to be viewed in the gallery of the emulator and more such usage. <br>

Below are the steps to setup a SDCard storage in the emulator<br>

<b>1.</b>We need to create a iso image of the SDCard in our local file system using the below command<br>

<b>mksdcard 256M sdcard.iso</b><br>

<b>2.</b>Start emulator using below command if you are starting using the command line command<br>
<br>
<b>emulator -avd AVD_NAME -sdcard sdcard.iso </b> <br>

<b>3.</b> Check whether SDCard is available in the emulator from Menu --> Settings --> storage <br>

<b>4.</b> Now the SDCard is available in the emulator for use.Some of the commands to play with data is as follows<br>
<br>
<b> adb push 'Local file path' 'device destination path' </b> - This  command is used to copy file from local file system to SDCard. <br>

<b> Note: </b> SDCard path always starts from /sdcard/<br>
<br>
<b> adb shell </b> - used to navigate the SDCard file system.You can use the normal linux command like 'ls' to navigate with in the shell.