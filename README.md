**JingleToast**

JingleToast Library using Lottie animation and Typewriter animation.

![75760946-2f4b6280-5d5e-11ea-84b8-a72df222b31e](https://user-images.githubusercontent.com/17900470/208828888-4fba69fe-9f48-42d4-9ce6-7923706450b2.png)




To get this library into your build:

Step 1. Add this repository to your build file

Add it in your root build.gradle at the end of repositories:

```
  allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
  	}
``` 
  
Step 2. Add the dependency
```
  dependencies {
	        implementation 'com.github.jingil:JingleToast:v1.0'
	}
```



Use:

Then you can just call the show toast method by syntax

makeToast(Context context, String message, int duration) 

or

makeToast(Context context, String message, int duration, int style)

or

makeToast(Context context, String message, int duration, int style, int gravity)

or

makeToast(Context context, String message, int duration, int style, int gravity, String backgroundcolor)


Examples:
```
makeToast(
                this@MainActivity,
                "This is a sample success toast!",
                JingleToast.LENGTH_LONG,
                JingleToast.SUCCESS,
                JingleToast.TOP
            ).show()
 ```
 
 ```
 makeToast(
                this@MainActivity,
                "This is a sample failure toast!",
                JingleToast.LENGTH_LONG,
                JingleToast.FAILURE,
                JingleToast.BOTTOM
            ).show()
     
```


This project is licensed under Apache License 2.0. Commercial use, Modification, Distribution, Private use are permitted.

Stay tuned on https://jingil.medium.com/.



Enjoy :)

![visitors](https://visitor-badge.glitch.me/badge?page_id=jingil.JingleToast)
