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
***
## Views
- The most common type of element we’ll define in resources are Views. View is the superclass for visual interface elements—a visual component on the screen is a View. Specific types of Views include: TextViews, ImageViews, Buttons, etc.
   - View is a superclass for these components because it allows us to use polymorphism to treat all these visual elements the same way as instances of the same type. We can lay them out, draw them, click on them, move them, etc. And all the behavior will be the same—though subclasses can also have “extra” features
- Here’s the big trick: one subclass of View is ViewGroup. A ViewGroup can contain other “child” Views. But since ViewGroup is a View… it can contain more ViewGroups inside it! Thus we can nest Views within Views, following the Composite Pattern. This ends up working a lot like HTML (which can have DOM elements like <div> inside other DOM elements), allowing for complex user interfaces.
   - Thus Views are structured into a tree, what is known as the View hierarchy.
- Views are defined inside of Layouts—that is, inside a layout resource, which is an XML file describing Views. These resources are “inflated” (rendered) into UI objects that are part of the application.
- Technically, Layouts are simply ViewGroups that provide “ordering” and “positioning” information for the Views inside of them. they let the system “lay out” the Views intelligently and effectively. Individual views shouldn’t know their own position; this follows from good object-oriented design and keeps the Views encapsulated.
- Android studio does come with a graphical Layout Editor (the “Design” tab) that can be used to create layouts. However, most developers stick with writing layouts in XML. This is mostly because early design tools were pathetic and unusable, so XML was all we had. Although Android Studio’s graphical editor can be effective, you should create layouts “by hand” in XML. This is helpful for making sure you understand the pieces underlying development, and is a skill you should be comfortable with anyway (similar to how we encourage people to use git from the command-line).
#### View Properties
- Before we get into how to group Views, let’s focus on the individual, basic View classes. As an example, consider the activity_main layout in the lecture code. This layout contains two individual View elements (inside a Layout): a TextView and a Button.
- All Views have properties which define the state of the View. Properties are usually defined within the resource XML as element attributes. Some examples of these property attributes are described below.
   - android:id specifies a unique identifier for the View. This identifier needs to be unique within the layout, though ideally is unique within the entire app (for clarity)
      - Identifiers must be legal Java variable names (because they are turned into a variable name in the R class), and by convention are named in lower_case format.
      - Style tip: it is useful to prefix each View’s id with its type (e.g., btn, txt, edt). This helps with making the code self-documenting.
   - You should give each interactive View a unique id, which will allow its state to automatically be saved as a Bundle when the Activity is destroyed.
   - android:layout_width and android:layout_height are used to specify the View’s size on the screen . These values can be a specific value (e.g., 12dp), but more commonly is one of two special values:
     - wrap_content, meaning the dimension should be as large as the content requires, plus padding.
     - match_parent, meaning the dimension should be as large as the parent (container) element, minus padding. This value was renamed from fill_parent (which has now been deprecated).
   - Android utilizes the following dimensions or units:
     - dp is a “density-independent pixel”. On a 160-dpi (dots-per-inch) screen, 1dp equals 1px (pixel). But as dpi increases, the number of pixels per dp increases. These values should be used instead of px, as it allows dimensions to work independent of the hardware’s dpi (which is highly variable).
     - px is an actual screen pixel. DO NOT USE THIS (use dp instead!)
     - sp is a “scale-independent pixel”. This value is like dp, but is scale by the system’s font preference (e.g., if the user has selected that the device should display in a larger font, 1sp will cover more dp). You should always use sp for text dimensions, in order to support user preferences and accessibility.
     - pt is 1/72 of an inch of the physical screen. Similar units mm and in are available. Not recommended for use.
   - android:padding, android:paddingLeft, android:margin, android:marginLeft, etc. are used to specify the margin and padding for Views. These work basically the same way they do in CSS: padding is the space between the content and the “edge” of the View, and margin is the space between Views. Note that unlike CSS, margins between elements do not collapse.
   - android:textSize specifies the “font size” of textual Views (use sp units!), android:textColor specifies the color of text (reference a color resource!), etc.
- Note that unlike CSS, styling properties specified in the layout XML resources are not inherited; we’re effectively specifying an inline style attribute for that element, and one that won’t affect child elements. In order to define shared style properties, you’ll need to use styles resources.
- While it is possible to specify these visual properties dynamically via Java methods (e.g., setText(), setPadding()). You should only use Java methods to specify View properties when they need to be dynamic (e.g., the text changes in response to a button click)—it is much cleaner and effective to specify as much visual detail in the XML resource files as possible. It’s also possible to simply replace one layout resource with another (see below).
   - Views also have inspection methods such as isVisible() and hasFocus(); we will point to those as we need them.
- Do not define Views or View appearances in an Activity’s onCreate() callback, unless the properties (e.g., content) truly cannot be determined before runtime! Specify layouts in the XML instead.

