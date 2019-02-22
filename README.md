FontMania
=====

 [![Repository](https://img.shields.io/badge/repo-GitHub-blue.svg)](https://github.com/januprasad/Fontmania)
 ![License](https://img.shields.io/github/license/MarcinOrlowski/fonty.svg)
 
 [![Curent Release](https://jitpack.io/v/MarcinOrlowski/fonty.svg)](https://jitpack.io/#januprasad/Fontmania)
 ![jitpack Downloads](https://jitpack.io/v/januprasad/Fontmania/month.svg)



 `FontMania` is simple Android library allowing you to easily change the typeface
 of your UI elements. Contrary to other implementations .

 Using `FontMania` requires  nothing from your app

 Download demo application APK from [releases section](https://github.com/januprasad/Fontmania/releases).
 Source code in project's [app/](https://github.com/januprasad/Fontmania/tree/master/app/src/main) module.

Features
========

 - Fast and lightweight
 - No odd dependencies
 - Simple API
 - Supports the following UI elements and all subclasses:
   * TextViews


Installation
============

 Edit your master `gradle.build` file and **add** `maven { url 'https://jitpack.io' }` to your current
 `repositories` block content (if you use other jitpack hosted libraries, then this step can be skipped):

    allprojects {
      repositories {
        maven { url 'https://jitpack.io' }
        }
    }

 Next, edit your **module**'s `build.gradle` and the following dependency:
     implementation 'com.github.januprasad:Fontmania:<VERSION>'

Configuration
=============

 Then add the following lines to your Activity/Fragment 's class' `onCreate()`

       ROBOTO(text, text2, text3)
       ROBOTO_BOLD(text4, text2)
      
Contributing
============

 Please report any issue spotted using [GitHub's project tracker](https://github.com/Januprasad/FontMania/issues).

 If you'd like to contribute to the this project, please [open new ticket](https://github.com/Januprasad/FontMania/issues)
 **before doing any work**. This will help us save your time in case I'd not be able to accept such changes. But if all is good and
 clear then follow common routine:

  * fork the project
  * create new branch
  * do your changes
  * send pull request


License
=======

  * Written and copyrighted &copy;2013-2019 by Marcin Januprasad <mail (#) jnuprasad@gmail (.) com>
  * `FontMania` is open-sourced library licensed under the Apache 2.0 license
