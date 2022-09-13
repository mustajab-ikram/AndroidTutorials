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

