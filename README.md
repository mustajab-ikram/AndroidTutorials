# Android Tutorials
Collection of code samples for learning Android Fundamentals and lessons in KOTLIN from [YOUTUBE](https://www.youtube.com/playlist?list=PLQkwcJG4YTCTq1raTb5iMuxnEB06J1VHX).
![Android Logo](AndroidLogo.jpeg)
***
## The layout of Android Applications
Android applications have a strict layout. There are certain folders such as Manifest, JAVA folder, Res Folder, and Grade Scripts dedicated to their specific tasks.
- ### APP FOLDER
- 1. **Android Manifest** is the XML file that describes all the information needed from the app, the Android build tools, Android Operating System, and the Play Store. Android Manifest also contains the permission required by the app to perform its tasks. In addition to the information and permission, The XML file also stores the Hardware and Software features of the app. This helps determine the compatibility of the app in the play store.
   Other information stored in the file includes special activities like services, broadcast receivers, content providers, package names, etc.
- 2. **JAVA** Folder consists of all the required code files dedicated to performing specific tasks of the app. It is named Java, just for legacy purposes. The folder contains all the java and kotlin source code created during the app development.
- 3. **Res** Folder  consists of all the non-code files of the application such as Images, XML layouts, and UI strings for the android application. This makes it the most important among many. The Res folder consists of subfolders like drawable, layout, mipmap, raw, and values.
    - 1. **Drawable** consists of all the images used in Android Application.
    - 2. **Layout** Folder consists of all the XML files needed for properly working the Android application.
    - 3. **Mipmap** Folder of the Res folder consists of launcher.xml. The Launcher XML file is used to define icons on the home screen of phones and tablets. The Launcher has multiple density icons based on the size of the device screen.
    - 4. **Raw** Folder contains all the media files other than images such as audio files or music files. These can be accessed by syntax: R.raw.filename.
    - 5. **Values** Folder is used to store the values, colors, strings, integers, and more. 
- ### GRADLE SCRIPTS
   Gradle is storage for multiple build systems that when called can be applied to the app modules. The Gradle folder is independent of Android studio. They manage the entire build process. It provides processes and configuration settings specific to building and testing Android applications.
***
## Activity Lifecycle
- An activity is the single screen in android. It is like window or frame of Java. By the help of activity, you can place all your UI components or widgets in a single screen.
- It is basically a kotlin class combined with its xml layout and inside of that class we define how our specific screen should behave in which situations.
- All activities inherit from AppCompat Activity, which describes what an activity is, and we inherit from this class to take that behaviour and to make our activity out of that.
- As the user navigates between different screens or apps, it goes through different states in their lifecycle. So an activity lifecycle consists of 7 different methods of android.app.Activity class.
![Android Activity Lifecycle](Android-Activity-Lifecycle.png)
- You must be aware that a program starts from a main() function in different programming languages. Similarly, android initiates the program within an activity with a call to onCreate() callback method. There is a sequence of callback methods that starts up an activity and then tear down in different  methods shown in the above Activity life cycle diagram:
- Let’s understand these methods:
  - **onCreate()** :  In this state, the activity is created.
  - **onStart()** : This callback method is called when the activity becomes visible to the user.
  - **onResume()** : The activity is in the foreground and the user can interact with it.
  - **onPause()** : Activity is partially obscured by another activity. Other activity that’s in the foreground is semi-transparent.
  - **onStop()** : The activity is completely hidden and not visible to the user.
  - **onDestroy()** : Activity is destroyed and removed from the memory.
- **NOTE:** Whenever an activity is created it gets pushed to our activity stack and if a new activity is arrived it gets pushed on top of it, in that similar fashion they are popped out from the stack.
***
## Logcat
- Your best friend during android development.
- Console for android studio.
- LogCat Window is the place where various messages can be printed when an application runs. Suppose, you are running your application and the program crashes, unfortunately. Then, Logcat Window is going to help you to debug the output by collecting and viewing all the messages that your emulator throws. So, this is a very useful component for the app development because this Logcat dumps a lot of system messages and these messages are actually thrown by the emulator.
- There are lots of methods that are present in the log class:
  - v(String, String) - verbose
  - d(String, String) - debug
  - i(String, String) - information
  - w(String, String) - warning
  - e(String, String) - error
- The verbose method is of very lesser priority and error is of higher priority. Thus, the method’s priority increases from verbose to error.
- SYNTAX
  - for verbose Log.v("TAG", "MESSAGE")
  - for debug Log.d("TAG", "MESSAGE")
  - for information Log.i("TAG", "MESSAGE")
  - for warning Log.w("TAG", "MESSAGE")
  - for error Log.e("TAG", "MESSAGE")
***
## Activity Lifecycle practical with Logcat
- In your MainActivity override all the callback methods discussed above with **Log.d("Methods", "callbackName() is called")**
> Like this 
![override methods](overridenMethods.png)
- Then in your logcat select Debug write your tag, and play around a bit.
