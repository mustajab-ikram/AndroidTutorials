# Android Tutorials
Collection of code samples for learning Android Fundamentals and lessons in KOTLIN from [YOUTUBE](https://www.youtube.com/playlist?list=PLQkwcJG4YTCTq1raTb5iMuxnEB06J1VHX).
![Android Logo](AndroidLogo.jpeg)

## The layout of Android Applications
- Android applications have a strict layout. There are certain folders such as Manifest, JAVA folder, Res Folder, and Grade Scripts dedicated to their specific tasks. Enthusiasts and students on their way to making their first app must understand the purpose and significance of each folder. Let us go through each one of them in brief.

#### 1. Android Manifest 
   Android Manifest is the XML file that describes all the information needed from the app, the Android build tools, Android Operating System, and the Play Store. Android Manifest also contains the permission required by the app to perform its tasks. In addition to the information and permission, The XML file also stores the Hardware and Software features of the app. This helps determine the compatibility of the app in the play store.
   Other information stored in the file includes special activities like services, broadcast receivers, content providers, package names, etc.
#### 2. JAVA Folder
   JAVA Folder consists of all the required Code files dedicated to performing specific tasks of the app. The folder also comprises functionality, and utility of the buttons, calculation, storing, variables, toast(small popup message), programming function, etc. The folder contains all the java and kotlin source code created during the app development.
#### 3. Res Folder
   The resource folder consists of all the non-code files of the application such as Images, XML layouts, and UI strings for the android application. This makes it the most important among many. The Res folder consists of subfolders like drawable, layout, mipmap, raw, and values.
   - ### Drawable
   Drawable consists of all the images used in Android Application.
   - ### Layout
   Layout Folder consists of all the XML files needed for properly working the Android application. As we have studied earlier, that app performs at least one activity. Thus, the folder contains activity_main.xml.
   - ### Mipmap
   Mipmap folder of the Res folder consists of launcher.xml. The Launcher XML file is used to define icons on the home screen of phones and tablets. The Launcher has multiple density icons Based on the size of the device screen.
   - ### Raw
   Raw folder contains all the media files other than images such as audio files or music files. These can be accessed by syntax: R.raw.filename.
   - ### Values
   Values folder is sussed to store the values, colors, strings, integers, and more. It consists of the following directories.
   - R.array : arrays.xml for resource arrays
   - R.integer : integers.xml for resource integers
   - R.bool : bools.xml for resource boolean
   - R.color : colors.xml for color values
   - R.string : strings.xml for string values
   - R.dimen : dimens.xml for dimension values
   - R.style : styles.xml for styles
### 4. Gradle
   Gradle is storage for multiple build systems that when called can be applied to the ap modules. The gradle folder is independent of Android studio. They manage the entire build process. It provides processes and configuration settings specific to building and testing Android applications.

